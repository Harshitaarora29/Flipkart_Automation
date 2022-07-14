package com.FresherTraining_ExitTest.tests;


import org.testng.annotations.Test;

import com.FresherTraining_ExitTest.pages.BeautyToysMorePage;



public class BeautyToysMoreTest extends BaseTest
{
	
	
	@Test (priority=1,groups= {"sanity"})
	public void Check_Beauty_Personal_Care_Op() throws InterruptedException
	{
	    
		
		BeautyToysMorePage mor = new BeautyToysMorePage(driver);
		mor.Click_X();
		mor.Hover_BeautyToysMore();
		mor.Click_Beauty_Personal_Care();
		
	}
	
	@Test (priority=2,groups= {"sanity"})
	public void Check_Foods_and_Drinks_Op() throws InterruptedException
	{
		BeautyToysMorePage mor = new BeautyToysMorePage(driver);
		mor.Click_X();
		mor.Hover_BeautyToysMore();
		mor.Click_Foods_and_Drinks();
	}
	
	@Test (priority=3,groups= {"sanity"})
	public void Check_BabyCare_Op() throws InterruptedException
	{
		BeautyToysMorePage mor = new BeautyToysMorePage(driver);
		mor.Click_X();
		mor.Hover_BeautyToysMore();
		mor.Click_BabyCare();
	}
	
	@Test (priority=4,groups= {"sanity"})
	public void Check_Books_Op() throws InterruptedException
	{
		BeautyToysMorePage mor = new BeautyToysMorePage(driver);
		mor.Click_X();
		mor.Hover_BeautyToysMore();
		mor.Click_Books();
	}
}
