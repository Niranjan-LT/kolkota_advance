package genric;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class Action 
{
	public static  Actions act(WebDriver driver)
	{
		Actions act=new Actions(driver);
		return act;
	}
	
	
	
	
}
