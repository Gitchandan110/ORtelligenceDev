package com.ort.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ort.qa.base.TestBase;

public class CreateCaseBasicDetailsPage extends TestBase
{
	/* 	We have to use Page Factory-Object Repository
	 *		Here we will segregate all locators using @FindBy annotation
	 *		Surgeon* Dropdown
		 */

	@FindBy(xpath="//select[@id='surgeon']")
	WebElement surgeon;

	/*	Preference Card dropdown
	 */

	@FindBy(xpath="//select[@id='preferenceCard']")
	WebElement preferenceCard;

	/*	Preference Card Quick Pick button
	 */

	@FindBy(xpath="//button[text()='Quick Pick']")
	WebElement quickPick;	

	/*	Second Surgeon + icon 
	 */

	@FindBy(xpath="//i[@class='fa fa-plus padding-plus-layout cursor-pointer']")
	WebElement secondSergeonPlusIcon;


	/*	Second Surgeon dropdown
	 */

	@FindBy(xpath="//select[@id='surgeonPlus']")
	WebElement secondSurgeon;

	/*Surgeon Latex Allergy* dropdown . This is auto filled if data is already saved.
	*/
	
	@FindBy(xpath="(//select[@class='form-control ng-untouched ng-pristine ng-invalid'])[1]") 
	WebElement surgeonAllergy;

	/*	2nd Surg. Latex Allergy* dropdown This is auto filled if data is already saved.
	 */
	
	@FindBy(xpath="(//select[@class='form-control ng-untouched ng-pristine ng-invalid'])[2]")
	WebElement secondSurgeonAllergy;

	/*Patient Latex Allergy* dropdown This is auto filled if data is already saved.
	 */
	
	@FindBy(xpath="(//select[@class='form-control ng-untouched ng-pristine ng-valid'])[3]")
	WebElement patientAllergy;

	/*	Physician Assistant* dropdown
	 */
	
	@FindBy(xpath="(//select[@class='form-control ng-untouched ng-pristine ng-valid'])[4]")
	WebElement physicianAssistant;

	/*	Urgency
	 */
	
	@FindBy(xpath="//select[@id='urgency']")
	WebElement urgency;

	/*		Procedure
	 */
	
	@FindBy(xpath="//input[@id='selectProcedure']")
	WebElement procedure;

	/*	Specialty
	 */
	
	@FindBy(xpath="//select[@id='specialtyId']")
	WebElement speciaity;

	/*	Surgery Date/Time*
	*	Text Field is generally auto filled based upon Urgency but User can mannually enter data 
	*	Data format [ 5/3/2021, 3:40 PM ]
	 */
	
	@FindBy(xpath="//input[@class='form-control ng-untouched ng-pristine ng-invalid']")
	WebElement surgeryDateTime;

	/*		Surgery Date/Time* Calendar
	 */
	
	@FindBy(xpath="//span[@class='input-group-append']")
	WebElement surgeryDateTimeCalenderIcon;

	/*Notes
	 */
	
	@FindBy(xpath="//textarea[@id='notesbydoctor']")
	WebElement notes;

	/*	Diagnosis Code
	 */
	
	@FindBy(xpath="//input[@id='diagnosisCodes']")
	WebElement diagnosisCode;

	/*	Diagnosis Code Search button
	 */
	
	@FindBy(xpath="//a[text()='Search ICD 10 Codes']")
	WebElement diagnosisCodeSearch;

	/*	Image can be draged and dropped
	 * 	Upload image - Take a Photo  
	 */
	
	@FindBy(xpath="//label[@id='upload-drop-zone']")
	WebElement uploadImagePhoto;

	/* Upload image - Browse
	 */
	@FindBy(xpath="//div[@class='upload-drop-zone'] //label[@class='cursor-pointer' and @for='uploadImage']")
	WebElement uploadImageBrowse;	

	/*	 Next Button
	 */
	@FindBy(xpath="//button[text()='Next']")
	WebElement next;		


	/*	Actions :
	*	Verify Patient name
	*	Capture Case Number
	*	Verify DOB
	Verify MNR#
      */
	public void BasicDetails(String surgeonName, String surgeonPreferenceCard, String secondSurgeonName, String surgeonAllergyOption, String secondSurgeonAllergyOption, String patientAllergyOption, String physicianAssistantOption, String urgencyOption, String procedureOption, String speciaityOption, String surgeryDateTimeText, String notesText, String diagnosisCodeText)

	{
		surgeon.sendKeys(surgeonName);
		preferenceCard.sendKeys(surgeonPreferenceCard);
		quickPick.click();
		secondSergeonPlusIcon.click();
		secondSurgeon.sendKeys(secondSurgeonName);
		surgeonAllergy.sendKeys(surgeonAllergyOption);
		secondSurgeonAllergy.sendKeys(secondSurgeonAllergyOption);
		patientAllergy.sendKeys(patientAllergyOption);
		physicianAssistant.sendKeys(physicianAssistantOption);
		urgency.sendKeys(urgencyOption);
		procedure.sendKeys(procedureOption);
		speciaity.sendKeys(speciaityOption);
		surgeryDateTime.sendKeys(surgeryDateTimeText);
		surgeryDateTimeCalenderIcon.click();
		notes.sendKeys(notesText);
		diagnosisCode.sendKeys(diagnosisCodeText);
		diagnosisCodeSearch.click();
		uploadImagePhoto.click();
		uploadImageBrowse.click();
		next.click();

	}

	public void AddFacilityPage() 
	{
		PageFactory.initElements(driver, this);
	}

}
