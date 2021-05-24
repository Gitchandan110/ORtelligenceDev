package com.ort.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ort.qa.base.TestBase;

public class SearchPatientPage extends TestBase
{
	
//	Mandatory to use any on of the 5 provided options (Other than Specialty) to continue flow. 
	 
//	Last Name 
	@FindBy(xpath="//input[@id='lastName']")
	WebElement patientLastName;
		
//	First Name
	@FindBy(xpath="//input[@id='firstName']")
	WebElement patientFirstName;

//	Date of Birth text field	
	@FindBy(xpath="//input[@id='dob']")
	WebElement patientDOB;

//	Date of Birth Calendar icon
	@FindBy(xpath="//span[@class='date-picker-icon']")
	WebElement patientDOBIcon;
		
//	MRN# Number	
	@FindBy(xpath="//input[@id='mrn']")
	WebElement patientMRN;	

//	Speciality
	@FindBy(xpath="//select[@id='specialtyId']")
	WebElement speciality;
	
//	Case Number	
	@FindBy(xpath="//input[@id='caseId']")
	WebElement caseNumber;
	
//	Search button	
	@FindBy(xpath="//button[text()='Search']")
	WebElement searchPatient;

//	Actions:
//	Initialization
	public SearchPatientPage() 
	{
		PageFactory.initElements(driver, this);
	}
	
/*	Search patient method 
*	Parameters 
*	String lastName
*	String firstName
*	String dOB
*	String mNR
*	String specialityOption
*	String caseNumberText
*/	
	public void SearchPatient(String lastName, String firstName, String dOB, String mNR ,String specialityOption, String caseNumberText)
	{
		patientLastName.sendKeys(lastName);
		patientFirstName.sendKeys(firstName);
		patientDOB.sendKeys(dOB);
		patientMRN.sendKeys(mNR);
		speciality.sendKeys(specialityOption);
		caseNumber.sendKeys(caseNumberText);
		searchPatient.click();
			
	}
	
	
}
