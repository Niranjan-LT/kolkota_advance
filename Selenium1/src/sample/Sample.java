package sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sample 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		//System.setProperty("webdriver.firefox.bin", "C:\\Users\\USER\\Downloads\\geckodriver-v0.33.0-win64\\geckodriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		//		driver.get("https://demoapps.qspiders.com/image/linkImage?sublist=2");
//		
//		Thread.sleep(2000);
//		
//		WebElement src = driver.findElement(By.xpath("//img[@src='/static/media/men.c2174a1823cfd5f1ac43.jpg']"));
//		Thread.sleep(1000);
//		genric.Actions_class.MoveToElement(driver, src);
		//ScreenShot.sc(driver);
	
	}

}
