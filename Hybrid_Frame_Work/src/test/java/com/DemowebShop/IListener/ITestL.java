package com.DemowebShop.IListener;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.DemowebShopUtility.ExtentManager;
import com.DemowebShopUtility.Utility;
import com.relevantcodes.extentreports.LogStatus;

import orangeHRM.org.Org_Base_class;

public  class ITestL  extends Org_Base_class implements ITestListener
{
	public void onTestStart(ITestResult result) {
		System.out.println("hi");
		
	}

	public void onTestSuccess(ITestResult result) {
		ExtentManager.getTest().log(LogStatus.PASS, "test Successfully Done");

	}

	public void onTestFailure(ITestResult result) {
		Utility.screenshot();
		
		ExtentManager.getTest().log(LogStatus.FAIL, "Test case got failure");
	}

	public void onTestSkipped(ITestResult result)
	{
		ExtentManager.getTest().log(LogStatus.SKIP,"skipped");
		
		
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
