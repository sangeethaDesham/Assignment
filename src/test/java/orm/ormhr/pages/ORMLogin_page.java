package orm.ormhr.pages;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import javax.xml.parsers.ParserConfigurationException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.xml.sax.SAXException;


public class ORMLogin_page
{
	@FindBy(how = How.XPATH, using = "//*[@id='txtUsername']")
	public WebElement ORM_Username;

	@FindBy(how = How.XPATH, using = "//*[@id='txtPassword']")
	public WebElement ORM_Password;

	@FindBy(how = How.XPATH, using = "//*[@id='btnLogin']")
	public WebElement ORM_LoginButton;
	
	@FindBy(how = How.XPATH, using = "//*[@id='welcome']")
	public WebElement ORM_Welcome_Lgt;
	
	@FindBy(how = How.XPATH, using = "//*[@id='welcome-menu']//a[contains(@href,'/index.php/auth/logout')]")
	public WebElement ORM_Logout_link;
	
	public WebDriver driver;
	
	public ORMLogin_page(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	//Method to Login into ORM Portal 

	public void LoginValidation(String userName, String Password) throws InterruptedException {
		try {
			
			ORM_Username.sendKeys(userName);
			ORM_Password.sendKeys(Password);
			ORM_LoginButton.click();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
		}		
		catch(Exception e) {
			System.out.println("Something went wrong in ORM Login module, please verify the login details." + e);
		}
	}	
}
