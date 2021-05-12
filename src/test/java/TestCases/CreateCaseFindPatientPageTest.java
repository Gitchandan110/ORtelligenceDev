package TestCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.TestBase.TestBase;

import TestPages.CreateCaseFindPatientPage;
import Utility.DataProviderExcel;

public class CreateCaseFindPatientPageTest extends TestBase {
	CreateCaseFindPatientPage createCaseFindPatientPage;  
	String sheetName = "PatientData";
	
	
	public CreateCaseFindPatientPageTest() {  
		super();	                           
		}

	@BeforeMethod
	public void setUp() {
		initialization();
		
		//now creating the object of LoginPage class.
		
		createCaseFindPatientPage = new CreateCaseFindPatientPage();
	}
	
	
	@Test(priority=1,dataProvider="PatientData",dataProviderClass=DataProviderExcel.class)
	public void createCaseFindPatientPageTest(String firstname, String lastname, String DOB, String MNR) {
		
		createCaseFindPatientPage.findPatientData(firstname,lastname,DOB,MNR);
		
	}
	
	 @AfterMethod
	public void tearDown() {
		driver.quit();
	 }

}
