/* Created by Piyush Sadawarti on 20/5/2021
 * 
 * 
 * 
 */
package com.ort.qa.testcases;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.ort.qa.base.TestBase;
import com.ort.qa.pages.LoginPage;
import com.ort.qa.pages.NurseDashboardPage;
import com.ort.qa.pages.SelectFacilityPage;

public class NurseDashboardClickInProgressMenu extends TestBase 
{
//	Declaration
//	LoginPage object - loginPage 
	LoginPage loginPage;
//	NurseDashboardPage object - nurseDashboardPage
	NurseDashboardPage nurseDashboardPage;
//   SelectFacilityPage object - selectFacilityPage
	SelectFacilityPage selectFacilityPage;
	
    public NurseDashboardClickInProgressMenu() 
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
   		loginPage = new LoginPage(driver);
   		nurseDashboardPage = new NurseDashboardPage();
   		selectFacilityPage = new SelectFacilityPage(driver);
   		nurseDashboardPage=loginPage.login(prop.getProperty("username"), prop.getProperty("password"));  
   		Thread.sleep(1000);
   		selectFacilityPage.clickOnDropDown();
   		Thread.sleep(1000);
  		selectFacilityPage.clickConfirm();
  		Thread.sleep(1000);
    		
   	}
    
// 	Click on In Process option of Menu
 	@Test(priority=1)
 	public void clickInProcessMenu() throws InterruptedException
 	{
 		Thread.sleep(2000);
 		nurseDashboardPage.menuInProcess.click();
 		Thread.sleep(2000);
 	} 
    
//	Quit browser
 	@AfterTest
 	public void tearDown() throws InterruptedException 
 	{
 		Thread.sleep(3000);
 		driver.quit();
 	} 

}
