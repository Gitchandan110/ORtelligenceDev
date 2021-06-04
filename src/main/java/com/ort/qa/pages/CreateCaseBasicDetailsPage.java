package com.ort.qa.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.ort.qa.base.TestBase;
import com.ort.qa.util.DropDownHandler;

public class CreateCaseBasicDetailsPage extends TestBase
{
	
 /* We have to use Page Factory-Object Repository
 *	Here we will segregate all locators using @FindBy annotation
 *	Surgeon* Dropdown
 */
	WebDriver driver;
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
    //XPATH CHANGED BY PRIYANKA

 /*	Second Surgeon dropdown
 */

	@FindBy(xpath="//select[@id='surgeonPlus']")
	WebElement secondSurgeon;

 /*Surgeon Latex Allergy* dropdown . This is auto filled if data is already saved.
 */
	
	@FindBy(xpath="//select[@formcontrolname='surgeonHasLatexAlergy']") 
	WebElement surgeonAllergy;
	
/* XPATH WRITTEN BY PIYUSH :(//select[@class='form-control ng-untouched ng-pristine ng-invalid'])[1]
* CHANGED BY PRIYANKA ://select[@formcontrolname='surgeonHasLatexAlergy']
*/

 /*	2nd Surg. Latex Allergy* dropdown This is auto filled if data is already saved.
 */
	
	@FindBy(xpath="(//select[@formcontrolname='secondSurgeonHasLatexAlergy']")
	WebElement secondSurgeonAllergy;
//XPATH CHANGED BY PRIYANKA
	
 /* Patient Latex Allergy* dropdown This is auto filled if data is already saved.
 */
	
	@FindBy(xpath="//select[@formcontrolname='hasLatexAlergy']")
	WebElement patientAllergy;
	//CHANGED THE XPATH WRITTEN BY PIYUSH ://select[@class='form-control ng-untouched ng-pristine ng-invalid'])[2] 
	// CHANGED BY PRIYANKA ://select[@formcontrolname='hasLatexAlergy']
	
 /* Physician Assistant* dropdown
 */
	
	@FindBy(xpath="//select[@formcontrolname='physicianAssistant']")
	WebElement physicianAssistant;
//XPATH CHANGED BY PRIYANKA
 /*	Urgency
 */
	
	@FindBy(xpath="//select[@formcontrolname='urgency']")
	WebElement urgency;
//Changed the xpath written by Piyush

 /*	Procedure
 */
	
	@FindBy(xpath="//input[@id='selectProcedure']")
	 WebElement procedure;
//XPATH CHANGED BY PRIYANKA

 /*	Specialty
 */
	
	@FindBy(xpath="//select[@id='specialtyId']")
	WebElement speciaity;

 /*	Surgery Date/Time*
 *	Text Field is generally auto filled based upon Urgency but User can manually enter data 
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

 /*	Image can be dragged and dropped
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
	
	@FindBy(xpath="//button[text()=' Please select Surgeon ']")
	WebElement errorMsg;
////div[@class='text-danger']

	/*	Actions :
	*/
	public CreateCaseBasicDetailsPage(WebDriver dr) 
	{
		driver=dr;
		PageFactory.initElements(driver, this);
	}
	
	/* Verify Patient name - pending
	* Capture Case Number -  pending
	* Verify DOB -  pending
    * Verify MNR#
    */
	//Deleted basicDetails Method as it was not useful: 03/06/2021 

	public void clickOnPatientDropDown() {
		DropDownHandler dp =new DropDownHandler(driver);
        dp.selectUsingVisibleText(surgeon,"Christiana Surgeon");
	}
	
	public boolean checkErrorMessage() {

		if (errorMsg.getText().equals(" Please select Surgeon ")) {
			System.out.println(" Please select Surgeon ");
			return true;
		} else {

			System.out.println("Error msg should be displayed as--' Please select Surgeon '");
			return false;
		}
	}

	
	public void clickOnPatientLatexAllergyDropDown() {
		DropDownHandler dp =new DropDownHandler(driver);
        dp.selectUsingVisibleText(patientAllergy,"No");
	}
	
	public void clickOnPatientUrgencyDropDown() {
		DropDownHandler dp =new DropDownHandler(driver);
        dp.selectUsingVisibleText(urgency,"Critical (Up to 1hr.)");
	}
    
	public void clickOnNextButton() {
		next.click();
	}
	
	
	
	public void clickOnProcedure() {
		procedure.sendKeys("IM Nail Hip / InterTroch / CMN Hip (27245)");
	}
	

	public void clickOnPreferenceCard() {
		preferenceCard.click();
		
	}
	
	public void notesByDoctor() {
		notes.sendKeys("Do not Drink Water before one hour of operation");
	}
	
}
