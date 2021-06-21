package com.ort.qa.testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.ort.qa.base.TestBase;
import com.ort.qa.pages.CreateCaseBasicDetailsPage;
import com.ort.qa.pages.CreateCaseFlowPage;
import com.ort.qa.pages.CreateCaseSetSelectionPage;
import com.ort.qa.pages.LoginPage;
import com.ort.qa.pages.NurseDashboardPage;
import com.ort.qa.pages.SearchCaseFlowPage;
import com.ort.qa.pages.SearchPatientPage;
import com.ort.qa.pages.SelectFacilityPage;
import com.ort.qa.util.DataProviderExcel;

public class CreateCaseFlowPageTest extends TestBase {
	LoginPage loginPage;
	SelectFacilityPage selectFacilityPage;
	CreateCaseFlowPage createCaseFlowPage; 
    NurseDashboardPage nurseDashboardPage;
	CreateCaseSetSelectionPage  createCaseSetSelectionPage;
	SearchCaseFlowPage searchCaseFlowPage;
	
	
	public CreateCaseFlowPageTest() {  
		
		super();	                           
		}

	@BeforeTest
	
	public void setUp() throws InterruptedException {
		initialization();

		                  loginPage = new LoginPage(driver);
		         selectFacilityPage = new SelectFacilityPage(driver);
		  createCaseFlowPage = new CreateCaseFlowPage(driver);  
		 searchCaseFlowPage= new SearchCaseFlowPage(driver);
			 nurseDashboardPage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		         nurseDashboardPage=new NurseDashboardPage(driver);
		 	     createCaseSetSelectionPage = new  CreateCaseSetSelectionPage();
		 		 Thread.sleep(1000);
		         selectFacilityPage.clickOnDropDown();
		    	 Thread.sleep(1000);
		 		 selectFacilityPage.clickConfirm();
		 		 Thread.sleep(1000);
		 		 nurseDashboardPage.clickOncreateCase();
		 		
	}
	
	//@AfterTest
	public void tearDown() throws InterruptedException {
		driver.quit();
	}
	
	//Long Flow 
	
	@Test(priority=1, dataProvider="LongFlow",dataProviderClass=DataProviderExcel.class)
	public void createCaseFindPatientLongFlowTest(String Status, String lastName, String firstName, String mNR ,  String sname, String urgencyName, String patientAllergy, String speciality, String notesBySurgeon, 
			String AnasthesiaRequest, String Medications,String Side, String Position, String PositioningComments, String Instructions) throws InterruptedException 
	{
		 Thread.sleep(3000);
		createCaseFlowPage.createCaseFindPatientLongFlowData(Status,lastName,firstName, mNR, sname, urgencyName, patientAllergy,speciality,notesBySurgeon,AnasthesiaRequest, Medications, Side, Position, PositioningComments, Instructions );
		 Thread.sleep(3000);
		 
		 createCaseSetSelectionPage.create.click();
		 searchCaseFlowPage.okButton.click();
		 
		 
		 
	}
	
	//Preference Card Flow
	
	@Test(priority=2, dataProvider="PreferenceCardSelectionFlow",dataProviderClass=DataProviderExcel.class)
	public void createCasePreferenceCardFlowTest(String Status, String lastName, String firstName, String MNR,String SurgeonName, String UrgencyName, String patientAlllergy,String Speciality,String PhysicianAssistant, String NotesBySurgeon, String PreferenceCardSelection,
			String AnesthesiaRequest, String Medications,  String  Side, String Position,   String PositioningComments, String Instructions) throws InterruptedException 
	{
		 Thread.sleep(3000);
	
		createCaseFlowPage.createCasePreferenceCardData(Status,lastName,firstName, MNR, SurgeonName, UrgencyName, patientAlllergy,Speciality,PhysicianAssistant, NotesBySurgeon, PreferenceCardSelection,
				AnesthesiaRequest, Medications, Side, Position, PositioningComments, Instructions   );
		 Thread.sleep(3000);
	
		  createCaseSetSelectionPage.create.click();
		  searchCaseFlowPage.okButton.click();
		 
	}
	
	//Procedure Flow
	 
	@Test(priority=3, dataProvider="ProcedureSelectionFlow",dataProviderClass=DataProviderExcel.class)
	public void createCaseProcedureSelectionFlowTest( String Status, String lastName, String firstName, String mNR ,  String sname, String urgencyName, String patientAllergy, String speciality,String procedureSelection,
			String AnasthesiaRequest, String Medications, String Side, String Position, String PositioningComments, String Instructions) throws InterruptedException 
	{
		 Thread.sleep(3000);
		createCaseFlowPage.createCaseProcedureSelectionFlowData(Status,lastName,firstName, mNR, sname, urgencyName, patientAllergy,speciality, procedureSelection,
				 AnasthesiaRequest,  Medications, Side, Position,  PositioningComments,  Instructions);
		 Thread.sleep(3000);
		
		 createCaseSetSelectionPage.create.click();
		 searchCaseFlowPage.okButton.click();
	}
	
	
	

}
