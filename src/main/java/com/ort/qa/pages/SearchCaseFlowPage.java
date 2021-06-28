package com.ort.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ort.qa.base.TestBase;
import com.ort.qa.util.RepositoryPages;

public class SearchCaseFlowPage extends RepositoryPages{
	
	@FindBy(name="username")
	WebElement username;

	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath="//*[@id=\"page-ui-container\"]/div/div/div/div[2]/div[1]/div/form/div[3]/button")  
	WebElement signUpBtn;
	
	@FindBy(xpath="//select[@name='locationId']")
	WebElement facilityDropdown;
	
	@FindBy(xpath="//button[text()='Confirm']")
	WebElement confirm;	
	
	@FindBy(xpath="//li[@class='dropdown user-menu pl-sm-0']")
	public WebElement menuUserName; 
	
	@FindBy(xpath="(//a[text()='Logout'])[1]")
	public WebElement menuLogout;
	
	@FindBy(xpath="(//a[text()='Search Cases'])[1]")
	public WebElement searchCaseLink;
	
	
	@FindBy(xpath="//input[@id='lastName']")
	WebElement patientLastName;
	
	@FindBy(xpath="//input[@id='firstName']")
	WebElement patientFirstName;
	
	@FindBy(xpath="//input[@id='mrn']")
	WebElement patientMRN;
	
	//@FindBy(xpath="//button[text()='Search']")
	//WebElement search;
	
	@FindBy(xpath="//select[@id='specialtyId']")
	public WebElement specialitySelection;
	
	@FindBy(xpath="//input[@id='caseId']")
	public WebElement caseNumbers;
	
	@FindBy(xpath="//select[@id='facilityName']")
	public WebElement facilityName;
	
	@FindBy(xpath="//Button[contains(text(),'Ok')]")
	public WebElement okButton;
	
	
	
public  SearchCaseFlowPage(WebDriver dr)
	
	{
		driver=dr;
		PageFactory.initElements(driver, this);  
	}
	
public void userSearchCase(String Status, String userRoleLoginId, String userRolePassword, String facilitySelection,String lastName, String firstName, String MRN, String speciality, String caseNumber) throws InterruptedException 
{
	username.sendKeys(userRoleLoginId);
	Thread.sleep(2000);
	
	password.sendKeys(userRolePassword);
	Thread.sleep(2000);
	
	signUpBtn.click();
	Thread.sleep(2000);
	
	facilityDropdown.sendKeys(facilitySelection);
	Thread.sleep(2000);
	
	confirm.click();
	Thread.sleep(2000);
	
	searchCaseLink.click();
	Thread.sleep(2000);
	
	patientLastName.sendKeys(lastName);
	Thread.sleep(2000);
	
	patientFirstName.sendKeys(firstName);
	Thread.sleep(2000);
	
	patientMRN.sendKeys(MRN);
	Thread.sleep(2000);
	
	specialitySelection.sendKeys(speciality);
	Thread.sleep(2000);
	
	//caseNumbers.sendKeys(caseNumber);
	//Thread.sleep(2000);
	
	
	search.click();
	//facilityName.sendKeys(facility);
	//Thread.sleep(2000);
	
	
}


//Click on the case number link
	public void clickOnCaseNumberLink()
	{
		caseNumberLink.click();
	}
	
	
	//click on the Procedure Details Button on Confirmation Popup
	public void clickOnProcedureDetails()
	{
		procedureDetailsButton.click();
	}
	
	//clcick on the Cart Details Button on the confirmation PopUp
	public void clickOnCartDetails()
	{
		cartDetailsButton.click();
	}
	
	//Click on the back Button on View Cases Page After clicking on Procedure Details Button 
	public void clickOnBackButton() throws InterruptedException
	{
		Thread.sleep(2000);
		backButton.click();
	}
	
	//click on Update Button on create Cart Page After clicking on Cart Details Button
	public void clickOnUpdateButton() throws InterruptedException
	{
		Thread.sleep(2000);
		updateButton.click();
	}
	

	










}

