package com.FresherTraining_ExitTest.tests;

import org.testng.annotations.Test;

import com.FresherTraining_ExitTest.pages.MorePage;

public class MoreTest extends BaseTest
{
	//@Test (priority=1,groups= {"sanity"})
	public void Notification_Op() throws InterruptedException
	{
		MorePage more = new MorePage(driver);
		more.Click_X();
		more.Hover_More();
		more.Click_Notification();
	}
	
	@Test (priority=2,groups= {"sanity"})
	public void _24x7_Customer_Care_Op() throws InterruptedException
	{
		MorePage more = new MorePage(driver);
		more.Click_X();
		more.Hover_More();
		more.Click_24x7_Customer_Care();
	}
	
	//@Test (priority=3,groups= {"sanity"})
	public void Download_App_Op() throws InterruptedException
	{
		MorePage more = new MorePage(driver);
		more.Click_X();
		more.Hover_More();
		more.Click_Download_App();
	}
}
