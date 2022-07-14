package com.FresherTraining_ExitTest.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class FashionOpPage 
{
	WebDriver driver;
	
	public FashionOpPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		this.driver=driver;
	}
	
	@FindBy (how=How.XPATH,using="//button[contains(text(),'✕')]")
	public WebElement XButton;
	
	@FindBy (how=How.XPATH,using="//div[contains(text(),'Fashion')]")
	public WebElement FashionOp ;
	
	@FindBy (how=How.XPATH,using="//a[@class='_6WOcW9 _2-k99T']")
	public WebElement subMenu ;
	
	@FindBy (how=How.XPATH,using="//a[normalize-space()='All']")
	public WebElement MenFashion ;
	
	@FindBy (how=How.XPATH,using="//a[normalize-space()='Women Western']")
	public WebElement WomenWestern;
	
	@FindBy (how=How.XPATH,using="//a[normalize-space()='Women Ethnic']")
	public WebElement WomensEthnic;
	
	public void Click_X() throws InterruptedException
	{
		XButton.click();
		Thread.sleep(2000);
	}
	
	public void Hover_FashionOp() throws InterruptedException
	{
		Actions action = new Actions(driver);
		action.moveToElement(FashionOp).perform();
		action.moveToElement(subMenu).perform();
		Thread.sleep(5000);		
	}
	
	public void Click_MensFashion() throws InterruptedException
	{
		Actions action = new Actions(driver);
		action.moveToElement(MenFashion);
		action.click().build().perform();
		Thread.sleep(5000);	
	}
	
	public void Click_WomenWestern() throws InterruptedException
	{
		Actions action = new Actions(driver);
		action.moveToElement(WomenWestern);
		action.click().build().perform();
		Thread.sleep(5000);	
	}
	
	public void Click_WomenEthnic() throws InterruptedException
	{
		Actions action = new Actions(driver);
		action.moveToElement(WomensEthnic);
		action.click().build().perform();
		Thread.sleep(5000);	
	}
	

}
