package com.ort.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ort.qa.base.TestBase;

public class NurseDashboardPage extends TestBase
{

 /*	Dashboard
 * In Process
 */
	
	@FindBy(xpath="(//div[@class='rcorners3 border border-primary flexchild pointer-div'])[1]")
	WebElement dashboardInProcess;   
	
 /* On Hold
 */
	
	@FindBy(xpath="(//div[@class='rcorners3 border border-primary flexchild pointer-div'])[2]")
	WebElement dashboardOnHold;   
	
 /*	Cart Review
 */
	
	@FindBy(xpath="(//div[@class='rcorners3 border border-primary flexchild pointer-div'])[3]")
	WebElement dashboardCartReview;   
	
 /*	Create Case
 */
	
	@FindBy(xpath="(//div[@class='rcorners3 border border-primary flexchild pointer-div'])[4]")
	public WebElement dashboardCreateCase;   
	
 /*	Search Case
 */
	
	@FindBy(xpath="(//div[@class='rcorners3 border border-primary flexchild pointer-div'])[5]")
	WebElement dashboardSearchCase;   
	
 /* Open Case
 */
	
	@FindBy(xpath="(//div[@class='rcorners3 border border-primary flexchild pointer-div'])[6]")
	WebElement dashboardOpenCase;   
	
 /*	ORtelligence
 */
	
	@FindBy(xpath="(//div[@class='rcorners3 border border-primary flexchild pointer-div'])[7]")
	WebElement dashboardORtelligence;   
	
 /*	Menu Bar 
 * In Process 
 */
	
	@FindBy(xpath="(//a[text()='In-Process'])[1]")
	WebElement menuInProcess;   
	
 /*On Hold
 */
	
	@FindBy(xpath="(//a[text()='On-Hold'])[1]")
	WebElement menuOnHold;   
	
 /*	Cart Review
 */
	
	@FindBy(xpath="(//a[text()='Cart Review'])[1]")
	WebElement menuCartReview;   

 /*	Create Case
 */
	
	@FindBy(xpath="(//a[text()='Create Case'])[1]")
	WebElement menuCreateCase;   
	
 /*	Search Case
 */
	
	@FindBy(xpath="(//a[text()='Search Cases'])[1]")
	WebElement menuSearchCase;  
	
 /*	Open Case
 */
	
	@FindBy(xpath="(//a[text()='Open Cases'])[1]")
	WebElement menuOpenCase;   
	

 /*	ORtelligence
*/

	
	@FindBy(xpath="(//a[text()='ORtelligence'])[1]")
	WebElement menuORtelligence;   
	
 /*	User Name
 */
	
	@FindBy(xpath="//li[@class='dropdown user-menu pl-sm-0']")
	WebElement menuUserName;   
	
 /*	Profile
 */
	
	@FindBy(xpath="(//a[@class='menu-font'])[7]")
	WebElement menuProfile;   
	
 /*Switch Location
 */
	
	@FindBy(xpath="(//a[@class='menu-font'])[8]")
	WebElement menuSwitchLocatoin;   
	
 /*Logout
 */
	
	@FindBy(xpath="(//a[@class='menu-font'])[9]")
	WebElement menuLogout;

 /*	Alerts 
 */
	
	@FindBy(xpath="((//a[text()='Alerts '])[1]")
	WebElement menuAlerts;
	
 /*Initialization
 */
	
	public NurseDashboardPage()
	{ 
		
		PageFactory.initElements(driver, this);
	}
		
 /*	Actions:
 */
	
	public void NurseDashboard()
	{
		dashboardInProcess.click();
		dashboardOnHold.click();
		dashboardCartReview.click();
		dashboardCreateCase.click();
		dashboardSearchCase.click();
		dashboardOpenCase.click();
		dashboardORtelligence.click();
		menuInProcess.click();
		menuOnHold.click();
		menuCartReview.click();
		menuCreateCase.click();
		menuSearchCase.click();
		menuOpenCase.click();
		menuORtelligence.click();
		menuAlerts.click();
	}
		
	public  void clickOnMenuProfile() 
	{
		Actions action = new Actions(driver);
		action.moveToElement(menuUserName).build().perform();
		menuProfile.click();
		
	}
	
	public  void clickOnMenuSwitchLocation() 
	{
		Actions action = new Actions(driver);
		action.moveToElement(menuUserName).build().perform();
		menuSwitchLocatoin.click();
			
	}
	
	public  void clickOnMenuLogout() 
	{
		Actions action = new Actions(driver);
		action.moveToElement(menuUserName).build().perform();
		menuLogout.click();
		}

	public String verifyNurseDashboardPageTitle() {  
		return driver.getTitle();
		
	}
	
	public void createCaseTest() {
		
	}

}
