/* Created by Piyush Sadawarti on 28/05/2021
 * 
 * 
 * 
 */

package com.ort.qa.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ort.qa.base.TestBase;
import com.ort.qa.pages.LoginPage;
import com.ort.qa.pages.NurseDashboardPage;
import com.ort.qa.pages.SPDCaseQueuePage;
import com.ort.qa.pages.SearchPatientPage;
import com.ort.qa.pages.SelectFacilityPage;

public class SPDOnHoldPageTest extends TestBase
{
	
//	Declaration
//	LoginPage object - loginPage 
	LoginPage loginPage;
//	NurseDashboardPage object - nurseDashboardPage
	NurseDashboardPage nurseDashboardPage;
//  SelectFacilityPage object - selectFacilityPage
	SelectFacilityPage selectFacilityPage;
//	SearchPatientPage object - SearchPatientPage object
	SearchPatientPage searchPatientPage;
    
	public SPDOnHoldPageTest() 
    {
    	super();	
    }
     
/*  Initialize different objects
 * 	Perform pre-required tests 
 */
    @BeforeMethod
 	public void setUp() throws InterruptedException, IOException 
    {
 		initialization();
 		loginPage = new LoginPage(driver);
 		nurseDashboardPage = new NurseDashboardPage(driver);
 		selectFacilityPage = new SelectFacilityPage(driver);
 		searchPatientPage = new SearchPatientPage();
 		nurseDashboardPage=loginPage.login(prop.getProperty("usernameSPD"), prop.getProperty("passwordSPD"));  
 		Thread.sleep(1000);
 		selectFacilityPage.clickOnDropDown();
 		Thread.sleep(1000);
		selectFacilityPage.clickConfirm();
		Thread.sleep(1000);
		nurseDashboardPage.dashboardOnHold.click();
		Thread.sleep(1000);
		searchPatientPage.SearchPatientData("SearchPatient", 10,0,1,2,3,4,5);
		
	}
    
         
// 	Search patient
    @Test(priority=1)
    public void searchPatient() throws InterruptedException, IOException
 	{
    	Thread.sleep(2000);
    	Assert.assertEquals(true, searchPatientPage.selectCase.isDisplayed());
    	System.out.println(searchPatientPage.selectCase.isDisplayed());
    	searchPatientPage.selectCase.click();
 		Thread.sleep(2000);
// 		searchPatientPage.confirmationPopupClose.click();
// 		searchPatientPage.confirmationPopupProcedureDetails.click();
 		searchPatientPage.confirmationPopupCartDetails.click();
 		Thread.sleep(5000);
 		
 	}
    
//	Quit browser
 	@AfterMethod
 	public void tearDown() throws InterruptedException 
 	{
 		Thread.sleep(2000);
 		driver.quit();
 	}
 	
}
