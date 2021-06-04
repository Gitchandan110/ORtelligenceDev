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

public class SPDDashboardPageTest extends TestBase
{
//	Declaration
//	LoginPage object - loginPage 
	LoginPage loginPage;
//	NurseDashboardPage object - nurseDashboardPage
	NurseDashboardPage nurseDashboardPage;
//   SelectFacilityPage object - selectFacilityPage
	SelectFacilityPage selectFacilityPage;
	
    public SPDDashboardPageTest() 
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
 		nurseDashboardPage=loginPage.login(prop.getProperty("usernameSPD"), prop.getProperty("passwordSPD"));  
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
		System.out.println("SPD Dashboard page title is -  "+dashboardPageTitle);  
	}

// 	Verification of visibility of different options of Menu
 	@Test(priority=2)
 	public void verifyMenuOptionVisibility() throws InterruptedException
 	{
 		Thread.sleep(2000);
 		Assert.assertEquals(true, nurseDashboardPage.menuInProcess.isDisplayed());
 		Assert.assertEquals(true, nurseDashboardPage.menuOnHold.isDisplayed());
 		Assert.assertEquals(true, nurseDashboardPage.menuSearchCase.isDisplayed());
 		Assert.assertEquals(true, nurseDashboardPage.menuCaseQueueSPD.isDisplayed());
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
 		Assert.assertEquals(true, nurseDashboardPage.dashboardSearchCaseSPD.isDisplayed());
 		Assert.assertEquals(true, nurseDashboardPage.dashboardCaseQueueSPD.isDisplayed());		 		
 	}		
    
//	Dashboard option Click. 	
// 	Click on In Process option of Dashboard
 	@Test(priority=4)
 	public void clickInProcessDashboard() throws InterruptedException
 	{
 		Thread.sleep(2000);
 		nurseDashboardPage.dashboardInProcess.click();
 		Thread.sleep(2000);
 	} 
 	
// 	Click on On Hold option of Dashboard
 	@Test(priority=5)
 	public void clickOnHoldDashboard() throws InterruptedException
 	{
 		Thread.sleep(2000);
 		nurseDashboardPage.dashboardOnHold.click();
 		Thread.sleep(2000);
	} 

// 	Click on Search Case option of Dashboard
 	@Test(priority=6)
 	public void clickSearchCaseDashboardSPD() throws InterruptedException
 	{
 		Thread.sleep(2000);
 		nurseDashboardPage.dashboardSearchCaseSPD.click();
 		Thread.sleep(2000);
 	} 
 	
// 	Click on Case Queue option of Dashboard
 	@Test(priority=7)
 	public void clickCaseQueueDashboardSPD() throws InterruptedException
 	{
 		Thread.sleep(2000);
 		nurseDashboardPage.dashboardCaseQueueSPD.click();
 		Thread.sleep(2000);
 	} 
 	
//	Menu option Click. 	
// 	Click on In Process option of Menu
 	@Test(priority=8)
 	public void clickInProcessMenu() throws InterruptedException
 	{
 		Thread.sleep(2000);
 		nurseDashboardPage.menuInProcess.click();
 		Thread.sleep(2000);
 	} 
 	
// 	Click on On Hold option of Menu
 	@Test(priority=9)
 	public void clickOnHoldMenu() throws InterruptedException
 	{
 		Thread.sleep(2000);
 		nurseDashboardPage.menuOnHold.click();
 		Thread.sleep(2000);
 	} 
 	
// 	Click on Search Case option of Menu
 	@Test(priority=10)
 	public void clickSearchCaseMenu() throws InterruptedException
 	{
 		Thread.sleep(2000);
 		nurseDashboardPage.menuSearchCase.click();
 		Thread.sleep(2000);
 	} 
 	
// 	Click on Case Queue option of Menu
 	@Test(priority=11)
 	public void clickCaseQueueMenuSPD() throws InterruptedException
 	{
 		Thread.sleep(2000);
 		nurseDashboardPage.menuCaseQueueSPD.click();
 		Thread.sleep(2000);
 	} 

// 	Click on Profile option of Menu
 	@Test(priority=12)
 	public void clickProfileMenu() throws InterruptedException
 	{
 		Thread.sleep(2000);
 		nurseDashboardPage.clickOnMenuProfile();
 		Thread.sleep(2000);
 	}	
 	
// 	Click on Switch Location option of Menu
 	@Test(priority=13)
 	public void clickNurseSwitchLocationMenuSPD() throws InterruptedException
 	{
 		Thread.sleep(2000);
 		nurseDashboardPage.clickOnMenuSwitchLocationSPD();
 		Thread.sleep(2000);
 	}	
 
// 	Click on Logout option of Menu
 	@Test(priority=14)
 	public void clickLogoutMenu() throws InterruptedException
 	{
 		Thread.sleep(2000);
 		nurseDashboardPage.clickOnMenuLogout();
 		Thread.sleep(2000);
 	}  	
 	
// 	Click on Alert option of Menu
 	@Test(priority=15)
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
