package com.DemowebShopUtility;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.DemowebShopBase.Genaric_base;
import com.DemowebShopConstants.BaseConstants;

import orangeHRM.org.Org_Base_class;

public class Utility  extends  Org_Base_class implements BaseConstants
{
	public static WebDriverWait 
	wait=new WebDriverWait(driver, 10);
	
	public static ExpectedConditions Explicity(WebElement vis,WebElement eleclick)
	{
	  WebElement visibility = wait.until(ExpectedConditions.visibilityOf(vis));
	  return  (ExpectedConditions) visibility;
	}
	public static WebElement Explicity(WebElement eleclick)
	{
	  WebElement elecclick = wait.until(ExpectedConditions.visibilityOf(eleclick));
	  return elecclick;
	}
	public static Select Select(WebElement DropDown)
	{
		Select se=new Select(DropDown);
		return se;
	}
	public static Actions Act_cl(WebDriver driver)
	{
		Actions act=new Actions(driver);
		return act;
	}
	public static Robot Robt() throws AWTException
	{
		Robot r=new Robot();
		return r;
	}
	public static Timeouts implecitily() 
	{
		Timeouts implecitily = driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return implecitily;
	}
	public static void screenshot()
	{
		TakesScreenshot tcs=(TakesScreenshot)driver;
		File fis = tcs.getScreenshotAs(OutputType.FILE);
		Date d=new Date();
		String date = d.toString();
		String d1 = date.replace(":", "-");
		File src=new File(path_of_excel+d1+".jpeg");
		try {
			FileHandler.copy(fis, src);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
	}
	
	
	
	
	
	

}
