package com.ort.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ort.qa.base.TestBase;
import com.ort.qa.pages.CreateCaseBasicDetailsPage;
import com.ort.qa.pages.CreateCaseFindPatientPage;
import com.ort.qa.pages.LoginPage;
import com.ort.qa.pages.NurseDashboardPage;
import com.ort.qa.pages.SelectFacilityPage;
import com.ort.qa.util.DataProviderExcel;

public class CreateCaseFindPatientPageTest extends TestBase {
	LoginPage loginPage;
	SelectFacilityPage selectFacilityPage;
	CreateCaseFindPatientPage createCaseFindPatientPage; 
    CreateCaseBasicDetailsPage createCaseBasicDetailsPage;
    NurseDashboardPage nurseDashboardPage;
	String sheetName = "PatientData";
	
	
	public CreateCaseFindPatientPageTest() {  
		super();	                           
		}

	@BeforeMethod
	public void setUp() throws InterruptedException {
		initialization();

		                  loginPage = new LoginPage(driver);
		         selectFacilityPage = new SelectFacilityPage(driver);
		  createCaseFindPatientPage = new CreateCaseFindPatientPage(driver);  
		  createCaseBasicDetailsPage = new CreateCaseBasicDetailsPage(driver);
		         selectFacilityPage = loginPage.login1(prop.getProperty("username"), prop.getProperty("password"));
		         nurseDashboardPage=new NurseDashboardPage();
		
	}
	
	//@Test(priority=1)
	public void selectFacilityPage() 
	{
		selectFacilityPage.clickOnDropDown();
		selectFacilityPage.clickConfirm();
		//nurseDashboardPage.dashboardCreateCase.click();

	}
	
	/*@Test(priority=1,enabled=false)
	public void findPatientPage() throws InterruptedException 
	{
		selectFacilityPage.clickOnDropDown();
		selectFacilityPage.clickConfirm();
		selectFacilityPage.clickOnCreateCase();
		//nurseDashboardPage.dashboardCreateCase.click();
		createCaseFindPatientPage.typeLastName("Sharma");
		createCaseFindPatientPage.typeFirstName("Vikas");
		createCaseFindPatientPage.typeMRN("646464");
		createCaseFindPatientPage.clickSearchButton();
		 try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		
			e.printStackTrace();
		}
		createCaseFindPatientPage.createCaseSelectPatientButton();
		Thread.sleep(5000);
		createCaseBasicDetailsPage.clickOnPatientDropDown();
		createCaseBasicDetailsPage.clickOnPatientLatexAllergyDropDown();
		createCaseBasicDetailsPage.clickOnPatientUrgencyDropDown();
		createCaseBasicDetailsPage.clickOnNextButton();
		
		
	}
	*/
	
	
	@Test(priority=3,dataProvider="PatientData",dataProviderClass=DataProviderExcel.class)
	public void createCaseFindPatientPageTest(String lastName, String firstName, String mNR) throws InterruptedException 
	{
		selectFacilityPage.clickOnDropDown();
		selectFacilityPage.clickConfirm();
		Thread.sleep(5000);
		//nurseDashboardPage.clickOncreateCase();
		createCaseFindPatientPage.createCaseFindPatientData(lastName, firstName, mNR);
	    createCaseFindPatientPage.clickSearchButton();
	    Thread.sleep(5000);
	    createCaseFindPatientPage.createCaseSelectPatientButton();
	    
	}
	
	
	
	
	/* @AfterMethod
	public void tearDown() {
		driver.quit();
	 }
*/
}
