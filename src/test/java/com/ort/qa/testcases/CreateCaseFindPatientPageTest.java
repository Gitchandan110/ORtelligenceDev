package com.ort.qa.testcases;

import org.testng.annotations.AfterMethod;
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

public class CreateCaseFindPatientPageTest extends TestBase {
	LoginPage loginPage;
	SelectFacilityPage selectFacilityPage;
	CreateCaseFindPatientPage createCaseFindPatientPage; 
    CreateCaseBasicDetailsPage createCaseBasicDetailsPage;
    NurseDashboardPage nurseDashboardPage;
    CreateCaseAffectedAreaPage createCaseAffectedAreaPage;
    CreateCaseProcedureSelectionPage createCaseProcedureSelectionPage;
    CreateCaseSystemSelectionPage createCaseSystemSelectionPage;
	 CreateCaseSetSelectionPage  createCaseSetSelectionPage;
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
		  nurseDashboardPage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		         nurseDashboardPage=new NurseDashboardPage(driver);
		         createCaseAffectedAreaPage= new CreateCaseAffectedAreaPage();
		         createCaseProcedureSelectionPage =new CreateCaseProcedureSelectionPage();
		         createCaseSystemSelectionPage = new CreateCaseSystemSelectionPage();
		 	      createCaseSetSelectionPage = new  CreateCaseSetSelectionPage();
		         selectFacilityPage.clickOnDropDown();
		  		Thread.sleep(1000);
		 		selectFacilityPage.clickConfirm();
		 		nurseDashboardPage.clickOncreateCase();
	}
	
	
	@Test(priority=1,dataProvider="PatientData",dataProviderClass=DataProviderExcel.class)
	public void createCaseFindPatientPageTest(String lastName, String firstName, String mNR) throws InterruptedException 
	{
		
		createCaseFindPatientPage.createCaseFindPatientData(lastName, firstName, mNR);
		Thread.sleep(5000);
	    createCaseFindPatientPage.clickSearchButton();
	    Thread.sleep(1000);
	    createCaseFindPatientPage.createCaseSelectPatientButton();
	    Thread.sleep(2000);
	   
	    createCaseBasicDetailsPage.clickOnPatientDropDown();
	    Thread.sleep(5000);
	    createCaseBasicDetailsPage.clickOnPatientLatexAllergyDropDown();
	    Thread.sleep(5000);
	    createCaseBasicDetailsPage.clickOnPatientUrgencyDropDown();
	    Thread.sleep(5000);
	    createCaseBasicDetailsPage.clickOnNextButton();
	    Thread.sleep(5000);
	    createCaseAffectedAreaPage.Clickonhip();
	    Thread.sleep(5000);
	    createCaseProcedureSelectionPage.selectProcedure2.click();
	    createCaseSystemSelectionPage.checkboxSystem1.click();
	  	Thread.sleep(2000);
	
	    createCaseSystemSelectionPage.checkboxSystem2.click();
	    Thread.sleep(5000);
	    
	    createCaseSystemSelectionPage.clickOnSelectButton.click();
	    Thread.sleep(3000);
	    	
	    createCaseSystemSelectionPage.proceedToCart.click();
	    Thread.sleep(5000);
	    
	    createCaseSetSelectionPage.createCaseSetSelectioncheckbox();
	    Thread.sleep(3000);
	    createCaseSetSelectionPage.createCaseOpenQuantity(); 
	    Thread.sleep(2000);
	    createCaseSetSelectionPage.createCaseSetSelectionDropdown();
	    Thread.sleep(2000);
	    createCaseSetSelectionPage.createCaseSetPositionDropdown();
	    Thread.sleep(2000);
	    createCaseSetSelectionPage.create.click();
	    		} 
	    
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@Test(priority=2,dataProvider="PatientData",dataProviderClass=DataProviderExcel.class)
	public void ProcedureSelection(String lastName, String firstName, String mNR) throws InterruptedException 
	{
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
	    createCaseBasicDetailsPage.clickOnProcedure();
	    
	    createCaseBasicDetailsPage.clickOnNextButton();
	    Thread.sleep(5000);
	    createCaseAffectedAreaPage.Clickonhip();
	}
	
	@Test(priority=3,dataProvider="PatientData",dataProviderClass=DataProviderExcel.class)
	public void PreferenceCard(String lastName, String firstName, String mNR) throws InterruptedException 
	{
		
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
	   // createCaseBasicDetailsPage.clickOnPreference();
	    
	    createCaseBasicDetailsPage.clickOnNextButton();
	    Thread.sleep(5000);
	    createCaseAffectedAreaPage.Clickonhip();
	    //createCaseAffectedAreaPage.hip.click();
	}

	

	
	// @AfterMethod
	public void tearDown() {
		driver.quit();
	 }

}
