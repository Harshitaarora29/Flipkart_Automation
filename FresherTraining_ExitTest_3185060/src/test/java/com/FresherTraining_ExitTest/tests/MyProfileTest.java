package com.FresherTraining_ExitTest.tests;

import java.util.HashMap;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.FresherTraining_ExitTest.pages.MyProfilePage;
import com.FresherTraining_ExitTest.utils.CommonUtils;

public class MyProfileTest extends BaseTest
{
	// Work sheet Name used by all tests
    private String sheetName = prop.getProperty("MyProfileTestSheetName");   
    
    @Test (priority=1,groups= {"sanity"})
	public void Open_MyProfile() throws InterruptedException
	{
    	String testname = "Open MyProfile Option";

        // Fetching all test data from excel file
        HashMap<String, String> testData = new HashMap<String, String>();
        testData = reader.getRowTestData(sheetName, testname);
        String executionRequired = testData.get("Execution Required").toLowerCase();
        String Number = testData.get("Number");
        String Password = testData.get("Password");
        
     // log all data
        CommonUtils.logTestData(sheetName, testname);

        // if execution required field is no
        CommonUtils.toCheckExecutionRequired(executionRequired);
       
    	MyProfilePage prof = new MyProfilePage(driver);
        prof.Login_Func(Number,Password);
        prof.Click_MyProfile();
	}
    
    @Test (priority=1,groups= {"sanity"})
	public void Enter_CorrectPersonalInfo() throws InterruptedException
	{
		String testname = "Correct Personal Information";

        // Fetching all test data from excel file
        HashMap<String, String> testData = new HashMap<String, String>();
        testData = reader.getRowTestData(sheetName, testname);
        String executionRequired = testData.get("Execution Required").toLowerCase();
        String FirstName = testData.get("FirstName");
        String LastName = testData.get("LastName");
        String Number = testData.get("Number");
        String Password = testData.get("Password");
        
     // log all data
        CommonUtils.logTestData(sheetName, testname);

        // if execution required field is no
        CommonUtils.toCheckExecutionRequired(executionRequired);
		
        MyProfilePage prof = new MyProfilePage(driver);
        prof.Login_Func(Number,Password);
        prof.Click_MyProfile();
        prof.Enter_PersonalInfo(FirstName,LastName);
        prof.ClickSaveButton();
				
	}
    
    @Test (priority=2,groups= {"sanity"})
	public void Enter_Incorrect_PersonalInfo() throws InterruptedException
	{
		String testname = "Incorrect Personal Information";

        // Fetching all test data from excel file
        HashMap<String, String> testData = new HashMap<String, String>();
        testData = reader.getRowTestData(sheetName, testname);
        String executionRequired = testData.get("Execution Required").toLowerCase();
        String FirstName = testData.get("FirstName");
        String LastName = testData.get("LastName");
        String Number = testData.get("Number");
        String Password = testData.get("Password");
        
     // log all data
        CommonUtils.logTestData(sheetName, testname);

        // if execution required field is no
        CommonUtils.toCheckExecutionRequired(executionRequired);
		
        MyProfilePage prof = new MyProfilePage(driver);
        prof.Login_Func(Number,Password);
        prof.Click_MyProfile();
        prof.Enter_PersonalInfo(FirstName,LastName);
        prof.ClickSaveButton();
				
	}
    
    @Test (priority=3,groups= {"sanity"})
	public void Blank_FirstName() throws InterruptedException
	{
		String testname = "Blank FirstName";

        // Fetching all test data from excel file
        HashMap<String, String> testData = new HashMap<String, String>();
        testData = reader.getRowTestData(sheetName, testname);
        String executionRequired = testData.get("Execution Required").toLowerCase();
        String FirstName = testData.get("FirstName");
        String LastName = testData.get("LastName");
        String Number = testData.get("Number");
        String Password = testData.get("Password");
        
     // log all data
        CommonUtils.logTestData(sheetName, testname);

        // if execution required field is no
        CommonUtils.toCheckExecutionRequired(executionRequired);
		
        MyProfilePage prof = new MyProfilePage(driver);
        prof.Login_Func(Number,Password);
        prof.Click_MyProfile();
        prof.Enter_PersonalInfo(FirstName,LastName);
        prof.ClickSaveButton();
				
	}
    
    @Test (priority=4,groups= {"sanity"})
	public void Blank_LastName() throws InterruptedException
	{
		String testname = "Blank LastName";

        // Fetching all test data from excel file
        HashMap<String, String> testData = new HashMap<String, String>();
        testData = reader.getRowTestData(sheetName, testname);
        String executionRequired = testData.get("Execution Required").toLowerCase();
        String FirstName = testData.get("FirstName");
        String LastName = testData.get("LastName");
        String Number = testData.get("Number");
        String Password = testData.get("Password");
        
     // log all data
        CommonUtils.logTestData(sheetName, testname);

        // if execution required field is no
        CommonUtils.toCheckExecutionRequired(executionRequired);
		
        MyProfilePage prof = new MyProfilePage(driver);
        prof.Login_Func(Number,Password);
        prof.Click_MyProfile();
        prof.Enter_PersonalInfo(FirstName,LastName);
        prof.ClickSaveButton();
				
	}
    
//    @Test (priority=1,groups= {"sanity"})
//    @Parameters ({"number","password"})
//   	public void MyProfile(String Number,String Password) throws InterruptedException
//   	{
//          
//       	MyProfilePage prof = new MyProfilePage(driver);
//           prof.Login_Func(Number,Password);
//           prof.Click_MyProfile();
//   	}
}
