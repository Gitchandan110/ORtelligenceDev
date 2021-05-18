package com.ort.qa.testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ort.qa.base.TestBase;
import com.ort.qa.pages.LoginPage;
import com.ort.qa.pages.NurseDashboardPage;
import com.ort.qa.pages.SelectFacilityPage;

public class SelectFacilityPageTest extends TestBase
{

     LoginPage loginPage;
	 SelectFacilityPage selectFacilityPage;
	 NurseDashboardPage nurseDashboardPage;
		public SelectFacilityPageTest() 
		{  
			super();	                           
		}
		
		@BeforeMethod
		public void setUp() 
		{
			           initialization();
			         loginPage = new LoginPage();
	      selectFacilityPage = new SelectFacilityPage();
	      selectFacilityPage = loginPage.login1(prop.getProperty("username"), prop.getProperty("password"));
	     
			
		}
		
		@Test(priority=1)
		public void selectFacilityPage() 
		{
			selectFacilityPage.clickOnDropDown();
			selectFacilityPage.clickConfirm();
			//nurseDashboardPage.dashboardCreateCase.click();
	
		}
		
		
		
}