package com.FresherTraining_ExitTest.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class NavigationBarPage 
{
WebDriver driver;

	
	public NavigationBarPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		this.driver=driver;
	}
	
	@FindBy (how=How.XPATH,using="//button[contains(text(),'✕')]")
	public WebElement XButton;
	
	
	//BecomeSeller
	@FindBy (how=How.XPATH,using="//a[@class='_3-PJz-']//span[contains(text(),'Become a Seller')]")
	public WebElement Op_BecomeSeller;
	
	@FindBy (how=How.XPATH,using="//a[normalize-space()='Fee Structure']")
	public WebElement Op_FeeStructure;
	
	@FindBy (how=How.LINK_TEXT,using="Services")
	public WebElement Op_Services;
	
	
	public void Click_X() throws InterruptedException
	{
		XButton.click();
		Thread.sleep(2000);
	}
	
	public void click_FeeStructure()
	{
		Op_FeeStructure.click();
	}
	
	public void click_BecomeSeller()
	{
		Op_BecomeSeller.click();
	}
	
	public void click_Services()
	{
		Op_Services.click();
	}
	
	
	//Search 
	
	@FindBy (how=How.XPATH,using="//input[@placeholder='Search for products, brands and more']")
	public WebElement Search;
	
	@FindBy (how=How.XPATH,using="//button[@type='submit']//*[name()='svg']")
	public WebElement SubmitButton;
	
	
	public void Enter_Search(String prod) throws InterruptedException
	{
		Search.sendKeys(prod);
		Thread.sleep(2000);
	}
	
	public void Click_SubmitButton() throws InterruptedException
	{		
		SubmitButton.click();
		Thread.sleep(2000);		
	}
	
	//cart
	@FindBy (how=How.XPATH,using="//span[normalize-space()='Cart']")
	public WebElement Cart;
	
	
	public void click_Cart() throws InterruptedException
	{
		Cart.click();
		Thread.sleep(2000);		
	}
	
	//flipkartPlus
	
	@FindBy (how=How.XPATH,using="//span[@class='_2FVHGh']")
	public WebElement FlipkartPlus;
	
	@FindBy (how=How.XPATH,using="(//img[@class='kJjFO0 _3DIhEh'])[9]")
	public WebElement ProductsAt1;

	
	public void Click_FlipkartPlus() throws InterruptedException
	{
		FlipkartPlus.click();
		Thread.sleep(2000);
	}
	
	public void Click_ProductsAt1() throws InterruptedException
	{
		ProductsAt1.click();
		Thread.sleep(2000);
	}
}
