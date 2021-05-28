package com.ort.qa.testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ort.qa.base.TestBase;
import com.ort.qa.pages.CreateCaseAffectedAreaPage;
import com.ort.qa.pages.CreateCaseBasicDetailsPage;
import com.ort.qa.pages.CreateCaseFindPatientPage;
import com.ort.qa.pages.CreateCaseProcedureSelectionPage;
import com.ort.qa.pages.CreateCaseSpecialtyPage;
import com.ort.qa.pages.LoginPage;
import com.ort.qa.pages.NurseDashboardPage;
import com.ort.qa.pages.SelectFacilityPage;
import com.ort.qa.util.DataProviderExcel;


 /*	Here in that page i have initialize the following pages: 
 * Login ,Select facility. NurseDashboard, CreatecaseAffectedarea, createcaseSpecialityPage,createCaseProcedureSelection.
 */

public class CreateCaseProcedureSelectionPageTest extends TestBase
{

	LoginPage loginPage;
	SelectFacilityPage selectFacilityPage;
	CreateCaseFindPatientPage createCaseFindPatientPage; 
    CreateCaseBasicDetailsPage createCaseBasicDetailsPage;
    NurseDashboardPage nurseDashboardPage;
	String sheetName = "PatientData";
	 CreateCaseAffectedAreaPage  createCaseAffectedAreaPage;
	 
	 CreateCaseProcedureSelectionPage createCaseProcedureSelectionPage;
		public CreateCaseProcedureSelectionPageTest() 
		{
			super();	                           
		}
		
		@BeforeMethod
		public void setUp() throws InterruptedException 
		{
			           initialization();

		                  loginPage = new LoginPage(driver);
		         selectFacilityPage = new SelectFacilityPage(driver);
		  createCaseFindPatientPage = new CreateCaseFindPatientPage(driver);  
		  createCaseBasicDetailsPage = new CreateCaseBasicDetailsPage(driver);
		         selectFacilityPage = loginPage.login1(prop.getProperty("username"), prop.getProperty("password"));
		         nurseDashboardPage=new NurseDashboardPage();
	      createCaseAffectedAreaPage = new CreateCaseAffectedAreaPage();
	      createCaseProcedureSelectionPage =new CreateCaseProcedureSelectionPage();
			
	      
		}
		@Test(priority=2,dataProvider="PatientData",dataProviderClass=DataProviderExcel.class)
		public void ProcedureSelection(String lastName, String firstName, String mNR) throws InterruptedException
		{
		selectFacilityPage.clickOnDropDown();
		selectFacilityPage.clickConfirm();
		Thread.sleep(5000);
		nurseDashboardPage.dashboardCreateCase.click();
		createCaseFindPatientPage.createCaseFindPatientData(lastName, firstName, mNR);
		createCaseFindPatientPage.clickSearchButton();
		Thread.sleep(5000);

		createCaseFindPatientPage.createCaseSelectPatientButton();
		Thread.sleep(5000);
		createCaseBasicDetailsPage.clickOnPatientDropDown();
		Thread.sleep(5000);
		createCaseBasicDetailsPage.clickOnPatientLatexAllergyDropDown();
		Thread.sleep(5000);
		createCaseBasicDetailsPage.clickOnPatientUrgencyDropDown();
		Thread.sleep(5000);
		// createCaseBasicDetailsPage.clickOnProcedure();

		createCaseBasicDetailsPage.clickOnNextButton();
		Thread.sleep(5000);
		createCaseAffectedAreaPage.hip.click();
		
		Thread.sleep(3000);
		 createCaseProcedureSelectionPage.selectProcedure2.click();
		}
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
		//}
		//@Test(priority=1)
		//public void CreateCaseProcedureSelectionPage() throws InterruptedException 
		//{
			//Thread.sleep(3000);
			// createCaseProcedureSelectionPage.click();
			
		
		
		}
	
	
	
	
	
	
	
	
	
	
	


