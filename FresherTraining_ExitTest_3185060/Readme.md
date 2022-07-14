# Flipkart Website Automation Suite Information:
##### To run the Flipkart Automation Suite from command line in the project folder
mvn clean test

## GitHub Repository link 
*  https://github.com/Harshitaarora29/Flipkart_Automation.git

#### Testng files description
* testng.xml: define the tests related to different pages across the site


## Jenkins ( Run with jenkins )  
1. Install Jenkins.war
2. open cmd with jenkins path and write :
		java -jre jenkins.war

		
## Screenshots 
![Jenkins Setup](./photo/Screenshot3.png)

![Jenkins Setup](./photo/Screenshot1.png)

![Jenkins Setup](./photo/Screenshot2.png)

#### Packages description
* com.FresherTraining_ExitTest_Pages- Defining all the pages actions and the respective object repository.
* com.FresherTraining_ExitTest_utils- Defining all the utilities needed for the tests.
* com.FresherTraining_ExitTest_tests- Defining all the pages tests and assertions.

#### Tests.java files description
**Base_Test** : The main class which defines-
* @BeforeMethod- to open the browser, to open url and get the name of the test
* @AfterMethd- to attach screenshot and to quit the browser
* @BeforeSuite- to set Extent
* @AfterSuite- to end the report

**Home_Test** : check functions on the home option on category field of Flipkart. Includes tests:
* Check HomeFurnishings
* Check Kitchen and Dining

**Electronics_Test** : check functions on the electronics option on category section of Flipkart. 
Includes tests:
* Check Cameras_Accessories
* Check Audio

**Fashion_Test** : check functions on the fashion option on category section of Flipkart. 
Includes tests:
* Check MensFashion
* Check WomenWestern

**Grocery_Test** : check functions on the grocery option on category section of Flipkart. 
Includes tests:
* Check ValidProduct
* Check InvalidProduct

**Login_test** : Check login functionality by  entering mobilenumber and password and clicking login button present on dialogue box . 
Includes tests:
* check login with valid login credentials.
* check login with Invalid login credentials.
* check BlankMobileNumber
* check BlankPassword

**MyProfile_test** : checks the fuctionalities of My Profile present in Account .
Includes tests:
* check CorrectPersonalInfo
* check Incorrect PersonalInfo
* check Blank FirstName
* check Blank LastName

**NavigationBar_test** : checks the fuctionalities of Navigation Bar visible on Flipkart in Blue Field.
Includes tests:
* check OpenBecomeSeller
* Check FeeStructure
* Check Services For Seller
* Check Cart
* Check Valid_Search
* Check Invalid_Search
* Check FlipKartPlus

**SocialPlatform_Test** : check functions of social platform option on Footer section of Flipkart. 
Includes tests:
* Open FaceBook
* Open Twitter
* Open Youtube

**Travel_test** : check the flight and the search button in flight page.
Includes tests:
* Valid Cities
* Invalid Cities


#### Drivers Folder description:

* chromedriver.exe : drivers for chrome
* geckodriver.exe : drivers for firefox
* msedgedriver.exe: drivers for microsoft edge


#### Other files description
* **Screenshots.java** : defines functions to take screenshots
* **confi.properties** : placed under "./Resources/config.properties". By changing the value of "chooseDriver" and "mode" you can run the project on different browsers:

** For firefox without headless mode** : chooseDriver= "FireFoxDriver"  and mode="normal"

**For chrome in headless mode** : chooseDriver= "ChromeDriver"  and mode="Headless"

** For chrome without headless mode** : chooseDriver= "ChromeDriver"  and mode="normal"

** For Microsoft Edge without headless mode** : chooseDriver="MicrosoftEdge" and mode="normal"

** For Microsoft Edge without headless mode** : chooseDriver="MicrosoftEdge" and mode="Headless"


* **ExcelFile

#### Reports 
* Extent report gets generated after the run under ./Reports/ExtentReports.html.
* TestNG report as "emailable-report.html" gets generated under /test-output.

#### FailedScreenshots
* Failed Screenshots gets placed under /FailedScreenshots
 
 
## Implemented features

-	Create at least 20 automated Test Case across different flows and screens. - **done**
-	Implement POM (Page factory)  - **done**
-	Test data should be read from excel. User has the ability to selective run the test cases by marking yes in the "Execution Required" field in excel. - **done**
-	Use config files for Global Parameters usage. - **done**
-	Use proper waits i.e., implicit wait and explicit wait wherever necessary. - **done**
-	The test should run on following browsers IE, Chrome, FF. - **done**
-	There should be an option to run the test cases in headless mode. - **done**
-	Use Grouping, Priority, and enable/disable when creating the TestNG Test Cases. - **done**
-	Assertions should be used properly throughout the suite. - **done**
-	Put proper assertions and error screenshot in the extent report. - **done**
-	Create a ReadMe document which has the steps to install and run the code. - **done**
-	Integrate your test suite with Jenkins and GitHub for CI/CD part. - **done**
-	Test Suite should be executable from command line using maven. - **done**
-	Use Logger to implement logging in your test cases. - **done**
