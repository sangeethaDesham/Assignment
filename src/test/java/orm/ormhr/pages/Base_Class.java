package orm.ormhr.pages;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Base_Class {
	protected static WebDriver driver;
	private static ChromeDriverService service;
	@BeforeTest
	public void ValidationBeforeTest() throws IOException
	{
		service = new ChromeDriverService.Builder()
		        .usingDriverExecutable(new File("./src/test/resources/chromedriver.exe"))
		        .usingAnyFreePort()
		        .build();
		service.start();
		//System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver.exe");
		//driver = new ChromeDriver();
		driver = new RemoteWebDriver(service.getUrl(), DesiredCapabilities.chrome());
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/");		
	}	
	
	
	@AfterTest 
	public void ValidationAfterTest()
	{
		ORMLogin_page pg = new ORMLogin_page(driver);
		pg.ORM_Welcome_Lgt.click();
		pg.ORM_Logout_link.click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.quit();

		}
}
