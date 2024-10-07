package orangeHRM.org;

import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.DemowebShopUtility.Utility;

public class Org_Runner_class extends Org_Base_class
{
	@Test
	public void validation() throws EncryptedDocumentException, IOException, InterruptedException
	{
		Org_POM_Class pm=new Org_POM_Class(driver);
		pm.Username().sendKeys("Admin");
		pm.Password().sendKeys("admin123");
		pm.LginBt().click();
		Actions act=new Actions(driver);
		act.moveToElement(pm.PIM()).click().perform();
		ArrayList<String> name=new ArrayList<String>();

		for(int i=0; i<3; i++)
		{
			pm.AddEmp().click();
			for(int j=0; j<3;j++)
			{
				j=0;
			String value = Org_DDT.DDT("sheet1", i, j);
			pm.Fistname().sendKeys(value);
			Thread.sleep(2000);
			j++;
			String value1 = Org_DDT.DDT("sheet1", i, j);
			Thread.sleep(2000);
			pm.Midlename().sendKeys(value1);
			j++;
			String value2=Org_DDT.DDT("sheet1", i, j);
			pm.lastname().sendKeys(value2);
			Thread.sleep(2000);
			pm.Save().click();
			name.add(value);
			}	
		}
		pm.Emp_List().click();
		ArrayList<WebElement> l=new ArrayList<WebElement>();
		l.add(pm.Emp1());
		l.add(pm.Emp2());
		l.add(pm.Emp3());
		JavascriptExecutor js=(JavascriptExecutor)driver;
		SoftAssert sf=new SoftAssert();
		for (WebElement wl : l) 
		{
		Point loc = wl.getLocation();
		int x = loc.getX();
		int y = loc.getY();
		js.executeScript("window.scrollBy("+x+","+y+")");
		String emp_name = wl.getText();
		for (String s1 : name) 
		{
			sf.assertEquals(emp_name,s1 );
			//verifying Actual Name With Created Name 
			System.out.println(s1);
			break;
		}
		sf.assertAll();
		Utility.Explicity(pm.Dashboard()).click();
		Utility.Explicity(pm.Paul()).click();
		Utility.Explicity(pm.Logout()).click();
		
	}
	}
}
