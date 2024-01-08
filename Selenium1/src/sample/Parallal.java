package sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parallal 
{
	WebDriver driver;
	@Parameters({"browser"})
	@Test
	public void test(String browser) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		if(browser.equals("chrome"))
		{
			 driver=new ChromeDriver();
			 Thread.sleep(2000);
			driver.get("https://www.google.com");
			System.out.println("chrome");
		}
		
		else
		{
			driver=new FirefoxDriver();
			driver.get("https://www.facebook.com");
			System.out.println("firefox");
		}

	}
	

}
