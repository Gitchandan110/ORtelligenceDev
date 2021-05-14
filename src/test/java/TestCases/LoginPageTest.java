package TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.TestBase.TestBase;

import TestPages.LoginPage;
import TestPages.NurseDashboardPage;
import Utility.DataProviderExcel;
public class LoginPageTest extends TestBase{
	//Defined the loginPage variable
	LoginPage loginPage;   
	NurseDashboardPage dashboardPage;
	
	//name of the sheet in excel
	String sheetName = "NurseData";
	
	// here created the constructor of LoginPageTest
	//it will call superclass constructor bcz i want to initialize my properties also
	// only after calling the superclass constructor it will go to the initialization
	// the moment it will go to initialization method of super class it will not give nullpointer exception bcz we already defined the properties
	public LoginPageTest() {  
		super();	                           
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
		Assert.assertTrue(flag);     
		//if flag is true ur assertion will be passed otherwise it will fail
	}
	
	
	@Test(priority=3,enabled = false,dataProvider="NurseData",dataProviderClass=DataProviderExcel.class)
	public void LoginTest(String user,String password) {
		loginPage.loginuser(user, password);	
	}
	
	
	@Test(priority=4)
	public  void  loginTest() {
		dashboardPage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}

	 @AfterMethod
	public void tearDown() {
		driver.quit();
	 }

} 
