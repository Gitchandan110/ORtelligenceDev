package com.ort.qa.util;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.ort.qa.base.TestBase;

public class RepositoryPages extends TestBase {
	
		
	//Login Page xpath
		
		@FindBy(name="username")
		WebElement username;

		@FindBy(name="password")
		WebElement password;

		@FindBy(xpath="//*[@id=\"page-ui-container\"]/div/div/div/div[2]/div[1]/div/form/div[3]/button")  
		WebElement signUpBtn;

		@FindBy(xpath="//img[contains(@class,org-logo__image)]")
		WebElement ortLogo;
		
		@FindBy(xpath="//div[text()='Incorrect username or password. Please try again.']")
		WebElement errorMsgForInvalidMail;

		@FindBy(xpath="//a[text()='Forgot Password']")
		WebElement forgotPassword;
		
		@FindBy(xpath="//a[text()='Forgot Password link']")
		WebElement forgotPasswordlink;
		
		@FindBy(xpath="//*[@id=\"page-ui-container\"]/div/div/div/div[2]/div[1]/div/div/div/text()") 
		WebElement passwordResetMsg;
		
		@FindBy(id="cancel-button")
		WebElement clickOnCancleButtonLink;
		
		@FindBy(id ="recovery-code")
		WebElement recoveryCode;  

		@FindBy(id ="new") 
		WebElement enterNewPassword; 

		@FindBy(id ="verify")
		WebElement verifyNewPassword;

		@FindBy(xpath="//button[@type='submit']")
		WebElement save;
		
	//Select Facility Page	
		    
		    //Select Facility Dropdown*
			@FindBy(xpath="//select[@name='locationId']")
			WebElement facilityDropdown;

		    //	Confirm button
			@FindBy(xpath="//button[text()='Confirm']")
			WebElement confirm;	
			 
	//Dashboard Page 
			
			//creat case menu link
			@FindBy(xpath="(//a[@class='menu-font'])[4]")
			WebElement createcase;	
			
			// create case dashboard link
			@FindBy(xpath="(//div[@class='rcorners3 border border-primary flexchild pointer-div'])[4]")
			 WebElement dashboardCreateCase;
			
			
			
	//Find Patient Page
			
			//PatientLastName
			@FindBy(xpath="//input[@id='lastName']")
			WebElement patientLastName;
		
			//patient first name
			@FindBy(xpath="//input[@id='firstName']")
			WebElement patientFirstName;
		 
			//patient DOB
			@FindBy(xpath="//input[@id='dob']")
			WebElement patientDOB;

		     //	Date of Birth Calendar icon	
			@FindBy(xpath="//span[@class='date-picker-icon']")
			WebElement patientDOBIcon;
			
		     //MRN# Number	
			@FindBy(xpath="//input[@id='mrn']")
			WebElement patientMRN;
			
		    //Search button	On Find Patient Page
			@FindBy(xpath="//button[text()='Search']")
			WebElement search;
			
		    //	Select Patient Button on Find Patient Page
			@FindBy(xpath="//button[@name='Select']")
			WebElement selectPatient;
			
	//Create Case Xpaths
			
			//select surgeon on create case
			@FindBy(xpath="//select[@formcontrolname='surgeon']")
			WebElement surgeon;

			//Patient Latex Allergy
			@FindBy(xpath="//select[@formcontrolname='hasLatexAlergy']")
			WebElement patientAllergy;
			
			//select urgency on create case page
			@FindBy(xpath="//select[@formcontrolname='urgency']")
			WebElement urgency;
			
			//select speciallity on create case page
			@FindBy(xpath="//select[@id='specialtyId']")
			WebElement speciaity;
			
			//next button on create case Page
			@FindBy(xpath="//button[text()='Next']")
			WebElement next;
			
			//notes by Doctor on create case Page
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
			
			@FindBy(xpath="//select[@formcontrolname='systemPosition']")
			WebElement systemPosition;
			
			
			@FindBy(xpath="//textarea[@formcontrolname='positioning_information']")
			WebElement positioningInformation;
			
			@FindBy(xpath="//textarea[@formcontrolname='instructions']")
			WebElement instructions;
			

	}



