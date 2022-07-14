package com.FresherTraining_ExitTest.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class FlipkartAdvertisePage 
{
	WebDriver driver;
	
	public FlipkartAdvertisePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		this.driver=driver;
	}
	
	@FindBy (how=How.XPATH,using="//button[contains(text(),'✕')]")
	public WebElement XButton;
	
	@FindBy (how=How.XPATH,using="//span[normalize-space()='Advertise']")
	public WebElement Advertise;
	
	@FindBy (how=How.XPATH,using="//input[@placeholder='Search for a brand or category']")
	public WebElement Search_for_Brand_or_category;
	
	@FindBy (how=How.XPATH,using="//img[@alt='Search']")
	public WebElement SearchButton;
	
	@FindBy (how=How.XPATH,using="//a[normalize-space()='Flipkart Advertising']")
	public WebElement FlipkartAdvertise;
	
	public void Click_X() throws InterruptedException
	{
		XButton.click();
		Thread.sleep(2000);
	}
	
	public void Click_Advertise() throws InterruptedException
	{
		Advertise.click();
		Thread.sleep(2000);
	}
	
	public void Enter_Brand_or_category(String Brand) throws InterruptedException
	{
		Search_for_Brand_or_category.sendKeys(Brand);
		SearchButton.click();
		Thread.sleep(2000);
		
	}
	
	public void Click_FlipkartAdvertising() throws InterruptedException
	{
		FlipkartAdvertise.click();
		Thread.sleep(2000);
	}
}
