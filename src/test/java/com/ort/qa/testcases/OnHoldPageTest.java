package com.ort.qa.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.ort.qa.base.TestBase;
import com.ort.qa.pages.CartReviewPage;
import com.ort.qa.pages.CreateCaseSetSelectionPage;
import com.ort.qa.pages.LoginPage;
import com.ort.qa.pages.NurseDashboardPage;
import com.ort.qa.pages.OnHoldPage;
import com.ort.qa.pages.SelectFacilityPage;
import com.ort.qa.util.DataProviderExcel;

public class OnHoldPageTest extends TestBase {
	
	LoginPage loginPage;
	SelectFacilityPage selectFacilityPage;
    NurseDashboardPage nurseDashboardPage;
	CreateCaseSetSelectionPage  createCaseSetSelectionPage;
	OnHoldPage onHoldPage;

public OnHoldPageTest() {  
		
		super();	                           
		}
	
@BeforeTest

public void setUp() throws InterruptedException {
	initialization();
	loginPage = new LoginPage(driver);
    selectFacilityPage = new SelectFacilityPage(driver); 
  	onHoldPage = new OnHoldPage(driver);
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
	onHoldPage.checkOnHold (Status,lastName,firstName, MRN, Speciality);
	 Thread.sleep(3000);
	onHoldPage.search.click();


}
	
}
