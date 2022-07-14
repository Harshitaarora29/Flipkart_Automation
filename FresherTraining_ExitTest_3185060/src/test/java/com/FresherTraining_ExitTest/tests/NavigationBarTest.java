package com.FresherTraining_ExitTest.tests;

import java.util.HashMap;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import com.FresherTraining_ExitTest.pages.NavigationBarPage;

import com.FresherTraining_ExitTest.utils.CommonUtils;
import com.FresherTraining_ExitTest.utils.ExplicitWait;

public class NavigationBarTest extends BaseTest
{
	// Work sheet Name used by all tests
    private String sheetName = prop.getProperty("NavigationTestSheetName");   

	@Test(priority=1,groups= {"Navigation"})
	public void OpenBecomeSeller() throws InterruptedException
	{
		String testname = "OpenBecomeSeller";

        // Fetching all test data f4rom excel file
        HashMap<String, String> testData = new HashMap<String, String>();
        testData = reader.getRowTestData(sheetName, testname);
        String executionRequired = testData.get("Execution Required").toLowerCase();

        String expectedTitle = testData.get("Expected Title");	
        // log all data
        CommonUtils.logTestData(sheetName, testname);

        // if execution required field is no
        CommonUtils.toCheckExecutionRequired(executionRequired);
	
        NavigationBarPage op = new NavigationBarPage(driver);
        op.Click_X();
        op.click_BecomeSeller();
        ExplicitWait.checkClickableExplicitly(driver, expectedTitle, 5);
        String actualTitle = driver.getTitle();
    	
    	SoftAssert sa =new SoftAssert();
		sa.assertEquals(actualTitle,expectedTitle);
		sa.assertAll();
	}
	
	@Test(priority=2,groups= {"Navigation"})
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
	
        NavigationBarPage op = new NavigationBarPage(driver);
        op.Click_X();
        op.click_BecomeSeller();
        op.click_FeeStructure();        
        
        ExplicitWait.checkClickableExplicitly(driver, expectedTitle, 5);
        String actualTitle = driver.getTitle();
    	
        
    	SoftAssert sa =new SoftAssert();
		sa.assertEquals(actualTitle,expectedTitle);
		sa.assertAll();		
	}
	
	//negative case
	@Test(priority=3,groups= {"Navigation"})
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
	
        NavigationBarPage op = new NavigationBarPage(driver);
        op.Click_X();
        op.click_BecomeSeller();
        op.click_Services();        
        String actualTitle = driver.getTitle();
        
        System.out.println("Assertion Fail");
    	SoftAssert sa =new SoftAssert();
		sa.assertEquals(actualTitle,expectedTitle);
		sa.assertAll();		
	}
	
	
	@Test (priority=4,groups= {"Navigation"})
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
		
        NavigationBarPage cart = new NavigationBarPage(driver);
		cart.Click_X();
		cart.click_Cart();
		
		ExplicitWait.checkClickableExplicitly(driver, expectedTitle, 5);
		
		String actualTitle = driver.getTitle().toLowerCase();
        Assert.assertTrue(actualTitle.contains(expectedTitle.toLowerCase()),
                "Assertion on actual and expected title of Cart page.");
		
	}
	   
    
	@Test (priority=5,groups= {"Navigation"})
	public void Valid_Search() throws InterruptedException
	{
		String testname = "Search Valid Product";

        // Fetching all test data from excel file
        HashMap<String, String> testData = new HashMap<String, String>();
        testData = reader.getRowTestData(sheetName, testname);
        String executionRequired = testData.get("Execution Required").toLowerCase();
        String Product = testData.get("Products");
        
        String expectedTitle = testData.get("Expected Title");
     // log all data
        CommonUtils.logTestData(sheetName, testname);

        // if execution required field is no
        CommonUtils.toCheckExecutionRequired(executionRequired);
		
        NavigationBarPage search = new NavigationBarPage(driver);
		search.Click_X();
		search.Enter_Search(Product);
		search.Click_SubmitButton();
		ExplicitWait.checkClickableExplicitly(driver, expectedTitle, 5);
		
		String actualTitle = driver.getTitle().toLowerCase();
        Assert.assertTrue(actualTitle.contains(expectedTitle.toLowerCase()),
                "Assertion on actual and expected title of Search page.");
	}
	
	//negative case
	@Test (priority=6,groups= {"Navigation"})
	public void Invalid_Search() throws InterruptedException
		{
			String testname = "Search Invalid Product";

	        // Fetching all test data from excel file
	        HashMap<String, String> testData = new HashMap<String, String>();
	        testData = reader.getRowTestData(sheetName, testname);
	        String executionRequired = testData.get("Execution Required").toLowerCase();
	        String Product = testData.get("Products");
	        
	        String expectedTitle = testData.get("Expected Title");
	     // log all data
	        CommonUtils.logTestData(sheetName, testname);

	        // if execution required field is no
	        CommonUtils.toCheckExecutionRequired(executionRequired);
			
	        NavigationBarPage search = new NavigationBarPage(driver);
			search.Click_X();
			search.Enter_Search(Product);
			search.Click_SubmitButton();
			ExplicitWait.checkClickableExplicitly(driver, expectedTitle, 5);
			
		//Assertion will fail
			System.out.println("Assertion Fail");
			String actualTitle = driver.getTitle().toLowerCase();
	        Assert.assertTrue(actualTitle.contains(expectedTitle.toLowerCase()),
	                "Assertion on actual and expected title of search page.");
		}
	

	@Test (priority=7,groups= {"Navigation"})
	public void Check_FlipKartPlus() throws InterruptedException
	{
		NavigationBarPage plus = new NavigationBarPage(driver);
		plus.Click_X();
		plus.Click_FlipkartPlus();
		plus.Click_ProductsAt1();
	}
	
}
