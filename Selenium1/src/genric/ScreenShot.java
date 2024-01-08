package genric;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot 
{
	

	public  static void sc(WebDriver driver)
	{
	
		Date d=new Date();
		String d1 = d.toString();
		 String date = d1.replace(":", "-");
		 
		 System.out.println(date);
		
		
	TakesScreenshot tc=(TakesScreenshot)driver;
	File src = tc.getScreenshotAs(OutputType.FILE);
	File target=new File(".\\sc\\"+date+".jpeg");
	try 
	{
		FileHandler.copy(src, target);
	} catch (IOException e) 
	{	
		e.printStackTrace();
	}
	
	}
}
	


