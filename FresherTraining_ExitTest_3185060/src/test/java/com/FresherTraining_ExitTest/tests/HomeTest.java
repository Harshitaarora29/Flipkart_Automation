package com.FresherTraining_ExitTest.tests;

import org.testng.annotations.Test;

import com.FresherTraining_ExitTest.pages.HomePage;

public class HomeTest extends BaseTest
{
	@Test (priority=1,groups= {"sanity"})
	public void Check_HomeFurnishings() throws InterruptedException
	{
		HomePage hom = new HomePage(driver);
		hom.Click_X();
		hom.Hover_Home();
		hom.Click_HomeFurnishings();
	}
	
	@Test (priority=2,groups= {"sanity"})
	public void Check_Kitchen_and_Dining_Op() throws InterruptedException
	{
		HomePage hom = new HomePage(driver);
		hom.Click_X();
		hom.Hover_Home();
		hom.Click_Kitchen_and_Dining();
	}
	
	@Test (priority=3,groups= {"sanity"})
	public void Check_Bedroom_Furniture_Op() throws InterruptedException
	{
		HomePage hom = new HomePage(driver);
		hom.Click_X();
		hom.Hover_Home();
		hom.Click_Bedroom_Furniture();
	}
	
	@Test (priority=4,groups= {"sanity"})
	public void Check_HomeDecor_Op() throws InterruptedException
	{
		HomePage hom = new HomePage(driver);
		hom.Click_X();
		hom.Hover_Home();
		hom.Click_HomeDecor();
	}
}
