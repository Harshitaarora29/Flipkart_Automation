package com.FresherTraining_ExitTest.tests;

import org.testng.annotations.Test;

import com.FresherTraining_ExitTest.pages.TopOffersPage;


public class TopOffersTest extends BaseTest
{
	
	@Test (priority=1,groups= {"sanity"})
	public void Open_Travel() throws InterruptedException
	{
		TopOffersPage off = new TopOffersPage(driver);
		off.Click_X();
		off.Click_TopOffers();
	}
	
	@Test (priority=2,groups= {"sanity"})
	public void Check_DealOfTheDay() throws InterruptedException
	{
		
        TopOffersPage off = new TopOffersPage(driver);
		off.Click_X();
		off.Click_TopOffers();
		off.Click_DealOfTheDay();
	}
	
	@Test (priority=2,groups= {"sanity"})
	public void Check_FashionTopDeals() throws InterruptedException
	{
		
        TopOffersPage off = new TopOffersPage(driver);
		off.Click_X();
		off.Click_TopOffers();
		off.Click_FashionTopDeals();
	}
}
