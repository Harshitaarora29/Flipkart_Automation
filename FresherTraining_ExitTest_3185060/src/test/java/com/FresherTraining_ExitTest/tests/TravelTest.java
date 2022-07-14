package com.FresherTraining_ExitTest.tests;

import java.util.HashMap;

import org.testng.annotations.Test;
import com.FresherTraining_ExitTest.pages.TravelPage;
import com.FresherTraining_ExitTest.utils.CommonUtils;

public class TravelTest extends BaseTest
{
	// Worksheet Name used by all tests
    private String sheetName = prop.getProperty("TravelTestSheetName");
	
	@Test (priority=1,groups= {"sanity"})
	public void ValidCities() throws InterruptedException
	{
		String testname = "ValidCities";

        // Fetching all test data from excel file
        HashMap<String, String> testData = new HashMap<String, String>();
        testData = reader.getRowTestData(sheetName, testname);
        String executionRequired = testData.get("Execution Required").toLowerCase();
        String DepartureCity = testData.get("Departure City");
        String ArrivalCity = testData.get("Arrival City");
        
        
     // log all data
        CommonUtils.logTestData(sheetName, testname);

        // if execution required field is no
        CommonUtils.toCheckExecutionRequired(executionRequired);
		
		TravelPage travel = new TravelPage(driver);
		travel.Click_X();
		travel.Click_Travel();
		travel.Enter_DepartureCity(DepartureCity);
		travel.Enter_ArrivalCity(ArrivalCity);
	}
	
	@Test (priority=2,groups= {"sanity"})
	public void InvalidCities() throws InterruptedException
	{
		String testname = "InvalidCities";

        // Fetching all test data from excel file
        HashMap<String, String> testData = new HashMap<String, String>();
        testData = reader.getRowTestData(sheetName, testname);
        String executionRequired = testData.get("Execution Required").toLowerCase();
        String DepartureCity = testData.get("Departure City");
        String ArrivalCity = testData.get("Arrival City");
        
        
     // log all data
        CommonUtils.logTestData(sheetName, testname);

        // if execution required field is no
        CommonUtils.toCheckExecutionRequired(executionRequired);
		
		TravelPage travel = new TravelPage(driver);
		travel.Click_X();
		travel.Click_Travel();
		travel.Enter_DepartureCity(DepartureCity);
		travel.Enter_ArrivalCity(ArrivalCity);
	}
	
}
