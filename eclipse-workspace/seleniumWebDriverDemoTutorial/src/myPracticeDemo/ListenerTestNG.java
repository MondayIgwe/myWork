package myPracticeDemo;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerTestNG implements ITestListener{

	@Override
	public void onFinish(ITestContext result) {
		System.out.println("The Test case Finished and details are:==>"+ result.getName());
		
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("The Test case Failed and details are:==>"+ result.getName());
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("The Test case Skipped and details are:==>"+ result.getName());
		
	}

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("The Test case Started and details are:==>"+ result.getName());
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("The Test case Successful and details are:==>"+ result.getName());
		
		
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
