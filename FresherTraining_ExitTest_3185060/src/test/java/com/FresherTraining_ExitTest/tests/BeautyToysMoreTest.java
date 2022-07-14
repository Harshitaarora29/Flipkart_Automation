package com.FresherTraining_ExitTest.tests;

import java.util.HashMap;

import org.testng.annotations.Test;

import com.FresherTraining_ExitTest.pages.BeautyToysMorePage;
import com.FresherTraining_ExitTest.utils.CommonUtils;


public class BeautyToysMoreTest extends BaseTest
{
//	@Test (priority=1,groups= {"sanity"})
//	public void Check_Beauty_Personal_Care_Op() throws InterruptedException
//	{
//		// Work sheet Name used by all tests
//	    //private String sheetName = prop.getProperty("ToysMoreTestSheetName"); 
//	    
//	    String testname = "Beauty_Personal_Care";
//
//        // Fetching all test data from excel file
//        HashMap<String, String> testData = new HashMap<String, String>();
//        testData = reader.getRowTestData(sheetName, testname);
//        String executionRequired = testData.get("Execution Required").toLowerCase();
//
//        String expectedTitle = testData.get("Expected Title");
//        // log all data
//        CommonUtils.logTestData(sheetName, testname);
//
//        // if execution required field is no
//        CommonUtils.toCheckExecutionRequired(executionRequired);
//		
//		BeautyToysMorePage mor = new BeautyToysMorePage(driver);
//		mor.Click_X();
//		mor.Hover_BeautyToysMore();
//		mor.Click_Beauty_Personal_Care();
//	}
	
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
