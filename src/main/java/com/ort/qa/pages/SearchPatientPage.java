/* Modified by Piyush Sadawarti on 24/05/2021
 * Modified by Piyush Sadawarti on 25/05/2021 - Added testDataString, testDataNumeric.
 * Modified by Piyush Sadawarti on 26/05/2021 - Added conditions to avoid empty cell data.
 * Modified by Piyush Sadawarti on 27/05/2021 - Removed testDataString, testDataNumeric. They are now in ExcelDataUtility.java
 * Modified by Piyush Sadawarti on 27/05/2021 - Added conditions for Specialty and DOB.
 * Modified by Piyush Sadawarti on 27/05/2021 - Added multiple search patient method. 
 * Modified by Piyush Sadawarti on 28/05/2021 - Added select patient after search, pop up repository and actions.
 * 
 * 
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
import com.ort.qa.util.DropDownHandler;
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
	
//	Spine 
	@FindBy(xpath="//option[text()=' Spine']")
	public WebElement specialitySpine;
	
//	Arthroplasty
	@FindBy(xpath="//option[text()=' Arthroplasty']")
	public WebElement specialityArthroplasty;
	
//	Trauma
	@FindBy(xpath="//option[text()=' Trauma']")
	public WebElement specialityTrauma;
	
//	Sports
	@FindBy(xpath="//option[text()=' Sports']")
	public WebElement specialitySports;
	
//	Case Number	
	@FindBy(xpath="//input[@id='caseId']")
	public WebElement caseNumber;
	
//	Search button	
	@FindBy(xpath="//button[text()='Search']")
	public WebElement searchPatient;
	
//	(multiple Cases, we need to click on the specific Case)
//	Case - Select case in Data Table
	@FindBy(xpath="(//a[@class='a-pointer'])[1]")
	public WebElement selectCase;
	
//	Actions:
//	Initialization
	public SearchPatientPage() 
	{
		PageFactory.initElements(driver, this);
	}
	
//	Click on Case number
	public void SearchPatientClickOnCaseNumber() throws InterruptedException
	{
		selectCase.click();
		Thread.sleep(2000);
	}
	
//	Confirmation pop-up
//	Close icon
	@FindBy(xpath="//div[@class='modal-content'] //button[@class='close']")
	public WebElement confirmationPopupClose;
	
//	Procedure details
	@FindBy(xpath="//button[text()='Procedure Details']")
	public WebElement confirmationPopupProcedureDetails;
	
//	Cart Details
	@FindBy(xpath="//button[text()='Cart Details']")
	public WebElement confirmationPopupCartDetails;
	
	
//	Method to deselect all Specialty. They are all by default selected.
	public void deselectSpecialty()
	{
		specialitySpine.click();
		specialityArthroplasty.click();
		specialityTrauma.click();
		specialitySports.click();
	}
	
/*	........................................................................................................................
 * 	........................................................................................................................
 */
	
/*	Method SearchPatientData - Specific patient
 * 	Parameter @ int x - will be used as row of excel sheet
 * String sheetname
 * int row
 * int colLastName
 * int colFirstname
 * int colMNR
 * int colCase
 * int colDOB
 * int colSpecialyt
 * 
 */
	public void SearchPatientData(
			String sheetName, 
			int row,
			int colLastName,
			int colFirstname,
			int colMNR,
			int colCase,
			int colDOB,
			int colSpecialyt)
							throws IOException, InterruptedException
	{
		
/*		Sheet name will be fetched from the parameter of SearchPatientData method.
 * 		Sheet name will be passed as parameter of testDataString and testDataNumeric methods.
 *		Declare column number for each element, to be used in cell data fetching method.  
 */
				
//		Compare the String values of data fetched from the Excel sheet to a String noData that is equal to 0.
		String noData = "0";		
		Thread.sleep(2000);
		
//		Use of if-else condition to compare String data with noData. This allows us to bypass empty data cells in Excel  sheet.

//		Patient Last Name
		String patientLastNameText = ExcelDataUtility.testDataString(sheetName, row, colLastName);
//		Patient Last Name
		if (patientLastNameText.equals(noData))
			{
				System.out.println("Patient's Last Name is: "+patientLastNameText);
			}
		else
		{
			System.out.println("Patient's Last Name is: "+patientLastNameText);
			patientLastName.sendKeys(patientLastNameText);
		}

//		Patient First Name
		String patientFirstNameText = ExcelDataUtility.testDataString(sheetName, row, colFirstname);
//		Patient First Name
		if (patientFirstNameText.equals(noData))
		{
			System.out.println("Patient's First Name is: "+patientFirstNameText);
		}
		else
		{
			System.out.println("Patient's First Name is: "+patientFirstNameText);
			patientFirstName.sendKeys(patientFirstNameText);
		}
		
//		Patient MNR number
		String patientMNRText = ExcelDataUtility.testDataNumeric(sheetName, row, colMNR);
//		Patient MNR Number
		if (patientMNRText.equals(noData))
		{
			System.out.println("Patient's MNR number is: "+patientMNRText);
		}
		else
		{
			System.out.println("Patient's MNR number is: "+patientMNRText);
			patientMRN.sendKeys(patientMNRText);
		}
		
//		Case Number
		String caseNumberText = ExcelDataUtility.testDataNumeric(sheetName, row, colCase);
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
	
//		Patient DOB
		String patientDOBText = ExcelDataUtility.testDataNumeric(sheetName, row, colDOB);
//		Patient DOB
		if (patientDOBText.equals(noData))
		{
			System.out.println("Patient's Date of Birth is: "+patientDOBText);
		}
		else
		{
			System.out.println("Patient's Date of Birth is: "+patientDOBText);
			patientDOB.sendKeys(patientDOBText);
		}

//		Specialty selection
//		String objects to compare text with cell data.
//		Spine
		String specialitySpine1 = "Spine";
		String specialitySpine2 = "spine";
//		Arthroplasty
		String specialityArthroplasty1 = "Arthroplasty";
		String specialityArthroplasty2 = "arthroplasty";
//		Trauma
		String specialityTrauma1 = "Trauma";
		String specialityTrauma2 = "trauma";
//		Sports
		String specialitySports1 = "Sports";
		String specialitySports2 = "sports";
		
//		Case Speciality
		String specialityOptionText = ExcelDataUtility.testDataString(sheetName, row, colSpecialyt);
		if (specialityOptionText.equals(noData))
		{
			System.out.println("Speciality is: "+specialityOptionText);
		}
//		Spine
		else if (specialityOptionText.equals(specialitySpine1) || specialityOptionText.equals(specialitySpine2) ) 
		{
			deselectSpecialty();
			System.out.println("Speciality is: "+specialityOptionText);
			specialitySpine.click();
		}
//		Arthroplasty
		else if (specialityOptionText.equals(specialityArthroplasty1) || specialityOptionText.equals(specialityArthroplasty2) ) 
		{
			deselectSpecialty();
			System.out.println("Speciality is: "+specialityOptionText);
			specialityArthroplasty.click();
		}
//		Trauma
		else if (specialityOptionText.equals(specialityTrauma1) || specialityOptionText.equals(specialityTrauma2) ) 
		{
			deselectSpecialty();
			System.out.println("Speciality is: "+specialityOptionText);
			specialityTrauma.click();
		}
//		Sports
		else if (specialityOptionText.equals(specialitySports1) || specialityOptionText.equals(specialitySports2) ) 
		{
			deselectSpecialty();
			System.out.println("Speciality is: "+specialityOptionText);
			specialitySports.click();
		}
		
		Thread.sleep(2000);
//		Click on Search button
		searchPatient.click();
	}
/*	.............................................................................................................................	
 *	.............................................................................................................................
 */	
	
	/*	Method SearchPatientData - loop
	 * 	Parameter @ int x - will be used as row of excel sheet
	 * String sheetname
	 * int row
	 * int colLastName
	 * int colFirstname
	 * int colMNR
	 * int colCase
	 * int colDOB
	 * int colSpecialyt
	 * 
	 */
	public void SearchPatientDataAll(
				String sheetName, 
				int colLastName,
				int colFirstname,
				int colMNR,
				int colCase,
				int colDOB,
				int colSpecialyt)
								throws IOException, InterruptedException
		
	{
		
//		Row count using getRowCount method.
		int rowCount = ExcelDataUtility.getRowCount(sheetName);
//		Column count using getColCount method.
		int colCount = ExcelDataUtility.getColCount(sheetName);

		for ( int x = 0; x < rowCount; x++ )
		{
			SearchPatientData(sheetName, x, colLastName, colFirstname, colMNR, colCase, colDOB, colSpecialyt);
		}
		
	}

	
	
	
/*	.......................................................................................................................
 * 	.......................................................................................................................
 */	
	public void SearchPatient()
	{
		patientLastName.click();
		patientFirstName.click();
		patientDOB.click();
		patientMRN.click();
		caseNumber.click();
		searchPatient.click();
		selectCase.click();
		confirmationPopupClose.click();
		confirmationPopupProcedureDetails.click();
		confirmationPopupCartDetails.click();
		
	}
	
}
