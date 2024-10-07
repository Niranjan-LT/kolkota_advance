package com.DemowebShopBase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.DemowebShopConstants.BaseConstants;
import com.DemowebShopUtility.Utility;

public class Genaric_base implements BaseConstants
{
	public static  WebDriver driver;
	@BeforeMethod
	public  void openappl()
	{
		System.setProperty(chrome_key, chrome_value);
		driver=new ChromeDriver();
		Utility.implecitily();
		
		driver.get(base_url);
		//passing the base URl;
		driver.manage().window().maximize();
	}
	
	@AfterMethod
	public void closeapp()
	{
		
		driver.close();
	}
}
