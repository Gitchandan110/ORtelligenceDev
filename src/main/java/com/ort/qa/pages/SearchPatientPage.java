package com.ort.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ort.qa.base.TestBase;

public class SearchPatientPage extends TestBase
{
	/*	
*	We have to use Page Factory-Object Repository
*	Here we will segregate all locators using @FindBy annotation
*	Mandatory to Use any of the 4 provided options
*	Use the elements of CreateCaseFindPatientPage
*	Remaining elements are present below
*	Specialty
	 */
	@FindBy(xpath="//select[@id='specialtyId']")
	WebElement speciality;
	
	/*	Case Number	
		 */
	
	@FindBy(xpath="//input[@id='caseId']")
	WebElement caseNumber;

	/*Initialization
	 */
	public SearchPatientPage() 
	{
		PageFactory.initElements(driver, this);
	}
	
	public void SearchPatient(String specialityOption, String caseNumberText)
	{
		speciality.sendKeys(specialityOption);
		caseNumber.sendKeys(caseNumberText);
			
	}
	
	
}
