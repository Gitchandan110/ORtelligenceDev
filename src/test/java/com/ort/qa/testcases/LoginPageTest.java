package com.ort.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.ort.qa.base.TestBase;
import com.ort.qa.pages.LoginPage;
import com.ort.qa.pages.NurseDashboardPage;
import com.ort.qa.util.DataProviderExcel;
import com.ort.qa.util.ExcelUtility;
public class LoginPageTest extends TestBase{
	//Defined the loginPage variable
	LoginPage loginPage;   
	NurseDashboardPage nurseDashboardPage;
	
	//name of the sheet in excel //will use this later
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
	public void loginPageTiltleTest() {
		String title=loginPage.validateLoginPageTitle();
		Assert.assertEquals(title, "ortelligence");
		
	}
	
    @Test(priority=2)
	public void ortLogoImageTest() {
		boolean flag=loginPage.validateORtLogo();
		Assert.assertTrue(flag);     
		//if flag is true ur assertion will be passed otherwise it will fail
	}
	
	//this test case is for fetching the multiple username and password from the excel sheet 
    //we will run this testcase later
    
  @DataProvider
    	public Object getORtTestData() {
   		Object data [][]=ExcelUtility.getTestData(sheetName);
   		return data;
    	}

 
  	@Test(priority=3,dataProvider="NurseData",dataProviderClass=DataProviderExcel.class)
  	public void LoginTest(String user,String password) {
  		
  		//LoginPage lpage=new LoginPage();
  		loginPage.loginuser(user, password);
  		
  		//dashboardPage =loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
   	}
   	 
	/*@Test(priority=3,dataProvider="NurseData",dataProviderClass=DataProviderExcel.class)
	public void LoginTest(String un,String pwd) {
		loginPage.login(un, pwd);	
	}*/
	
	
	@Test(priority=4)
	public  void  loginTest() {
		nurseDashboardPage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	
	}

	 @AfterMethod
	public void tearDown() {
		driver.quit();
	 }

} 
