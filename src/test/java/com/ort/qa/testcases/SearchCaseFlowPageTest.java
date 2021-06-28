package com.ort.qa.testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.ort.qa.base.TestBase;
import com.ort.qa.pages.SearchCaseFlowPage;
import com.ort.qa.pages.UserRoleLoginPage;
import com.ort.qa.util.DataProviderExcel;


public class SearchCaseFlowPageTest extends TestBase {
	
	SearchCaseFlowPage searchCaseFlowPage;
    UserRoleLoginPage userRoleLoginPage;
	public SearchCaseFlowPageTest() {  
		super();	                           
		}

	@BeforeTest
	public void setUp() {
		initialization();

		searchCaseFlowPage = new SearchCaseFlowPage(driver);
		userRoleLoginPage = new UserRoleLoginPage(driver);	
	}
	
	@Test(priority=1, dataProvider="SearchCaseFlow",dataProviderClass=DataProviderExcel.class)
	public void SearchCasesTest(String Status,String userRoleLoginId, String userRolePassword, String facilitySelection,String lastName, String firstName, String MRN, String speciality, String caseNumber) throws InterruptedException {
	 Thread.sleep(3000);
	 searchCaseFlowPage.userSearchCase(Status, userRoleLoginId, userRolePassword, facilitySelection, lastName,firstName, MRN, speciality,caseNumber);
	 Thread.sleep(3000);
	 searchCaseFlowPage.search.click();
	 //userRoleLoginPage.clickOnMenuLogout();
	}

	@Test(priority=2)
	public void clickOnCaseLink()
	{
		searchCaseFlowPage.clickOnCaseNumberLink();
	}
	
	
	//Click on Cart Details Button on Confirmation Popup
	@Test(priority=3)
	public void clickOnCartDetalisButton() 
	{
		searchCaseFlowPage.clickOnCartDetails();
	}
	
	
	//Click on Update Button
	@Test(priority=4)
	public void clickOnUpDateButton() throws InterruptedException
	{
		searchCaseFlowPage.clickOnUpdateButton();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
