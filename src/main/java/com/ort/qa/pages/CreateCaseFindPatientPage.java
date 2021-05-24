package com.ort.qa.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ort.qa.base.TestBase;
import com.ort.qa.util.DropDownHandler;

public class CreateCaseFindPatientPage extends TestBase
{


 /*	Mandatory to Use any of the 4 provided options
 *Last Name 
 */
	WebDriver driver;

	@FindBy(xpath="//input[@id='lastName']")
	WebElement patientLastName;
	
 /*	First Name
 */
	
	@FindBy(xpath="//input[@id='firstName']")
	WebElement patientFirstName;

 /*	Date of Birth text field	
 */
	
	@FindBy(xpath="//input[@id='dob']")
	WebElement patientDOB;

 /*	Date of Birth Calendar icon
 */ 
	
	@FindBy(xpath="//span[@class='date-picker-icon']")
	WebElement patientDOBIcon;
	
 /*	MRN# Number	
 */
	
	@FindBy(xpath="//input[@id='mrn']")
	WebElement patientMRN;
	
 /*Search button	
 */
	
	@FindBy(xpath="//button[text()='Search']")
	WebElement search;
	
 /*	Select Patient
 */
	
	@FindBy(xpath="//button[@name='Select']")
	WebElement selectPatient;
	
	

 /*Initialization	
 */
	
	public CreateCaseFindPatientPage(WebDriver dr) 
	{	
		driver=dr;
		PageFactory.initElements(driver, this);
	}	

 /*	User needs to Select the Patient from the list of Patients
 *	page ignition is also present
 */
	
 /*Actions : 
 */

	
	public void createCaseFindPatientData(String lastName, String firstName, String mNR) 
	{
						
		patientLastName.sendKeys(lastName);
		patientFirstName.sendKeys(firstName);
		patientMRN.sendKeys(mNR);
		search.click();
		
	}
	
	
	
	
	public void clickSearchButton() {
		search.click();
	}
	
	
	public void createCaseSelectPatientButton()
	{
		selectPatient.click();
			
	}
	
	
}
