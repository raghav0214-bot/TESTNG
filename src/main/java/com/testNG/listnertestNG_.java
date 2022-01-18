package com.testNG;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class listnertestNG_ implements ITestListener {

	@Override
	public void onTestStart(ITestResult result)
	{
		System.out.println("Test started is " +getMethodName(result));
		Reporter.log("Test started is " +getMethodName(result));
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test succeded is " +getMethodName(result));
		Reporter.log("Test succeded is " +getMethodName(result));

	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Test failed " +getMethodName(result));
		Reporter.log("Test failed is " +getMethodName(result));

	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Test skipped " +getMethodName(result));
		Reporter.log("Test skipped is " +getMethodName(result));

	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("Test is passed Based on Percentage " +getMethodName(result));
		Reporter.log("Test is passed Based on Percentage " +getMethodName(result));

	}


	@Override
	public void onStart(ITestContext context) {
		System.out.println("All Test Execution is About to Start");
		Reporter.log("All Test Execution is About to Start");

	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("All test Execution is finished");
		Reporter.log("All test Execution is finished");

	}
	private static String getMethodName(ITestResult arg0)
	{
		return arg0.getMethod().getConstructorOrMethod().getName();
	}

}
