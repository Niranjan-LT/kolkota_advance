package com.DemowebShop.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Demo_WebShop_Pom {

	@FindBy(xpath="//div[@class='header-menu']/ul[1]/li[1]/a")
	private WebElement Book;
	@FindBy(xpath="//a[.='Computing and Internet']/../../div[3]//input")
	private WebElement Add_to_Cart;
	@FindBy(xpath="//span[.='Shopping cart']")
	private WebElement Shopping_cart;
	@FindBy(xpath="//a[.='Computing and Internet']/../../td[1]/input")
	private WebElement Check_box;
	@FindBy(xpath="//input[@value='Update shopping cart']")
	private WebElement Update_Cart;
	@FindBy(xpath="//div[@class='order-summary-content']")
	private WebElement Empty_cart;
	@FindBy(xpath="//div[@id='bar-notification']")
	private WebElement confirm_notifiaction;
	@FindBy(xpath="//img[@alt='Tricentis Demo Web Shop']")
	private WebElement title;
	
	public Demo_WebShop_Pom(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public WebElement Book()
	{
		return Book;
	}
	public WebElement Add_to_Cart()
	{
		return Add_to_Cart;
	}
	public WebElement Shopping_cart()
	{
		return Shopping_cart;
	}
	public WebElement Check_box()
	{
		return Check_box;
	}
	public WebElement Update_cart()
	{
		return Update_Cart;
	}
	public WebElement Empty_cart()
	{
		return Empty_cart;
	}
	public WebElement confirm_notifiaction()
	{
		return confirm_notifiaction;
	}
	public WebElement title()
	{
		return title;
	}
	
	
	
	
	
	
	
	
	
	
	
}
