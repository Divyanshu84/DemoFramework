package com.listners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public  class ListnerCall implements ITestListener{

	public void onTestStart(ITestResult result)
	{
		
		System.out.println(" Test case started "+result.getName());
		
	}

	public void onTestSuccess(ITestResult result) 
	{
		
		System.out.println(" Test case Success "+result.getName());
	}

	public void onTestFailure(ITestResult result) {
		
		System.out.println(" Test case Failure "+result.getName());
	}

	public void onTestSkipped(ITestResult result) {
		
		System.out.println(" Test case Skipped "+result.getName());
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
		
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	

	
	

}
