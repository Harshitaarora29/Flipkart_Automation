package com.FresherTraining_ExitTest.tests;

import org.testng.annotations.Test;

import com.FresherTraining_ExitTest.pages.MobilesPage;

public class MobilesTest extends BaseTest
{
	@Test (priority=1,groups= {"sanity"})
	public void Check_Mobiles_Op() throws InterruptedException
	{
		MobilesPage  mob = new MobilesPage(driver);
		mob.Click_X();
		mob.Click_Mobiles();
	}
	
	@Test (priority=2,groups= {"sanity"})
	public void Check_RealmeMobiles_Op() throws InterruptedException
	{
		MobilesPage  mob = new MobilesPage(driver);
		mob.Click_X();
		mob.Click_Mobiles();
		mob.Click_RealmeMobiles();
	}
	
	@Test (priority=3,groups= {"sanity"})
	public void Check_PocoMobiles_Op() throws InterruptedException
	{
		MobilesPage  mob = new MobilesPage(driver);
		mob.Click_X();
		mob.Click_Mobiles();
		mob.Click_PocoMobiles();
	}
	
	@Test (priority=4,groups= {"sanity"})
	public void Check_NazroMobiles_Op() throws InterruptedException
	{
		MobilesPage  mob = new MobilesPage(driver);
		mob.Click_X();
		mob.Click_Mobiles();
		mob.Click_NarzoMobiles();
	}
	
	@Test (priority=5,groups= {"sanity"})
	public void Check_OppoMobiles_Op() throws InterruptedException
	{
		MobilesPage  mob = new MobilesPage(driver);
		mob.Click_X();
		mob.Click_Mobiles();
		mob.Click_OppoMobiles();
	}
	
	@Test (priority=6,groups= {"sanity"})
	public void Check_ComingSoon_Op() throws InterruptedException
	{
		MobilesPage  mob = new MobilesPage(driver);
		mob.Click_X();
		mob.Click_Mobiles();
		mob.Click_ComingSoon();
	}
}
