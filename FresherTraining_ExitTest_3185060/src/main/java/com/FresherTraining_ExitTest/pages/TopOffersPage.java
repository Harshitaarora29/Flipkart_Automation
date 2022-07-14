package com.FresherTraining_ExitTest.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class TopOffersPage
{
WebDriver driver;
	
	public TopOffersPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		this.driver=driver;
	}
	
	@FindBy (how=How.XPATH,using="//button[contains(text(),'✕')]")
	public WebElement XButton;
	
	@FindBy (how=How.XPATH,using="//div[contains(text(),'Top Offers')]")
	public WebElement TopOffers;
	
	@FindBy (how=How.XPATH,using="(//a[contains(text(),'VIEW ALL')])[2]")
	public WebElement FashionTopDeals ;
	
	@FindBy (how=How.XPATH,using="(//a[contains(text(),'VIEW ALL')])[3]")
	public WebElement TopOffersOp;
	
	@FindBy (how=How.XPATH,using="(//a[contains(text(),'VIEW ALL')])[1]")
	public WebElement DealOfTheDay;
	
	public void Click_X() throws InterruptedException
	{
		XButton.click();
		Thread.sleep(2000);
	}
	
	public void Click_TopOffers() throws InterruptedException
	{
		TopOffers.click();
		Thread.sleep(2000);
	}
	
	public void Click_FashionTopDeals() throws InterruptedException
	{
		FashionTopDeals.click();
		Thread.sleep(2000);
		
	}
		
	
	public void Click_DealOfTheDay() throws InterruptedException
	{
		
		DealOfTheDay.click();
		Thread.sleep(2000);
	}
	
}
