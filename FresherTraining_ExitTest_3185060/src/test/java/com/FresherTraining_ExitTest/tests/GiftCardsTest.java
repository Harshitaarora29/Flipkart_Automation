package com.FresherTraining_ExitTest.tests;

import org.testng.annotations.Test;
import com.FresherTraining_ExitTest.pages.GiftCardsPage;
import com.FresherTraining_ExitTest.utils.CommonUtils;

public class GiftCardsTest extends BaseTest
{
	//private String sheetName = prop.getProperty("GiftCardsTestSheetName");   
    
	@Test (priority=1,groups= {"sanity"})
	public void Open_GiftCards() throws InterruptedException
	{
		GiftCardsPage gift = new GiftCardsPage(driver);
		gift.Click_X();
		CommonUtils.scrollDown();
		gift.Click_GiftCards();
	}
	
	@Test (priority=2,groups= {"sanity"})
	public void Check_DigitalGiftCards() throws InterruptedException
	{
		
		
        GiftCardsPage gift = new GiftCardsPage(driver);
		gift.Click_X();
		CommonUtils.scrollDown();
		gift.Click_GiftCards();
		gift.Click_DigitalGiftCards();
	}
	
	@Test (priority=3,groups= {"sanity"})
	public void Check_PhysicalGiftCards() throws InterruptedException
	{
		GiftCardsPage gift = new GiftCardsPage(driver);
		gift.Click_X();
		CommonUtils.scrollDown();
		gift.Click_GiftCards();	
		gift.Click_PhysicalGiftCards();
	}
	
	@Test (priority=4,groups= {"sanity"})
	public void Check_GiftCard_Anniversary() throws InterruptedException
	{
		
		GiftCardsPage gift = new GiftCardsPage(driver);
		gift.Click_X();
		CommonUtils.scrollDown();
		gift.Click_GiftCards();
		gift.Click_AnniversaryGiftCards();
	}
	
	
	@Test (priority=5,groups= {"sanity"})
	public void Check_GiftCard_Birthdays() throws InterruptedException
	{
		
		GiftCardsPage gift = new GiftCardsPage(driver);
		gift.Click_X();
		CommonUtils.scrollDown();
		gift.Click_GiftCards();
		gift.Click_BirthdayGiftCards();
	}
	
}
