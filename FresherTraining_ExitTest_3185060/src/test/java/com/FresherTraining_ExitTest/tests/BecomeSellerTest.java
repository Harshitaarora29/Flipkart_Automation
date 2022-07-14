package com.FresherTraining_ExitTest.tests;

import java.util.HashMap;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.FresherTraining_ExitTest.pages.BecomeSellerPage;
import com.FresherTraining_ExitTest.utils.CommonUtils;
import com.FresherTraining_ExitTest.utils.ExplicitWait;

public class BecomeSellerTest extends BaseTest
{
	// Worksheet Name used by all tests
    private String sheetName = prop.getProperty("SellerTestSheetName");   

	@Test(priority=1,groups= {"sanity"})
	public void OpenBecomeSeller() throws InterruptedException
	{
		String testname = "OpenBecomeSeller";

        // Fetching all test data from excel file
        HashMap<String, String> testData = new HashMap<String, String>();
        testData = reader.getRowTestData(sheetName, testname);
        String executionRequired = testData.get("Execution Required").toLowerCase();

        String expectedTitle = testData.get("Expected Title");	
        // log all data
        CommonUtils.logTestData(sheetName, testname);

        // if execution required field is no
        CommonUtils.toCheckExecutionRequired(executionRequired);
	
        BecomeSellerPage op = new BecomeSellerPage(driver);
        op.Click_X();
        op.click_BecomeSeller();
        ExplicitWait.checkClickableExplicitly(driver, expectedTitle, 5);
        String actualTitle = driver.getTitle();
    	
    	SoftAssert sa =new SoftAssert();
		sa.assertEquals(actualTitle,expectedTitle);
		sa.assertAll();
	}
	
	@Test(priority=2,groups= {"sanity"})
	public void CheckFeeStructure() throws InterruptedException
	{
		
		String testname = "Check_FeeStructure_Option";

        // Fetching all test data from excel file
        HashMap<String, String> testData = new HashMap<String, String>();
        testData = reader.getRowTestData(sheetName, testname);
        String executionRequired = testData.get("Execution Required").toLowerCase();

        String expectedTitle = testData.get("Expected Title");	
        // log all data
        CommonUtils.logTestData(sheetName, testname);

        // if execution required field is no
        CommonUtils.toCheckExecutionRequired(executionRequired);
	
        BecomeSellerPage op = new BecomeSellerPage(driver);
        op.Click_X();
        op.click_BecomeSeller();
        op.click_FeeStructure();        
        
        ExplicitWait.checkClickableExplicitly(driver, expectedTitle, 5);
        String actualTitle = driver.getTitle();
    	
    	SoftAssert sa =new SoftAssert();
		sa.assertEquals(actualTitle,expectedTitle);
		sa.assertAll();		
	}
	
	
	@Test(priority=3,groups= {"sanity"})
	public void Check_Services_For_Seller() throws InterruptedException
	{
		
		String testname = "Check_Services_For_Seller";

        // Fetching all test data from excel file
        HashMap<String, String> testData = new HashMap<String, String>();
        testData = reader.getRowTestData(sheetName, testname);
        String executionRequired = testData.get("Execution Required").toLowerCase();

        String expectedTitle = testData.get("Expected Title");	
        // log all data
        CommonUtils.logTestData(sheetName, testname);

        // if execution required field is no
        CommonUtils.toCheckExecutionRequired(executionRequired);
	
        BecomeSellerPage op = new BecomeSellerPage(driver);
        op.Click_X();
        op.click_BecomeSeller();
        op.click_Services();        
        String actualTitle = driver.getTitle();
    	
    	SoftAssert sa =new SoftAssert();
		sa.assertEquals(actualTitle,expectedTitle);
		sa.assertAll();		
	}
}
