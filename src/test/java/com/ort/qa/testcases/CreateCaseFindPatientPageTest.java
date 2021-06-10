package com.ort.qa.testcases;






import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
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
	//String sheetName = "PatientData";
	
	
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
		 		 Thread.sleep(1000);
		         selectFacilityPage.clickOnDropDown();
		    	 Thread.sleep(1000);
		 		selectFacilityPage.clickConfirm();
		 		 Thread.sleep(1000);
		 		nurseDashboardPage.clickOncreateCase();
		 		
	}
	
	@AfterMethod
	public void tearDown() throws InterruptedException {
		driver.quit();
	}
	
	/*@Test(priority=1,dataProvider="PatientData",dataProviderClass=DataProviderExcel.class)
	public void createCaseFindPatientPageTest(String lastName, String firstName, String mNR) throws InterruptedException 
	{
	
		createCaseFindPatientPage.createCaseFindPatientData(lastName, firstName, mNR);
		 Thread.sleep(3000);
	}*/
	
	@Test(priority=2, dataProvider="LongFlow",dataProviderClass=DataProviderExcel.class)
	public void createCaseFindPatientLongFlowTest( String lastName, String firstName, String mNR ,  String sname, String urgencyName, String patientAllergy, String speciality, String notesBySurgeon) throws InterruptedException 
	{
		 Thread.sleep(3000);
		createCaseFindPatientPage.createCaseFindPatientLongFlowData(lastName,firstName, mNR, sname, urgencyName, patientAllergy,speciality,notesBySurgeon   );
		 Thread.sleep(3000);
		 createCaseAffectedAreaPage.clickOnhip();
		 Thread.sleep(5000);
		 createCaseProcedureSelectionPage.selectProcedure2.click();
		 Thread.sleep(3000);
		 createCaseSystemSelectionPage.checkboxSystem1.click();
		 Thread.sleep(3000);
		 createCaseSystemSelectionPage.checkboxSystem2.click();
		 Thread.sleep(1000);
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
	
	
	@Test(priority=3,enabled=false)
	public void clickOnPatientButton() throws InterruptedException {	
		  createCaseFindPatientPage.createCaseSelectPatientButton();
			 Thread.sleep(1000); 
	}
	
	@Test(priority=4,enabled=false)
	public void clickOnPatientDropDownButton() throws InterruptedException {
	
		 createCaseBasicDetailsPage.clickOnPatientDropDown();
		 Thread.sleep(1000);
		 createCaseBasicDetailsPage.clickOnPatientLatexAllergyDropDown();
		 Thread.sleep(1000);
		 createCaseBasicDetailsPage.clickOnPatientUrgencyDropDown();
		 Thread.sleep(1000);
		 createCaseBasicDetailsPage.clickOnSpecialityDropDown();
	}
	
	@Test(priority=5,enabled=false)
	public void notesByDoctors() {
		createCaseBasicDetailsPage.notesByDoctor();
	}
	
	@Test(priority=6,enabled=false)
	public void clickOnNextButton() throws InterruptedException {
		Thread.sleep(1000);
		  createCaseBasicDetailsPage.clickOnNextButton();
	}
	
	
	@Test(priority=7,enabled=false)
	public void clickOnHip() {
		createCaseAffectedAreaPage.clickOnhip();
	}
	
	@Test(priority=8,enabled=false)
	public void clickOnProcedure() throws InterruptedException {
		Thread.sleep(1000);
	    createCaseProcedureSelectionPage.selectProcedure2.click();
	}
	
	
	@Test(priority=9,enabled=false)
	public void clickOnCheckBox() throws InterruptedException {
		createCaseSystemSelectionPage.checkboxSystem1.click();
		 createCaseSystemSelectionPage.checkboxSystem2.click();
		 Thread.sleep(1000);
		 createCaseSystemSelectionPage.clickOnSelectButton.click();
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
	
	
	
	
/*	@Test(priority=2,dataProvider="PatientData",dataProviderClass=DataProviderExcel.class)
	public void ProcedureSelection(String lastName, String firstName, String mNR) throws InterruptedException 
	{
		createCaseFindPatientPage.createCaseFindPatientData(lastName, firstName, mNR);
	    Thread.sleep(5000);
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
	    createCaseAffectedAreaPage.clickOnhip();
	}
	
	@Test(priority=3,enabled=false,dataProvider="PatientData",dataProviderClass=DataProviderExcel.class)
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
	   // createCaseBasicDetailsPage.clickOnPreferenceCard();
	    
	    createCaseBasicDetailsPage.clickOnNextButton();
	    Thread.sleep(5000);
	    createCaseAffectedAreaPage.clickOnhip();
	    //createCaseAffectedAreaPage.hip.click();
	}
*/
	

	
	

}
