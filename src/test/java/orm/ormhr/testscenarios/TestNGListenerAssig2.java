package orm.ormhr.testscenarios;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGListenerAssig2 implements ITestListener  {
	
	public void onTestStart(ITestResult result) {
						
		System.out.println("Listener test case started");			
			
		}
	
		public void onTestSuccess(ITestResult result) {
			System.out.println("TC1"+result.getName()+"Pass");
			}
	
		public void onTestFailure(ITestResult result) {
			System.out.println("TC1"+result.getName()+"Fail");
		}

		public void onTestSkipped(ITestResult result) {
			// TODO Auto-generated method stub
			
		}

		public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
			// TODO Auto-generated method stub
			
		}

		public void onStart(ITestContext context) {
			// TODO Auto-generated method stub
			
		}

		public void onFinish(ITestContext context) {
			// TODO Auto-generated method stub
			
		}


		}		
		
	

