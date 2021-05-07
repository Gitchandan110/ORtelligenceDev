package TestPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.TestBase.TestBase;

public class CreateCaseFindPatientPage extends TestBase
{
//	We have to use Page Factory-Object Repository
//	Here we will segregate all locators using @FindBy annotation
//	Mandatory to Use any of the 4 provided options
//	Last Name
	@FindBy(xpath="//input[@id='lastName']")
	WebElement patientLastName;
	
//	First Name
	@FindBy(xpath="//input[@id='firstName']")
	WebElement patientFirstName;

//	Date of Birth text field	
	@FindBy(xpath="//input[@id='dob']")
	WebElement patientDOB;

//	Date of Birth Calander icon
	@FindBy(xpath="//span[@class='date-picker-icon']")
	WebElement patientDOBIcon;
	
//	MRN# Number	
	@FindBy(xpath="//input[@id='mrn']")
	WebElement patientMRN;
	
//	Search button	
	@FindBy(xpath="//button[text()='Search']")
	WebElement search;
	
	
//	User needs to Select the Patient from the list of Patients
//	page ignition is also present
//	Actions : 
	public void FindPatientData(String lastName, String firstName, String DOB, String MNR) 
	{
						
		patientLastName.sendKeys(lastName);
		patientFirstName.sendKeys(firstName);
		patientDOB.sendKeys(DOB);
		patientMRN.sendKeys(MNR);
		search.click();
		
	}
	
	public void AddFacilityPage() 
	{
		PageFactory.initElements(driver, this);
	}
}
