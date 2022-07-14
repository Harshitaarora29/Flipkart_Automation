package com.FresherTraining_ExitTest.tests;

import java.util.HashMap;

import org.testng.annotations.Test;

import com.FresherTraining_ExitTest.pages.GroceryPage;
import com.FresherTraining_ExitTest.utils.CommonUtils;

public class GroceryTest extends BaseTest
{
	
	// Work sheet Name used by all tests
    private String sheetName = prop.getProperty("GroceryTestSheetName");   
    
		@Test (priority=1,groups= {"sanity"})
		public void Check_Grocery_Op() throws InterruptedException
		{
			GroceryPage groc = new GroceryPage(driver);
			groc.Click_X();
			groc.Click_Grocery();
		}
		
		@Test (priority=2,groups= {"sanity"})
		public void ValidProduct() throws InterruptedException
		{
			String testname = "ValidProduct";

	        // Fetching all test data from excel file
	        HashMap<String, String> testData = new HashMap<String, String>();
	        testData = reader.getRowTestData(sheetName, testname);
	        String executionRequired = testData.get("Execution Required").toLowerCase();
	        String Product = testData.get("Grocery Products");
	        
	        
	     // log all data
	        CommonUtils.logTestData(sheetName, testname);

	        // if execution required field is no
	        CommonUtils.toCheckExecutionRequired(executionRequired);
			
			GroceryPage groc = new GroceryPage(driver);
			groc.Click_X();
			groc.Click_Grocery();
			groc.Enter_Groceries(Product);
			
		}
		
		//@Test (priority=3,groups= {"sanity"})
		public void Check_PocoMobiles_Op() throws InterruptedException
		{
			String testname = "InvalidProduct";

	        // Fetching all test data from excel file
	        HashMap<String, String> testData = new HashMap<String, String>();
	        testData = reader.getRowTestData(sheetName, testname);
	        String executionRequired = testData.get("Execution Required").toLowerCase();
	        String Product = testData.get("Grocery Products");
	        
	        
	     // log all data
	        CommonUtils.logTestData(sheetName, testname);

	        // if execution required field is no
	        CommonUtils.toCheckExecutionRequired(executionRequired);
			
			GroceryPage groc = new GroceryPage(driver);
			groc.Click_X();
			groc.Click_Grocery();
			groc.Enter_Groceries(Product);
		}
}
