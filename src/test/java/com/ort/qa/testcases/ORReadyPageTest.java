package com.ort.qa.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.ort.qa.base.TestBase;
import com.ort.qa.pages.CaseQueuePage;
import com.ort.qa.pages.CreateCaseSetSelectionPage;
import com.ort.qa.pages.LoginPage;
import com.ort.qa.pages.NurseDashboardPage;
import com.ort.qa.pages.ORReadyPage;
import com.ort.qa.pages.SearchCaseFlowPage;
import com.ort.qa.pages.SelectFacilityPage;
import com.ort.qa.util.DataProviderExcel;

public class ORReadyPageTest extends TestBase{
	
	LoginPage loginPage;
	SelectFacilityPage selectFacilityPage;
    NurseDashboardPage nurseDashboardPage;
	CreateCaseSetSelectionPage  createCaseSetSelectionPage;
	ORReadyPage orReadyPage;

    public ORReadyPageTest() {  
		
		super();	                           
		}


@BeforeTest

    public void setUp() throws InterruptedException {
	initialization();
	loginPage = new LoginPage(driver);
    selectFacilityPage = new SelectFacilityPage(driver); 
     nurseDashboardPage = loginPage.login(prop.getProperty("superUsername"), prop.getProperty("superPassword"));
    nurseDashboardPage = new NurseDashboardPage(driver);
     createCaseSetSelectionPage = new  CreateCaseSetSelectionPage();
	 Thread.sleep(1000);
    //selectFacilityPage.clickOnDropDown();
	 //Thread.sleep(1000);
	 //selectFacilityPage.clickConfirm();
	// Thread.sleep(1000);
	 nurseDashboardPage.clickOnORReadyLink();
			
}


@Test(priority=1, dataProvider="OpenCases",dataProviderClass=DataProviderExcel.class)
public void openCases(String Status, String lastName, String firstName, String MRN, String Speciality, String CaseNumber ) throws InterruptedException 
{
	 Thread.sleep(3000);
	 orReadyPage.ORReady (Status,lastName,firstName, MRN, Speciality,CaseNumber);
	 Thread.sleep(3000);
	 orReadyPage.search.click();
	 Thread.sleep(3000);
	 orReadyPage.caseNumberLink.click();

}


}
