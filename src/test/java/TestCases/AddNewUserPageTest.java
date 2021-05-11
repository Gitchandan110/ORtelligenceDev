package TestCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import com.TestBase.TestBase;

import TestPages.AdminAddNewUserPage;
import TestPages.AdminDashboardPage;
import TestPages.LoginPage;
import TestPages.AdminManageHealthSystemPage;
import TestPages.ProfilePage;
import Utility.ExcelUtility;

public class AddNewUserPageTest extends TestBase {
	LoginPage loginPage;
	 AdminDashboardPage dashboardPage;
	 ProfilePage profilePage;
	 AdminManageHealthSystemPage manageHealthSystemPage;
	 AdminAddNewUserPage addNewUserPage;
	 
	 //name of the sheet in excel
	 String sheetName = "UserData";
	 
	 
	public AddNewUserPageTest() {
		super();
		
	}
	@BeforeMethod
	public void setUp() {
		initialization();
		addNewUserPage =new AdminAddNewUserPage();
	}
	
	@DataProvider
	public Object getORtTestData() {
		Object data [][]=ExcelUtility.getTestData(sheetName);
		return data;
	}
	//@Test(priority=1, dataProvider="getORtTestData")
	
	
	 @AfterMethod
		public void tearDown() {
			driver.quit();
		 }

	
}
