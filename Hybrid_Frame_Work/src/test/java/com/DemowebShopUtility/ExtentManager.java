package com.DemowebShopUtility;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class ExtentManager
{ 
	public static ExtentReports reports;
	
	
	
	
	
	
	 //creating the thread Local to  initiate test
	public static ThreadLocal<ExtentTest> test = new ThreadLocal();
	// report name with extention
	static String path="login.html";
	// calling instance of Extent_report
	
	
	public static ExtentReports getInstance() 
	{
    if (reports == null) 
    {
        reports = new ExtentReports(path);
    }
    return reports;
	}
	//calling the 
public static ExtentTest getTest() 
{
    return test.get();
}
public static void setTest(ExtentTest extentTest) 
{
    test.set(extentTest);
}

public static void endTest() 
{
    if (getTest() != null) 
    {
        getInstance().endTest(getTest());
    }
}
public static void flush() 
{
    getInstance().flush();
}
}


