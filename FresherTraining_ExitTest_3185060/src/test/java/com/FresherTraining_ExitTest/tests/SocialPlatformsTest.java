package com.FresherTraining_ExitTest.tests;

import org.testng.annotations.Test;
import com.FresherTraining_ExitTest.pages.SocialPlatFormsPage;
import com.FresherTraining_ExitTest.utils.CommonUtils;

public class SocialPlatformsTest extends BaseTest
{
	@Test (priority=1,groups= {"sanity"})
	public void Open_FaceBook() throws InterruptedException
	{
		SocialPlatFormsPage soc= new SocialPlatFormsPage(driver);
		soc.Click_X();
		CommonUtils.scrollDown();
		soc.Click_FaceBook();
	}
	
	@Test (priority=2,groups= {"sanity"})
	public void Open_Twitter() throws InterruptedException
	{
		SocialPlatFormsPage soc= new SocialPlatFormsPage(driver);
		soc.Click_X();
		CommonUtils.scrollDown();
		soc.Click_Twitter();
	}
	
	@Test (priority=3,groups= {"sanity"})
	public void Open_YouTube() throws InterruptedException
	{
		SocialPlatFormsPage soc= new SocialPlatFormsPage(driver);
		soc.Click_X();
		CommonUtils.scrollDown();
		soc.Click_YouTube();
	}
}
