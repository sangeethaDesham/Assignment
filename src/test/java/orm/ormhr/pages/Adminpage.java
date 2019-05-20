package orm.ormhr.pages;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import orm.ormhr.testscenarios.Testcase3;

public class Adminpage {
	
	@FindBy(how = How.XPATH, using = "//*[@id='searchSystemUser_userName']")
	public WebElement Admin_UserName;
	@FindBy(how = How.XPATH, using = "//*[@id='searchSystemUser_userType']")
	public WebElement Admin_UserRole;
	@FindBy(how = How.XPATH, using = "//*[@id='searchSystemUser_employeeName_empName']")
	public WebElement Admin_EmpName;
	@FindBy(how = How.XPATH, using = "//*[@id='searchSystemUser_status']")
	public WebElement Admin_Status;
	@FindBy(how = How.XPATH, using ="//*[@id='searchBtn']")
	public WebElement Admin_Searchbtn;	
	@FindBy(how = How.XPATH, using ="//*[@id='resetBtn']")
	public WebElement Admin_Resetbtn;
	@FindBy(how = How.XPATH, using ="//*[@id='btnAdd']")
	public WebElement Admin_Add_btn;
	@FindBy(how =  How.XPATH, using ="//a[text()='linda.anderson']/../preceding-sibling::td/input")
	public WebElement UserName_Checkbox;
		
	public WebDriver driver;
	
	public Adminpage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void SearchSystemUsers(String UserName,String EmployeeName,String UserRole,String Status) 
{
		WebElement mainMenu = driver.findElement(By.linkText("Admin"));
		Actions action = new Actions(driver);
		action.moveToElement(mainMenu).perform();;
		WebElement subMenu = driver.findElement(By.linkText("User Management"));
		action.moveToElement(subMenu);
		action.click();
		action.perform();
		WebElement subMenu1 = driver.findElement(By.linkText("Users"));
		action.moveToElement(subMenu1);
		action.click();
		action.perform();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Admin_UserName.click();
		Admin_UserName.sendKeys(UserName);
		Admin_EmpName.click();
		(new Select(Admin_UserRole)).selectByVisibleText(UserRole);
		(new Select(Admin_Status)).selectByVisibleText(Status);
		Admin_EmpName.sendKeys(EmployeeName);
		Admin_Searchbtn.click();	
		}		
	
	public void ResetSystemUsers() throws InterruptedException {	
		Admin_Resetbtn.click();			
		}	
	
	}

	        

	

	
	
	
	

	

