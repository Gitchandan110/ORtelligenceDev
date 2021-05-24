
/* Created by Piyush Sadawarti on 19/5/2021
 * Modified by Piyush Sadawarti on 20/5/2021
 * Modified by Piyush Sadawarti on 21/5/2021
 * 
 */

//Nurse dashboard Test


package com.ort.qa.testcases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
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
    @BeforeMethod
 	public void setUp() throws InterruptedException 
    {
 		initialization();
 		loginPage = new LoginPage(driver);
 		nurseDashboardPage = new NurseDashboardPage();
 		selectFacilityPage = new SelectFacilityPage(driver);
 		nurseDashboardPage=loginPage.login(prop.getProperty("username"), prop.getProperty("password"));  
 		Thread.sleep(1000);
 		selectFacilityPage.clickOnDropDown();
 		Thread.sleep(1000);
		selectFacilityPage.clickConfirm();
		Thread.sleep(1000);
		
 	}
    
// 	Verification of page title  
 	@Test(priority=1)
 	public void verifyDashboardPageTitleTest()
 	{
 		String dashboardPageTitle =nurseDashboardPage.verifyDashboardPageTitle();
		System.out.println("Nurse Dashboard page title is -  "+dashboardPageTitle);  
	}

// 	Verification of visibility of different options of Menu
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
 		Assert.assertEquals(true, nurseDashboardPage.menuUserName.isDisplayed());
 		Assert.assertEquals(true, nurseDashboardPage.menuAlerts.isDisplayed());
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
    
//	Dashboard option Click. 	
// 	Click on In Process option of Dashboard
 	@Test(priority=6)
 	public void clickInProcessDashboard() throws InterruptedException
 	{
 		Thread.sleep(2000);
 		nurseDashboardPage.dashboardInProcess.click();
 		Thread.sleep(2000);
 	} 
 	
// 	Click on On Hold option of Dashboard
 	@Test(priority=7)
 	public void clickOnHoldDashboard() throws InterruptedException
 	{
 		Thread.sleep(2000);
 		nurseDashboardPage.dashboardOnHold.click(); 	
 		Thread.sleep(2000);

 	} 
 	
// 	Click on Cart Review option of Dashboard
 	@Test(priority=8)
 	public void clickCartReviewDashboard() throws InterruptedException
 	{
 		Thread.sleep(2000);
 		nurseDashboardPage.dashboardCartReview.click();
 		Thread.sleep(2000);
 	} 
 	
// 	Click on Create Case option of Dashboard
 	@Test(priority=9)
 	public void clickCreateCaseDashboard() throws InterruptedException
 	{
 		Thread.sleep(2000);
 		nurseDashboardPage.dashboardCreateCase.click();
 		Thread.sleep(2000);
 	} 
 	
// 	Click on Search Case option of Dashboard
 	@Test(priority=10)
 	public void clickSearchCaseDashboard() throws InterruptedException
 	{
 		Thread.sleep(2000);
 		nurseDashboardPage.dashboardSearchCase.click();
 		Thread.sleep(2000);
 	} 
 	
// 	Click on Open Case option of Dashboard
 	@Test(priority=11)
 	public void clickOpenCaseDashboard() throws InterruptedException
 	{
 		Thread.sleep(2000);
 		nurseDashboardPage.dashboardOpenCase.click();
 		Thread.sleep(2000);
 	} 

// 	Click on ORtelligence option of Dashboard
 	@Test(priority=12)
 	public void clickORtelligenceDashboard() throws InterruptedException
 	{
 		Thread.sleep(2000);
 		nurseDashboardPage.dashboardORtelligence.click();
 		Thread.sleep(2000);
 	} 
 	
//	Header option Click. 	
// 	Click on In Process option of Menu
 	@Test(priority=13)
 	public void clickInProcessMenu() throws InterruptedException
 	{
 		Thread.sleep(2000);
 		nurseDashboardPage.menuInProcess.click();
 		Thread.sleep(2000);
 	} 
 	
// 	Click on On Hold option of Menu
 	@Test(priority=14)
 	public void clickOnHoldMenu() throws InterruptedException
 	{
 		Thread.sleep(2000);
 		nurseDashboardPage.menuOnHold.click();
 		Thread.sleep(2000);
 	} 
 	
// 	Click on Cart Review option of Menu
 	@Test(priority=15)
 	public void clickCartReviewMenu() throws InterruptedException
 	{
 		Thread.sleep(2000);
 		nurseDashboardPage.menuCartReview.click();
 		Thread.sleep(2000);
 	} 
 	
// 	Click on Create Case option of Menu
 	@Test(priority=16)
 	public void clickCreateCaseMenu() throws InterruptedException
 	{
 		Thread.sleep(2000);
 		nurseDashboardPage.menuCreateCase.click();
 		Thread.sleep(2000);
 	} 
 	
// 	Click on Search Case option of Menu
 	@Test(priority=17)
 	public void clickSearchCaseMenu() throws InterruptedException
 	{
 		Thread.sleep(2000);
 		nurseDashboardPage.menuSearchCase.click();
 		Thread.sleep(2000);
 	} 
 	
// 	Click on Open Case option of Menu
 	@Test(priority=18)
 	public void clickOpenCaseMenu() throws InterruptedException
 	{
 		Thread.sleep(2000);
 		nurseDashboardPage.menuOpenCase.click();
 	} 

// 	Click on ORtelligence option of Menu
 	@Test(priority=19)
 	public void clickORtelligenceMenu() throws InterruptedException
 	{
 		Thread.sleep(2000);
 		nurseDashboardPage.menuORtelligence.click();
 		Thread.sleep(2000);
 	} 	

// 	Click on Profile option of Menu
 	@Test(priority=20)
 	public void clickProfileMenu() throws InterruptedException
 	{
 		Thread.sleep(2000);
 		nurseDashboardPage.clickOnMenuProfile();
 		Thread.sleep(2000);
 	}	
 	
// 	Click on Switch Location option of Menu
 	@Test(priority=21)
 	public void clickNurseSwitchLocationMenu() throws InterruptedException
 	{
 		Thread.sleep(2000);
 		nurseDashboardPage.clickOnMenuSwitchLocation();
 		Thread.sleep(2000);
 	}	

// 	Click on Logout option of Menu
 	@Test(priority=22)
 	public void clickLogoutMenu() throws InterruptedException
 	{
 		Thread.sleep(2000);
 		nurseDashboardPage.clickOnMenuLogout();
 		Thread.sleep(2000);
 	} 	
 	 	
// 	Click on Alert option of Menu
 	@Test(priority=23)
 	public void clickAlertMenu() throws InterruptedException
 	{
 		Thread.sleep(2000);
 		nurseDashboardPage.menuAlerts.click();
 		Thread.sleep(2000);
 	}  	
 	
//	Quit browser
 	@AfterMethod
 	public void tearDown() throws InterruptedException 
 	{
 		Thread.sleep(3000);
 		driver.quit();
 	}
}
 	
