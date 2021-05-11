package TestPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.TestBase.TestBase;

public class CreateCaseSetSelectionPage extends TestBase 
{
	
//	Set Checkbox  
//	Open quantity
//	Hold quantity
	
//	Records display quantity
	@FindBy(xpath="//select[@class='custom-select']")
	WebElement records;
	
//	Search Set
	@FindBy(xpath="//input[@id='selectSetSubstInstrument']")
	WebElement searchSet;	
	
//	Supplies + icon
	@FindBy(xpath="//i[@class='fa fa-plus-circle icon-size']")
	WebElement supplies;
	
//	Search Supplies
	@FindBy(xpath="//input[@id='selectSupply']")
	WebElement searchSupplies;	
	
//	Anesthesia Request*
	@FindBy(xpath="(//select[@class='form-control ng-untouched ng-pristine ng-valid'])[1]")
	WebElement anesthesia;
	
//	X-Ray Needed* - Yes
	@FindBy(xpath="(//label[@class='form-check-label'])[1]")
	WebElement xRayYes;

//	X-Ray Needed* - No
	@FindBy(xpath="(//label[@class='form-check-label'])[2]")
	WebElement xRayNo;	
	
//	Medications
	@FindBy(xpath="//textarea[@id='medications']")
	WebElement medications;
	
//	Side*
	@FindBy(xpath="(//select[@class='form-control ng-untouched ng-pristine ng-valid'])[3]")
	WebElement side;
	
//	Position*
	@FindBy(xpath="(//select[@class='form-control ng-untouched ng-pristine ng-valid'])[4]")
	WebElement position;
	
//	Positioning Comments
	@FindBy(xpath="//textarea[@id='positioning_information']")
	WebElement positioningComment;
	
//	Instructions
	@FindBy(xpath="//textarea[@id='instructions']")
	WebElement instructions;
	
//	Back
	@FindBy(xpath="//button[text()='Back']")
	WebElement back;
	
//	Remove Procedure
	@FindBy(xpath="//button[text()='Remove Procedure']")
	WebElement removeProcedure;
	
//	This will open a pop-up box
//	Close button
	@FindBy(xpath="//button[text()='Close']")
	WebElement closeButton;	

//	Close icon
	@FindBy(xpath="//button[@class='close']")
	WebElement closeIcon;	
	
//	Create
	@FindBy(xpath="//button[text()='Create']")
	WebElement create;	
	
//	Confirmation pop-up
//	Ok button
	@FindBy(xpath="//button[text()='Ok']")
	WebElement confirmationOk;
	
//	Click here button to download the Case Details
	@FindBy(xpath="//a[text()='Click here']']")
	WebElement clickHere;

	
	public void AddFacilityPage() 
	{
		PageFactory.initElements(driver, this);
	}
}
