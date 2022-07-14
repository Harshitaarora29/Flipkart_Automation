package com.FresherTraining_ExitTest.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class BeautyToysMorePage
{
	WebDriver driver;
	
	public BeautyToysMorePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		this.driver=driver;
	}
	
	@FindBy (how=How.XPATH,using="//button[contains(text(),'✕')]")
	public WebElement XButton;
	
	@FindBy (how=How.XPATH,using="//div[contains(text(),'Beauty, Toys & More')]")
	public WebElement BeautyToysMore;
	
	@FindBy (how=How.XPATH,using="//a[normalize-space()='Beauty & Personal Care']")
	public WebElement Beauty_Personal_Care ;
	
	@FindBy (how=How.XPATH,using="//a[normalize-space()='Food & Drinks']")
	public WebElement Food_and_Drinks  ;

	
	
	public void Click_X() throws InterruptedException
	{
		XButton.click();
		Thread.sleep(2000);
	}
	
	public void Hover_BeautyToysMore() throws InterruptedException
	{
		Actions action = new Actions(driver);
		action.moveToElement(BeautyToysMore).perform();
		Thread.sleep(2000);		
	}
	
	public void Click_Beauty_Personal_Care() throws InterruptedException
	{
		Actions action = new Actions(driver);
		action.moveToElement(Beauty_Personal_Care);
		action.click().build().perform();
		Thread.sleep(5000);	
	}
	

	public void Click_Foods_and_Drinks () throws InterruptedException
	{
		Actions action = new Actions(driver);
		action.moveToElement(Food_and_Drinks);
		action.click().build().perform();
		Thread.sleep(5000);	
	}
}
