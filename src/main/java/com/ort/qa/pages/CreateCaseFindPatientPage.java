package com.ort.qa.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ort.qa.base.TestBase;


public class CreateCaseFindPatientPage extends TestBase
{


 /*	Mandatory to Use any of the 4 provided options
 *Last Name 
 */
	WebDriver driver;
	CreateCaseAffectedAreaPage createCaseAffectedAreaPage;
	CreateCaseProcedureSelectionPage createCaseProcedureSelectionPage;
	CreateCaseSystemSelectionPage createCaseSystemSelectionPage;
	CreateCaseSetSelectionPage createCaseSetSelectionPage;
	
	
	
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
	
	@FindBy(xpath="//select[@formcontrolname='surgeon']")
	WebElement surgeon;

	
	@FindBy(xpath="//select[@formcontrolname='hasLatexAlergy']")
	WebElement patientAllergy;
	
	@FindBy(xpath="//select[@formcontrolname='urgency']")
	WebElement urgency;
	
	@FindBy(xpath="//select[@id='specialtyId']")
	WebElement speciaity;
	
	@FindBy(xpath="//button[text()='Next']")
	WebElement next;
	
	@FindBy(xpath="//textarea[@id='notesbydoctor']")
	WebElement notes;
	
	@FindBy(xpath="//input[@id='selectProcedure']")
	 WebElement procedure;
	
	@FindBy(xpath="//select[@id='preferenceCard']")
	WebElement preferenceCard;
	
	@FindBy(xpath="//button[text()='Quick Pick']")
	WebElement quickPick;
	
	@FindBy(xpath="//select[@formcontrolname='anestesiaRequests']")
	WebElement anestesiaRequests;
	
	@FindBy(xpath="//textarea[@formcontrolname='medications']")
	WebElement medications;
	
	@FindBy(xpath="//select[@formcontrolname='positionSide']")
	WebElement positionSide;
	
	@FindBy(xpath="//select[@formcontrolname='positionSide']")
	WebElement systemPosition;
	
	
	@FindBy(xpath="//textarea[@formcontrolname='positioning_information']")
	WebElement positioningInformation;
	
	@FindBy(xpath="//textarea[@formcontrolname='instructions']")
	WebElement instructions;
	
 /*Initialization	
 */
	
	public CreateCaseFindPatientPage(WebDriver dr) 
	{	
		driver=dr;
		PageFactory.initElements(driver, this);
		 createCaseAffectedAreaPage= new CreateCaseAffectedAreaPage();
		 createCaseProcedureSelectionPage= new CreateCaseProcedureSelectionPage();
			createCaseSystemSelectionPage= new CreateCaseSystemSelectionPage();
			createCaseSetSelectionPage= new CreateCaseSetSelectionPage();
	}	

 /*	User needs to Select the Patient from the list of Patients
 *	page ignition is also present
 */
	
 /*Actions : 
 */

	
/*	public void createCaseFindPatientData(String lastName, String firstName, String mNR) 
	{
						
		patientLastName.sendKeys(lastName);
		patientFirstName.sendKeys(firstName);
		patientMRN.sendKeys(mNR);
		search.click();
	    
		selectPatient.click();
		
	}*/
	
	

	
/*	public void createCaseFindPatientLongFlowData(String lastName, String firstName, String mNR,String sname, String urgencyName, String patientAlllergy,String speciality, String notesBySurgeon) throws InterruptedException 
	{
		patientLastName.sendKeys(lastName);
		Thread.sleep(2000);
		patientFirstName.sendKeys(firstName);
		Thread.sleep(2000);
		patientMRN.sendKeys(mNR);
		Thread.sleep(2000);
        search.click();
        Thread.sleep(2000);
		selectPatient.click();
		Thread.sleep(2000);
		surgeon.sendKeys(sname);
		Thread.sleep(2000);
		urgency.sendKeys(urgencyName);
		Thread.sleep(2000);
		patientAllergy.sendKeys(patientAlllergy);
		Thread.sleep(3000);
		speciaity.sendKeys(speciality);
		Thread.sleep(3000);
		notes.sendKeys(notesBySurgeon);
        next.click();
       
     
	}*/
	
	
	public void createCaseFindPatientLongFlowData(String lastName, String firstName, String mNR,String sname, String urgencyName, String patientAlllergy,String speciality, 
			String notesBySurgeon, String AnasthesiaRequest, String Medications, String Side, String Position, String PositioningComments, String Instructions) throws InterruptedException 
	{
		patientLastName.sendKeys(lastName);
		Thread.sleep(2000);
		patientFirstName.sendKeys(firstName);
		Thread.sleep(2000);
		patientMRN.sendKeys(mNR);
		Thread.sleep(2000);
        search.click();
        Thread.sleep(2000);
		selectPatient.click();
		Thread.sleep(2000);
		surgeon.sendKeys(sname);
		Thread.sleep(2000);
		urgency.sendKeys(urgencyName);
		Thread.sleep(2000);
		patientAllergy.sendKeys(patientAlllergy);
		Thread.sleep(3000);
		speciaity.sendKeys(speciality);
		Thread.sleep(3000);
		notes.sendKeys(notesBySurgeon);
		Thread.sleep(3000);
        next.click();
        Thread.sleep(3000);
        createCaseAffectedAreaPage.clickOnhip();
        Thread.sleep(3000);
        createCaseProcedureSelectionPage.selectProcedure2.click();
		 Thread.sleep(3000);
		 createCaseSystemSelectionPage.createCaseSystemSelectionOption1();
		 Thread.sleep(3000);	 
		 createCaseSystemSelectionPage.clickOnSelectButton.click();
		 Thread.sleep(1000);
		 createCaseSystemSelectionPage.proceedToCart.click();
		 Thread.sleep(1000);
		 createCaseSetSelectionPage.createCaseOpenQuantity(); 
		 Thread.sleep(1000);
		 anestesiaRequests.sendKeys(AnasthesiaRequest);
		 Thread.sleep(1000);
		 medications.sendKeys(Medications);
		 Thread.sleep(1000);
		 positionSide.sendKeys(Side);
		 Thread.sleep(1000);
		 systemPosition.sendKeys(Position);
		 Thread.sleep(1000);
		 positioningInformation.sendKeys(PositioningComments);
		 Thread.sleep(1000);
		 instructions.sendKeys(Instructions);
	}
	

	
	
	public void createCaseProcedureSelectionFlowData(String lastName, String firstName, String mNR,String surgeonName, String urgencyName, String patientAlllergy,String speciality, String procedureSelection) throws InterruptedException 
	{
		patientLastName.sendKeys(lastName);
		Thread.sleep(2000);
		patientFirstName.sendKeys(firstName);
		Thread.sleep(2000);
		patientMRN.sendKeys(mNR);
		Thread.sleep(2000);
        search.click();
        Thread.sleep(2000);
		selectPatient.click();
		Thread.sleep(2000);
		surgeon.sendKeys(surgeonName);
		Thread.sleep(2000);
		urgency.sendKeys(urgencyName);
		Thread.sleep(2000);
		patientAllergy.sendKeys(patientAlllergy);
		Thread.sleep(3000);
		speciaity.sendKeys(speciality);
		Thread.sleep(3000);
		
		procedure.sendKeys(procedureSelection);
		Thread.sleep(3000);
		procedure.sendKeys(Keys.EQUALS);
		Thread.sleep(3000);
	   // procedure.click();
		procedure.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		 next.click();
       	
	}
	

	public void createCasePreferenceCardData(String lastName, String firstName, String mNR,String sname, String urgencyName, String patientAlllergy,String speciality,  String preferenceCardflow) throws InterruptedException 
	{
		patientLastName.sendKeys(lastName);
		Thread.sleep(2000);
		patientFirstName.sendKeys(firstName);
		Thread.sleep(2000);
		patientMRN.sendKeys(mNR);
		Thread.sleep(2000);
        search.click();
        Thread.sleep(2000);
		selectPatient.click();
		Thread.sleep(2000);
		surgeon.sendKeys(sname);
		Thread.sleep(2000);
		urgency.sendKeys(urgencyName);
		Thread.sleep(2000);
		patientAllergy.sendKeys(patientAlllergy);
		Thread.sleep(3000);
		speciaity.sendKeys(speciality);
		Thread.sleep(3000);
		preferenceCard.sendKeys(preferenceCardflow);
		quickPick.click();
	
		
	}

	
	public void clickSearchButton() {
		search.click();
	}
	

	public void createCaseSelectPatientButton() {
		JavascriptExecutor jse = (JavascriptExecutor)driver;
	
		jse.executeScript("arguments[0].click()", selectPatient);
		jse.executeScript("arguments[0].click()", search);
	
	}
	
	
	//Below method is to select the checkbox if it is not selected already
	public void selectTheCheckbox(WebElement element) {
		try {
            if (element.isSelected()) {
               System.out.println("Checkbox: " + element + "is already selected");
            } else {
            	// Select the checkbox
                element.click();
            }
        } catch (Exception e) {
        	System.out.println("Unable to select the checkbox: " + element);
        }
		
	}
	
	//Below method is to De-select the checkbox if it is already selected
	public void deSelectTheCheckbox(WebElement element) {
		try {
            if (element.isSelected()) {
            	//De-select the checkbox
                element.click();
            } else {
            	System.out.println("Checkbox: "+element+"is already deselected");
            }
        } catch (Exception e) {
        	System.out.println("Unable to deselect checkbox: "+element);
        }
		}
	
	
	
}
