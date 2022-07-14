package com.FresherTraining_ExitTest.tests;

import java.util.HashMap;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.FresherTraining_ExitTest.pages.SocialPlatFormsPage;
import com.FresherTraining_ExitTest.utils.CommonUtils;

public class SocialPlatformsTest extends BaseTest
{
	
	// Worksheet Name used by all tests
    private String sheetName = prop.getProperty("SocialTestSheetName");
    
	@Test (priority=1,groups= {"social"})
	public void Open_FaceBook() throws InterruptedException
	{
		String testname = "FaceBook";

        // Fetching all test data from excel file
        HashMap<String, String> testData = new HashMap<String, String>();
        testData = reader.getRowTestData(sheetName, testname);
        String executionRequired = testData.get("Execution Required").toLowerCase();
        
        String expectedTitle = testData.get("Expected Title");
        // log all data
        CommonUtils.logTestData(sheetName, testname);

        // if execution required field is no
        CommonUtils.toCheckExecutionRequired(executionRequired);
        
		SocialPlatFormsPage soc= new SocialPlatFormsPage(driver);
		soc.Click_X();
		CommonUtils.scrollDown();
		soc.Click_FaceBook();
		
		String actualTitle = driver.getTitle().toLowerCase();
		Assert.assertTrue(actualTitle.contains(expectedTitle.toLowerCase()),
                "Assertion on actual and expected title of Social page.");
	}
	

	@Test (priority=2,groups= {"social"})
	public void Open_Twitter() throws InterruptedException
	{
		String testname = "Twitter";
		
		// Fetching all test data from excel file
        HashMap<String, String> testData = new HashMap<String, String>();
        testData = reader.getRowTestData(sheetName, testname);
        String executionRequired = testData.get("Execution Required").toLowerCase();
        
        String expectedTitle = testData.get("Expected Title");
        // log all data
        CommonUtils.logTestData(sheetName, testname);

        // if execution required field is no
        CommonUtils.toCheckExecutionRequired(executionRequired);
		
		SocialPlatFormsPage soc= new SocialPlatFormsPage(driver);
		soc.Click_X();
		CommonUtils.scrollDown();
		soc.Click_Twitter();
		
		System.out.println("Assertion Fail");
		String actualTitle = driver.getTitle().toLowerCase();
		Assert.assertTrue(actualTitle.contains(expectedTitle.toLowerCase()),
                "Assertion on actual and expected title of Social page.");
	}
	
	@Test (priority=3,groups= {"social"})
	public void Open_YouTube() throws InterruptedException
	{

		String testname = "YouTube";
		
		// Fetching all test data from excel file
        HashMap<String, String> testData = new HashMap<String, String>();
        testData = reader.getRowTestData(sheetName, testname);
        String executionRequired = testData.get("Execution Required").toLowerCase();
        
        String expectedTitle = testData.get("Expected Title");
        // log all data
        CommonUtils.logTestData(sheetName, testname);

        // if execution required field is no
        CommonUtils.toCheckExecutionRequired(executionRequired);
		
		SocialPlatFormsPage soc= new SocialPlatFormsPage(driver);
		soc.Click_X();
		CommonUtils.scrollDown();
		soc.Click_YouTube();
		
		String actualTitle = driver.getTitle().toLowerCase();
		Assert.assertTrue(actualTitle.contains(expectedTitle.toLowerCase()),
                "Assertion on actual and expected title of Social page.");
	}
}
