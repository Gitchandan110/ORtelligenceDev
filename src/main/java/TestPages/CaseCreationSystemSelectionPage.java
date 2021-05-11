package TestPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.TestBase.TestBase;

public class CaseCreationSystemSelectionPage extends TestBase
{

//	Checkbox 1st option
	@FindBy(xpath="(//input[@type='checkbox'])[1]")
	WebElement checkboxSystem1;
	
//	Checkbox 2nd option
	@FindBy(xpath="(//input[@type='checkbox'])[2]")
	WebElement checkboxSystem2;

//	Back button
	@FindBy(xpath="//button[text()='Back']")
	WebElement back;

//	Select button
	@FindBy(xpath="//button[text()='Select']")
	WebElement select;
	
//	System not found exception
////
//	@FindBy(xpath="")
//	WebElement ;
//
////
//	@FindBy(xpath="")
//	WebElement ;
	
//	Click here link to open pop-up
	@FindBy(xpath="//a[text()='Click here']")
	WebElement clickHere;

//	Pop-up - Proceed to Cart button
	@FindBy(xpath="//button[text()='Proceed to Cart']")
	WebElement proceedToCart;
	
//	Pop-up - Select another Procedure button
	@FindBy(xpath="//button[text()='Select another Procedure']")
	WebElement selectAnotherProcedure;

//	Pop-up - Close Icon
	@FindBy(xpath="//button[@class='close']")
	WebElement closeIcon;

		
	public void AddFacilityPage() 
	{
		PageFactory.initElements(driver, this);
	}
}
