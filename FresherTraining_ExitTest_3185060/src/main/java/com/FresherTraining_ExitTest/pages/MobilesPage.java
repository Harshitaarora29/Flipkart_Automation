package com.FresherTraining_ExitTest.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class MobilesPage 
{
	WebDriver driver;
	
	public MobilesPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		this.driver=driver;
	}
	
	@FindBy (how=How.XPATH,using="//button[contains(text(),'✕')]")
	public WebElement XButton;
	
	@FindBy (how=How.XPATH,using="//div[contains(text(),'Mobiles')]")
	public WebElement Mobiles;
	
	@FindBy (how=How.XPATH,using="(//p[contains(text(),'Shop Now')])[1]")
	public WebElement RealmeMobiles;
	
	@FindBy (how=How.XPATH,using="(//p[contains(text(),'Shop Now')])[2]")
	public WebElement  PocoMobiles ;
	
	@FindBy (how=How.XPATH,using="(//p[contains(text(),'Shop Now')])[3]")
	public WebElement NarzoMobiles ;
	
	@FindBy (how=How.XPATH,using="(//p[contains(text(),'Shop Now')])[4]")
	public WebElement OppoMobiles ;
	
	@FindBy (how=How.XPATH,using="//img[@alt='Coming Soon']")
	public WebElement ComingSoon ;
	

	public void Click_X() throws InterruptedException
	{
		XButton.click();
		Thread.sleep(2000);
	}
	
	public void Click_Mobiles() throws InterruptedException
	{
		Mobiles.click();
		Thread.sleep(2000);
	}
	
	public void Click_RealmeMobiles() throws InterruptedException
	{
		RealmeMobiles.click();
		Thread.sleep(2000);
	}
	
	public void Click_PocoMobiles() throws InterruptedException
	{
		PocoMobiles.click();
		Thread.sleep(2000);
	}
	
	public void Click_NarzoMobiles() throws InterruptedException
	{
		NarzoMobiles.click();
		Thread.sleep(2000);
	}
	
	public void Click_OppoMobiles() throws InterruptedException
	{
		OppoMobiles.click();
		Thread.sleep(2000);
	}
	
	public void Click_ComingSoon() throws InterruptedException
	{
		ComingSoon.click();
		Thread.sleep(2000);
	}
}
