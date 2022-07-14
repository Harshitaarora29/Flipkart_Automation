package com.FresherTraining_ExitTest.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePage
{
	WebDriver driver;
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		this.driver=driver;
	}
	
	@FindBy (how=How.XPATH,using="//button[contains(text(),'✕')]")
	public WebElement XButton;
	
	@FindBy (how=How.XPATH,using="//div[@class='xtXmba'][normalize-space()='Home']")
	public WebElement Home;
	
	@FindBy (how=How.XPATH,using="//a[normalize-space()='Home Furnishings']")
	public WebElement HomeFurnishings ;
	
	@FindBy (how=How.XPATH,using="//a[normalize-space()='Kitchen & Dining']")
	public WebElement Kitchen_and_Dining  ;
	
	@FindBy (how=How.XPATH,using="//a[normalize-space()='Bedroom Furniture']")
	public WebElement Bedroom_Furniture  ;
	
	@FindBy (how=How.XPATH,using="//a[normalize-space()='Home Decor']")
	public WebElement HomeDecor ;
	
	
	public void Click_X() throws InterruptedException
	{
		XButton.click();
		Thread.sleep(2000);
	}
	
	public void Hover_Home() throws InterruptedException
	{
		Actions action = new Actions(driver);
		action.moveToElement(Home).perform();
		Thread.sleep(2000);		
	}
	
	public void Click_HomeFurnishings() throws InterruptedException
	{
		Actions action = new Actions(driver);
		action.moveToElement(HomeFurnishings);
		action.click().build().perform();
		Thread.sleep(5000);	
	}
	
	public void Click_Kitchen_and_Dining () throws InterruptedException
	{
		Actions action = new Actions(driver);
		action.moveToElement(Kitchen_and_Dining);
		action.click().build().perform();
		Thread.sleep(5000);	
	}

}
