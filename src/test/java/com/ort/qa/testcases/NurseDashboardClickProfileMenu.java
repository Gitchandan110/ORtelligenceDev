package com.ort.qa.testcases;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.ort.qa.base.TestBase;
import com.ort.qa.pages.LoginPage;
import com.ort.qa.pages.NurseDashboardPage;
import com.ort.qa.pages.SelectFacilityPage;

public class NurseDashboardClickProfileMenu extends TestBase 
{
//	Declaration
//	LoginPage object - loginPage 
	LoginPage loginPage;
//	NurseDashboardPage object - nurseDashboardPage
	NurseDashboardPage nurseDashboardPage;
//   SelectFacilityPage object - selectFacilityPage
	SelectFacilityPage selectFacilityPage;
	
    public NurseDashboardClickProfileMenu() 
    {
    	super();	
    }
    
/*  Initialize different objects
 * 	Perform pre-required tests 
 */
    @BeforeTest
  	public void setUp() throws InterruptedException 
    {
   		initialization();
   		loginPage = new LoginPage();
   		nurseDashboardPage = new NurseDashboardPage();
   		selectFacilityPage = new SelectFacilityPage();
   		nurseDashboardPage=loginPage.login(prop.getProperty("username"), prop.getProperty("password"));  
   		Thread.sleep(1000);
   		selectFacilityPage.clickOnDropDown();
   		Thread.sleep(1000);
  		selectFacilityPage.clickConfirm();
  		Thread.sleep(1000);
    		
   	}
    
// 	Click on Profile option of Menu
 	@Test(priority=1)
 	public void clickProfileMenu() throws InterruptedException
 	{
 		Thread.sleep(2000);
 		nurseDashboardPage.clickOnMenuProfile();
 		Thread.sleep(20000);
 	} 
    
//	Quit browser
 	@AfterTest
 	public void tearDown() throws InterruptedException 
 	{
 		Thread.sleep(3000);
 		driver.quit();
 	} 

}
