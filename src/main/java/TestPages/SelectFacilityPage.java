package TestPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.TestBase.TestBase;

public class SelectFacilityPage extends TestBase
{
//	We have to use Page Factory-Object Repository
//	Here we will segregate all locators using @FindBy annotation
//	Select Facility Dropdown*
	@FindBy(xpath="//select[@name='locationId']")
	WebElement facilityDropdown;
	
//	Submit button
	@FindBy(xpath="//button[text()='Confirm']")
	WebElement submit;
	
//	Actions : 
	
		
	
	public void AddFacilityPage() 
	{
		PageFactory.initElements(driver, this);
	}
}
