package TestPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.TestBase.TestBase;

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
	
	
	
	public ProfilePage(){                             //creating loginpage constructor
		PageFactory.initElements(driver, this);    //PageFactory is a class and InitElements is method 
		                                          //driver is coming from base class  //'this' means current class object, instead of this we can write LoginPage.class but better to use 'this'
	}
	

}
