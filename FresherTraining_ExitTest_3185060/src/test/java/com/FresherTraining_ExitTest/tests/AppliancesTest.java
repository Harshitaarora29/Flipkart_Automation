package com.FresherTraining_ExitTest.tests;

import org.testng.annotations.Test;

import com.FresherTraining_ExitTest.pages.AppliancesPage;

public class AppliancesTest extends BaseTest
{
	@Test (priority=1,groups= {"sanity"})
	public void Check_Appliances_Op() throws InterruptedException
	{
		AppliancesPage  app = new AppliancesPage(driver);
		app.Click_X();
		app.Click_Appliances();
	}
	
	@Test (priority=2,groups= {"sanity"})
	public void Check_WashingMachine_Op() throws InterruptedException
	{
		AppliancesPage  app = new AppliancesPage(driver);
		app.Click_X();
		app.Click_Appliances();
		app.Click_WashingMachine();
	}
	
	@Test (priority=3,groups= {"sanity"})
	public void Check_Telivisions_Op() throws InterruptedException
	{
		AppliancesPage  app = new AppliancesPage(driver);
		app.Click_X();
		app.Click_Appliances();
		app.Click_Telivisions();
	}
	
	@Test (priority=4,groups= {"sanity"})
	public void Check_AirConditioners_Op() throws InterruptedException
	{
		AppliancesPage  app = new AppliancesPage(driver);
		app.Click_X();
		app.Click_Appliances();
		app.Click_AirConditioner();
	}
	
	@Test (priority=5,groups= {"sanity"})
	public void Check_FansAndCooler_Op() throws InterruptedException
	{
		AppliancesPage  app = new AppliancesPage(driver);
		app.Click_X();
		app.Click_Appliances();
		app.Click_Fans_and_Cooler();
	}
}
