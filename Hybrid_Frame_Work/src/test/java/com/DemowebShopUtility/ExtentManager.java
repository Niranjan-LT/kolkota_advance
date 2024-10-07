package com.DemowebShopUtility;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class ExtentManager 
{    private static ExtentReports reports;
	private static ThreadLocal<ExtentTest> test = new ThreadLocal();

	static String path="login.html";

public static ExtentReports getInstance() 
{
    if (reports == null) {
        reports = new ExtentReports(path);
    }
    return reports;
}

public static ExtentTest getTest() {
    return test.get();
}

public static void setTest(ExtentTest extentTest) {
    test.set(extentTest);
}

public static void endTest() {
    if (getTest() != null) {
        getInstance().endTest(getTest());
    }
}

public static void flush() {
    getInstance().flush();
}
}


