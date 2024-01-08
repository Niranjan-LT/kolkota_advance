package genric;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import net.bytebuddy.implementation.bind.annotation.Super;



public class Actions_class extends Action
{
	
	
	public  static void MoveToElement(WebDriver driver , WebElement ele)
	{
		Actions act = Action.act(driver);
		act.moveToElement(ele).build().perform();
	}
//	public static void DoubleClick(WebElement ele)
//	{
//		act=new Actions(driver);
//		act.contextClick(ele).perform();
//	}
}
