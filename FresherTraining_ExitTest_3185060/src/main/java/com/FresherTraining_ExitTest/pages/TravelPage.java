package com.FresherTraining_ExitTest.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class TravelPage 
{
WebDriver driver;
	
	public TravelPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		this.driver=driver;
	}
	
	@FindBy (how=How.XPATH,using="//button[contains(text(),'✕')]")
	public WebElement XButton;
	
	@FindBy (how=How.XPATH,using="//div[contains(text(),'Travel')]")
	public WebElement Travel;
	
	@FindBy (how=How.XPATH,using="//input[@name='0-departcity']")
	public WebElement DepartureCity ;
	
	@FindBy (how=How.XPATH,using="//input[@name='0-arrivalcity']")
	public WebElement ArrivalCity;
	
	@FindBy (how=How.XPATH,using="//input[@name='0-travellerclasscount']")
	public WebElement TravellerClass;
	
	@FindBy (how=How.XPATH,using="//div[@data-checked='false'][normalize-space()='Economy']")
	public WebElement EconomyOp;
	
	@FindBy (how=How.XPATH,using="//div[contains(text(),'Premium Economy')]")
	public WebElement PremiumOp;
	
	@FindBy (how=How.XPATH,using="//div[contains(text(),'Business')]")
	public WebElement BusinessOp;
	
	@FindBy (how=How.XPATH,using="//button[normalize-space()='Done']")
	public WebElement DoneButton;
	
	@FindBy (how=How.XPATH,using="//button[@type='button']")
	public WebElement SearchButton;
	
	public void Click_X() throws InterruptedException
	{
		XButton.click();
		Thread.sleep(2000);
	}
	
	public void Click_Travel() throws InterruptedException
	{
		Travel.click();
		Thread.sleep(2000);
	}
	
	public void Enter_DepartureCity(String city1) throws InterruptedException
	{
		DepartureCity.sendKeys(city1);
		Actions keyDown = new Actions(driver);
		keyDown.sendKeys(Keys.chord(Keys.DOWN, Keys.DOWN)).perform();
		SearchButton.click();
		Thread.sleep(2000);
		
	}
	
	public void Enter_ArrivalCity(String city2) throws InterruptedException
	{
		ArrivalCity.sendKeys(city2);
		Actions keyDown = new Actions(driver);
		keyDown.sendKeys(Keys.chord(Keys.DOWN, Keys.DOWN)).perform();
		SearchButton.click();
		Thread.sleep(2000);
	}
	
	
	public void Click_TravellerClass() throws InterruptedException
	{
		TravellerClass.click();
		Thread.sleep(2000);
	}
	
}
