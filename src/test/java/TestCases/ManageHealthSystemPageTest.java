package TestCases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.TestBase.TestBase;

import TestPages.AdminAddNewHealthSystemPage;
import TestPages.AlertsPage;
import TestPages.AdminDashboardPage;
import TestPages.LoginPage;
import TestPages.AdminManageHealthSystemPage;
import TestPages.ProfilePage;

public class ManageHealthSystemPageTest extends TestBase {
	
	LoginPage loginPage;
	 AdminDashboardPage dashboardPage;
	 ProfilePage profilePage;
	 AdminManageHealthSystemPage manageHealthSystemPage;
	 AdminAddNewHealthSystemPage addNewHealthSystemPage;
	public ManageHealthSystemPageTest() {
		super();
	}
	
	
	
	@BeforeMethod
	public void setUp() {
		initialization();
		 profilePage= new  ProfilePage();  //initialising profile page reference
//<<<<<<< HEAD
//		 loginPage = new LoginPage();
//		 manageHealthSystemPage = new AdminManageHealthSystemPage();
//=======
//		 loginPage = new LoginPage(driver);
//		 manageHealthSystemPage = new ManageHealthSystemPage();
//>>>>>>> 46537dab4829e9af0cb9d9e6a154850d7e3482cc
		 //properties will get initialized here
		 manageHealthSystemPage=loginPage.dashboard(prop.getProperty("username"), prop.getProperty("password"));  //can access login method here, and in login method we are passing the properties username and password
	}
	
/*	@Test(priority=1)
	public void verifyAddNewHealthSystemLink() {
		addNewHealthSystemPage = manageHealthSystemPage.clickOnAddNewHealthSystemLink();
		}
	*/
	
	
}
