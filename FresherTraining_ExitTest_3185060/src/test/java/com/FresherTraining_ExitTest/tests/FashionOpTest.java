package com.FresherTraining_ExitTest.tests;

import java.util.HashMap;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.FresherTraining_ExitTest.pages.FashionOpPage;
import com.FresherTraining_ExitTest.utils.CommonUtils;
import com.FresherTraining_ExitTest.utils.ExplicitWait;

public class FashionOpTest extends BaseTest
{
		
	// Work sheet Name used by all tests
    private String sheetName = prop.getProperty("FashionTestSheetName");   
		
	
	@Test (priority=1,groups= {"sanity"})
	public void Check_MensFashion_Op() throws InterruptedException
	{
		String testname = "Men's Fashion";

        // Fetching all test data from excel file
        HashMap<String, String> testData = new HashMap<String, String>();
        testData = reader.getRowTestData(sheetName, testname);
        String executionRequired = testData.get("Execution Required").toLowerCase();

        String expectedTitle = testData.get("Expected Title");
        // log all data
        CommonUtils.logTestData(sheetName, testname);

        // if execution required field is no
        CommonUtils.toCheckExecutionRequired(executionRequired);
		
		FashionOpPage fas = new FashionOpPage(driver);
		fas.Click_X();
		fas.Hover_FashionOp();
		fas.Click_MensFashion();
		ExplicitWait.checkClickableExplicitly(driver, expectedTitle, 5);
		
		String actualTitle = driver.getTitle().toLowerCase();
        Assert.assertTrue(actualTitle.contains(expectedTitle.toLowerCase()),
                "Assertion on actual and expected title of Fashion page.");

	}
	
	@Test (priority=2,groups= {"sanity"})
	public void Check_WomenWestern_Option() throws InterruptedException
	{
		
		String testname = "WomenWestern";

        // Fetching all test data from excel file
        HashMap<String, String> testData = new HashMap<String, String>();
        testData = reader.getRowTestData(sheetName, testname);
        String executionRequired = testData.get("Execution Required").toLowerCase();

        String expectedTitle = testData.get("Expected Title");
        // log all data
        CommonUtils.logTestData(sheetName, testname);

        // if execution required field is no
        CommonUtils.toCheckExecutionRequired(executionRequired);
		
		FashionOpPage fas = new FashionOpPage(driver);
		fas.Click_X();
		fas.Hover_FashionOp();
		fas.Click_WomenWestern();
		ExplicitWait.checkClickableExplicitly(driver, expectedTitle, 5);
		
		String actualTitle = driver.getTitle().toLowerCase();
        Assert.assertTrue(actualTitle.contains(expectedTitle.toLowerCase()),
                "Assertion on actual and expected title of Fashion page.");
	}
	

}
