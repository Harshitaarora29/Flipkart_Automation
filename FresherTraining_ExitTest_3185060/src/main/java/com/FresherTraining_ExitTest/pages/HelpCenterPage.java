package com.FresherTraining_ExitTest.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HelpCenterPage 
{
	WebDriver driver;
	
	public HelpCenterPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		this.driver=driver;
	}
	
	@FindBy (how=How.XPATH,using="//button[contains(text(),'✕')]")
	public WebElement XButton;
	
	@FindBy (how=How.XPATH,using="//span[normalize-space()='Help Center']")
	public WebElement Help_Center;
	
	@FindBy (how=How.XPATH,using="//div[normalize-space()='I want to track my order']")
	public WebElement Help_With_Orders;
	
	@FindBy (how=How.XPATH,using="//div[normalize-space()='I want help with returns & refunds']")
	public WebElement Help_With_returns_refunds;
	
	@FindBy (how=How.XPATH,using="//div[normalize-space()='I want help with other issues']")
	public WebElement Help_With_Others;
	
	@FindBy (how=How.XPATH,using="//div[contains(text(),'I want to contact the seller')]")
	public WebElement  Help_Contact_Seller;
	
	public void Click_X() throws InterruptedException
	{
		XButton.click();
		Thread.sleep(2000);
	}
	
	public void ClickHelp_Center() throws InterruptedException
	{
		Help_Center.click();
		Thread.sleep(1000);
	}
	
	public void ClickHelp_With_Orders() throws InterruptedException
	{
		Help_With_Orders.click();
		Thread.sleep(2000);
	}
	
	public void ClickHelp_With_returns_refunds() throws InterruptedException
	{
		Help_With_returns_refunds.click();
		Thread.sleep(2000);
	}
	
	public void ClickHelp_With_Others() throws InterruptedException
	{
		Help_With_Others.click();
		Thread.sleep(2000);
	}
	
	public void ClickHelp_Contact_Seller() throws InterruptedException
	{
		Help_Contact_Seller.click();
		Thread.sleep(2000);
	}
	
}
