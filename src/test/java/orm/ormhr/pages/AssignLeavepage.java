package orm.ormhr.pages;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AssignLeavepage {
	
	@FindBy(how = How.XPATH, using = "//*[@id='assignleave_txtEmployee_empName']")
	public WebElement AssignLeave_EmpName;
	@FindBy(how = How.XPATH, using = "//*[@id='assignleave_txtLeaveType']")
	public WebElement AssignLeave_LeaveType;
	@FindBy(how = How.XPATH, using = "//*[@id='assignleave_txtFromDate']")
	public WebElement AssignLeave_FromDate;
	@FindBy(how = How.XPATH, using = "//*[@id='assignleave_txtToDate']")
	public WebElement AssignLeave_ToDate;
	@FindBy(how = How.XPATH, using = "//*[@id='assignleave_txtComment']")
	public WebElement AssignComment;	
	@FindBy(how = How.XPATH, using = "//*[@id='assignBtn']")
	public WebElement Assignbtn;
	@FindBy(how = How.XPATH, using = "//*[@id='assignleave_duration_duration']")
	public WebElement AssignDuration;
	@FindBy(how = How.XPATH, using = "//input[@id='confirmOkButton']")
	public WebElement Confirmation_Btn;
	
	
	public WebDriver driver;
	
	public AssignLeavepage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void AssignLeave(String EmployeeName,String LeaveType,String FromDate,String ToDate,String Duration,String Comment) throws InterruptedException 
	{ 
		WebElement mainMenu = driver.findElement(By.linkText("Leave"));
		Actions action = new Actions(driver);
		action.moveToElement(mainMenu).perform();;
		WebElement subMenu = driver.findElement(By.linkText("Assign Leave"));
		action.moveToElement(subMenu);
		action.click();
		action.perform();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		AssignLeave_EmpName.sendKeys(EmployeeName);
		(new Select(AssignLeave_LeaveType)).selectByVisibleText(LeaveType);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('assignleave_txtFromDate').removeAttribute('readonly',0);");
		WebElement fromDateBox=AssignLeave_FromDate;
		fromDateBox.clear();
		fromDateBox.sendKeys(FromDate); 
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		((JavascriptExecutor)driver).executeScript ("document.getElementById('assignleave_txtToDate').removeAttribute('readonly',0);");		
		WebElement toDateBox=AssignLeave_ToDate;
		toDateBox.clear();
		toDateBox.sendKeys(ToDate); 
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		(new Select(AssignDuration)).selectByVisibleText(Duration);
		AssignComment.sendKeys(Comment);
		Assignbtn.click();	
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);  
		Confirmation_Btn.click();		       
		}
	}
	
		


