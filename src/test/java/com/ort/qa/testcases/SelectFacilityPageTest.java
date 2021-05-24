package com.ort.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ort.qa.base.TestBase;
import com.ort.qa.pages.CreateCaseFindPatientPage;
import com.ort.qa.pages.LoginPage;
import com.ort.qa.pages.NurseDashboardPage;
import com.ort.qa.pages.SelectFacilityPage;

public class SelectFacilityPageTest extends TestBase
{

     LoginPage loginPage;
	 SelectFacilityPage selectFacilityPage;
	 NurseDashboardPage nurseDashboardPage;
	 CreateCaseFindPatientPage createCaseFindPatientPage;
		public SelectFacilityPageTest() 
		{  
			super();	                           
		}
		
		@BeforeMethod
		public void setUp() 
		{
			           initialization();
			         loginPage = new LoginPage(driver);
	      selectFacilityPage = new SelectFacilityPage(driver);
	    createCaseFindPatientPage = new CreateCaseFindPatientPage(driver);
	      selectFacilityPage = loginPage.login1(prop.getProperty("username"), prop.getProperty("password"));
	     
			
		}
		
	
		
		@AfterMethod
		public void tearDown() 
		{
			driver.quit();
		}
		
		
		
}