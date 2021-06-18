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

public class CreateCasePreferenceCardSelectionFlowTest extends TestBase {

	
	
	
	LoginPage loginPage;
	SelectFacilityPage selectFacilityPage;
	CreateCaseFindPatientPage createCaseFindPatientPage; 
    CreateCaseBasicDetailsPage createCaseBasicDetailsPage;
    NurseDashboardPage nurseDashboardPage;
    CreateCaseAffectedAreaPage createCaseAffectedAreaPage;
    CreateCaseProcedureSelectionPage createCaseProcedureSelectionPage;
    CreateCaseSystemSelectionPage createCaseSystemSelectionPage;
	CreateCaseSetSelectionPage  createCaseSetSelectionPage;
	
	
	public CreateCasePreferenceCardSelectionFlowTest() {  
		
		super();	                           
		}

	@BeforeMethod
	
	public void setUp() throws InterruptedException {
		initialization();

		                    loginPage = new LoginPage(driver);
		           selectFacilityPage = new SelectFacilityPage(driver);
		    createCaseFindPatientPage = new CreateCaseFindPatientPage(driver);  
		   createCaseBasicDetailsPage = new CreateCaseBasicDetailsPage(driver);
		           nurseDashboardPage = new NurseDashboardPage(driver);
		   createCaseAffectedAreaPage = new CreateCaseAffectedAreaPage();
	 createCaseProcedureSelectionPage = new CreateCaseProcedureSelectionPage();
	    createCaseSystemSelectionPage = new CreateCaseSystemSelectionPage();
		   createCaseSetSelectionPage = new  CreateCaseSetSelectionPage();
    nurseDashboardPage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		 	      
		 		 Thread.sleep(1000);
		         selectFacilityPage.clickOnDropDown();
		    	 Thread.sleep(1000);
		 		selectFacilityPage.clickConfirm();
		 		 Thread.sleep(1000);
		 		nurseDashboardPage.clickOncreateCase();
		 		
	}		
	
	@Test(priority=1, dataProvider="PreferenceCardSelectionFlow",dataProviderClass=DataProviderExcel.class)
	public void createCasePreferenceCardFlowTest(String Status, String lastName, String firstName, String MNR,String SurgeonName, String UrgencyName, String patientAlllergy,String Speciality,String PhysicianAssistant, String NotesBySurgeon, String PreferenceCardSelection,
			String AnesthesiaRequest, String Medications,  String  Side, String Position,   String PositioningComments, String Instructions) throws InterruptedException 
	{
		 Thread.sleep(3000);
	
		createCaseFindPatientPage.createCasePreferenceCardData(Status,lastName,firstName, MNR, SurgeonName, UrgencyName, patientAlllergy,Speciality,PhysicianAssistant, NotesBySurgeon, PreferenceCardSelection,
				AnesthesiaRequest, Medications, Side, Position, PositioningComments, Instructions   );
		 Thread.sleep(3000);
	
		  createCaseSetSelectionPage.create.click();
		  
		 
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
