package com.FresherTraining_ExitTest.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class AppliancesPage 
{
	WebDriver driver;
	
	public AppliancesPage (WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		this.driver=driver;
	}
	
	@FindBy (how=How.XPATH,using="//button[contains(text(),'✕')]")
	public WebElement XButton;
	
	@FindBy (how=How.XPATH,using="//div[contains(text(),'Appliances')]")
	public WebElement Appliances;
	
	@FindBy (how=How.XPATH,using="(//img[@alt='wash'])[4]")
	public WebElement WashingMachine;
	
	@FindBy (how=How.XPATH,using="(//img[@alt='AC-Large-Mall-Mode-Nav-1'])[2]")
	public WebElement AirConditioner  ;
	
	@FindBy (how=How.XPATH,using="(//img[@alt='dd'])[2]")
	public WebElement Telivisions  ;
	
	@FindBy (how=How.XPATH,using="(//img[@alt='SEAS-Fans and cooler'])[2]")
	public WebElement Fans_and_Cooler ;
	
	

	public void Click_X() throws InterruptedException
	{
		XButton.click();
		Thread.sleep(2000);
	}
	
	public void Click_Appliances() throws InterruptedException
	{
		Appliances.click();
		Thread.sleep(2000);
	}
	
	public void Click_WashingMachine() throws InterruptedException
	{
		WashingMachine.click();
		Thread.sleep(2000);
	}
	
	public void Click_AirConditioner() throws InterruptedException
	{
		AirConditioner.click();
		Thread.sleep(2000);
	}
	public void Click_Telivisions() throws InterruptedException
	{
		Telivisions.click();
		Thread.sleep(2000);
	}
	
	public void Click_Fans_and_Cooler() throws InterruptedException
	{
		Fans_and_Cooler.click();
		Thread.sleep(2000);
	}
}
