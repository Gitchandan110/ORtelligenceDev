package com.ort.qa.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.ort.qa.base.TestBase;
import com.ort.qa.pages.CartReviewPage;
import com.ort.qa.pages.CaseQueuePage;
import com.ort.qa.pages.CreateCaseFlowPage;
import com.ort.qa.pages.CreateCaseSetSelectionPage;
import com.ort.qa.pages.LoginPage;
import com.ort.qa.pages.NurseDashboardPage;
import com.ort.qa.pages.SearchCaseFlowPage;
import com.ort.qa.pages.SelectFacilityPage;
import com.ort.qa.util.DataProviderExcel;

public class CartReviewPageTest extends TestBase {
	
	LoginPage loginPage;
	SelectFacilityPage selectFacilityPage;
    NurseDashboardPage nurseDashboardPage;
	CreateCaseSetSelectionPage  createCaseSetSelectionPage;
	CartReviewPage cartReviewPage;
	
public CartReviewPageTest() {  
		
		super();	                           
		}


@BeforeTest

public void setUp() throws InterruptedException {
	initialization();
	loginPage = new LoginPage(driver);
    selectFacilityPage = new SelectFacilityPage(driver); 
  	 cartReviewPage = new CartReviewPage(driver);
     nurseDashboardPage = loginPage.login(prop.getProperty("superUsername"), prop.getProperty("superPassword"));
    nurseDashboardPage = new NurseDashboardPage(driver);
	 Thread.sleep(1000);
   // selectFacilityPage.clickOnDropDown();
	// Thread.sleep(1000);
	 //selectFacilityPage.clickConfirm();
	 Thread.sleep(1000);
	 nurseDashboardPage.clickOnCartReviewLink();
			
}


@Test(priority=1, dataProvider="OpenCases",dataProviderClass=DataProviderExcel.class)
public void openCases(String Status, String lastName, String firstName, String MRN, String Speciality, String CaseNumber ) throws InterruptedException 
{
	 Thread.sleep(3000);
	 cartReviewPage.checkCartReview (Status,lastName,firstName, MRN, Speciality);
	 Thread.sleep(3000);
	 cartReviewPage.search.click();


}
}
