/* Created by Piyush Sadawarti on 24/05/2021
 * Modified by Piyush Sadawarti on 26/05/2021 - Added Test cases for different Rows from excel sheet.
 * Modified by Piyush Sadawarti on 27/05/2021 - Added Test cases for different Rows from excel sheet.
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
import com.ort.qa.pages.SearchPatientPage;
import com.ort.qa.pages.SelectFacilityPage;

public class SearchPatientPageTest extends TestBase
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
	
    public SearchPatientPageTest() 
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
 		searchPatientPage = new SearchPatientPage();
 		nurseDashboardPage=loginPage.login(prop.getProperty("usernameSPD"), prop.getProperty("passwordSPD"));  
 		Thread.sleep(1000);
 		selectFacilityPage.clickOnDropDown();
 		Thread.sleep(1000);
		selectFacilityPage.clickConfirm();
		Thread.sleep(1000);
//		nurseDashboardPage.dashboardCaseQueueSPD.click();
		nurseDashboardPage.dashboardSearchCaseSPD.click();
		Thread.sleep(1000);
 	}
    
    @Test(priority=1)
    public void VeriyfSearchPatientFormOptions() throws InterruptedException
 	{
    	Thread.sleep(2000);
    	Assert.assertEquals(true, searchPatientPage.patientLastName.isDisplayed());
    	System.out.println(searchPatientPage.patientLastName.isDisplayed());
 		Assert.assertEquals(true, searchPatientPage.patientFirstName.isDisplayed());
 		System.out.println(searchPatientPage.patientFirstName.isDisplayed());
 		Assert.assertEquals(true, searchPatientPage.patientDOB.isDisplayed());
 		System.out.println(searchPatientPage.patientDOB.isDisplayed());
 		Assert.assertEquals(true, searchPatientPage.patientMRN.isDisplayed());
 		System.out.println(searchPatientPage.patientMRN.isDisplayed());
 		Assert.assertEquals(true, searchPatientPage.caseNumber.isDisplayed());
 		System.out.println(searchPatientPage.caseNumber.isDisplayed());
 		Assert.assertEquals(true, searchPatientPage.speciality.isDisplayed());
 		System.out.println(searchPatientPage.speciality.isDisplayed());
 		Assert.assertEquals(true, searchPatientPage.searchPatient.isDisplayed());
 		System.out.println(searchPatientPage.searchPatient.isDisplayed());
 		Thread.sleep(2000);
 	}
   
       
// 	Search patient
    @Test(priority=2)
    public void searchPatient1() throws InterruptedException, IOException
 	{    	
 		Thread.sleep(2000);
 		searchPatientPage.SearchPatientData("SearchPatient", 1,0,1,2,3,4,5);
 		Thread.sleep(2000);
 	}
    
// 	Search patient
    @Test(priority=3)
    public void searchPatient2() throws InterruptedException, IOException
 	{    	
 		Thread.sleep(2000);
 		searchPatientPage.SearchPatientData("SearchPatient", 2,0,1,2,3,4,5);
 		Thread.sleep(2000);
 	}
    
// 	Search patient
    @Test(priority=4)
    public void searchPatient3() throws InterruptedException, IOException
 	{    	
 		Thread.sleep(2000);
 		searchPatientPage.SearchPatientData("SearchPatient", 3,0,1,2,3,4,5);
 		Thread.sleep(2000);
 	}
    
// 	Search patient
    @Test(priority=5)
    public void searchPatient4() throws InterruptedException, IOException
 	{
    	Thread.sleep(2000);
 		searchPatientPage.SearchPatientData("SearchPatient", 4,0,1,2,3,4,5);
 		Thread.sleep(2000);
 	}
    
// 	Search patient
    @Test(priority=6)
    public void searchPatient5() throws InterruptedException, IOException
 	{
    	Thread.sleep(2000);
 		searchPatientPage.SearchPatientData("SearchPatient", 5,0,1,2,3,4,5);
 		Thread.sleep(2000);
 	}
    
// 	Search patient
    @Test(priority=7)
    public void searchPatient6() throws InterruptedException, IOException
 	{
    	Thread.sleep(2000);
 		searchPatientPage.SearchPatientData("SearchPatient", 6,0,1,2,3,4,5);
 		Thread.sleep(2000);
 	}
    
// 	Search patient
    @Test(priority=8)
    public void searchPatient7() throws InterruptedException, IOException
 	{
    	Thread.sleep(2000);
 		searchPatientPage.SearchPatientData("SearchPatient", 7,0,1,2,3,4,5);
 		Thread.sleep(2000);
 	}
    
// 	Search patient
    @Test(priority=9)
    public void searchPatient8() throws InterruptedException, IOException
 	{
    	Thread.sleep(2000);
 		searchPatientPage.SearchPatientData("SearchPatient", 8,0,1,2,3,4,5);
 		Thread.sleep(2000);
 	}
//    
//// 	Search patient
//    @Test(priority=10)
//    public void searchPatient9() throws InterruptedException, IOException
// 	{
//    	Thread.sleep(2000);
// 		searchPatientPage.SearchPatientData("SearchPatient", 9,0,1,2,3,4,5);
// 		Thread.sleep(2000);
// 	}
//
//// 	Search patient
//    @Test(priority=11)
//    public void searchPatient10() throws InterruptedException, IOException
// 	{
//    	Thread.sleep(2000);
// 		searchPatientPage.SearchPatientData("SearchPatient", 10,0,1,2,3,4,5);
// 		Thread.sleep(2000);
// 	}
//    
//// 	Search patient
//    @Test(priority=12)
//    public void searchPatient11() throws InterruptedException, IOException
// 	{
//    	Thread.sleep(2000);
// 		searchPatientPage.SearchPatientData("SearchPatient", 14,0,1,2,3,4,5);
// 		Thread.sleep(2000);
// 	}
//    
//// 	Search patient loop
//    @Test(priority=12)
//    public void searchPatientAll1() throws InterruptedException, IOException
// 	{
//    	Thread.sleep(2000);
// 		searchPatientPage.SearchPatientDataAll("SearchPatient", 12,0,1,2,3,4,5);
// 		Thread.sleep(2000);
// 	}
    
//	Quit browser
 	@AfterMethod
 	public void tearDown() throws InterruptedException 
 	{
 		Thread.sleep(3000);
 		driver.quit();
 	}
    
}
