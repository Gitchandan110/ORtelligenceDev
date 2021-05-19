package com.ort.qa.testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ort.qa.base.TestBase;
import com.ort.qa.pages.LoginPage;
import com.ort.qa.pages.SelectFacilityPage;

public class SelectFacilityPiyushTest extends TestBase
{
	
	LoginPageTest loginPageTest;
	 SelectFacilityPage selectFacilityPage;
	 
		public SelectFacilityPiyushTest() 
		{  
			super();	                           
		}
		
		@BeforeMethod
		public void setUp() 
		{
			initialization();
			loginPageTest = new LoginPageTest();
			selectFacilityPage = new SelectFacilityPage(driver);
			loginPageTest.loginTest();
					 
		}
		
		@Test(priority=1)
		public void selectFacilityPage() 
		{
			selectFacilityPage.clickOnDropDown();
			selectFacilityPage.clickConfirm();
	
		}

}
