package com.FresherTraining_ExitTest.tests;

import java.util.HashMap;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.FresherTraining_ExitTest.pages.ElectronicsPage;
import com.FresherTraining_ExitTest.utils.CommonUtils;
import com.FresherTraining_ExitTest.utils.ExplicitWait;

public class ElectronicsTest extends BaseTest
{
	
	// Work sheet Name used by all tests
    private String sheetName = prop.getProperty("ElectronicTestSheetName");
	
	@Test (priority=1,groups= {"sanity"})
	public void Check_Cameras_Accessories() throws InterruptedException
	{
		
		String testname = "Cameras And Accessories";

        // Fetching all test data from excel file
        HashMap<String, String> testData = new HashMap<String, String>();
        testData = reader.getRowTestData(sheetName, testname);
        String executionRequired = testData.get("Execution Required").toLowerCase();

        String expectedTitle = testData.get("Expected Title");
        // log all data
        CommonUtils.logTestData(sheetName, testname);

        // if execution required field is no
        CommonUtils.toCheckExecutionRequired(executionRequired);
		
		ElectronicsPage ele = new ElectronicsPage(driver);
		ele.Click_X();
		ele.Hover_Electronics();
		ele.Click_Cameras_and_Accessories();
		ExplicitWait.checkClickableExplicitly(driver, expectedTitle, 5);
		
		String actualTitle = driver.getTitle().toLowerCase();
        Assert.assertTrue(actualTitle.contains(expectedTitle.toLowerCase()),
                "Assertion on actual and expected title of Electronics page.");
	}
	
	
	@Test (priority=2,groups= {"sanity"})
	public void Check_Audio_Op() throws InterruptedException
	{
		
		String testname = "Audio";

        // Fetching all test data from excel file
        HashMap<String, String> testData = new HashMap<String, String>();
        testData = reader.getRowTestData(sheetName, testname);
        String executionRequired = testData.get("Execution Required").toLowerCase();

        String expectedTitle = testData.get("Expected Title");
        // log all data
        CommonUtils.logTestData(sheetName, testname);

        // if execution required field is no
        CommonUtils.toCheckExecutionRequired(executionRequired);
		
		ElectronicsPage ele = new ElectronicsPage(driver);
		ele.Click_X();
		ele.Hover_Electronics();
		ele.Click_Audio();
		ExplicitWait.checkClickableExplicitly(driver, expectedTitle, 5);
		
		String actualTitle = driver.getTitle().toLowerCase();
		System.out.println(actualTitle);
		Assert.assertTrue(actualTitle.contains(expectedTitle.toLowerCase()),
                "Assertion on actual and expected title of Electronics page.");
	}
	

}
