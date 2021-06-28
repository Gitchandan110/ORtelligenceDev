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
import com.ort.qa.pages.OpenCasesPage;
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
	OpenCasesPage openCasesPage;
	
	public CreateCaseFlowPageTest() {  
		
		super();	                           
		}

	@BeforeTest
	
	public void setUp() throws InterruptedException {
		initialization();

		                  loginPage = new LoginPage(driver);
		         selectFacilityPage = new SelectFacilityPage(driver);
		         createCaseFlowPage = new CreateCaseFlowPage(driver);  
	           	 searchCaseFlowPage = new SearchCaseFlowPage(driver);
			     nurseDashboardPage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		         nurseDashboardPage = new NurseDashboardPage(driver);
		         openCasesPage = new OpenCasesPage();
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
	
	//@Test(priority=2, dataProvider="PreferenceCardSelectionFlow",dataProviderClass=DataProviderExcel.class)
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
	 
	//@Test(priority=3, dataProvider="ProcedureSelectionFlow",dataProviderClass=DataProviderExcel.class)
	public void createCaseProcedureSelectionFlowTest( String Status, String lastName, String firstName, String mNR ,  String sname, String urgencyName, String patientAllergy, String speciality,String procedureSelection,
		String OpenQuantity,String AnasthesiaRequest, String Medications, String Side, String Position, String PositioningComments, String Instructions) throws InterruptedException 
	{
		 Thread.sleep(3000);
		createCaseFlowPage.createCaseProcedureSelectionFlowData(Status,lastName,firstName, mNR, sname, urgencyName, patientAllergy,speciality, procedureSelection,
		OpenQuantity, AnasthesiaRequest,  Medications, Side, Position,  PositioningComments,  Instructions);
		 Thread.sleep(3000);
		
		 createCaseSetSelectionPage.create.click();
		 searchCaseFlowPage.okButton.click();
	}
	
	//Click On search CaseLink 
	@Test(priority=4)
	public void clickOnSearchCasesLink()
	{
		nurseDashboardPage.menuSearchCase.click();
	}
	
	// Search case flow: Need to make one sheet for search case. Temporarily using open case sheet just to check the flow
	@Test(priority=5, dataProvider="OpenCases",dataProviderClass=DataProviderExcel.class)
	public void userSearchCases(String Status, String lastName, String firstName, String MRN, String Speciality, String CaseNumber) throws InterruptedException 
	{
		Thread.sleep(3000);
		   createCaseFlowPage.userSearchCases (Status,lastName,firstName, MRN, Speciality, CaseNumber);
			 Thread.sleep(3000);
			openCasesPage.search.click();
	}
	
	
	//Click on opn case link
	   @Test(priority=6)
	    public void clickOnOpenCases()
	    {
	    	nurseDashboardPage.clickOnOpenCaseLink();
	    }
		
		//check Open case flow
		@Test(priority=7, dataProvider="OpenCases",dataProviderClass=DataProviderExcel.class)
		public void openCases(String Status, String lastName, String firstName, String MRN, String Speciality, String CaseNumber ) throws InterruptedException 
		{
			 Thread.sleep(3000);
		   openCasesPage.userOpenCases (Status,lastName,firstName, MRN, Speciality,CaseNumber);
			 Thread.sleep(3000);
			openCasesPage.search.click();
			Thread.sleep(3000);
			openCasesPage.caseNumberLink.click();
		}
		
		
		//click on Cart Review link
		@Test(priority=7)
		public void clickOnCartReview()
		{
			nurseDashboardPage.menuCartReview.click();
		}
		
		// Check Cart Review Cases
		@Test(priority=8, dataProvider="OpenCases",dataProviderClass=DataProviderExcel.class)
		public void cartReviewCases(String Status, String lastName, String firstName, String MRN, String Speciality, String CaseNumber) throws InterruptedException 
		{
			Thread.sleep(3000);
			   createCaseFlowPage.userSearchCases (Status,lastName,firstName, MRN, Speciality, CaseNumber);
				 Thread.sleep(3000);
				openCasesPage.search.click();
		}
	
		//Click on OR-Ready Link
		@Test(priority=9)
		public void clickOnORreadyLink() 
		{
			nurseDashboardPage.menuORtelligence.click();
		}
		
		//Check OR-Ready Cases
		@Test(priority=10, dataProvider="OpenCases",dataProviderClass=DataProviderExcel.class)
		public void oRreadyCases(String Status, String lastName, String firstName, String MRN, String Speciality, String CaseNumber) throws InterruptedException 
		{
			Thread.sleep(3000);
			   createCaseFlowPage.userSearchCases (Status,lastName,firstName, MRN, Speciality, CaseNumber);
				 Thread.sleep(3000);
				openCasesPage.search.click();
		}
		
		
		//click on On-Progress Link
		@Test(priority=11)
		public void clickOnInProgressLink() 
		{
			nurseDashboardPage.menuInProcess.click();
		}
		
		@Test(priority=12, dataProvider="OpenCases",dataProviderClass=DataProviderExcel.class)
		public void inProgressCases(String Status, String lastName, String firstName, String MRN, String Speciality, String CaseNumber) throws InterruptedException 
		{
			Thread.sleep(3000);
			   createCaseFlowPage.userSearchCases (Status,lastName,firstName, MRN, Speciality, CaseNumber);
				 Thread.sleep(3000);
				openCasesPage.search.click();
		}
		
		@Test(priority=13)
		public void clickOnOnHoldLink()
		{
			nurseDashboardPage.menuOnHold.click();
		}
		
		@Test(priority=14, dataProvider="OpenCases",dataProviderClass=DataProviderExcel.class)
		public void onHoldCases(String Status, String lastName, String firstName, String MRN, String Speciality, String CaseNumber) throws InterruptedException 
		{
			Thread.sleep(3000);
			   createCaseFlowPage.userSearchCases (Status,lastName,firstName, MRN, Speciality, CaseNumber);
				 Thread.sleep(3000);
				openCasesPage.search.click();
		}
		
		
}
