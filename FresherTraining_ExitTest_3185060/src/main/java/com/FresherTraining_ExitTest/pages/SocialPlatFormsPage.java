package com.FresherTraining_ExitTest.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;	
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class SocialPlatFormsPage 
{
	WebDriver driver;
	
	public SocialPlatFormsPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		this.driver=driver;
	}
	
	@FindBy (how=How.XPATH,using="//button[contains(text(),'✕')]")
	public WebElement XButton;
	
	@FindBy (how=How.XPATH,using="//a[normalize-space()='Facebook']")
	public WebElement FaceBook ;
	
	@FindBy (how=How.XPATH,using="//a[normalize-space()='Twitter']")
	public WebElement Twitter ;
	
	@FindBy (how=How.XPATH,using="//a[normalize-space()='YouTube']")
	public WebElement YouTube ;
	
	public void Click_X() throws InterruptedException
	{
		XButton.click();
		Thread.sleep(2000);
	}
	
	public void Click_FaceBook() throws InterruptedException
	{
		FaceBook.click();
		Thread.sleep(5000);		
	}
	
	public void Click_Twitter() throws InterruptedException
	{
		Twitter.click();
		Thread.sleep(5000);		
	}
	
	public void Click_YouTube() throws InterruptedException
	{
		YouTube.click();
		Thread.sleep(5000);		
	}
}
