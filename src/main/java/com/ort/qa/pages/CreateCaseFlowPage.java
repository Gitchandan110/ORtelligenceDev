package com.ort.qa.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.PageFactory;


import com.ort.qa.util.RepositoryPages;


public class CreateCaseFlowPage extends RepositoryPages
{


 /*	Mandatory to Use any of the 4 provided options
 *Last Name 
 */
	WebDriver driver;
	CreateCaseAffectedAreaPage createCaseAffectedAreaPage;
	CreateCaseProcedureSelectionPage createCaseProcedureSelectionPage;
	CreateCaseSystemSelectionPage createCaseSystemSelectionPage;
	CreateCaseSetSelectionPage createCaseSetSelectionPage;
	
	
	
	
 /*Initialization	
 */
	
	public CreateCaseFlowPage(WebDriver dr) 
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

	
/*	public void createCaseSearchPatientData(String lastName, String firstName, String mNR) 
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
	
	
	public void createCaseFindPatientLongFlowData(String Status,String lastName, String firstName, String mNR,String sname, String urgencyName, String patientAlllergy,String speciality, 
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
	

	
	
	public void createCaseProcedureSelectionFlowData(String Status, String lastName, String firstName, String mNR,String surgeonName, String urgencyName, String patientAlllergy,String speciality, String procedureSelection,
			String AnasthesiaRequest, String Medications, String Side, String Position, String PositioningComments, String Instructions ) throws InterruptedException 
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
		Thread.sleep(3000);
		surgeon.sendKeys(surgeonName);
		Thread.sleep(3000);
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
			Thread.sleep(3000);
		// createCaseProcedureSelectionPage.selectProcedure2.click();
		// Thread.sleep(3000);
		 createCaseSystemSelectionPage.createCaseSystemSelectionOption1();
		 Thread.sleep(3000);	 
		 createCaseSystemSelectionPage.clickOnSelectButton.click();
		 Thread.sleep(1000);
		 createCaseSystemSelectionPage.proceedToCart.click();
		 Thread.sleep(1000);
		 createCaseSetSelectionPage.createCaseSetSelectioncheckbox();
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
	

	public void createCasePreferenceCardData(String Status, String lastName, String firstName, String MNR,String SurgeonName, String UrgencyName, String patientAlllergy,String Speciality,String PhysicianAssistant, String NotesBySurgeon, String PreferenceCardSelection,
			String AnesthesiaRequest, String Medications,  String  Side, String Position,   String PositioningComments, String Instructions) throws InterruptedException 
	{
		patientLastName.sendKeys(lastName);
		Thread.sleep(2000);
		patientFirstName.sendKeys(firstName);
		Thread.sleep(2000);
		patientMRN.sendKeys(MNR);
		Thread.sleep(2000);
        search.click();
        Thread.sleep(2000);
		selectPatient.click();
		Thread.sleep(2000);
		surgeon.sendKeys(SurgeonName);
		Thread.sleep(2000);
		urgency.sendKeys(UrgencyName);
		Thread.sleep(2000);
		patientAllergy.sendKeys(patientAlllergy);
		Thread.sleep(3000);
		speciaity.sendKeys(Speciality);
		Thread.sleep(3000);
		physicianAssistant.sendKeys(PhysicianAssistant);
		Thread.sleep(3000);
		notes.sendKeys(NotesBySurgeon);
		Thread.sleep(3000);
		preferenceCard.sendKeys(PreferenceCardSelection);
		Thread.sleep(3000);
		quickPick.click();
		 Thread.sleep(1000);
	    createCaseSetSelectionPage.createCaseCptCodeBox();
		 Thread.sleep(1000);
	     createCaseSystemSelectionPage.proceedToCart.click();
		 Thread.sleep(1000);
		 createCaseSetSelectionPage.createCaseSetSelectioncheckbox();
		 Thread.sleep(1000);
		 createCaseSetSelectionPage.createCaseOpenQuantity(); 
		 Thread.sleep(1000);
		 anestesiaRequests.sendKeys(AnesthesiaRequest);
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
