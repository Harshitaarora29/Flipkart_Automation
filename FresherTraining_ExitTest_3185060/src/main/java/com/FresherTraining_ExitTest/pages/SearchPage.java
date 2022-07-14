package com.FresherTraining_ExitTest.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class SearchPage 
{
	WebDriver driver;
	
	public SearchPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		this.driver=driver;
	}
	
	@FindBy (how=How.XPATH,using="//button[contains(text(),'✕')]")
	public WebElement XButton;
	
	@FindBy (how=How.XPATH,using="//input[@placeholder='Search for products, brands and more']")
	public WebElement Search;
	
	@FindBy (how=How.XPATH,using="//button[@type='submit']//*[name()='svg']")
	public WebElement SubmitButton;
	
	public void Click_X() throws InterruptedException
	{
		XButton.click();
		Thread.sleep(2000);
	}
	
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
}
