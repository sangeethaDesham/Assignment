package orm.ormhr.testscenarios;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.Test;
import orm.ormhr.pages.Adminpage;
import orm.ormhr.pages.AssignLeavepage;
import orm.ormhr.pages.Base_Class;

public class TestCase4 extends Base_Class {
	
	@Test
	public void SearchAdminUser() throws InterruptedException {
		(new Testcase1()).LoginTest();
		AssignLeavepage ap = new AssignLeavepage(driver);
		ap.AssignLeave("Linda Anderson","Paternity US","2019-05-02","2019-05-02","Full Day","test");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		System.out.println("Leave Assigned Successfully");

	}
}
