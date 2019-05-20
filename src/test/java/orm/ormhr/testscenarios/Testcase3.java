package orm.ormhr.testscenarios;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import orm.ormhr.pages.Adminpage;
import orm.ormhr.pages.Base_Class;
import orm.ormhr.pages.Directorypage;

public class Testcase3 extends Base_Class {
	
	
@Test
	public void SearchAdminUser() throws InterruptedException {
		(new Testcase1()).LoginTest();
		Adminpage ad = new Adminpage(driver);
		ad.SearchSystemUsers("linda.anderson","Linda Anderson","ESS","Enabled");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		System.out.println("Admin User Search Results are displayed");
	}	
@Test
	public void ResetSystemUsers() throws InterruptedException {
		(new Testcase1()).LoginTest();
		Adminpage ad = new Adminpage(driver);
		ad.SearchSystemUsers("Fiona Grace","Fiona Grace","Admin","Enabled");
		ad.ResetSystemUsers();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		System.out.println("Admin System User Reset is successful");
	}
	
	@Test
	public void SelectCheckboxForEMP() throws InterruptedException
	{
		(new Testcase1()).LoginTest();
		Adminpage ad = new Adminpage(driver);
		ad.SearchSystemUsers("linda.anderson","Linda Anderson","ESS","Enabled");
		ad.SelcetCheckBoxfromResult();	
	}

}
