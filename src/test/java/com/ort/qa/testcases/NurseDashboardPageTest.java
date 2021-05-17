package com.ort.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ort.qa.base.TestBase;
import com.ort.qa.pages.CreateCaseFindPatientPage;
import com.ort.qa.pages.LoginPage;
import com.ort.qa.pages.NurseDashboardPage;
import com.ort.qa.pages.SelectFacilityPage;

public class NurseDashboardPageTest extends TestBase{
	
	LoginPage loginPage;
	NurseDashboardPage nurseDashboardPage;
	SelectFacilityPage selectFacilityPage;
	CreateCaseFindPatientPage createCaseFindPatientPage;
     public NurseDashboardPageTest() {
	 super();	

      }
     
     
     @BeforeMethod
 	public void setUp() {
 		initialization();
 		 loginPage = new LoginPage();

 		 //properties will get initialized here
 		 nurseDashboardPage=loginPage.login(prop.getProperty("username"), prop.getProperty("password"));  
 	}
 	
	
 	
 	@Test(priority=1)
 	public void verifyDashboardPageTitleTest()
 	{
 		String dashboardPageTitle =nurseDashboardPage.verifyNurseDashboardPageTitle();
		Assert.assertEquals(dashboardPageTitle, "Login", "Dashboard Page Title not matched");  
	}
	
 	/* (In progress)
 	 * 
 	 * @Test(priority=2)
 	public void createCaseTest()
 	{
 		 SelectFacilityPage.clickOnDropDown();
	     selectFacilityPage.clickConfirm();
	     Assert.assertTrue(driver.getCurrentUrl().contains("dashboard"));
	     nurseDashboardPage.dashboardCreateCase.click();
	     createCaseFindPatientPage.patientLastName.sendKeys("Sharma");
	     createCaseFindPatientPage.patientFirstName.sendKeys("Vikas");
	     createCaseFindPatientPage.search.click();
	     
	     String actual="";
	     Assert.assertEquals("Sharma",actual);
	      

 	} 
 	*/
 	
 	@AfterMethod
 	public void tearDown() {
 		driver.quit();
 	}
 	
 	

     








}