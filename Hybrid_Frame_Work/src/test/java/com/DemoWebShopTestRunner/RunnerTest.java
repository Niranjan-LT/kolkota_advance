package com.DemoWebShopTestRunner;

import org.testng.annotations.Test;

import com.DemowebShop.Pom.Demo_WebShop_Pom;
import com.DemowebShopBase.Genaric_base;
import com.DemowebShopUtility.Utility;

import orangeHRM.org.Org_Base_class;

public class RunnerTest extends Org_Base_class
{
	@Test
	public void validation()
	{
		Demo_WebShop_Pom pm=new Demo_WebShop_Pom(driver);
		pm.Book().click();
		pm.Add_to_Cart().click();
		pm.Shopping_cart().click();
		pm.Check_box().click();
		pm.Update_cart();
		if(pm.Empty_cart().isDisplayed())
		{
			pm.title().click();
		}
		else {
			driver.navigate().refresh();
			Utility.screenshot();
		}	
	}
	@Test(dependsOnMethods = "validation")
	void depends_other_method()
	{
		System.out.println(" testcase got Skipped");
	}
	@Test
	void depends_other_method1()
	{
		System.out.println(" testcase got Skipped");
	}
	
	
	
}
