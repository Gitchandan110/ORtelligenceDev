package com.ort.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.ort.qa.base.TestBase;
import com.ort.qa.pages.CreateCaseFindPatientPage;
import com.ort.qa.pages.LoginPage;
import com.ort.qa.pages.NurseDashboardPage;
import com.ort.qa.pages.SelectFacilityPage;

public class NurseDashboardPageTest extends TestBase
{
//	Declaration
//	LoginPage object - loginPage 
	LoginPage loginPage;
//	NurseDashboardPage object - nurseDashboardPage
	NurseDashboardPage nurseDashboardPage;
//   SelectFacilityPage object - selectFacilityPage
	SelectFacilityPage selectFacilityPage;
	
    public NurseDashboardPageTest() 
    {
    	super();	
    }
     
/*  Initialize different objects
 * 	Perform pre-required tests 
*/
    @BeforeTest
 	public void setUp() 
    {
 		initialization();
 		loginPage = new LoginPage();
 		nurseDashboardPage = new NurseDashboardPage();
 		nurseDashboardPage=loginPage.login(prop.getProperty("username"), prop.getProperty("password"));  
  		selectFacilityPage = new SelectFacilityPage();
  		selectFacilityPage.clickOnDropDown();
		selectFacilityPage.clickConfirm();
 	}
    
//// 	Verification of page title  
// 	@Test(priority=1)
// 	public void verifyDashboardPageTitleTest()
// 	{
// 		String dashboardPageTitle =nurseDashboardPage.verifyNurseDashboardPageTitle();
//		Assert.assertEquals(dashboardPageTitle, "Login", "Dashboard Page Title not matched");  
//	}

//// 	Verification of visibility of different options of Header
// 	@Test(priority=2)
// 	public void verifyHeaderOptionVisibility()
// 	{
// 		 		 		
// 	}
// 		
//// 	Verification of visibility of different options of Dashboard
// 	@Test(priority=3)
// 	public void verifyDashboardOptionVisibility()
// 	{
// 		 		 		
// 	}		
// 		
//// 	Verification of text of different options of Header
// 	@Test(priority=4)
// 	public void verifyHeaderOptiontext()
// 	{
// 		 		
// 	}
// 		
//// 	Verification of text of different options of Dashboard
// 	@Test(priority=5)
// 	public void verifyDashboardOptiontext()
// 	{
// 		 		
// 	} 		

//	Dashboard option Click. 	
// 	Click on In Process option of Dashboard
 	@Test(priority=6)
 	public void clickInProcessDashboard()
 	{
 		nurseDashboardPage.dashboardInProcess.click();
 	} 
 	
// 	Click on On Hold option of Dashboard
 	@Test(priority=7)
 	public void clickOnHoldDashboard()
 	{
 		nurseDashboardPage.dashboardOnHold.click(); 				
 	} 
 	
// 	Click on Cart Review option of Dashboard
 	@Test(priority=8)
 	public void clickCartReviewDashboard()
 	{
 		nurseDashboardPage.dashboardCartReview.click();
 	} 
 	
// 	Click on Create Case option of Dashboard
 	@Test(priority=9)
 	public void clickCreateCaseDashboard()
 	{
 		nurseDashboardPage.dashboardCreateCase.click();	
 	} 
 	
// 	Click on Search Case option of Dashboard
 	@Test(priority=10)
 	public void clickSearchCaseDashboard()
 	{
 		nurseDashboardPage.dashboardSearchCase.click();
 	} 
 	
// 	Click on Open Case option of Dashboard
 	@Test(priority=11)
 	public void clickOpenCaseDashboard()
 	{
 		nurseDashboardPage.dashboardOpenCase.click();
 	} 

// 	Click on ORtelligence option of Dashboard
 	@Test(priority=12)
 	public void clickORtelligenceDashboard()
 	{
 		nurseDashboardPage.dashboardORtelligence.click();
 	} 
 	
//	Header option Click. 	
// 	Click on In Process option of Menu
 	@Test(priority=13)
 	public void clickInProcessMenu()
 	{
 		nurseDashboardPage.menuInProcess.click();
 	} 
 	
// 	Click on On Hold option of Menu
 	@Test(priority=14)
 	public void clickOnHoldMenu()
 	{
 		nurseDashboardPage.menuOnHold.click();
 	} 
 	
// 	Click on Cart Review option of Menu
 	@Test(priority=15)
 	public void clickCartReviewMenu()
 	{
 		nurseDashboardPage.menuCartReview.click();
 	} 
 	
// 	Click on Create Case option of Menu
 	@Test(priority=16)
 	public void clickCreateCaseMenu()
 	{
 		nurseDashboardPage.menuCreateCase.click();
 	} 
 	
// 	Click on Search Case option of Menu
 	@Test(priority=17)
 	public void clickSearchCaseMenu()
 	{
 		nurseDashboardPage.menuSearchCase.click();
 	} 
 	
// 	Click on Open Case option of Menu
 	@Test(priority=18)
 	public void clickOpenCaseMenu()
 	{
 		nurseDashboardPage.menuOpenCase.click();
 	} 

// 	Click on ORtelligence option of Menu
 	@Test(priority=19)
 	public void clickORtelligenceMenu()
 	{
 		nurseDashboardPage.menuORtelligence.click();
 	} 	
 	
 //	Quit browser
 	@AfterTest
 	public void tearDown() throws InterruptedException 
 	{
 		Thread.sleep(3000);
 		driver.quit();
 	}
}
 	