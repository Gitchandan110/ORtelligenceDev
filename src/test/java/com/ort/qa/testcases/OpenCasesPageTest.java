package com.ort.qa.testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.ort.qa.base.TestBase;
import com.ort.qa.pages.CreateCaseFlowPage;
import com.ort.qa.pages.CreateCaseSetSelectionPage;
import com.ort.qa.pages.LoginPage;
import com.ort.qa.pages.NurseDashboardPage;
import com.ort.qa.pages.OpenCasesPage;
import com.ort.qa.pages.SearchCaseFlowPage;
import com.ort.qa.pages.SelectFacilityPage;
import com.ort.qa.util.DataProviderExcel;

public class OpenCasesPageTest extends TestBase {
	LoginPage loginPage;
	SelectFacilityPage selectFacilityPage;
	CreateCaseFlowPage createCaseFlowPage; 
    NurseDashboardPage nurseDashboardPage;
	CreateCaseSetSelectionPage  createCaseSetSelectionPage;
	SearchCaseFlowPage searchCaseFlowPage;
	OpenCasesPage openCasesPage;
	
	public OpenCasesPageTest() {  
		
		super();	                           
		}

	@BeforeTest
	
	
	public void setUp() throws InterruptedException {
		initialization();

		                  loginPage = new LoginPage(driver);
		         selectFacilityPage = new SelectFacilityPage(driver);
		         createCaseFlowPage = new CreateCaseFlowPage(driver);  
	           	 searchCaseFlowPage = new SearchCaseFlowPage(driver);
	           	 openCasesPage      = new OpenCasesPage();
			     nurseDashboardPage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		         nurseDashboardPage = new NurseDashboardPage(driver);
		 	     createCaseSetSelectionPage = new  CreateCaseSetSelectionPage();
		 		 Thread.sleep(1000);
		         selectFacilityPage.clickOnDropDown();
		    	 Thread.sleep(1000);
		 		 selectFacilityPage.clickConfirm();
		 		 Thread.sleep(2000);
		 		 nurseDashboardPage.clickOnOpenCaseLink();
		 		
		 		 
	}

	
	@Test(priority=1, dataProvider="OpenCases",dataProviderClass=DataProviderExcel.class)
	public void openCases(String Status, String lastName, String firstName, String MRN, String Speciality, String CaseNumber ) throws InterruptedException 
	{
		 Thread.sleep(3000);
	   openCasesPage.userOpenCases (Status,lastName,firstName, MRN, Speciality, CaseNumber);
		 Thread.sleep(3000);
		openCasesPage.search.click();
		 Thread.sleep(3000);
		openCasesPage.clickOnCaseNumberLink();
		Thread.sleep(3000);
		openCasesPage.clickOnProcedureDetails();
		Thread.sleep(3000);
		openCasesPage.clickOnBackButton();
		Thread.sleep(3000);	 
	}
	
	//CLICK ON THE FIRST lINK
	
	@Test(priority=2)
	public void clickOnCaseLink()
	{
		openCasesPage.clickOnCaseNumberLink();
	}
	
	
	//Click on Cart Details Button on Confirmation Popup
	@Test(priority=3)
	public void clickOnCartDetalisButton() 
	{
		openCasesPage.clickOnCartDetails();
	}
	
	
	//Click on Update Button
	@Test(priority=4)
	public void clickOnUpDateButton() throws InterruptedException
	{
		openCasesPage.clickOnUpdateButton();
	}
	
	

}
