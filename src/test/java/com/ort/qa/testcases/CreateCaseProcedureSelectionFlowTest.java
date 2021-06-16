package com.ort.qa.testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ort.qa.base.TestBase;
import com.ort.qa.pages.CreateCaseAffectedAreaPage;
import com.ort.qa.pages.CreateCaseBasicDetailsPage;
import com.ort.qa.pages.CreateCaseFindPatientPage;
import com.ort.qa.pages.CreateCaseProcedureSelectionPage;
import com.ort.qa.pages.CreateCaseSetSelectionPage;
import com.ort.qa.pages.CreateCaseSystemSelectionPage;
import com.ort.qa.pages.LoginPage;
import com.ort.qa.pages.NurseDashboardPage;
import com.ort.qa.pages.SelectFacilityPage;
import com.ort.qa.util.DataProviderExcel;

public class CreateCaseProcedureSelectionFlowTest extends TestBase {
	
	LoginPage loginPage;
	SelectFacilityPage selectFacilityPage;
	CreateCaseFindPatientPage createCaseFindPatientPage; 
    CreateCaseBasicDetailsPage createCaseBasicDetailsPage;
    NurseDashboardPage nurseDashboardPage;
    CreateCaseAffectedAreaPage createCaseAffectedAreaPage;
    CreateCaseProcedureSelectionPage createCaseProcedureSelectionPage;
    CreateCaseSystemSelectionPage createCaseSystemSelectionPage;
	 CreateCaseSetSelectionPage  createCaseSetSelectionPage;
	//String sheetName = "ProcedureSelection";
	
	
	public CreateCaseProcedureSelectionFlowTest() {  
		
		super();	                           
		}

	@BeforeMethod
	
	public void setUp() throws InterruptedException {
		initialization();

		                  loginPage = new LoginPage(driver);
		         selectFacilityPage = new SelectFacilityPage(driver);
		  createCaseFindPatientPage = new CreateCaseFindPatientPage(driver);  
		 createCaseBasicDetailsPage = new CreateCaseBasicDetailsPage(driver);
		  nurseDashboardPage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		         nurseDashboardPage = new NurseDashboardPage(driver);
		 createCaseAffectedAreaPage = new CreateCaseAffectedAreaPage();
   createCaseProcedureSelectionPage = new CreateCaseProcedureSelectionPage();
      createCaseSystemSelectionPage = new CreateCaseSystemSelectionPage();
		 createCaseSetSelectionPage = new  CreateCaseSetSelectionPage();
		 		 Thread.sleep(1000);
		         selectFacilityPage.clickOnDropDown();
		    	 Thread.sleep(1000);
		 		selectFacilityPage.clickConfirm();
		 		 Thread.sleep(1000);
		 		nurseDashboardPage.clickOncreateCase();
		 		
	}		
	
	@Test(priority=1, dataProvider="ProcedureSelectionFlow",dataProviderClass=DataProviderExcel.class)
	public void createCaseProcedureSelectionFlowTest( String lastName, String firstName, String mNR ,  String sname, String urgencyName, String patientAllergy, String speciality,String procedureSelection) throws InterruptedException 
	{
		 Thread.sleep(3000);
		createCaseFindPatientPage.createCaseProcedureSelectionFlowData(lastName,firstName, mNR, sname, urgencyName, patientAllergy,speciality, procedureSelection   );
		 Thread.sleep(3000);
		// createCaseAffectedAreaPage.clickOnhip();
		// Thread.sleep(5000);
		// createCaseProcedureSelectionPage.selectProcedure2.click();
		// Thread.sleep(3000);
		 
		 createCaseSystemSelectionPage.createCaseSystemSelectionOption1();
		 Thread.sleep(3000);
		// createCaseSystemSelectionPage.checkboxSystem2.click();
		 //Thread.sleep(1000);
		 createCaseSystemSelectionPage.clickOnSelectButton.click();
		 Thread.sleep(1000);
		 createCaseSystemSelectionPage.proceedToCart.click();
		 Thread.sleep(1000);
		 createCaseSetSelectionPage.createCaseSetSelectioncheckbox();
		  
		 createCaseSetSelectionPage.createCaseOpenQuantity(); 
		  Thread.sleep(1000);
		 createCaseSetSelectionPage.createCaseSetSelectionDropdown();
		  Thread.sleep(1000);
		 createCaseSetSelectionPage.createCaseSetPositionDropdown();
		  Thread.sleep(1000);
		 createCaseSetSelectionPage.create.click();
		 
	}
	
	
	

	
	
	
	
	
	
}
