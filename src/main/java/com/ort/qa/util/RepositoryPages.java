package com.ort.qa.util;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.ort.qa.base.TestBase;

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
			protected  WebElement search;
			
		    //	Select Patient Button on Find Patient Page
			@FindBy(xpath="//button[@name='Select']")
			protected	WebElement selectPatient;
			
	//Create Case Xpaths
			
			//select surgeon on create case
			@FindBy(xpath="//select[@formcontrolname='surgeon']")
			protected WebElement surgeon;

			//Patient Latex Allergy
			@FindBy(xpath="//select[@formcontrolname='hasLatexAlergy']")
			protected WebElement patientAllergy;
			
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
			
			//
			@FindBy(xpath="//input[@id='selectProcedure']")
			protected WebElement procedure;
			
			@FindBy(xpath="//select[@id='preferenceCard']")
			protected	WebElement preferenceCard;
			
			@FindBy(xpath="//button[text()='Quick Pick']")
			protected WebElement quickPick;
			
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
			

			
			
	}



