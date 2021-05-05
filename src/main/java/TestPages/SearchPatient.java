package TestPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.TestBase.TestBase;

public class SearchPatient extends TestBase
{
//	We have to use Page Factory-Object Repository
//	Here we will segregate all locators using @FindBy annotation
//	Mandatory to Use any of the 4 provided options
//	Use the elements of CreateCaseFindPatientPage
//	Remaining elements are present below
//	Specialty
	@FindBy(xpath="//select[@id='specialtyId']")
	WebElement speciality;
	
//	Case Number	
	@FindBy(xpath="//input[@id='caseId']")
	WebElement caseNumber;
	 
	public void SearchPatient()
	{
		
		
		
		
		
	}
	
	
	public void AddFacilityPage() 
	{
		PageFactory.initElements(driver, this);
	}
}
