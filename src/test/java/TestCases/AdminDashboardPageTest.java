package TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.TestBase.TestBase;

import TestPages.AdminDashboardPage;
import TestPages.LoginPage;
import TestPages.AdminManageHealthSystemPage;
import TestPages.ProfilePage;

public class AdminDashboardPageTest extends TestBase {
	LoginPage loginPage;
	AdminDashboardPage adminDashboardPage;
	ProfilePage profilePage;
	AdminManageHealthSystemPage manageHealthSystemPage;
	public AdminDashboardPageTest() {
		super();
		
	}
	
	//Before each test case launch the browser and login
	// after each test case close the browser
	
	@BeforeMethod
	public void setUp() {
		initialization();
		 profilePage= new  ProfilePage();  //initialising profile page reference

		 loginPage = new LoginPage(driver);
		 manageHealthSystemPage = new AdminManageHealthSystemPage();



		 //properties will get initialized here
		adminDashboardPage=loginPage.login(prop.getProperty("username"), prop.getProperty("password"));  //can access login method here, and in login method we are passing the properties username and password
	}
	
	
	
	@Test(priority=1)
	public void verifyDashboardPageTitleTest()
	{
		String dashboardPageTitle =adminDashboardPage.verifyAdminDashboardPageTitle();
		Assert.assertEquals(dashboardPageTitle, "Login", "Dashboard Page Title not matched");  //if assertion is getting failed then"Dashboard Page Title not matched" this msg will gets displyed at the time of reporting. it will get printed only when test case gets passed
	}
	
	
	@Test(priority=2)
	public void verifyCorrectUserNameLableTest() {
		Assert.assertTrue(adminDashboardPage.verifyCorrectUserNameLable());
		
		
	}
	
	@Test(priority=3)
	public void verifymenu() {
		Assert.assertTrue(adminDashboardPage.verifyMenu());
		}
	
	/*@Test(priority=4)
	public void verifyProfileLinkTest() {
		profilePage=dashboardPage.clickOnProfileLink();
		}*/
	@Test(priority=4)
	public void verifyProfileLink() {
		adminDashboardPage.clickOnProfileLink();
	}
	
	
	
	@Test(priority=5)
	public void verifyManageHealthSystemLinkTest() {
		manageHealthSystemPage=adminDashboardPage.clickOnManageHealthSystemLink();
		}
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	

}
