package com.FresherTraining_ExitTest.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class CartPage
{
	WebDriver driver;
	
	public CartPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		this.driver=driver;
		
	}
	
	@FindBy (how=How.XPATH,using="//button[contains(text(),'✕')]")
	public WebElement XButton;
	
	@FindBy (how=How.XPATH,using="//span[normalize-space()='Cart']")
	public WebElement Cart;
	
	
	public void Click_X() throws InterruptedException
	{
		XButton.click();
		Thread.sleep(2000);
	}
	
	public void click_Cart() throws InterruptedException
	{
		Cart.click();
		Thread.sleep(2000);		
	}
	

}
