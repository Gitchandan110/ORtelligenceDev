package com.ort.qa.testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ort.qa.base.TestBase;
import com.ort.qa.pages.CreateCaseSpecialtyPage;
import com.ort.qa.pages.CreateCaseSystemSelectionPage;
import com.ort.qa.pages.LoginPage;
import com.ort.qa.pages.NurseDashboardPage;
import com.ort.qa.pages.SelectFacilityPage;

public class CreateCaseSystemSelectionTest extends TestBase
{
	 LoginPage loginPage;
	 SelectFacilityPage selectFacilityPage;
	 NurseDashboardPage nurseDashboardPage;
	 CreateCaseSpecialtyPage createCaseSpecialtyPage;
	 CreateCaseSystemSelectionPage createCaseSystemSelectionPage;
		public CreateCaseSystemSelectionTest() 
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
	      createCaseSpecialtyPage = new CreateCaseSpecialtyPage();
	      createCaseSystemSelectionPage = new CreateCaseSystemSelectionPage();
		}
		
		@Test(priority=1)
		public void  createCaseSystemSelectionOption1() throws InterruptedException 
		{
			
			createCaseSystemSelectionPage.checkboxSystem1.click();
			Thread.sleep(2000);
			System.out.println("click1");
			
		}
		
		@Test(priority=2)
		public void  createCaseSystemSelectionOption2() throws InterruptedException 
		{
			
			createCaseSystemSelectionPage.checkboxSystem2.click();
			Thread.sleep(2000);
			System.out.println("click2");
		}
		
		@Test(priority=3)
		public void  createCaseSystemSelectionSelectSystem() throws InterruptedException 
		{
			
			createCaseSystemSelectionPage.clickHere.click();
			Thread.sleep(3000);
			System.out.println("click3");
		}
		
		@Test(priority=4)
		public void createCaseConfirmationPopUp() throws InterruptedException 
		{
			
			createCaseSystemSelectionPage.proceedToCart.click();
			Thread.sleep(2000);
			System.out.println("click4");
		}
		
		
}
