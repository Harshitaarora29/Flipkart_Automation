package com.FresherTraining_ExitTest.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class MyProfilePage 
{
WebDriver driver;
	
	public MyProfilePage(WebDriver driver)
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
	
	@FindBy (how=How.XPATH,using="(//div[@class='_28p97w'])[1]")
	public WebElement MyAccount;
	
	@FindBy (how=How.XPATH,using="//div[normalize-space()='My Profile']")
	public WebElement MyProfile;
	
	@FindBy (how=How.XPATH,using="//span[@class='oKZoMV']")
	public WebElement Edit;
	
	@FindBy (how=How.XPATH,using="//input[@name='firstName']")
	public WebElement FirstName;
	
	@FindBy (how=How.XPATH,using="//input[@name='lastName']")
	public WebElement LastName;
	
	@FindBy (how=How.XPATH,using="//button[normalize-space()='SAVE']")
	public WebElement SaveButton;
	
	public void Login_Func(String num,String pass) throws InterruptedException
	{
		MobileNum.sendKeys(num);	
		Password.sendKeys(pass);
		LoginButton.click();
		Thread.sleep(5000);
	}

	
	public void Click_MyProfile() throws InterruptedException
	{	
		Actions action = new Actions(driver);
		action.moveToElement(MyAccount).perform();
		action.moveToElement(MyProfile);
		action.click().build().perform();	
		Edit.click();

	}
	
	public void Enter_PersonalInfo(String name1,String name2) throws InterruptedException
	{	
		
		FirstName.clear();
		LastName.clear();
		FirstName.sendKeys(name1);
		LastName.sendKeys(name2);
		Thread.sleep(1000);	
	}
	
	
	public void ClickSaveButton() throws InterruptedException
	{
		SaveButton.click();
		Thread.sleep(1000);
	}

}
