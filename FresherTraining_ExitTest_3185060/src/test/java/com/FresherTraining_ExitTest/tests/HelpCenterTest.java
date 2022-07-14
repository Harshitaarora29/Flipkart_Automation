package com.FresherTraining_ExitTest.tests;

import org.testng.annotations.Test;

import com.FresherTraining_ExitTest.pages.HelpCenterPage;
import com.FresherTraining_ExitTest.utils.CommonUtils;

public class HelpCenterTest extends BaseTest
{
	@Test (priority=1,groups= {"sanity"})
	public void Open_HelpCenter() throws InterruptedException
	{
		HelpCenterPage help = new HelpCenterPage(driver);
		help.Click_X();
		CommonUtils.scrollDown();
		help.ClickHelp_Center();
	}
	
	@Test (priority=2,groups= {"sanity"})
	public void Check_Help_With_Orders() throws InterruptedException
	{
		HelpCenterPage help = new HelpCenterPage(driver);
		help.Click_X();
		CommonUtils.scrollDown();
		help.ClickHelp_Center();
		help.ClickHelp_With_Orders();
	}
	
	@Test (priority=3,groups= {"sanity"})
	public void Check_Help_With_returns_refunds() throws InterruptedException
	{
		HelpCenterPage help = new HelpCenterPage(driver);
		help.Click_X();
		CommonUtils.scrollDown();
		help.ClickHelp_Center();
		help.ClickHelp_With_returns_refunds();
		
	}
	
	// @Test(priority=4,groups= {"sanity"})
	public void Check_Help_With_Others() throws InterruptedException
	{
		HelpCenterPage help = new HelpCenterPage(driver);
		help.Click_X();
		CommonUtils.scrollDown();
		help.ClickHelp_Center();
		help.ClickHelp_With_Others();
	}
	
	//@Test (priority=5,groups= {"sanity"})
	public void Check_Help_Contact_Seller() throws InterruptedException
	{
		HelpCenterPage help = new HelpCenterPage(driver);
		help.Click_X();
		CommonUtils.scrollDown();
		help.ClickHelp_Center();
		help.ClickHelp_Contact_Seller();
	}
}
