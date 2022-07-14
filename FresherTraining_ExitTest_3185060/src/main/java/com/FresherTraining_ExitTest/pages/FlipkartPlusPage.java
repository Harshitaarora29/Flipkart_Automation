package com.FresherTraining_ExitTest.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class FlipkartPlusPage 
{
	
	
	WebDriver driver;
	
	public FlipkartPlusPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		this.driver=driver;
	}
	
	@FindBy (how=How.XPATH,using="//button[contains(text(),'✕')]")
	public WebElement XButton;
	
	@FindBy (how=How.XPATH,using="//span[@class='_2FVHGh']")
	public WebElement FlipkartPlus;
	
	@FindBy (how=How.XPATH,using="(//img[@class='kJjFO0 _3DIhEh'])[9]")
	public WebElement ProductsAt1;
	
	@FindBy (how=How.XPATH,using="//button[@type='submit']")
	public WebElement GetExtra;
	
	public void Click_X() throws InterruptedException
	{
		XButton.click();
		Thread.sleep(2000);
	}
	
	public void Click_FlipkartPlus() throws InterruptedException
	{
		FlipkartPlus.click();
		Thread.sleep(2000);
	}
	
	public void Click_ProductsAt1() throws InterruptedException
	{
		ProductsAt1.click();
		Thread.sleep(2000);
	}
	
	public void Click_GetExtra() throws InterruptedException
	{
		
		GetExtra.click();
		Thread.sleep(2000);
		
	}
}
