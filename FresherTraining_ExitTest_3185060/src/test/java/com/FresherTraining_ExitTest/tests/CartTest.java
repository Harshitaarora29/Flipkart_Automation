package com.FresherTraining_ExitTest.tests;

import java.util.HashMap;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.FresherTraining_ExitTest.pages.CartPage;
import com.FresherTraining_ExitTest.utils.CommonUtils;

public class CartTest extends BaseTest
{
	
	// Work sheet Name used by all tests
    private String sheetName = prop.getProperty("CartTestSheetName");
	
	@Test (priority=1,groups= {"sanity"})
	public void OpenCart() throws InterruptedException
	{
		String testname = "Cart";

        // Fetching all test data from excel file
        HashMap<String, String> testData = new HashMap<String, String>();
        testData = reader.getRowTestData(sheetName, testname);
        String executionRequired = testData.get("Execution Required").toLowerCase();

        String expectedTitle = testData.get("Expected Title");
        // log all data
        CommonUtils.logTestData(sheetName, testname);

        // if execution required field is no
        CommonUtils.toCheckExecutionRequired(executionRequired);
		
		CartPage cart = new CartPage(driver);
		cart.Click_X();
		cart.click_Cart();
		
		String actualTitle = driver.getTitle().toLowerCase();
		System.out.println(actualTitle);
        Assert.assertTrue(actualTitle.contains(expectedTitle.toLowerCase()),
                "Assertion on actual and expected title of Cart page.");
		
	}
	
}
