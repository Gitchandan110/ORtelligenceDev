package TestPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.TestBase.TestBase;

public class CreateCaseFindPatientPage extends TestBase
{
//	We have to use Page Factory-Object Repository
//	Here we will segregate all locators using @FindBy annotation
//	Mandatory to Use any of the 4 provided options
//	Last Name
	WebDriver driver;
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
	
//	Select Patient
	@FindBy(xpath="//button[@name='Select']")
	WebElement selectPatient;
	
	
//	User needs to Select the Patient from the list of Patients
//	page ignition is also present
//	Actions : 
<<<<<<< HEAD
	public void CreateCaseFindPatientData(String lastName, String firstName, String DOB, String MNR) 
=======
	public void findPatientData(String lastName, String firstName, String DOB, String MNR) 
>>>>>>> e027ecfc522e51ed07934bda89842c1809dd4867
	{
						
		patientLastName.sendKeys(lastName);
		patientFirstName.sendKeys(firstName);
		patientDOB.sendKeys(DOB);
		patientMRN.sendKeys(MNR);
		search.click();
		
	}
	
<<<<<<< HEAD
//	Select Patient
	public void CreateCaseSelectPatient()
	{
		selectPatient.click();
			
	}
		
	public void AddFacilityPage() 
	{
=======
	
	
	public void createCaseFindPatientPage(WebDriver dr) 
	{	
		driver=dr;
>>>>>>> e027ecfc522e51ed07934bda89842c1809dd4867
		PageFactory.initElements(driver, this);
	}
}
