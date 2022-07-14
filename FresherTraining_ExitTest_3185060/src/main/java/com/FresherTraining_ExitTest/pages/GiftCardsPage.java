package com.FresherTraining_ExitTest.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class GiftCardsPage 
{
    WebDriver driver;
	
	public GiftCardsPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		this.driver=driver;
	}
	
	@FindBy (how=How.XPATH,using="//button[contains(text(),'✕')]")
	public WebElement XButton;
	
	@FindBy (how=How.XPATH,using="//span[normalize-space()='Gift Cards']")
	public WebElement GiftCards;
	
	@FindBy (how=How.XPATH,using="(//img[@alt='digital'])[2]")
	public WebElement DigitalGiftCards;
	
	@FindBy (how=How.XPATH,using="(//img[@alt='physical'])[2]")
	public WebElement PhysicalGiftCards;
	
	@FindBy (how=How.XPATH,using="(//img[@alt='anniversary'])[2]")
	public WebElement AnniversaryGiftCards;
	
	@FindBy (how=How.XPATH,using="(//img[@alt='birthday'])[2]")
	public WebElement BirthdayGiftCards;

	
	public void Click_X() throws InterruptedException
	{
		XButton.click();
		Thread.sleep(2000);
	}
	
	public void Click_GiftCards() throws InterruptedException
	{
		GiftCards.click();
		Thread.sleep(2000);
	}
	
	public void Click_DigitalGiftCards() throws InterruptedException
	{		
		DigitalGiftCards.click();
		Thread.sleep(2000);		
	}
	
	public void Click_PhysicalGiftCards() throws InterruptedException
	{		
		PhysicalGiftCards.click();
		Thread.sleep(2000);		
	}
	
	public void Click_AnniversaryGiftCards() throws InterruptedException
	{		
		AnniversaryGiftCards.click();
		Thread.sleep(2000);		
	}
	
	public void Click_BirthdayGiftCards() throws InterruptedException
	{		
		BirthdayGiftCards.click();
		Thread.sleep(2000);		
	}
	
}
