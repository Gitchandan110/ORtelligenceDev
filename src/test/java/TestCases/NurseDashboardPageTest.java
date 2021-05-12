package TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.TestBase.TestBase;

import TestPages.AdminManageHealthSystemPage;
import TestPages.LoginPage;
import TestPages.NurseDashboardPage;
import TestPages.ProfilePage;

public class NurseDashboardPageTest extends TestBase{
	
	LoginPage loginPage;
	NurseDashboardPage nurseDashboardPage;
	
     public NurseDashboardPageTest() {
	 super();	

      }
     
     
     @BeforeMethod
 	public void setUp() {
 		initialization();
 		

 		 loginPage = new LoginPage(driver);}
 		

//
// 		 //properties will get initialized here
// 		 nurseDashboardPage=loginPage.login(prop.getProperty("username"), prop.getProperty("password"));  
// 	}
// 	
// 	
// 	
// 	@Test(priority=1)
// 	public void verifyDashboardPageTitleTest()
// 	{
// 		String dashboardPageTitle =nurseDashboardPage.verifyDashboardPageTitle();
// 		Assert.assertEquals(dashboardPageTitle, "Login", "Dashboard Page Title not matched");  
// 	}
// 	
// 
// 		
 		
 	
 	
 
 	
 	@AfterMethod
 	public void tearDown() {
 		driver.quit();
 	}
 	
 	

     








}