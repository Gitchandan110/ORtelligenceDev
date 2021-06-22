//modified by Priyanka Pawar on 03/06/2021
package com.ort.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ort.qa.base.TestBase;

public class ProfilePage extends TestBase {
	
	@FindBy(xpath="//a[@class='a menu-active']")
	WebElement profile;

	@FindBy(xpath="//label[text()='Profile']")
	WebElement profileDisplay;

	@FindBy(xpath="//i[@class='fas fa-pen penProfileIcon']")
	WebElement editProfilePicture;


	@FindBy(id ="upload-drop-zone")
	WebElement uploadDropZone;

	@FindBy(xpath="(//label[@class='link img-space'])[2]']")
	WebElement browse;

	@FindBy(xpath="(//label[@class='link img-space'])[2]']")
	WebElement close;

	
	@FindBy(xpath="(//button[@class='btn btn-primary button-font-system-setup']")
	WebElement  testYourSetup ;


	@FindBy(xpath="(//label[text()='System setup']")//
	WebElement  systemSetup ;

	@FindBy(xpath="(//i[@class='fas fa-pen link rowEdit']")
	WebElement  personalInformation ;


	@FindBy(id ="lastName")
	WebElement lastName;
	
	 @FindBy(name="emailAddress")
	 WebElement emailAddress;
	 
     @FindBy(id ="mobile")
	 WebElement mobile;
	 	
	
	
 //creating profilepage constructor
     
      public ProfilePage(){                             
      PageFactory.initElements(driver, this); 
    
      }
	
//Actions:
      
 	public ProfilePage click1() {//Link click for Forgot Passwor
 	profile.click();
 	return new ProfilePage();
  }
 	
 	public String validateProfilePageTitle(){
 		return driver.getTitle();
  }
 	
 //Deleted the editProfilePicture click() method
 	
  
  }
 
