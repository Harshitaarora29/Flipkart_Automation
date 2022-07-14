package com.FresherTraining_ExitTest.tests;

import java.util.HashMap;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.FresherTraining_ExitTest.pages.LoginPage;
import com.FresherTraining_ExitTest.utils.CommonUtils;
import com.FresherTraining_ExitTest.utils.ExplicitWait;
 
public class LoginTest extends BaseTest
{
	

	// Work sheet Name used by all tests
    private String sheetName = prop.getProperty("LoginTestSheetName");   
		
	
		
	@Test (priority=1,groups= {"Login"})
	public void validLogin() throws InterruptedException
	{	
		String testname = "ValidLogin";

        // Fetching all test data from excel file
        HashMap<String, String> testData = new HashMap<String, String>();
        testData = reader.getRowTestData(sheetName, testname);
        String executionRequired = testData.get("Execution Required").toLowerCase();
        String Number = testData.get("number");
        String Password = testData.get("password");

        String expectedTitle = testData.get("Expected Title");
        String expectedUrl = testData.get("ExpectedUrl");
        
        // log all data
        CommonUtils.logTestData(sheetName, testname);

        // if execution required field is no
        CommonUtils.toCheckExecutionRequired(executionRequired);

        LoginPage login = new LoginPage(driver);
        login.enterMobileNum(Number);
        login.enterPassword(Password);
        login.ClickLoginButton();
        
    	ExplicitWait.checkClickableExplicitly(driver, expectedTitle, 5);
		String actualTitle = driver.getTitle();
		String actualUrl = driver.getCurrentUrl();
    	
    	SoftAssert sa =new SoftAssert();
		sa.assertEquals(actualUrl,expectedUrl);
		sa.assertEquals(actualTitle,expectedTitle);
		sa.assertAll();

	}
	
	
	@Test (priority=2,groups= {"Login"})
	public void Invalidlogin() throws InterruptedException
	{
		String testname = "InvalidLogin";
		
		// Fetching all test data from excel file
       HashMap<String, String> testData = new HashMap<String, String>();
       testData = reader.getRowTestData(sheetName, testname);
       String executionRequired = testData.get("Execution Required").toLowerCase();
		String Number = testData.get("number");
        String Password = testData.get("password");

        String expectedTitle = testData.get("Expected Title");
     // log all data
        CommonUtils.logTestData(sheetName, testname);

        // if execution required field is no
        CommonUtils.toCheckExecutionRequired(executionRequired);
        
		LoginPage login = new LoginPage(driver);
		login.enterMobileNum(Number);
		login.enterPassword(Password);
		login.ClickLoginButton();	
		
    	ExplicitWait.checkClickableExplicitly(driver, expectedTitle, 5);
		String actualTitle = driver.getTitle();
    			
		SoftAssert sa =new SoftAssert();
		sa.assertEquals(actualTitle,expectedTitle);
		sa.assertAll();
	}
	
	@Test (priority=3,groups= {"Login"})
	public void BlankMobileNumber() throws InterruptedException
	{
		String testname = "BlankMobileNumber";
		
		// Fetching all test data from excel file
        HashMap<String, String> testData = new HashMap<String, String>();
        testData = reader.getRowTestData(sheetName, testname);
        String executionRequired = testData.get("Execution Required").toLowerCase();
        String Number = testData.get("number");
        String Password = testData.get("password");

        String expectedTitle = testData.get("Expected Title");
     // log all data
        CommonUtils.logTestData(sheetName, testname);

        // if execution required field is no
        CommonUtils.toCheckExecutionRequired(executionRequired);

		LoginPage login = new LoginPage(driver);
		login.enterMobileNum(Number);
		login.enterPassword(Password);
		login.ClickLoginButton();
		
		ExplicitWait.checkClickableExplicitly(driver, expectedTitle, 5);
		String actualTitle = driver.getTitle();
    			
		SoftAssert sa =new SoftAssert();
		sa.assertEquals(actualTitle,expectedTitle);
		sa.assertAll();
	}
	
	@Test (priority=4,groups= {"Login"})
	public void BlankPassword() throws InterruptedException
	{
		String testname = "BlankPassword";
		
		// Fetching all test data from excel file
        HashMap<String, String> testData = new HashMap<String, String>();
        testData = reader.getRowTestData(sheetName, testname);
        String executionRequired = testData.get("Execution Required").toLowerCase();
        String Number = testData.get("number");
        String Password = testData.get("password");

        String expectedTitle = testData.get("Expected Title");
     // log all data
        CommonUtils.logTestData(sheetName, testname);

        // if execution required field is no
        CommonUtils.toCheckExecutionRequired(executionRequired);

		LoginPage login = new LoginPage(driver);
		login.enterMobileNum(Number);
		login.enterPassword(Password);
		login.ClickLoginButton();	
		ExplicitWait.checkClickableExplicitly(driver, expectedTitle, 5);
		String actualTitle = driver.getTitle();
    			
		SoftAssert sa =new SoftAssert();
		sa.assertEquals(actualTitle,expectedTitle);
		sa.assertAll();
	}
		
}	
