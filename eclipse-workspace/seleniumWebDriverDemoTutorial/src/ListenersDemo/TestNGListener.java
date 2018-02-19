package ListenersDemo;

import org.apache.poi.util.SystemOutLogger;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNGListener implements ITestListener{

	

	@Override
	public void onTestFailure(ITestResult result) {
		try {
			
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("TestCases failed and details are "+result.getName());
		
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("TestCases Skipped and details are "+result.getName());
		
	}

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("TestCases Started and details are "+result.getName());
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		try {
			System.out.println(result.getName());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
		System.out.println("TestCases Successfull and Test details are "+result.getName());
		
	}

	@Override
	public void onFinish(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

}
