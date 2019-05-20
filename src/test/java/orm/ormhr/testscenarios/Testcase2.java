package orm.ormhr.testscenarios;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import junit.framework.Assert;
import orm.ormhr.pages.Base_Class;
import orm.ormhr.pages.Directorypage;

public class Testcase2 extends Base_Class {
		
	@Test
	public void SearchDirectory() throws InterruptedException {
		(new Testcase1()).LoginTest();
		Directorypage dr = new Directorypage(driver);
		dr.SearchName("Linda Anderson","HR Manager","All");
		String expectedValue = "Linda Anderson";
		String actualValue = dr.DirectoryResults(expectedValue);
		Assert.assertEquals(expectedValue, actualValue);
		System.out.println("Correct Search results are displayed");		

	}
	
	@Test
	public void ResetDirectory() throws InterruptedException {
		(new Testcase1()).LoginTest();
		Directorypage dr = new Directorypage(driver);
		dr.SearchName("Fiona Grace","All","All");		
		dr.ResetDirectory();
		System.out.println("Directory user details Reset is succesful");	
	}

}
