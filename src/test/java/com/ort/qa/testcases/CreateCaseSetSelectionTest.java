package com.ort.qa.testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ort.qa.base.TestBase;
import com.ort.qa.pages.CreateCaseSetSelectionPage;
import com.ort.qa.pages.CreateCaseSpecialtyPage;
import com.ort.qa.pages.CreateCaseSystemSelectionPage;
import com.ort.qa.pages.LoginPage;
import com.ort.qa.pages.NurseDashboardPage;
import com.ort.qa.pages.SelectFacilityPage;

 /*	Here in that page i have initialize the following pages: 
 * Login ,Select facility. NurseDashboard, CreatecaseAffectedarea, createcaseSpecialityPage,createCaseSystemSelection,createCaseSetSelection
 */
public class CreateCaseSetSelectionTest extends TestBase 
{ 
	 LoginPage loginPage;
	 SelectFacilityPage selectFacilityPage;
	 NurseDashboardPage nurseDashboardPage;
	 CreateCaseSpecialtyPage createCaseSpecialtyPage;
	 CreateCaseSystemSelectionPage createCaseSystemSelectionPage;
	 CreateCaseSetSelectionPage  createCaseSetSelectionPage;
		public CreateCaseSetSelectionTest() 
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
	      createCaseSpecialtyPage = new CreateCaseSpecialtyPage();
	      createCaseSystemSelectionPage = new CreateCaseSystemSelectionPage();
	      createCaseSetSelectionPage = new  CreateCaseSetSelectionPage();
	      
		}
		
 /*	Here we perform the SetSelectionProcess click operation on checkboxSystem1
 */
		
		@Test(priority=1)
		public void  createCaseSetSelectionProcess() throws InterruptedException 
		{
			Thread.sleep(2000);
			createCaseSystemSelectionPage.checkboxSystem1.click();
			Thread.sleep(2000);
			System.out.println("click1");
			
		}
		
		
	

}
