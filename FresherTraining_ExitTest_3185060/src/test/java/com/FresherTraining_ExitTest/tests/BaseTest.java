package com.FresherTraining_ExitTest.tests;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.log4testng.Logger;

import com.FresherTraining_ExitTest.utils.Excel_Reader;
import com.FresherTraining_ExitTest.utils.Screenshot;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class BaseTest
{
	public static WebDriver driver;

	public static File file;
	public static FileInputStream fis;
	public static Properties prop;
	public static ExtentReports extent;
	public static ExtentTest extentTest;
	public static String DriverBrowser, Select;
	
	// Excel File Test Data Reader
    public static Excel_Reader reader = null;

    static {
        reader = new Excel_Reader("./Excel/TestData.xlsx");
    }

    static {
        String log4jConfigFile = System.getProperty("user.dir")
               + File.separator + "./log4j/log4j.properties";
        PropertyConfigurator.configure(log4jConfigFile);
       }
    
 // Log4j logger
    public final static Logger logger = Logger.getLogger(BaseTest.class);

	static {
		file = new File("./Resources/config.properties");
		try {
			fis = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		prop = new Properties();
		try {
			prop.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@BeforeSuite
	public void setExtent() {
		extent = new ExtentReports("./Reports/ExtentReports.html");
	}

	@AfterSuite
	public void endReport() {
		extent.flush();
		extent.close();
	}

	@BeforeMethod
	public static void initializeDriver() {

		DriverBrowser = prop.getProperty("driverName");
		Select = prop.getProperty("mode");

		// Code for Chrome Driver with or without Headless Mode

		if (DriverBrowser.equals("ChromeDriver")) 
		{
			System.setProperty(prop.getProperty("chromeDriverProperty"), prop.getProperty("chromeDriverPath"));
			if (Select.equals("Headless")) 
			{
				ChromeOptions options = new ChromeOptions();
				options.addArguments("window-size= 1920, 1080");
				options.addArguments("--headless");
				driver = new ChromeDriver(options);
			} 
			else
			{
				driver = new ChromeDriver();
			}
		}
		
		// Code for FireFox Driver without Headless Mode
		if (DriverBrowser.equals("FireFoxDriver")) {
			System.setProperty(prop.getProperty("firefoxDriverProperty"), prop.getProperty("firefoxDriverPath"));
			if (Select.equals("Headless")) 
			{
				FirefoxOptions options = new FirefoxOptions();
				options.addArguments("window-size= 1920, 1080");
				options.addArguments("--headless");
				driver = new FirefoxDriver(options);
				

			}
			
			else
			{
				driver = new FirefoxDriver();
			}
		}
		
		// MicrosoftEdge Does not Support Headless Mode
		if (DriverBrowser.equals("MicrosoftEdge")) {
			System.setProperty(prop.getProperty("EdgeDriverProperty"),
					prop.getProperty("EdgeDriverPath"));
			driver = new EdgeDriver();
			
			//implicit wait
			String number= prop.getProperty("wait");
			int num = Integer.parseInt(number);
			driver.manage().timeouts().implicitlyWait(num, TimeUnit.SECONDS);
		}

		driver.manage().window().maximize();

		String n = prop.getProperty("Wait");
		driver.manage().timeouts().implicitlyWait(Long.parseLong(n), TimeUnit.SECONDS);
	}

	@BeforeMethod
	public static void openUrl() {
		driver.get(prop.getProperty("FlipkartUrl"));
		

	}

	@BeforeMethod
	public void startTest(Method name) {
		String testName = name.getName();
		extentTest = extent.startTest(testName);
	}

	@AfterMethod
	public void ResultTest(ITestResult result) throws IOException {
		if (result.getStatus() == ITestResult.FAILURE) {
			// take screenshot
			String imagePath = Screenshot.CaptureScreenshot(driver, result.getName());
			extentTest.log(LogStatus.FAIL, extentTest.addScreenCapture(imagePath));
			extentTest.log(LogStatus.INFO, result.getThrowable());

		}
		else 
		{
			if (result.getStatus() == ITestResult.SUCCESS)
			{
				extentTest.log(LogStatus.PASS, "Test case passed succefully");
			}

		}
		extent.endTest(extentTest);

	}

	@AfterMethod
	public static void testClose() {

		driver.close();

	}

}


