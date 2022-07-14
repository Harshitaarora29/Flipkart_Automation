package com.FresherTraining_ExitTest.tests;

import java.util.HashMap;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.FresherTraining_ExitTest.pages.HomePage;
import com.FresherTraining_ExitTest.utils.CommonUtils;
import com.FresherTraining_ExitTest.utils.ExplicitWait;

public class HomeTest extends BaseTest
{
	

	// Work sheet Name used by all tests
    private String sheetName = prop.getProperty("HomeTestSheetName");   
	
	@Test (priority=1,groups= {"sanity"})
	public void Check_HomeFurnishings() throws InterruptedException
	{
		String testname = "HomeFurnishings";

        // Fetching all test data from excel file
        HashMap<String, String> testData = new HashMap<String, String>();
        testData = reader.getRowTestData(sheetName, testname);
        String executionRequired = testData.get("Execution Required").toLowerCase();
        
        String expectedTitle = testData.get("Expected Title");
     // log all data
        CommonUtils.logTestData(sheetName, testname);

        // if execution required field is no
        CommonUtils.toCheckExecutionRequired(executionRequired);
		
		
		HomePage hom = new HomePage(driver);
		hom.Click_X();
		hom.Hover_Home();
		hom.Click_HomeFurnishings();
		ExplicitWait.checkClickableExplicitly(driver, expectedTitle, 5);
		
		String actualTitle = driver.getTitle().toLowerCase();
        Assert.assertTrue(actualTitle.contains(expectedTitle.toLowerCase()),
                "Assertion on actual and expected title of Electronics page.");
	}
	
	//negative case
	@Test (priority=2,groups= {"sanity"})
	public void Check_Kitchen_and_Dining_Op() throws InterruptedException
	{
		
		String testname = "Kitchen_and_Dining";

        // Fetching all test data from excel file
        HashMap<String, String> testData = new HashMap<String, String>();
        testData = reader.getRowTestData(sheetName, testname);
        String executionRequired = testData.get("Execution Required").toLowerCase();

        
        String expectedTitle = testData.get("Expected Title");
     // log all data
        CommonUtils.logTestData(sheetName, testname);

        // if execution required field is no
        CommonUtils.toCheckExecutionRequired(executionRequired);
        
        
		HomePage hom = new HomePage(driver);
		hom.Click_X();
		hom.Hover_Home();
		hom.Click_Kitchen_and_Dining();
		ExplicitWait.checkClickableExplicitly(driver, expectedTitle, 5);
		
		//Assertion will fail
		System.out.println("Assertion Fail");
		String actualTitle = driver.getTitle().toLowerCase();
        Assert.assertTrue(actualTitle.contains(expectedTitle.toLowerCase()),
                "Assertion on actual and expected title of Electronics page.");
	}
}
