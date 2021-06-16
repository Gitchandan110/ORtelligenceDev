/* Created by Piyush Sadawarti on 21/5/2021
 * 
 * 
 * 
 */
package com.ort.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
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
 		loginPage = new LoginPage(driver);
 		nurseDashboardPage = new NurseDashboardPage(driver);
 		selectFacilityPage = new SelectFacilityPage(driver);
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
//Modified the previously written "verifyMenuOptionVisibility" testcase: Priyanka:03/06/2021
 	
 	@Test(priority=2)
 	public void verifyMenuOptionVisibility()
 	{
 		boolean flag=nurseDashboardPage.verifyAllMenuOptions();
		Assert.assertTrue(flag); 
 	}
 	
 		
// 	Verification of visibility of different options of Dashboard
//Modified the previously written "verifyDashboardOptionVisibility" testcase: Priyanka:03/06/2021
 	@Test(priority=3)
 	public void verifyDashboardOptionVisibility() throws InterruptedException
 	{
 	
 		boolean flag=nurseDashboardPage.verifyDashboardOptions();
		Assert.assertTrue(flag); 
 				 		
 	}		
    
//	Dashboard option Click. 	
// 	Click on Create Case option of Dashboard
 	@Test(priority=4)
 	public void clickCreateCaseDashboard() throws InterruptedException
 	{
 	
 		nurseDashboardPage.dashboardCreateCaseHCP.click();
 	
 	} 
 	
// 	Click on Search Case option of Dashboard
 	@Test(priority=5)
 	public void clickSearchCaseDashboard() throws InterruptedException
 	{
 		
 		nurseDashboardPage.dashboardSearchCaseHCP.click();
 	
 	} 
 	
// 	Click on Open Case option of Dashboard
 	@Test(priority=6)
 	public void clickOpenCaseDashboard() throws InterruptedException
 	{
 	
 		nurseDashboardPage.dashboardOpenCaseHCP.click();
 	
 	} 

// 	Click on ORtelligence option of Dashboard
 	@Test(priority=7)
 	public void clickORtelligenceDashboard() throws InterruptedException
 	{
 		
 		nurseDashboardPage.dashboardORtelligenceHCP.click();
 	
 	} 
 	
//	Header option Click. 	
// 	Click on Create Case option of Menu
 	@Test(priority=8)
 	public void clickCreateCaseMenu() throws InterruptedException
 	{
 	
 		nurseDashboardPage.menuCreateCase.click();
 		
 	} 
 	
// 	Click on Search Case option of Menu
 	@Test(priority=9)
 	public void clickSearchCaseMenu() throws InterruptedException
 	{
 
 		nurseDashboardPage.menuSearchCase.click();

 	} 
 	
// 	Click on Open Case option of Menu
 	@Test(priority=10)
 	public void clickOpenCaseMenu() throws InterruptedException
 	{
 	
 		nurseDashboardPage.menuOpenCase.click();
 
 	} 

// 	Click on ORtelligence option of Menu
 	@Test(priority=11)
 	public void clickORtelligenceMenu() throws InterruptedException
 	{
 		
 		nurseDashboardPage.menuORtelligence.click();
 	
 	} 	

// 	Click on Profile option of Menu
 	@Test(priority=12)
 	public void clickProfileMenu() throws InterruptedException
 	{
 	
 		nurseDashboardPage.clickOnMenuProfile();
 		
 	}	
 	
// 	Click on Switch Location option of Menu
 	@Test(priority=13)
 	public void clickNurseSwitchLocationMenu() throws InterruptedException
 	{
 		
 		nurseDashboardPage.clickOnMenuSwitchLocationHCP();
 		
 	}	

// 	Click on Logout option of Menu
 	@Test(priority=14)
 	public void clickLogoutMenu() throws InterruptedException
 	{
 		
 		nurseDashboardPage.clickOnMenuLogout();
 		
 	} 	
 	
// 	Click on Alert option of Menu
 	@Test(priority=15)
 	public void clickAlertMenu() throws InterruptedException
 	{
 	
 		nurseDashboardPage.menuAlerts.click();
 		
 	}  	
 	
 //	Quit browser
 	@AfterMethod
 	public void tearDown() throws InterruptedException 
 	{
 	
 		driver.quit();
 	}
}
 	