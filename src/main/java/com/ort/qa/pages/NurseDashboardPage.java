/* Update Information:
 * Modified by Piyush Sadawarti on 19/5/2021
 * Modified by Piyush Sadawarti on 20/5/2021
 * Modified by Piyush Sadawarti on 21/5/2021
 * 
 */

/* Role wise elements xpaths comparison:
 * We are considering the xpaths of all element of Nurse as base.
 * If any element has different xpath then its element is created under the respective role.
 * 
 * Nurse:
 * All Elements (Nurse)
 * ..........................................................
 * HCP:
 * Menu = Nurse (Switch Location = HCP)
 * Dashboard = HCP 
 * ..........................................................
 * SPD:
 * Menu = Nurse (Case Queue + Switch Location = SPD)
 * Dashboard  = Nurse (Search Case + Case Queue = SPD)
 * ..........................................................
 * 
 *  
 * 
 * 
 * */

//Nurse Dashboard Page
package com.ort.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ort.qa.base.TestBase;
import com.ort.qa.util.RepositoryPages;

public class NurseDashboardPage extends RepositoryPages
{
	
// 	Dashboard Nurse ..............................................................................................
//  In Process Nurse
	WebDriver driver;
 	 
	
//  On Hold Nurse
 	@FindBy(xpath="(//div[@class='rcorners3 border border-primary flexchild pointer-div'])[2]")
	public WebElement dashboardOnHold;   
	
//  Cart Review Nurse
 	@FindBy(xpath="(//div[@class='rcorners3 border border-primary flexchild pointer-div'])[3]")
	public WebElement dashboardCartReview;   
	
//  Create Case Nurse
 	@FindBy(xpath="(//div[@class='rcorners3 border border-primary flexchild pointer-div'])[4]")
	public WebElement dashboardCreateCase;   
	
// 	Search Case Nurse
 	@FindBy(xpath="(//div[@class='rcorners3 border border-primary flexchild pointer-div'])[5]")
	public WebElement dashboardSearchCase;   
	
//  Open Case Nurse
 	@FindBy(xpath="(//div[@class='rcorners3 border border-primary flexchild pointer-div'])[6]")
	public WebElement dashboardOpenCase;   
	
// 	ORtelligence Nurse
 	@FindBy(xpath="(//div[@class='rcorners3 border border-primary flexchild pointer-div'])[7]")
	public WebElement dashboardORtelligence;   
	
//	Dashboard HCP .................................................................................................
//  Create Case HCP
 	@FindBy(xpath="(//div[@class='rcorners3 border border-primary flexchild pointer-div'])[1]")
	public WebElement dashboardCreateCaseHCP;   
		
// 	Search Case HCP
 	@FindBy(xpath="(//div[@class='rcorners3 border border-primary flexchild pointer-div'])[2]")
	public WebElement dashboardSearchCaseHCP;   
		
//  Open Case HCP
 	@FindBy(xpath="(//div[@class='rcorners3 border border-primary flexchild pointer-div'])[3]")
	public WebElement dashboardOpenCaseHCP;   
		
//  ORtelligence HCP
 	@FindBy(xpath="(//div[@class='rcorners3 border border-primary flexchild pointer-div'])[4]")
	public WebElement dashboardORtelligenceHCP; 
	
//  Dashboard SPD...................................................................................................
//	Search Case  - SPD
	@FindBy(xpath="(//div[@class='rcorners3 border border-primary flexchild pointer-div'])[3]")
	public WebElement dashboardSearchCaseSPD; 
	
//	Case Queue - SPD
	@FindBy(xpath="(//div[@class='rcorners3 border border-primary flexchild pointer-div'])[4]")
	public WebElement dashboardCaseQueueSPD;	
	
	
// 	Menu Bar ......................................................................................................
  
	
//  On Hold
 	@FindBy(xpath="(//a[text()='On-Hold'])[1]")
	public WebElement menuOnHold;   
	
// 	Cart Review
 	@FindBy(xpath="(//a[text()='Cart Review'])[1]")
	public WebElement menuCartReview;   

 //	Create Case
 	@FindBy(xpath="(//a[text()='Create Case'])[1]")
	public WebElement menuCreateCase;   
	
// 	Search Case
 	@FindBy(xpath="(//a[text()='Search Cases'])[1]")
	public WebElement menuSearchCase;  
	
//	Open Case
	@FindBy(xpath="(//a[text()='Open Cases'])[1]")
	public WebElement menuOpenCase;   
	
//	ORtelligence
	@FindBy(xpath="(//a[text()='ORtelligence'])[1]")
	public WebElement menuORtelligence;   
	
//	User Name
	@FindBy(xpath="//li[@class='dropdown user-menu pl-sm-0']")
	public WebElement menuUserName;   
	
// 	Profile
 	@FindBy(xpath="(//a[text()='Profile'])[1]")
	public WebElement menuProfile;   
	
// Switch Location
 	@FindBy(xpath="(//a[@class='menu-font'])[9]")
	public WebElement menuSwitchLocatoin; 
	
//  Logout
 	@FindBy(xpath="(//a[text()='Logout'])[1]")
	public WebElement menuLogout;

// 	Alerts 
 	@FindBy(xpath="(//a[text()='Alerts '])[1]")
	public WebElement menuAlerts;
	
//	Menu - HCP................................................................................................
//	Switch Locatoin - HCP
	@FindBy(xpath="(//a[@class='menu-font'])[6]")
	public WebElement menuSwitchLocatoinHCP;

//	Menu - SPD.........................................................................................
//  Case Queue - SPD
	@FindBy(xpath="(//a[text()='Case Queue'])[1]")
	public WebElement menuCaseQueueSPD;

//	Switch Locatoin - HCP
	@FindBy(xpath="(//a[@class='menu-font'])[6]")
	public WebElement menuSwitchLocatoinSPD;
	
	@FindBy(xpath="(//a[@class='menu-font'])[9]")
	public WebElement caseQueueLink;
	
 /*Initialization
 */	
	public NurseDashboardPage(WebDriver dr)
	{ 
		driver=dr;
		PageFactory.initElements(driver, this);
	}
		
//	Actions:
 	
//	Profile - Nurse .....................................................................................
//	Click on Profile button method
	public  void clickOnMenuProfile() 
	{
		Actions action = new Actions(driver);
		action.moveToElement(menuUserName).build().perform();
		menuProfile.click();
	}
	
//	Switch Location.........................................................................................
//	Click on Switch location dropdown option - Nurse
	public  void clickOnMenuSwitchLocation() 
	{
		Actions action = new Actions(driver);
		action.moveToElement(menuUserName).build().perform();
		menuSwitchLocatoin.click();
	}
	
//	Click on Switch location dropdown option - HCP
	public  void clickOnMenuSwitchLocationHCP() 
	{
		Actions action = new Actions(driver);
		action.moveToElement(menuUserName).build().perform();
		menuSwitchLocatoinHCP.click();
	}
	
//	Click on Switch location dropdown option - SPD
	public  void clickOnMenuSwitchLocationSPD() 
	{
		Actions action = new Actions(driver);
		action.moveToElement(menuUserName).build().perform();
		menuSwitchLocatoinSPD.click();
	}

//	Logout .........................................................................................................
//	Click on Logout dropdown option 
	public  void clickOnMenuLogout() 
	{
		Actions action = new Actions(driver);
		action.moveToElement(menuUserName).build().perform();
		menuLogout.click();
	}

//	Page title .....................................................................................................
//	Page title return method.
//	Returns @ page title
	public String verifyDashboardPageTitle() 
	{  
		return driver.getTitle();
	}
	
	public void clickOncreateCase()
 	{
 		dashboardCreateCase.click();
 	}
	
	
	//created method to verify visibility all the menu options on NurseDashboardPage:Priyanka:03/06/2021
	public boolean verifyMenuOptionsOnNurseDashboard() {
		menuInProcess.isDisplayed();
		menuOnHold.isDisplayed();
		menuCartReview.isDisplayed();
		menuCreateCase.isDisplayed();
		menuSearchCase.isDisplayed();
		menuOpenCase.isDisplayed();
		menuORtelligence.isDisplayed();
		menuUserName.isDisplayed();
		return menuAlerts.isDisplayed();
	}
	//created method to verify visibility of all the Dasboard options on NurseDashboardPage:Priyanka:03/06/2021
	public boolean verifyDashboardOptionsOnNurseDashboard() {
		
		dashboardInProcess.isDisplayed();
		dashboardOnHold.isDisplayed();
		dashboardCartReview.isDisplayed();
		dashboardCreateCase.isDisplayed();
		dashboardSearchCase.isDisplayed();
		dashboardOpenCase.isDisplayed();
		return dashboardORtelligence.isDisplayed();
	}
	
	//created this method to verify all menu options of HCP Dashboard Page
	//And deleted verifyMenuOptionVisibility testcase and written new testcase ussing AssertTrue
	
	public boolean verifyAllMenuOptions() 
	{
		 menuCreateCase.isDisplayed(); 
	     menuSearchCase.isDisplayed();
	     menuOpenCase.isDisplayed();
	     menuORtelligence.isDisplayed();
	     menuUserName.isDisplayed();
	    return menuAlerts.isDisplayed();
	}
	
	public boolean verifyDashboardOptions() 
	{
		dashboardCreateCaseHCP.isDisplayed();
		dashboardSearchCaseHCP.isDisplayed();
		dashboardOpenCaseHCP.isDisplayed();
		return dashboardORtelligenceHCP.isDisplayed();
		
	}
	
	public OpenCasesPage clickOnOpenCaseLink()
	{
		menuOpenCase.click();
		return new OpenCasesPage();
	}
	
	public OpenCasesPage clickOnCaseQueueLink()
	{
		caseQueueLink.click();
		return new OpenCasesPage();
	}
	
}
