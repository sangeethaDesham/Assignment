package orm.ormhr.testscenarios;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import orm.ormhr.pages.Base_Class;
import orm.ormhr.pages.ORMLogin_page;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Testcase1 extends Base_Class {	
	
	

@Test
public void LoginTest() throws InterruptedException {
	ORMLogin_page ORM = new ORMLogin_page(driver);
	ORM.LoginValidation("Admin", "admin123");	
	Assert.assertTrue(true, "Login Successful");
	}

}

	
	

	
	

