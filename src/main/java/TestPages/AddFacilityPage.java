package TestPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.TestBase.TestBase;

public class AddFacilityPage extends TestBase
{
//	We have to use Page Factory-Object Repository
//	Here we will segregate all locators using @FindBy annotation
//	Facility Name*
	@FindBy(xpath="//input[@id='facilityName']")
	WebElement facilityName;
	
//	Facility Address1*
	@FindBy(xpath="//input[@id='address1']")
	WebElement facilityAddress1;
	
//	Facility Address2
	@FindBy(xpath="//input[@id='address2']")
	WebElement facilityAddress2;
	
//	State* // Dropdown // Use sendkeys to enter data.
	@FindBy(xpath="//select[@id='stateId']")
	WebElement state;
	
//	City*
	@FindBy(xpath="//input[@id='city']")
	WebElement city;
	
//	Zip Code*
	@FindBy(xpath="//input[@id='zipCode']")
	WebElement zipCode;
	
//	1 of 3 options
//	Item tracking by SPD using QR Code/Barcode 
//	Required
	@FindBy(xpath="(//input[@type='radio'])[1]")
	WebElement spdRequired;
	
//	Item tracking by SPD using QR Code/Barcode 
//	Optional
	@FindBy(xpath="(//input[@type='radio'])[2]")
	WebElement spdOptional;
	
//	Item tracking by SPD using QR Code/Barcode 
//	Not Required
	@FindBy(xpath="(//input[@type='radio'])[3]")
	WebElement spdNotRequired;

//	If : Item tracking by SPD using QR Code/Barcode - Required then  1of 2 options	
//		Item tracking by Nurse using QR Code/Barcode
//		Required
		@FindBy(xpath="(//input[@type='radio'])[4]")
		WebElement nurseRequired;
	
//		Item tracking by Nurse using QR Code/Barcode 
//		Not Required
		@FindBy(xpath="(//input[@type='radio'])[5]")
		WebElement nurseNotRequired;
	
//	Can mark all supplies as available
	@FindBy(xpath="(//input[@type='checkbox'])[1]")
	WebElement allSuppliesAvailable;
	
//	Display Surgeon specific surgery steps
	@FindBy(xpath="(//input[@type='checkbox'])[2]")
	WebElement surgeonSteps;
	
//	Display Surgeon specific surgery items
	@FindBy(xpath="(//input[@type='checkbox'])[3]")
	WebElement surgeonItems;
	
//	Skip Process - SPD Cart Creation
	@FindBy(xpath="(//input[@type='checkbox'])[4]")
	WebElement cartCreationSkip;
	
//	Skip Process - Nurse Cart Review
	@FindBy(xpath="(//input[@type='checkbox'])[5]")
	WebElement cartReviewSkip;
	
//	Skip Process - Final Review
	@FindBy(xpath="(//input[@type='checkbox'])[6]")
	WebElement finalReviewSkip;
	
//	Submit Button
	@FindBy(xpath="//button[text()='Submit']")
	WebElement submit;
	
//	Cancel
	@FindBy(xpath="//button[text()='Cancel']")
	WebElement cancel;
	
//Using @FindBy annotation we have created different WebElements of Add Health System Page
//Now we are initializing the elements using PageFactory
//Initializing the Page Objects:
	public AddFacilityPage() 
	{
		PageFactory.initElements(driver, this);
	}

	
//	Actions :
//	Page Title
	public String validateLoginPageTitle()
	{
		return driver.getTitle();
	}
	

}