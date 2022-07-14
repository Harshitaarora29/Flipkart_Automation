package com.FresherTraining_ExitTest.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ElectronicsPage 
{
	WebDriver driver;
	
	public ElectronicsPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		this.driver=driver;
	}
	
	@FindBy (how=How.XPATH,using="//button[contains(text(),'✕')]")
	public WebElement XButton;
	
	@FindBy (how=How.XPATH,using="//div[contains(text(),'Electronics')]")
	public WebElement Electronics ;
	
	@FindBy (how=How.XPATH,using="//a[normalize-space()='Audio']")
	public WebElement Audio ;
	
	@FindBy (how=How.XPATH,using="//a[normalize-space()='Gaming']")
	public WebElement Gaming ;
	
	@FindBy (how=How.XPATH,using="//a[normalize-space()='Cameras & Accessories']")
	public WebElement Cameras_and_Accessories;
	
	@FindBy (how=How.XPATH,using="//a[normalize-space()='MobileAccessory']")
	public WebElement Mobile_Accessory ;
	
	
	public void Click_X() throws InterruptedException
	{
		XButton.click();
		Thread.sleep(2000);
	}
	
	public void Hover_Electronics() throws InterruptedException
	{
		Actions action = new Actions(driver);
		action.moveToElement(Electronics).perform();
		Thread.sleep(2000);		
	}
	
	public void Click_Audio() throws InterruptedException
	{
		Actions action = new Actions(driver);
		action.moveToElement(Audio);
		action.click().build().perform();
		Thread.sleep(5000);	
	}
	
	public void Click_Gaming() throws InterruptedException
	{
		Actions action = new Actions(driver);
		action.moveToElement(Gaming );
		action.click().build().perform();
		Thread.sleep(5000);	
	}
	
	public void Click_Cameras_and_Accessories() throws InterruptedException
	{
		Actions action = new Actions(driver);
		action.moveToElement(Cameras_and_Accessories);
		action.click().build().perform();
		Thread.sleep(5000);	
	}
	
	public void Click_Mobile_Accessory() throws InterruptedException
	{
		Actions action = new Actions(driver);
		action.moveToElement(Mobile_Accessory);
		action.click().build().perform();
		Thread.sleep(5000);	
	}
}
