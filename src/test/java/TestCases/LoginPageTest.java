package TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.TestBase.TestBase;

import TestPages.DashboardPage;
import TestPages.LoginPage;
public class LoginPageTest extends TestBase{
	LoginPage loginPage;   //Defined the loginPage variable
	DashboardPage dashboardPage;
	public LoginPageTest() {  // here created the constructor of LoginPageTest
		super();	  //it will call superclass constructor bcz i want to initialize my properties also
		              // only after calling the superclass constructor it will go to the initialization
// the moment it will go to initialization method of super class it will not give nullpointer exception bcz we already defined the properties
		}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		
		//now creating the object of LoginPage class.
		
		 loginPage = new LoginPage();
	}
	
	@Test(priority=1)
	public void LoginPageTiltleTest() {
		String title=loginPage.validateLoginPageTitle();
		Assert.assertEquals(title, "ortelligence");
		
	}
	

	@Test(priority=2)
	public void ORtLogoImageTest() {
		boolean flag=loginPage.validateORtLogo();
		Assert.assertFalse(flag);     //if flag is true ur assertion will be passed otherwise it will fail
	}
	
	@Test(priority=3)
	public void LoginTest() {
		dashboardPage =loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	

	 @AfterMethod
	public void tearDown() {
		driver.quit();
	 }

} 
