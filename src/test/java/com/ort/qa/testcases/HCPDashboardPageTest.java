/* Created by Piyush Sadawarti on 21/5/2021
 * 
 * 
 * 
 */
package com.ort.qa.testcases;

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

public class HCPDashboardPageTest extends TestBase
{
//	Declaration
//	LoginPage object - loginPage 
	LoginPage loginPage;
//	NurseDashboardPage object - nurseDashboardPage
	NurseDashboardPage nurseDashboardPage;
//   SelectFacilityPage object - selectFacilityPage
	SelectFacilityPage selectFacilityPage;
	
    public HCPDashboardPageTest() 
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
 		loginPage = new LoginPage();
 		nurseDashboardPage = new NurseDashboardPage();
 		selectFacilityPage = new SelectFacilityPage();
 		nurseDashboardPage=loginPage.login(prop.getProperty("usernameHCP"), prop.getProperty("passwordHCP"));  
 		Thread.sleep(3000);
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
		System.out.println("HCP Dashboard page title is -  "+dashboardPageTitle);  
	}

// 	Verification of visibility of different options of Menu
 	@Test(priority=2)
 	public void verifyMenuOptionVisibility() throws InterruptedException
 	{
 		Thread.sleep(2000);
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
 		Assert.assertEquals(true, nurseDashboardPage.dashboardCreateCaseHCP.isDisplayed());
 		Assert.assertEquals(true, nurseDashboardPage.dashboardSearchCaseHCP.isDisplayed());
 		Assert.assertEquals(true, nurseDashboardPage.dashboardOpenCaseHCP.isDisplayed());
 		Assert.assertEquals(true, nurseDashboardPage.dashboardORtelligenceHCP.isDisplayed());		 		
 	}		
    
//	Dashboard option Click. 	
// 	Click on Create Case option of Dashboard
 	@Test(priority=9)
 	public void clickCreateCaseDashboard() throws InterruptedException
 	{
 		Thread.sleep(2000);
 		nurseDashboardPage.dashboardCreateCaseHCP.click();	
 	} 
 	
// 	Click on Search Case option of Dashboard
 	@Test(priority=10)
 	public void clickSearchCaseDashboard() throws InterruptedException
 	{
 		Thread.sleep(2000);
 		nurseDashboardPage.dashboardSearchCaseHCP.click();
 	} 
 	
// 	Click on Open Case option of Dashboard
 	@Test(priority=11)
 	public void clickOpenCaseDashboard() throws InterruptedException
 	{
 		Thread.sleep(2000);
 		nurseDashboardPage.dashboardOpenCaseHCP.click();
 	} 

// 	Click on ORtelligence option of Dashboard
 	@Test(priority=12)
 	public void clickORtelligenceDashboard() throws InterruptedException
 	{
 		Thread.sleep(2000);
 		nurseDashboardPage.dashboardORtelligenceHCP.click();
 	} 
 	
//	Header option Click. 	
// 	Click on Create Case option of Menu
 	@Test(priority=16)
 	public void clickCreateCaseMenu() throws InterruptedException
 	{
 		Thread.sleep(2000);
 		nurseDashboardPage.menuCreateCase.click();
 	} 
 	
// 	Click on Search Case option of Menu
 	@Test(priority=17)
 	public void clickSearchCaseMenu() throws InterruptedException
 	{
 		Thread.sleep(2000);
 		nurseDashboardPage.menuSearchCase.click();
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
 	} 	

// 	Click on Profile option of Menu
 	@Test(priority=20)
 	public void clickProfileMenu() throws InterruptedException
 	{
 		Thread.sleep(2000);
 		nurseDashboardPage.clickOnMenuProfile();
 	}	
 	
// 	Click on Switch Location option of Menu
 	@Test(priority=21)
 	public void clickNurseSwitchLocationMenu() throws InterruptedException
 	{
 		Thread.sleep(2000);
 		nurseDashboardPage.clickOnMenuSwitchLocationHCP();
 	}	
 	
// 	Click on Alert option of Menu
 	@Test(priority=22)
 	public void clickAlertMenu() throws InterruptedException
 	{
 		Thread.sleep(2000);
 		nurseDashboardPage.menuAlerts.click();
 		Thread.sleep(2000);
 	}  	
 	
// 	Click on Logout option of Menu
 	@Test(priority=23)
 	public void clickLogoutMenu() throws InterruptedException
 	{
 		Thread.sleep(2000);
 		nurseDashboardPage.clickOnMenuLogout();
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
 	