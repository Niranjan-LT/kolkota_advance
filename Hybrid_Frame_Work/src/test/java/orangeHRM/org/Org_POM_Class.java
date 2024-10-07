package orangeHRM.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Org_POM_Class {

	@FindBy(xpath="//input[@name='username']")
	private WebElement US;
	@FindBy(xpath="//input[@name='password']")
	private WebElement PWD;
	@FindBy(xpath="//button[.=' Login ']")
	private WebElement LoginBt;
	@FindBy(xpath="//span[.='PIM']")
	private WebElement PIM;
	@FindBy(xpath="//a[.='Add Employee']")
	private WebElement AddEmp;
	@FindBy(xpath="//input[@name='firstName']")
	private WebElement Fistname;
	@FindBy(xpath="//input[@name='middleName']")
	private WebElement Midlename;
	@FindBy(xpath="//input[@name='lastName']")
	private WebElement lastname;
	@FindBy(xpath="//label[.='Employee Id']/../following-sibling::div[1]/input")
	private WebElement EMP_id;
	@FindBy(xpath="//button[.=' Save ']")
	private WebElement Save;
	@FindBy(xpath="//a[.='Employee List']")
	private WebElement Emp_List;
	@FindBy(xpath="//div[.='Agasthya KA']")
	private WebElement Emp1;
	@FindBy(xpath="//div[.='Prajwal Nayak']")
	private WebElement Emp2;
	@FindBy(xpath="//div[.='Sandeep Sandy']")
	private WebElement Emp3;
	
	@FindBy(xpath="//span[.='Dashboard']")
	private WebElement Dashboard;
	@FindBy(xpath="//p[.='PaulPaul CollingsCollings']")
	private WebElement Paul;
	@FindBy(xpath="//a[.='Logout']")
	private WebElement Logout;
	
	public Org_POM_Class(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public WebElement Username()
	{
		return US;
	}
	public WebElement Password()
	{
		return PWD;
	}
	public WebElement LginBt()
	{
		return LoginBt;
	}
	
	public WebElement PIM()
	{
		return PIM;
	}
	public WebElement AddEmp()
	{
		return AddEmp;
	}
	public WebElement Fistname()
	{
		return Fistname;
	}
	public WebElement Midlename()
	{
		return Midlename;
	}
	public WebElement lastname()
	{
		return lastname;
	}
	public WebElement EMP_id()
	{
		return EMP_id;
	}
	
	public WebElement Save()
	{
		return Save;
	}
	public WebElement Emp_List()
	{
		return Emp_List;
	}
	public WebElement Emp1()
	{
		return Emp1;
	}
	public WebElement Emp2()
	{
		return Emp2;
	}
	public WebElement Emp3()
	{
		return Emp3;
	}
	public WebElement Dashboard()
	{
		return Dashboard;
	}
	public WebElement Paul()
	{
		return Paul;
	}
	public WebElement Logout()
	{
		return Logout;
	}
	
	
	
}
