package com.FresherTraining_ExitTest.tests;

import java.util.HashMap;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.FresherTraining_ExitTest.pages.GroceryPage;
import com.FresherTraining_ExitTest.utils.CommonUtils;
import com.FresherTraining_ExitTest.utils.ExplicitWait;

public class GroceryTest extends BaseTest
{
	
	// Work sheet Name used by all tests
    private String sheetName = prop.getProperty("GroceryTestSheetName");   
    
		
		@Test (priority=1,groups= {"sanity"})
		public void ValidProduct() throws InterruptedException
		{
			String testname = "ValidProduct";

	        // Fetching all test data from excel file
	        HashMap<String, String> testData = new HashMap<String, String>();
	        testData = reader.getRowTestData(sheetName, testname);
	        String executionRequired = testData.get("Execution Required").toLowerCase();
	        String Product = testData.get("Grocery Products");
	        
	        String expectedTitle = testData.get("Expected Title");
	     // log all data
	        CommonUtils.logTestData(sheetName, testname);

	        // if execution required field is no
	        CommonUtils.toCheckExecutionRequired(executionRequired);
			
			GroceryPage groc = new GroceryPage(driver);
			groc.Click_X();
			groc.Click_Grocery();
			groc.Enter_Groceries(Product);
			ExplicitWait.checkClickableExplicitly(driver, expectedTitle, 5);
		
			
			String actualTitle = driver.getTitle().toLowerCase();
	        Assert.assertTrue(actualTitle.contains(expectedTitle.toLowerCase()),
	                "Assertion on actual and expected title of Electronics page.");
			
		}
		
		//Negative Case
		@Test (priority=2,groups= {"sanity"})
		public void InvalidProduct() throws InterruptedException
		{
			String testname = "InvalidProduct";

	        // Fetching all test data from excel file
	        HashMap<String, String> testData = new HashMap<String, String>();
	        testData = reader.getRowTestData(sheetName, testname);
	        String executionRequired = testData.get("Execution Required").toLowerCase();
	        String Product = testData.get("Grocery Products");
	        
	        String expectedTitle = testData.get("Expected Title");
	     // log all data
	        CommonUtils.logTestData(sheetName, testname);

	        // if execution required field is no
	        CommonUtils.toCheckExecutionRequired(executionRequired);
			
			GroceryPage groc = new GroceryPage(driver);
			groc.Click_X();
			groc.Click_Grocery();
			groc.Enter_Groceries(Product);
			ExplicitWait.checkClickableExplicitly(driver, expectedTitle, 5);
			
			//Assertion will fail
			System.out.println("Assertion Fail");
			String actualTitle = driver.getTitle().toLowerCase();
	        Assert.assertTrue(actualTitle.contains(expectedTitle.toLowerCase()),
	                "Assertion on actual and expected title of Electronics page.");
		}
}
