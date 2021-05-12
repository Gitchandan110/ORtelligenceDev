package TestPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.TestBase.TestBase;

public class SelectFacilityPage extends TestBase
{

//	Select Facility Dropdown*
	@FindBy(xpath="//select[@name='locationId']")
	WebElement facilityDropdown;

//	Confirm button
	@FindBy(xpath="//button[text()='Confirm']")
	WebElement confirm;	
	
//  Initialization
	public SelectFacilityPage() 
	{
		PageFactory.initElements(driver, this);
	}
		
	
//	Actions : 
	public void SelectFacility(String facilityName)
	{
		facilityDropdown.sendKeys(facilityName);
		confirm.click();
	}
	
	
//	public static WebElement getElement(By element) {
//		return driver.findElement(element);
//}
//	
//	
//	public static void SelectUsingVisibleValue(WebElement element, String visibleValue) {
//		Select select = new Select(element);
//		select.selectByVisibleText(visibleValue);
//		}

}
