package orm.ormhr.pages;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import junit.framework.Assert;

public class Directorypage {
	
	String Directory_ResultsXPathStr = "//*[@id='resultTable']//b[text()='PARAMETER']";
	
	@FindBy(how = How.XPATH, using = "//*[@id='menu_directory_viewDirectory']")
	public WebElement Directory_Menu;

	@FindBy(how = How.XPATH, using = "//*[@id='searchDirectory_emp_name_empName']")
	public WebElement Directory_Name;

	@FindBy(how = How.XPATH, using = "//*[@id='searchDirectory_job_title']")
	public WebElement Directory_Title ;
	
	@FindBy(how = How.XPATH, using ="//*[@id='searchDirectory_location']")
	public WebElement Directory_Location;
	
	@FindBy(how = How.XPATH, using ="//*[@id='searchBtn']")
	public WebElement Directory_Search_btn;
	
	@FindBy(how = How.XPATH, using ="//*[@id='resetBtn']")
	public WebElement Directory_Reset_btn;
		
	
	public WebDriver driver;
	
	public WebDriverWait wait;
		
	public Directorypage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
//Method for searching Directory
	
	public void SearchName(String DirectoryName,String DirectoryJob,String DirectoryLocation) 
	
	{
		Directory_Menu.click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Directory_Name.click();
		Directory_Name.sendKeys(DirectoryName);
		Directory_Name.sendKeys(Keys.TAB);	
		(new Select(Directory_Title)).selectByVisibleText(DirectoryJob);
		(new Select(Directory_Location)).selectByVisibleText(DirectoryLocation);
		Directory_Search_btn.click();
	}	
	
	//Method to select Random value from dropdown
	public void Dropdownselection(WebElement ele) {		
		
	 Select dropdown = new Select(ele);
	//Get all options
	List<WebElement> dd = dropdown.getOptions();
	 int iCnt = dd.size();
     Random num = new Random();
     int iSelect = num.nextInt(iCnt);
     dropdown.selectByIndex(iSelect);
     System.out.println("Element Name 1 : " +ele.getAttribute("value"));
	}	
	
	public String DirectoryResults(String expectedValue)
	{
		Directory_ResultsXPathStr = Directory_ResultsXPathStr.replace("PARAMETER", expectedValue);		
		WebElement ele = driver.findElement(By.xpath(Directory_ResultsXPathStr));
		String actualValue = ele.getText(); 
		return actualValue;
		}
	
	public void ResetDirectory() {		
		Directory_Reset_btn.click();	
		//dr.Dropdownselection(dr.Directory_Location);
		}	
	
	}
	
	 

	
	
	
	
	
	
		

	
	
	


