package com.ort.qa.testcases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ort.qa.base.TestBase;
import com.ort.qa.pages.CreateCaseFindPatientPage;
import com.ort.qa.pages.LoginPage;
import com.ort.qa.pages.NurseDashboardPage;
import com.ort.qa.pages.SelectFacilityPage;
import com.ort.qa.util.DataProviderExcel;

public class NurseDashboardPageTest extends TestBase
     {
	WebDriver driver;
	LoginPage loginPage;
	NurseDashboardPage nurseDashboardPage;
    SelectFacilityPage selectFacilityPage;
	CreateCaseFindPatientPage createCaseFindPatientPage;
	
	
	String sheetName = "PatientData";
    public NurseDashboardPageTest() 
    {
	super();	
    }
     
     
     @BeforeMethod
 	public void setUp() {
 		initialization();
 		 loginPage = new LoginPage(driver);
 		 selectFacilityPage = new SelectFacilityPage(driver);
 		 nurseDashboardPage = new NurseDashboardPage(driver);
 		 createCaseFindPatientPage = new CreateCaseFindPatientPage(driver);
 /*properties will get initialized here
 */
 		 
 		 nurseDashboardPage=loginPage.login(prop.getProperty("username"), prop.getProperty("password"));  
 	}
 	
	
 	
 	@Test(priority=1)
 	public void verifyDashboardPageTitleTest()
 	{
 		String dashboardPageTitle =nurseDashboardPage.verifyNurseDashboardPageTitle();
		Assert.assertEquals(dashboardPageTitle, "Login", "Dashboard Page Title not matched");  
	}

 	@Test(priority=2,dataProvider="PatientData",dataProviderClass=DataProviderExcel.class)
 	public void createCaseTest(String lastName, String firstName, String dOB, String mNR)
 	{
 		 selectFacilityPage.clickOnDropDown();
 		 selectFacilityPage.clickConfirm();
 		 nurseDashboardPage.dashboardCreateCase.click();
 		 createCaseFindPatientPage.createCaseFindPatientData(lastName, firstName, dOB, mNR);
 		
 	}
 		
 	@Test(priority=3,enabled=false,dataProvider="PatientData",dataProviderClass=DataProviderExcel.class)
	public void createCaseFindPatientPageTest(String lastName, String firstName, String dOB, String mNR) 
	{
		
		createCaseFindPatientPage.createCaseFindPatientData(lastName, firstName, dOB, mNR);

	}	
 		
 		
 		
 		
 	}
  /* (In progress)
  * 
  * @Test(priority=2)
=======
 	
 	/*
>>>>>>> 9800092468e2da9cf10821bf4f29bab55ec81f4a
 	 @Test(priority=2)

 	public void createCaseTest()
 	{   
 		 selectFacilityPage.clickOnDropDown();
	     selectFacilityPage.clickConfirm();
	     Assert.assertTrue(driver.getCurrentUrl().contains("dashboard"));
	     nurseDashboardPage.dashboardCreateCase.click();
	    // createCaseFindPatientPage.patientLastName.sendKeys("Sharma");
	    // createCaseFindPatientPage.patientFirstName.sendKeys("Vikas");
	    // createCaseFindPatientPage.search.click();
	     
	    // String actual="Sharma";
	    // Assert.assertEquals("Sharma","Sharma");
	      


 	} 

<<<<<<< HEAD

 	/*
 	@AfterMethod
 	public void tearDown() {
 		driver.quit();
=======
 	
 	//@AfterMethod
 	//public void tearDown() {
 		//driver.quit();
>>>>>>> 9800092468e2da9cf10821bf4f29bab55ec81f4a
 	}
 	*/
 	

     








