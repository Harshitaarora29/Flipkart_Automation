package com.FresherTraining_ExitTest.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class BecomeSellerPage 
{
WebDriver driver;

	
	public BecomeSellerPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		this.driver=driver;
	}
	@FindBy (how=How.XPATH,using="//button[contains(text(),'✕')]")
	public WebElement XButton;
	
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
}
