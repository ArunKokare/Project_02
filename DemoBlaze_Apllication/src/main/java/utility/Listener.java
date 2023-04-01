package utility;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Test execution start"+result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test execution Sucess"+result.getName());

	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Test execution Sucess"+result.getName());

		}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Test Execution Skipprd"+result.getName());
	}

	

}
