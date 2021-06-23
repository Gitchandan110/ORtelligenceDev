package com.ort.qa.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ort.qa.base.TestBase;
import com.ort.qa.pages.CreateCaseAffectedAreaPage;
import com.ort.qa.pages.CreateCaseProcedureSelectionPage;
import com.ort.qa.pages.CreateCaseSetSelectionPage;
import com.ort.qa.pages.CreateCaseSystemSelectionPage;

public class RepositoryPages extends TestBase {
	

	
	
//Login Page xpath
		
		@FindBy(name="username")
		protected WebElement username;

		@FindBy(name="password")
		protected WebElement password;

		@FindBy(xpath="//*[@id=\"page-ui-container\"]/div/div/div/div[2]/div[1]/div/form/div[3]/button")  
		protected WebElement signUpBtn;

		@FindBy(xpath="//img[contains(@class,org-logo__image)]")
		protected WebElement ortLogo;
		
		@FindBy(xpath="//div[text()='Incorrect username or password. Please try again.']")
		protected WebElement errorMsgForInvalidMail;

		@FindBy(xpath="//a[text()='Forgot Password']")
		protected WebElement forgotPassword;
		
		@FindBy(xpath="//a[text()='Forgot Password link']")
		protected WebElement forgotPasswordlink;
		
		@FindBy(xpath="//*[@id=\"page-ui-container\"]/div/div/div/div[2]/div[1]/div/div/div/text()") 
		protected WebElement passwordResetMsg;
		
		@FindBy(id="cancel-button")
		protected WebElement clickOnCancleButtonLink;
		
		@FindBy(id ="recovery-code")
		protected WebElement recoveryCode;  

		@FindBy(id ="new") 
		protected WebElement enterNewPassword; 

		@FindBy(id ="verify")
		protected WebElement verifyNewPassword;

		@FindBy(xpath="//button[@type='submit']")
		protected WebElement save;
		
//Select Facility Page	
		    
		    //Select Facility Dropdown*
			@FindBy(xpath="//select[@name='locationId']")
			protected WebElement facilityDropdown;

		    //	Confirm button
			@FindBy(xpath="//button[text()='Confirm']")
			protected WebElement confirm;	
			 
//Dashboard Page 
			
			//creat case menu link
			@FindBy(xpath="(//a[@class='menu-font'])[4]")
			protected WebElement createcase;	
			
			// create case dashboard link
			@FindBy(xpath="(//div[@class='rcorners3 border border-primary flexchild pointer-div'])[4]")
			protected WebElement dashboardCreateCase;
			
			//InProgress Menu Link 
			@FindBy(xpath="(//a[text()='In-Process'])[1]")
			public WebElement menuInProcess;
			
			//InProgrss Dashboard Link
			@FindBy(xpath="(//div[@class='rcorners3 border border-primary flexchild pointer-div'])[1]")
			public WebElement dashboardInProcess;  
			
			
			
			
//Find Patient Page
			
			//PatientLastName
			@FindBy(xpath="//input[@id='lastName']")
			protected WebElement patientLastName;
		
			//patient first name
			@FindBy(xpath="//input[@id='firstName']")
			protected  WebElement patientFirstName;
		 
			//patient DOB
			@FindBy(xpath="//input[@id='dob']")
			protected  WebElement patientDOB;

		     //	Date of Birth Calendar icon	
			@FindBy(xpath="//span[@class='date-picker-icon']")
			protected WebElement patientDOBIcon;
			
		     //MRN# Number	
			@FindBy(xpath="//input[@id='mrn']")
			protected  WebElement patientMRN;
			
		    //Search button	On Find Patient Page
			@FindBy(xpath="//button[text()='Search']")
			public  WebElement search;
			
		    //	Select Patient Button on Find Patient Page
			@FindBy(xpath="//button[@name='Select']")
			protected	WebElement selectPatient;
			
			@FindBy(xpath="//select[@id='specialtyId']")
			public WebElement specialitySelection;
			
			@FindBy(xpath="//input[@id='caseId']")
			public WebElement caseNumbers;
//Create Case Xpaths
			
			//select surgeon on create case
			@FindBy(xpath="//select[@formcontrolname='surgeon']")
			protected WebElement surgeon;

			//Patient Latex Allergy
			@FindBy(xpath="//select[@formcontrolname='hasLatexAlergy']")
			protected WebElement patientAllergy;
			
			//SECOND SURGEON PLUS ICON
			@FindBy(xpath="//i[@class='fa fa-plus padding-plus-layout cursor-pointer']")
			WebElement secondSergeonPlusIcon;
			
			//Second Surgeon field
			@FindBy(xpath="//select[@id='surgeonPlus']")
			WebElement secondSurgeon;
			
			//Surgeon Latex allergy
			@FindBy(xpath="//select[@formcontrolname='surgeonHasLatexAlergy']") 
			WebElement surgeonAllergy;
			
			//second surgeon Latex Allergy
			@FindBy(xpath="(//select[@formcontrolname='secondSurgeonHasLatexAlergy']")
			WebElement secondSurgeonAllergy;
			
			//Surgery Date and Time
			//Text Field is generally auto filled based upon Urgency but User can manually enter data 
			@FindBy(xpath="//input[@class='form-control ng-untouched ng-pristine ng-invalid']")
			WebElement surgeryDateTime;
			
			//Surgery Date/Time* Calendar
			@FindBy(xpath="//span[@class='input-group-append']")
			WebElement surgeryDateTimeCalenderIcon;
			
			//select urgency on create case page
			@FindBy(xpath="//select[@formcontrolname='urgency']")
			protected WebElement urgency;
			
			//select speciallity on create case page
			@FindBy(xpath="//select[@id='specialtyId']")
			protected WebElement speciaity;
			
			//next button on create case Page
			@FindBy(xpath="//button[text()='Next']")
			protected WebElement next;
			
			//notes by Doctor on create case Page
			@FindBy(xpath="//textarea[@id='notesbydoctor']")
			protected WebElement notes;
			
			//physician Assistant
			@FindBy(xpath="//select[@formcontrolname='physicianAssistant']")
			protected WebElement physicianAssistant;
			
			//Select Prcedure field
			@FindBy(xpath="//input[@id='selectProcedure']")
			protected WebElement procedure;
			
			//Preference Card Field
			@FindBy(xpath="//select[@id='preferenceCard']")
			protected	WebElement preferenceCard;
			
			//QuickPick Button 
			@FindBy(xpath="//button[text()='Quick Pick']")
			protected WebElement quickPick;
			
			//Diagnosis Code field
			@FindBy(xpath="//input[@id='diagnosisCodes']")
			WebElement diagnosisCode;
			
			//Diagnosis Code Search(Search ICD 10 Codes) Button
			@FindBy(xpath="//a[text()='Search ICD 10 Codes']")
			WebElement diagnosisCodeSearch;
			
			//upload Image photo label
			@FindBy(xpath="//label[@id='upload-drop-zone']")
			WebElement uploadImagePhoto;

			//upload Image browse label
			@FindBy(xpath="//div[@class='upload-drop-zone'] //label[@class='cursor-pointer' and @for='uploadImage']")
			WebElement uploadImageBrowse;	
	
			//Error Msg Field if surgeon field is blank while creating case
			@FindBy(xpath="//button[text()=' Please select Surgeon ']")
			protected WebElement errorMsg;
			
			
			
 //Create Cart Page xpath			
			//Anesthesia requests
			@FindBy(xpath="//select[@formcontrolname='anestesiaRequests']")
			protected	WebElement anestesiaRequests;
			
			//medications
			@FindBy(xpath="//textarea[@formcontrolname='medications']")
			protected WebElement medications;
			
			//position Side
			@FindBy(xpath="//select[@formcontrolname='positionSide']")
			protected WebElement positionSide;
			
			//System Position
			@FindBy(xpath="//select[@formcontrolname='systemPosition']")
			protected WebElement systemPosition;
			
			//Positioning Information
			@FindBy(xpath="//textarea[@formcontrolname='positioning_information']")
			protected WebElement positioningInformation;
			
			//Instructions
			@FindBy(xpath="//textarea[@formcontrolname='instructions']")
			protected WebElement instructions;
			
			@FindBy(xpath="/html/body/app-root/app-full-layout/div[1]/app-create-case/app-addsets/form/div[1]/div[2]/div/table/tbody/tr[2]/td[3]/input")
			protected WebElement openQuantity ;
			
		
			
	}



