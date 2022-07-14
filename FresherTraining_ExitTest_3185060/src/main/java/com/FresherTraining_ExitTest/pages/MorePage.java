package com.FresherTraining_ExitTest.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class MorePage
{
	WebDriver driver;
	
	public MorePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		this.driver=driver;
	}
	
	@FindBy (how=How.XPATH,using="//button[contains(text(),'✕')]")
	public WebElement XButton;
	
	@FindBy (how=How.XPATH,using="/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[5]/div[1]/div[1]/div[1]/div[1]")
	public WebElement More;
	
	@FindBy (how=How.XPATH,using="//div[normalize-space()='Notification Preferences']")
	public WebElement Notification ;
	
	@FindBy (how=How.XPATH,using="//div[normalize-space()='24x7 Customer Care']")
	public WebElement _24x7_Customer_Care;
	
	@FindBy (how=How.XPATH,using="//div[normalize-space()='Download App']")
	public WebElement Download_App;
	
	
	public void Click_X() throws InterruptedException
	{
		XButton.click();
		Thread.sleep(2000);
	}
	
	public void Hover_More() throws InterruptedException
	{
		Actions action = new Actions(driver);
		action.moveToElement(More).perform();
		Thread.sleep(2000);		
	}
	
	public void Click_Notification() throws InterruptedException
	{
		Actions action = new Actions(driver);
		action.moveToElement(Notification);
		action.click().build().perform();
		Thread.sleep(2000);	
	}
	
	public void Click_24x7_Customer_Care() throws InterruptedException
	{
		Actions action = new Actions(driver);
		action.moveToElement(_24x7_Customer_Care);
		action.click().build().perform();
		Thread.sleep(5000);	
	}
	
	public void Click_Download_App() throws InterruptedException
	{
		Actions action = new Actions(driver);
		action.moveToElement(Download_App);
		action.click().build().perform();
		Thread.sleep(5000);	
	}
	

}
