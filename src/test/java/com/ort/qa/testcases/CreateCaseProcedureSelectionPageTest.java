package com.ort.qa.testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ort.qa.base.TestBase;
import com.ort.qa.pages.CreateCaseSpecialtyPage;
import com.ort.qa.pages.LoginPage;
import com.ort.qa.pages.NurseDashboardPage;
import com.ort.qa.pages.SelectFacilityPage;

public class CreateCaseProcedureSelectionPageTest extends TestBase
{
	 LoginPage loginPage;
	 SelectFacilityPage selectFacilityPage;
	 NurseDashboardPage nurseDashboardPage;
	 CreateCaseSpecialtyPage createCaseSpecialtyPage;
	 com.ort.qa.pages.CreateCaseProcedureSelectionPage createCaseProcedureSelectionPage;
		public CreateCaseProcedureSelectionPageTest() 
		{
			super();	                           
		}
		
		@BeforeMethod
		public void setUp() 
		{
			           initialization();
			         loginPage = new LoginPage(driver);
	      selectFacilityPage = new SelectFacilityPage(driver);
	      selectFacilityPage = loginPage.login1(prop.getProperty("username"), prop.getProperty("password"));
	    nurseDashboardPage=loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	      createCaseSpecialtyPage =new CreateCaseSpecialtyPage();
	      createCaseProcedureSelectionPage =new com.ort.qa.pages.CreateCaseProcedureSelectionPage();
			
		}
		@Test(priority=1)
		public void CreateCaseProcedureSelectionPage() 
		{
			 createCaseProcedureSelectionPage.click();
			
		}
		
		}
	
	
	
	
	
	
	
	
	
	
	


