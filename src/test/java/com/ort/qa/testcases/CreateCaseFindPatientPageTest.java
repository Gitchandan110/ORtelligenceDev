package com.ort.qa.testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ort.qa.base.TestBase;
import com.ort.qa.pages.CreateCaseFindPatientPage;
import com.ort.qa.pages.LoginPage;
import com.ort.qa.pages.SelectFacilityPage;
import com.ort.qa.util.DataProviderExcel;

public class CreateCaseFindPatientPageTest extends TestBase {
	LoginPage loginPage;
	SelectFacilityPage selectFacilityPage;
	CreateCaseFindPatientPage createCaseFindPatientPage; 
	
	
	String sheetName = "PatientData";
	
	
	public CreateCaseFindPatientPageTest() {  
		super();	                           
		}

	@BeforeMethod
	public void setUp() throws InterruptedException {
		initialization();

		                  loginPage = new LoginPage(driver);
		         selectFacilityPage = new SelectFacilityPage(driver);
		  createCaseFindPatientPage = new CreateCaseFindPatientPage(driver);
		         selectFacilityPage = loginPage.login1(prop.getProperty("username"), prop.getProperty("password"));

		

 /*now creating the object of LoginPage class.
 * createCaseFindPatientPage = new CreateCaseFindPatientPage();
 */

		
	}
	
	
	@Test(priority=1,dataProvider="PatientData",dataProviderClass=DataProviderExcel.class)
	public void createCaseFindPatientPageTest(String lastName, String firstName, String dOB, String mNR) 
	{
		
		createCaseFindPatientPage.createCaseFindPatientData(lastName, firstName, dOB, mNR);
	}
	/*
	 @AfterMethod
	public void tearDown() {
		driver.quit();
	 }
*/
}
