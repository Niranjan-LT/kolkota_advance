package orangeHRM.org;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.DemowebShopUtility.ExtentManager;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Org_Base_class implements Constants
{
	public static WebDriver driver;

	//public ExtentTest test;
	@BeforeTest
	public void utils()
	{
		ExtentManager.getInstance();
	}
	
	@BeforeMethod
	public void launchapp()
	{
		ExtentTest	test=ExtentManager.getInstance().startTest("test"+getClass().getName());
		ExtentManager.setTest(test);
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(Base_url);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	@AfterMethod
	public void closeapp()
	{
		driver.quit();
		ExtentManager.endTest();
		ExtentManager.flush();
	}
	@AfterSuite
	public void end_ofutil()
	{
		ExtentManager.flush();
	}
	
	
	
}
