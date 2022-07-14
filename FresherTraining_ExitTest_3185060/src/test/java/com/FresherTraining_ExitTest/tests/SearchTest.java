package com.FresherTraining_ExitTest.tests;

import java.util.HashMap;

import org.testng.annotations.Test;

import com.FresherTraining_ExitTest.pages.SearchPage;
import com.FresherTraining_ExitTest.utils.CommonUtils;

public class SearchTest extends BaseTest
{
	private String sheetName = prop.getProperty("SearchTestSheetName");   
    
		@Test (priority=1,groups= {"sanity"})
		public void Valid_Search() throws InterruptedException
		{
			String testname = "Valid Product";

	        // Fetching all test data from excel file
	        HashMap<String, String> testData = new HashMap<String, String>();
	        testData = reader.getRowTestData(sheetName, testname);
	        String executionRequired = testData.get("Execution Required").toLowerCase();
	        String Product = testData.get("Products");
	        
	     // log all data
	        CommonUtils.logTestData(sheetName, testname);

	        // if execution required field is no
	        CommonUtils.toCheckExecutionRequired(executionRequired);
			
			SearchPage search = new SearchPage(driver);
			search.Click_X();
			search.Enter_Search(Product);
			search.Click_SubmitButton();
		}
		
		@Test (priority=2,groups= {"sanity"})
		public void Invalid_Search() throws InterruptedException
			{
				String testname = "Invalid Product";

		        // Fetching all test data from excel file
		        HashMap<String, String> testData = new HashMap<String, String>();
		        testData = reader.getRowTestData(sheetName, testname);
		        String executionRequired = testData.get("Execution Required").toLowerCase();
		        String Product = testData.get("Products");
		        
		     // log all data
		        CommonUtils.logTestData(sheetName, testname);

		        // if execution required field is no
		        CommonUtils.toCheckExecutionRequired(executionRequired);
				
				SearchPage search = new SearchPage(driver);
				search.Click_X();
				search.Enter_Search(Product);
				search.Click_SubmitButton();
			}
		
}
