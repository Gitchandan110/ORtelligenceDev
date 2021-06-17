package com.ort.qa.testcases;






import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ort.qa.base.TestBase;
import com.ort.qa.pages.CreateCaseBasicDetailsPage;
import com.ort.qa.pages.CreateCaseFindPatientPage;
import com.ort.qa.pages.CreateCaseSetSelectionPage;
import com.ort.qa.pages.LoginPage;
import com.ort.qa.pages.NurseDashboardPage;
import com.ort.qa.pages.SearchCaseFlowPage;
import com.ort.qa.pages.SearchPatientPage;
import com.ort.qa.pages.SelectFacilityPage;
import com.ort.qa.util.DataProviderExcel;

public class CreateCaseFindPatientPageTest extends TestBase {
	LoginPage loginPage;
	SelectFacilityPage selectFacilityPage;
	CreateCaseFindPatientPage createCaseFindPatientPage; 
    CreateCaseBasicDetailsPage createCaseBasicDetailsPage;
    NurseDashboardPage nurseDashboardPage;
	CreateCaseSetSelectionPage  createCaseSetSelectionPage;
	SearchCaseFlowPage searchCaseFlowPage;
	
	
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
	
	//@AfterMethod
	public void tearDown() throws InterruptedException {
		driver.quit();
	}
	
	
	
	@Test(priority=1, dataProvider="LongFlow",dataProviderClass=DataProviderExcel.class)
	public void createCaseFindPatientLongFlowTest(String Status, String lastName, String firstName, String mNR ,  String sname, String urgencyName, String patientAllergy, String speciality, String notesBySurgeon, 
			String AnasthesiaRequest, String Medications,String Side, String Position, String PositioningComments, String Instructions) throws InterruptedException 
	{
		 Thread.sleep(3000);
		createCaseFindPatientPage.createCaseFindPatientLongFlowData(Status,lastName,firstName, mNR, sname, urgencyName, patientAllergy,speciality,notesBySurgeon,AnasthesiaRequest, Medications, Side, Position, PositioningComments, Instructions );
		 Thread.sleep(3000);
		 
		 createCaseSetSelectionPage.create.click();
		 searchCaseFlowPage.okButton.click();
		 //searchCaseFlowPage.searchCaseLink.click();
		 //searchCaseFlowPage.searchCaseLink.click();
		 
		 
	}
	
	

}
