package TestCases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.TestBase.TestBase;

import TestPages.AdminDashboardPage;
import TestPages.LoginPage;
import TestPages.SelectFacilityPage;

public class SelectFacilityPageTest extends TestBase {

     LoginPage loginPage;
	 SelectFacilityPage selectFacilityPage;

		public SelectFacilityPageTest() {  
			super();	                           
			}
		
		@BeforeMethod
		public void setUp() {
			initialization();
			loginPage = new LoginPage(driver);
	        selectFacilityPage = new SelectFacilityPage(driver);
	     
			
		}
		
		@Test(priority=1)
		public void selectFacilityPage() {
			selectFacilityPage.clickOnDropDown();
		}
		
}