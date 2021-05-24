package com.ort.qa.testcases;

import org.testng.annotations.BeforeMethod;

import org.testng.annotations.Test;

import com.ort.qa.base.TestBase;
import com.ort.qa.pages.CreateCaseAffectedAreaPage;
import com.ort.qa.pages.CreateCaseFindPatientPage;
import com.ort.qa.pages.CreateCaseSetSelectionPage;
import com.ort.qa.pages.CreateCaseSpecialtyPage;
import com.ort.qa.pages.CreateCaseSystemSelectionPage;
import com.ort.qa.pages.LoginPage;
import com.ort.qa.pages.NurseDashboardPage;
import com.ort.qa.pages.SelectFacilityPage;

 /*	Here in that page i have initialize the following pages: 
 * Login ,Select facility. NurseDashboard, CreatecaseAffectedarea, createcaseSpecialityPage,createCaseSystemSelection,createCaseSetSelection
 */
	
public class CreateCaseAffectedAreaTest  extends TestBase 
{
	LoginPage loginPage;
	 SelectFacilityPage selectFacilityPage;
	 NurseDashboardPage nurseDashboardPage;
	 CreateCaseAffectedAreaPage  createCaseAffectedAreaPage;
	 CreateCaseSpecialtyPage createCaseSpecialtyPage;
	 CreateCaseSystemSelectionPage createCaseSystemSelectionPage;
	 CreateCaseSetSelectionPage  createCaseSetSelectionPage;
		public  CreateCaseAffectedAreaTest() 
		{  
			super();	                           
		}
		
		@BeforeMethod
		public void setUp() 
		{
			           initialization();
			           loginPage = new LoginPage(driver);
				         selectFacilityPage = new SelectFacilityPage(driver);
	      nurseDashboardPage=loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	      createCaseFindPatientPage = new CreateCaseFindPatientPage(); 
	      createCaseAffectedAreaPage = new CreateCaseAffectedAreaPage();
	      createCaseSpecialtyPage = new CreateCaseSpecialtyPage();
	      createCaseSystemSelectionPage = new CreateCaseSystemSelectionPage();
	      createCaseSetSelectionPage = new  CreateCaseSetSelectionPage();
	      
			
		}
		
	/*	Here we perform the click operation on AffectedAreapage 
	*/	 
		
		@Test(priority=1)
		public void Clickonheap() throws InterruptedException 
		{
			Thread.sleep(3000);
			createCaseAffectedAreaPage.hip.click();
			Thread.sleep(3000);
		}
		

}
