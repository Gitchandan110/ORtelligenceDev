package com.ort.qa.testcases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.ort.qa.base.TestBase;
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
 	public void setUp() throws InterruptedException 
    {
 		initialization();
 		loginPage = new LoginPage();
 		nurseDashboardPage = new NurseDashboardPage();
 		selectFacilityPage = new SelectFacilityPage();
 		nurseDashboardPage=loginPage.login(prop.getProperty("username"), prop.getProperty("password"));  
 		Thread.sleep(1000);
 		selectFacilityPage.clickOnDropDown();
 		Thread.sleep(1000);
		selectFacilityPage.clickConfirm();
		Thread.sleep(1000);
		
 	}
    
//// 	Verification of page title  
// 	@Test(priority=1)
// 	public void verifyDashboardPageTitleTest()
// 	{
// 		String dashboardPageTitle =nurseDashboardPage.verifyNurseDashboardPageTitle();
//		Assert.assertEquals(dashboardPageTitle, "Login", "Dashboard Page Title not matched");  
//	}

// 	Verification of visibility of different options of Header
 	@Test(priority=2)
 	public void verifyMenuOptionVisibility() throws InterruptedException
 	{
 		Thread.sleep(2000);
 		Assert.assertEquals(true, nurseDashboardPage.menuInProcess.isDisplayed());
 		Assert.assertEquals(true, nurseDashboardPage.menuOnHold.isDisplayed());
 		Assert.assertEquals(true, nurseDashboardPage.menuCartReview.isDisplayed());
 		Assert.assertEquals(true, nurseDashboardPage.menuCreateCase.isDisplayed());
 		Assert.assertEquals(true, nurseDashboardPage.menuSearchCase.isDisplayed());
 		Assert.assertEquals(true, nurseDashboardPage.menuOpenCase.isDisplayed());
 		Assert.assertEquals(true, nurseDashboardPage.menuORtelligence.isDisplayed());
 		
 	}
 		
// 	Verification of visibility of different options of Dashboard
 	@Test(priority=3)
 	public void verifyDashboardOptionVisibility() throws InterruptedException
 	{
 		Thread.sleep(2000);
 		Assert.assertEquals(true, nurseDashboardPage.dashboardInProcess.isDisplayed());
 		Assert.assertEquals(true, nurseDashboardPage.dashboardOnHold.isDisplayed());
 		Assert.assertEquals(true, nurseDashboardPage.dashboardCartReview.isDisplayed());
 		Assert.assertEquals(true, nurseDashboardPage.dashboardCreateCase.isDisplayed());
 		Assert.assertEquals(true, nurseDashboardPage.dashboardSearchCase.isDisplayed());
 		Assert.assertEquals(true, nurseDashboardPage.dashboardOpenCase.isDisplayed());
 		Assert.assertEquals(true, nurseDashboardPage.dashboardORtelligence.isDisplayed());		 		
 	}		
// 		
//// 	Verification of text of different options of Menu
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
 	public void clickInProcessDashboard() throws InterruptedException
 	{
 		Thread.sleep(2000);
// 		initialization();
// 		loginPage = new LoginPage();
// 		nurseDashboardPage = new NurseDashboardPage();
// 		selectFacilityPage = new SelectFacilityPage();
// 		nurseDashboardPage=loginPage.login(prop.getProperty("username"), prop.getProperty("password"));  
// 		Thread.sleep(1000);
//  		selectFacilityPage.clickOnDropDown();
//  		Thread.sleep(1000);
//		selectFacilityPage.clickConfirm();
//		Thread.sleep(1000);
// 		nurseDashboardPage.clickInProcessDashboardPage();
 		nurseDashboardPage.dashboardInProcess.click();
 		Thread.sleep(2000);
// 		System.out.println("dashboardInProcess performed");
 	} 
 	
// 	Click on On Hold option of Dashboard
 	@Test(priority=7)
 	public void clickOnHoldDashboard() throws InterruptedException
 	{
 		Thread.sleep(2000);
// 		initialization();
// 		loginPage = new LoginPage();
// 		nurseDashboardPage = new NurseDashboardPage();
// 		selectFacilityPage = new SelectFacilityPage();
// 		nurseDashboardPage=loginPage.login(prop.getProperty("username"), prop.getProperty("password"));  
// 		Thread.sleep(1000);
//  		selectFacilityPage.clickOnDropDown();
//  		Thread.sleep(1000);
//		selectFacilityPage.clickConfirm();
//		Thread.sleep(1000);
 		nurseDashboardPage.dashboardOnHold.click(); 		
 		System.out.println("clickOnHoldDashboard performed");
 	} 
 	
// 	Click on Cart Review option of Dashboard
 	@Test(priority=8)
 	public void clickCartReviewDashboard() throws InterruptedException
 	{
 		Thread.sleep(2000);
 		nurseDashboardPage.dashboardCartReview.click();
 		System.out.println("clickCartReviewDashboard performed");
 	} 
 	
// 	Click on Create Case option of Dashboard
 	@Test(priority=9)
 	public void clickCreateCaseDashboard() throws InterruptedException
 	{
 		Thread.sleep(2000);
 		nurseDashboardPage.dashboardCreateCase.click();	
 		System.out.println("clickCreateCaseDashboard performed");
 	} 
 	
// 	Click on Search Case option of Dashboard
 	@Test(priority=10)
 	public void clickSearchCaseDashboard() throws InterruptedException
 	{
 		Thread.sleep(2000);
 		nurseDashboardPage.dashboardSearchCase.click();
 		System.out.println("clickSearchCaseDashboard performed");
 	} 
 	
// 	Click on Open Case option of Dashboard
 	@Test(priority=11)
 	public void clickOpenCaseDashboard() throws InterruptedException
 	{
 		Thread.sleep(2000);
 		nurseDashboardPage.dashboardOpenCase.click();
 		System.out.println("clickOpenCaseDashboard performed");
 	} 

// 	Click on ORtelligence option of Dashboard
 	@Test(priority=12)
 	public void clickORtelligenceDashboard() throws InterruptedException
 	{
 		Thread.sleep(2000);
 		nurseDashboardPage.dashboardORtelligence.click();
 		System.out.println("clickORtelligenceDashboard performed");
 	} 
 	
//	Header option Click. 	
// 	Click on In Process option of Menu
 	@Test(priority=13)
 	public void clickInProcessMenu() throws InterruptedException
 	{
 		Thread.sleep(2000);
 		nurseDashboardPage.menuInProcess.click();
 		System.out.println("clickInProcessMenu performed");
 	} 
 	
// 	Click on On Hold option of Menu
 	@Test(priority=14)
 	public void clickOnHoldMenu() throws InterruptedException
 	{
 		Thread.sleep(2000);
 		nurseDashboardPage.menuOnHold.click();
 		System.out.println("clickOnHoldMenu performed");
 	} 
 	
// 	Click on Cart Review option of Menu
 	@Test(priority=15)
 	public void clickCartReviewMenu() throws InterruptedException
 	{
 		Thread.sleep(2000);
 		nurseDashboardPage.menuCartReview.click();
 		System.out.println("clickCartReviewMenu performed");
 	} 
 	
// 	Click on Create Case option of Menu
 	@Test(priority=16)
 	public void clickCreateCaseMenu() throws InterruptedException
 	{
 		Thread.sleep(2000);
 		nurseDashboardPage.menuCreateCase.click();
 		System.out.println("clickCreateCaseMenu performed");
 	} 
 	
// 	Click on Search Case option of Menu
 	@Test(priority=17)
 	public void clickSearchCaseMenu() throws InterruptedException
 	{
 		Thread.sleep(2000);
 		nurseDashboardPage.menuSearchCase.click();
 		System.out.println("clickSearchCaseMenu performed");
 	} 
 	
// 	Click on Open Case option of Menu
 	@Test(priority=18)
 	public void clickOpenCaseMenu() throws InterruptedException
 	{
 		Thread.sleep(2000);
 		nurseDashboardPage.menuOpenCase.click();
 		System.out.println("clickOpenCaseMenu performed");
 	} 

// 	Click on ORtelligence option of Menu
 	@Test(priority=19)
 	public void clickORtelligenceMenu() throws InterruptedException
 	{
 		Thread.sleep(2000);
 		nurseDashboardPage.menuORtelligence.click();
 		System.out.println("clickORtelligenceMenu performed");
 	} 	
 	
//	Quit browser
 	@AfterTest
 	public void tearDown() throws InterruptedException 
 	{
 		Thread.sleep(3000);
 		driver.quit();
 	}
}
 	