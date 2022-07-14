package com.FresherTraining_ExitTest.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage
{
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		this.driver=driver;
	}
	
	@FindBy (how=How.XPATH,using="//input[@class='_2IX_2- VJZDxU']")
	public WebElement MobileNum;
	
	@FindBy (how=How.XPATH,using="//input[@type='password']")
	public WebElement Password;
	
	@FindBy (how=How.XPATH,using="//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")
	public WebElement LoginButton;

	
	public void enterMobileNum(String num) throws InterruptedException
	{
		MobileNum.sendKeys(num);
		
	}
	
	public void enterPassword(String pass)
	{
		Password.sendKeys(pass);
	}
	
	public void ClickLoginButton()
	{
		LoginButton.click();
	}
}
