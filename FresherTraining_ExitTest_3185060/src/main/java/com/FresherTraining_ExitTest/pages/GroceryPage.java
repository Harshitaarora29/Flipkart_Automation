package com.FresherTraining_ExitTest.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class GroceryPage 
{
	WebDriver driver;
	
	public GroceryPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		this.driver=driver;
	}
	
	@FindBy (how=How.XPATH,using="//button[contains(text(),'✕')]")
	public WebElement XButton;
	
	@FindBy (how=How.XPATH,using="//div[contains(text(),'Grocery')]")
	public WebElement Grocery;
	
	@FindBy (how=How.XPATH,using="//input[@placeholder='Search grocery products']")
	public WebElement GrocerySearchBar;
	
	@FindBy (how=How.XPATH,using="//button[@type='submit']")
	public WebElement SubmitButton;
	
	public void Click_X() throws InterruptedException
	{
		XButton.click();
		Thread.sleep(2000);
	}
	
	public void Click_Grocery() throws InterruptedException
	{
		Grocery.click();
		Thread.sleep(2000);
	}
	
	public void Enter_Groceries(String Groc) throws InterruptedException
	{
		GrocerySearchBar.sendKeys(Groc);
		SubmitButton.click();
		Thread.sleep(2000);
		
	}
	
}
