package TestPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.TestBase.TestBase;

public class AddHealthSystemPage extends TestBase
{

//	We have to use Page Factory-Object Repository
//	Here we will segregate all locators using @FindBy annotation
//	Health System Name
	@FindBy(id="clientHospitalName")
	WebElement healthSystemName;
	
//	Item tracking by SPD using QR Code/Barcode, 1 of 3 options
//		Required
		@FindBy(xpath="(//input[@type='radio'])[1]")
		WebElement spdRequired;
	
//		Optional
		@FindBy(xpath="(//input[@type='radio'])[2]")
		WebElement spdOptional;
	
//		Not Required
		@FindBy(xpath="(//input[@type='radio'])[3]")
		WebElement spdNotRequired;
	
//	Item tracking by Nurse using QR Code/Barcode, 1 of 2 options
//		Required
		@FindBy(xpath="(//input[@type='radio'])[4]")
		WebElement nurseRequired;
	
//		Not Required
		@FindBy(xpath="(//input[@type='radio'])[5]")
		WebElement nurseNotRequired;
	
//	Can mark all supplies as available - Checkbox
	@FindBy(xpath="(//input[@type='checkbox'])[1]")
	WebElement suppliesAvailable;
	
//	Submit Button
	@FindBy(xpath="//button[text()='Submit']")
	WebElement submit;
	
//	Cancle Button
	@FindBy(xpath="//button[text()='Cancel']")
	WebElement cancel;
	

////	External Links
////	Manage Users Link
//	@FindBy(xpath="//a[text()='Manage SU Users']")
//	WebElement manageUsers;
//	
////	Add Health System link
//	@FindBy(xpath="//a[text()='Add New Health System']")
//	WebElement addHealthSystem;
	
//	Using @FindBy annotation we have created different WebElements of Add Health System Page
//	Now we are initializing the elements using PageFactory
//	Initializing the Page Objects:
	public AddHealthSystemPage() 
	{
			PageFactory.initElements(driver, this);
	}
	
	
//	Actions
	
//	Page Title
	public String validateLoginPageTitle()
	{
		return driver.getTitle();
	}
	
//	Add System Data
//  Module Information :
//	Only 1 text field is present - Health System Name
	public void AddHealthSystem( String hsn ) // String names hsn to save the Health System name. 
	{
		healthSystemName.sendKeys(hsn);

//		Next - Item tracking by SPD using QR Code/Bar-code. One of 3 radio buttons.	
//		if (spdRequired.click())
//		{
//		If It is required then the Next 2 choices are given otherwise they are not.
//			nurseRequired.click();
////			or
//			nurseNotRequired.click();
//		}
//		else ()
//		{
//			spdOptional.click();
////			or
//			spdNotRequired.click();
//		}	
		
//		Next - Can mark all supplies as available Checkbox		
//		suppliesAvailable.click();
		
//		Final Submission or Cancellation.
//		submit.click();
//		or
//		cancle.click();
		

					
	}
		
}
