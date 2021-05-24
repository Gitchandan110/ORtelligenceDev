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

public class SurgeonDashboardPageTest extends TestBase
{
//	Declaration
//	LoginPage object - loginPage 
	LoginPage loginPage;
//	NurseDashboardPage object - nurseDashboardPage
	NurseDashboardPage nurseDashboardPage;
//   SelectFacilityPage object - selectFacilityPage
	SelectFacilityPage selectFacilityPage;
	
    public SurgeonDashboardPageTest() 
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
 		nurseDashboardPage=loginPage.login(prop.getProperty("usernameSurgeon"), prop.getProperty("passwordSurgeon"));  
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
		System.out.println("Surgeon Dashboard page title is -  "+dashboardPageTitle);  
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
 	@Test(priority=4)
 	public void clickCreateCaseDashboard() throws InterruptedException
 	{
 		Thread.sleep(2000);
 		nurseDashboardPage.dashboardCreateCaseHCP.click();
 		Thread.sleep(2000);
 	} 
 	
// 	Click on Search Case option of Dashboard
 	@Test(priority=5)
 	public void clickSearchCaseDashboard() throws InterruptedException
 	{
 		Thread.sleep(2000);
 		nurseDashboardPage.dashboardSearchCaseHCP.click();
 		Thread.sleep(2000);
 	} 
 	
// 	Click on Open Case option of Dashboard
 	@Test(priority=6)
 	public void clickOpenCaseDashboard() throws InterruptedException
 	{
 		Thread.sleep(2000);
 		nurseDashboardPage.dashboardOpenCaseHCP.click();
 		Thread.sleep(2000);
 	} 

// 	Click on ORtelligence option of Dashboard
 	@Test(priority=7)
 	public void clickORtelligenceDashboard() throws InterruptedException
 	{
 		Thread.sleep(2000);
 		nurseDashboardPage.dashboardORtelligenceHCP.click();
 		Thread.sleep(2000);
 	} 
 	
//	Header option Click. 	
// 	Click on Create Case option of Menu
 	@Test(priority=8)
 	public void clickCreateCaseMenu() throws InterruptedException
 	{
 		Thread.sleep(2000);
 		nurseDashboardPage.menuCreateCase.click();
 		Thread.sleep(2000);
 	} 
 	
// 	Click on Search Case option of Menu
 	@Test(priority=9)
 	public void clickSearchCaseMenu() throws InterruptedException
 	{
 		Thread.sleep(2000);
 		nurseDashboardPage.menuSearchCase.click();
 		Thread.sleep(2000);
 	} 
 	
// 	Click on Open Case option of Menu
 	@Test(priority=10)
 	public void clickOpenCaseMenu() throws InterruptedException
 	{
 		Thread.sleep(2000);
 		nurseDashboardPage.menuOpenCase.click();
 		Thread.sleep(2000);
 	} 

// 	Click on ORtelligence option of Menu
 	@Test(priority=11)
 	public void clickORtelligenceMenu() throws InterruptedException
 	{
 		Thread.sleep(2000);
 		nurseDashboardPage.menuORtelligence.click();
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
 	public void clickNurseSwitchLocationMenu() throws InterruptedException
 	{
 		Thread.sleep(2000);
 		nurseDashboardPage.clickOnMenuSwitchLocationHCP();
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