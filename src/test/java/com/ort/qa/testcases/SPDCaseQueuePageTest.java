/* Created by Piyush Sadawarti on 26/05/2021
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
import com.ort.qa.pages.CaseQueuePage;
import com.ort.qa.pages.LoginPage;
import com.ort.qa.pages.NurseDashboardPage;
import com.ort.qa.pages.SearchPatientPage;
import com.ort.qa.pages.SelectFacilityPage;

public class SPDCaseQueuePageTest extends TestBase
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
//	CaseQueuePage object - caseQueuePage object
	CaseQueuePage caseQueuePage;	
    
	public SPDCaseQueuePageTest() 
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
 		nurseDashboardPage = new NurseDashboardPage();
 		selectFacilityPage = new SelectFacilityPage(driver);
 		searchPatientPage = new SearchPatientPage();
 		nurseDashboardPage=loginPage.login(prop.getProperty("usernameSPD"), prop.getProperty("passwordSPD"));  
 		Thread.sleep(1000);
 		selectFacilityPage.clickOnDropDown();
 		Thread.sleep(1000);
		selectFacilityPage.clickConfirm();
		Thread.sleep(1000);
		nurseDashboardPage.dashboardCaseQueueSPD.click();
		Thread.sleep(1000);
		searchPatientPage.SearchPatientData("SearchPatient", 1,0,1,2,3,4,5);
		
	}
    
         
// 	Search patient
    @Test(priority=1)
    public void searchPatient() throws InterruptedException, IOException
 	{
    	Thread.sleep(5000);
 		caseQueuePage.caseNumber.click();
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