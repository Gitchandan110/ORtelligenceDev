package TestPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.TestBase.TestBase;

public class CreateCaseFindPatientPage extends TestBase
{

	/*	Mandatory to Use any of the 4 provided options
*Last Name 
 */
	
	WebDriver driver;
	@FindBy(xpath="//input[@id='lastName']")
	WebElement patientLastName;
	
	/*	First Name
	 */
	
	@FindBy(xpath="//input[@id='firstName']")
	WebElement patientFirstName;

	/*	Date of Birth text field	
	 */
	@FindBy(xpath="//input[@id='dob']")
	WebElement patientDOB;

	/*	Date of Birth Calander icon
	 */
	@FindBy(xpath="//span[@class='date-picker-icon']")
	WebElement patientDOBIcon;
	
	/*	MRN# Number	
	 */
	
	@FindBy(xpath="//input[@id='mrn']")
	WebElement patientMRN;
	
	/*Search button	
	 */
	
	@FindBy(xpath="//button[text()='Search']")
	WebElement search;
	
	/*	Select Patient
	 */
	@FindBy(xpath="//button[@name='Select']")
	WebElement selectPatient;
	

	/*Initialization	
	 */
	
	public void createCaseFindPatientPage(WebDriver dr) 
	{	
		driver=dr;
		PageFactory.initElements(driver, this);
	}	

	/*	User needs to Select the Patient from the list of Patients
 *	page ignition is also present
 */
	
/*Actions : 
 */
	public void CreateCaseFindPatientData(String lastName, String firstName, String DOB, String MNR) 
	{
						
		patientLastName.sendKeys(lastName);
		patientFirstName.sendKeys(firstName);
		patientDOB.sendKeys(DOB);
		patientMRN.sendKeys(MNR);
		search.click();
		
	}
	

	/*	Select Patient
	 */
	public void CreateCaseSelectPatient()
	{
		selectPatient.click();
			
	}
		

}
