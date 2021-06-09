package com.ort.qa.testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ort.qa.base.TestBase;
import com.ort.qa.pages.CreateCaseSpecialtyPage;
import com.ort.qa.pages.LoginPage;
import com.ort.qa.pages.NurseDashboardPage;
import com.ort.qa.pages.SelectFacilityPage;

public class CreateCaseSpecialtyTest extends TestBase 
{


    LoginPage loginPage;
	 SelectFacilityPage selectFacilityPage;
	 NurseDashboardPage nurseDashboardPage;
	 CreateCaseSpecialtyPage createCaseSpecialtyPage;
		public CreateCaseSpecialtyTest() 
		{  
			super();	                           
		}
		
		@BeforeMethod
		public void setUp() throws InterruptedException 
		{
			           initialization();
			         loginPage = new LoginPage(driver);
	      selectFacilityPage = new SelectFacilityPage(driver);
	      nurseDashboardPage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	      createCaseSpecialtyPage =new CreateCaseSpecialtyPage();
			
		}
		
		@Test(priority=1)
		public void createCaseSpecialtyPage()
		{
			
			createCaseSpecialtyPage.clickOnDropDown();
			createCaseSpecialtyPage.clickOnNext();
			
			
		}
}
