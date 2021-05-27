/* Modified by Piyush Sadawarti on 24/05/2021
 * Modified by Piyush Sadawarti on 25/05/2021 - Added testDataString, testDataNumeric.
 * Modified by Piyush Sadawarti on 26/05/2021 - Added conditions to avoid empty cell data.
 * Modified by Piyush Sadawarti on 25/05/2021 - Removed testDataString, testDataNumeric. They are now in ExcelDataUtility.java
 *
 */

package com.ort.qa.pages;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ort.qa.base.TestBase;
import com.ort.qa.util.ExcelDataUtility;
import com.ort.qa.util.ExcelUtility;

public class SearchPatientPage extends TestBase
{
	
//	Mandatory to use any on of the 5 provided options (Other than Specialty) to continue flow. 
	 
//	Last Name 
	@FindBy(xpath="//input[@id='lastName']")
	public WebElement patientLastName;
		
//	First Name
	@FindBy(xpath="//input[@id='firstName']")
	public WebElement patientFirstName;

//	Date of Birth text field	
	@FindBy(xpath="//input[@id='dob']")
	public WebElement patientDOB;

//	Date of Birth Calendar icon
	@FindBy(xpath="//span[@class='date-picker-icon']")
	public WebElement patientDOBIcon;
		
//	MRN# Number	
	@FindBy(xpath="//input[@id='mrn']")
	public WebElement patientMRN;	

//	Speciality
	@FindBy(xpath="//select[@id='specialtyId']")
	public WebElement speciality;
	
//	Case Number	
	@FindBy(xpath="//input[@id='caseId']")
	public WebElement caseNumber;
	
//	Search button	
	@FindBy(xpath="//button[text()='Search']")
	public WebElement searchPatient;

//	Actions:
//	Initialization
	public SearchPatientPage() 
	{
		PageFactory.initElements(driver, this);
	}
	
/*	Method SearchPatientData
 * 	Parameter int x - will be used as row of excel sheet
 */
	public void SearchPatientData(int x) throws IOException, InterruptedException
	{
		
//		Compare the String values of data fetched from the Excel sheet to a String noData that is equal to 0.
		String noData = "0";		
		Thread.sleep(2000);
		
//		Use of if-else condition to compare String data with noData. This allows us to bypass empty data cells in Excel  sheet.
//		Patient Last Name
		String patientLastNameText = ExcelDataUtility.testDataString("SearchPatient", x, 0); 
//		Patient Last Name
		if (patientLastNameText.equals(noData))
			{
				System.out.println("Patient Last Name is: "+patientLastNameText);
			}
		else
		{
			System.out.println("Patient Last Name is: "+patientLastNameText);
			patientLastName.sendKeys(patientLastNameText);
		}

//		Patient First Name
		String patientFirstNameText = ExcelDataUtility.testDataString("SearchPatient", x, 1);
//		Patient First Name
		if (patientFirstNameText.equals(noData))
		{
			System.out.println("Patient First Name is: "+patientFirstNameText);
		}
		else
		{
			System.out.println("Patient First Name is: "+patientFirstNameText);
			patientFirstName.sendKeys(patientFirstNameText);
		}
		
//		Patient MNR number
		String patientMNRText = ExcelDataUtility.testDataNumeric("SearchPatient", x, 2);
//		Patient MNR Number
		if (patientMNRText.equals(noData))
		{
			System.out.println("MNR number is: "+patientMNRText);
		}
		else
		{
			System.out.println("MNR number is: "+patientMNRText);
			patientMRN.sendKeys(patientMNRText);
		}
		
//		Case Number
		String caseNumberText = ExcelDataUtility.testDataNumeric("SearchPatient", x, 3);
//		Case Number
		if (caseNumberText.equals(noData))
		{
			System.out.println("Case number is: "+caseNumberText);
		}
		else
		{
			System.out.println("Case number is: "+caseNumberText);
			caseNumber.sendKeys(caseNumberText);
		}
	
////	Patient DOB
//	String patientDOBText = testDataString("SearchPatient", 1, 4);
//	patientDOB.sendKeys(patientDOBText);
		
////		Case Speciality
//		String specialityOptionText = testDataNumeric("SearchPatient", 1, 5);
//		speciality.sendKeys(specialityOptionText);

		Thread.sleep(2000);
//		Click on Search button
		searchPatient.click();
	}
	
	public void SearchPatient()
	{
		patientLastName.click();
		patientFirstName.click();
		patientDOB.click();
		patientMRN.click();
		caseNumber.click();
		searchPatient.click();
	}
	
}
