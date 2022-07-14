package com.FresherTraining_ExitTest.tests;

import org.testng.annotations.Test;

import com.FresherTraining_ExitTest.pages.FlipkartPlusPage;

public class FlipkartPlusTest extends BaseTest
{
	@Test (priority=1,groups= {"sanity"})
	public void Open_FlipKartPlus() throws InterruptedException
	{
		FlipkartPlusPage plus = new FlipkartPlusPage(driver);
		plus.Click_X();
		plus.Click_FlipkartPlus();
	}
	
	@Test (priority=2,groups= {"sanity"})
	public void Check_Offer_ProductAt1() throws InterruptedException
	{
		FlipkartPlusPage plus = new FlipkartPlusPage(driver);
		plus.Click_X();
		plus.Click_FlipkartPlus();
		plus.Click_ProductsAt1();
	}
	
	@Test (priority=3,groups= {"sanity"})
	public void Check_Offer_GetExtra10() throws InterruptedException
	{
		FlipkartPlusPage plus = new FlipkartPlusPage(driver);
		plus.Click_X();
		plus.Click_FlipkartPlus();
		plus.Click_GetExtra();
	}
	
}
