package com.FresherTraining_ExitTest.tests;

import java.util.HashMap;

import org.testng.annotations.Test;

import com.FresherTraining_ExitTest.pages.FlipkartAdvertisePage;
import com.FresherTraining_ExitTest.utils.CommonUtils;

public class FlipkartAdvertiseTest extends BaseTest
{
	// Work sheet Name used by all tests
    private String sheetName = prop.getProperty("AdvertiseTestSheetName");   
    
		@Test (priority=1,groups= {"sanity"})
		public void Open_Advertise_Op() throws InterruptedException
		{
			FlipkartAdvertisePage adv = new FlipkartAdvertisePage(driver);
			adv.Click_X();
			CommonUtils.scrollDown();
			adv.Click_Advertise();
		}
		
		@Test (priority=2,groups= {"sanity"})
		public void Search_Brands() throws InterruptedException
		{
			String testname = "SearchTheBrand";

	        // Fetching all test data from excel file
	        HashMap<String, String> testData = new HashMap<String, String>();
	        testData = reader.getRowTestData(sheetName, testname);
	        String executionRequired = testData.get("Execution Required").toLowerCase();
	        String Brand = testData.get("Brands");
	        
	        
	     // log all data
	        CommonUtils.logTestData(sheetName, testname);

	        // if execution required field is no
	        CommonUtils.toCheckExecutionRequired(executionRequired);
			
	        FlipkartAdvertisePage adv = new FlipkartAdvertisePage(driver);
	        adv.Click_X();
			CommonUtils.scrollDown();
			adv.Click_Advertise();
			adv.Enter_Brand_or_category(Brand);	
			
		}
		
		@Test (priority=3,groups= {"sanity"})
		public void Incorect_Brands() throws InterruptedException
		{
			String testname = "The incorrect Brand";

	        // Fetching all test data from excel file
	        HashMap<String, String> testData = new HashMap<String, String>();
	        testData = reader.getRowTestData(sheetName, testname);
	        String executionRequired = testData.get("Execution Required").toLowerCase();
	        String Brand = testData.get("Brands");
	        
	        
	     // log all data
	        CommonUtils.logTestData(sheetName, testname);

	        // if execution required field is no
	        CommonUtils.toCheckExecutionRequired(executionRequired);
			
	        FlipkartAdvertisePage adv = new FlipkartAdvertisePage(driver);
	        adv.Click_X();
			CommonUtils.scrollDown();
			adv.Click_Advertise();
			adv.Enter_Brand_or_category(Brand);			
		}
		
		@Test (priority=4,groups= {"sanity"})
		public void Check_FlipkartAdvertising() throws InterruptedException
		{
			FlipkartAdvertisePage adv = new FlipkartAdvertisePage(driver);
			adv.Click_X();
			CommonUtils.scrollDown();
			adv.Click_Advertise();
			adv.Click_FlipkartAdvertising();
		}
		
}
