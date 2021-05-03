package TestPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.TestBase.TestBase;

public class CreateCaseBasicDetails extends TestBase
{
//	We have to use Page Factory-Object Repository
//	Here we will segregate all locators using @FindBy annotation
//	Surgeon* Dropdown
	@FindBy(xpath="//select[@id='surgeon']")
	WebElement surgeon;
	
//	Preference Card dropdown
	@FindBy(xpath="//select[@id='preferenceCard']")
	WebElement preferenceCard;

//	Preference Card Quick Pick button
	@FindBy(xpath="//button[text()='Quick Pick']")
	WebElement quickPick;	
	
////	Second Surgeon + icon
//	@FindBy(xpath="")
//	WebElement ;
	
//		Second Surgeon dropdown
		@FindBy(xpath="//select[@id='surgeonPlus']")
		WebElement secondSurgeon;

////	Surgeon Latex Allergy* dropdown . This is auto filled if data is already saved.
//	@FindBy(xpath="") 
//	WebElement ;
//	
////	2nd Surg. Latex Allergy* dropdown This is auto filled if data is already saved.
//	@FindBy(xpath="")
//	WebElement ;
	
////	Patient Latex Allergy* dropdown This is auto filled if data is already saved.
//	@FindBy(xpath="")
//	WebElement ;
	
////	Physician Assistant* dropdown
//	@FindBy(xpath="")
//	WebElement ;
	
//	Urgency*
	@FindBy(xpath="//select[@id='urgency']")
	WebElement urgency;
	
//	Procedure
	@FindBy(xpath="//input[@id='selectProcedure']")
	WebElement procedure;

//	Specialty*
	@FindBy(xpath="//select[@id='specialtyId']")
	WebElement speciaity;
	
////	Surgery Date/Time*
////	Text Field is generally auto filled based upon Urgency but User can mannually enter data 
////	Data format [ 5/3/2021, 3:40 PM ]
//	@FindBy(xpath="")
//	WebElement ;
	
////	Surgery Date/Time* Calander
//	@FindBy(xpath="")
//	WebElement ;
	
//	Notes
	@FindBy(xpath="//textarea[@id='notesbydoctor']")
	WebElement notes;
	
//	Diagnosis Code
	@FindBy(xpath="//input[@id='diagnosisCodes']")
	WebElement diagnosisCode;
	
//	Diagnosis Code Search button
	@FindBy(xpath="//a[text()='Search ICD 10 Codes']")
	WebElement diagnosisCodeSearch;
	
//	Image can be draged and dropped
//	Upload image - Take a Photo 
	@FindBy(xpath="//label[@id='upload-drop-zone']")
	WebElement uploadImagePhoto;
	
//	 Upload image - Browse
	@FindBy(xpath="//div[@class='upload-drop-zone'] //label[@class='cursor-pointer' and @for='uploadImage']")
	WebElement uploadImageBrowse;	
	
//	 Next Button
	@FindBy(xpath="//button[text()='Next']")
	WebElement next;		
	
	
//	Actions :
//	Verify Patient name
//	Capture Case Number
//	Verify DOB
//	Verify MNR#
	
	public void AddFacilityPage() 
	{
		PageFactory.initElements(driver, this);
	}

}
