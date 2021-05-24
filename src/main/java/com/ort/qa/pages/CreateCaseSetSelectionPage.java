package com.ort.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ort.qa.base.TestBase;

public class CreateCaseSetSelectionPage extends TestBase 
{
	
 /*	Set Checkbox is pending
 *	Open quantity is pending
 *	Hold quantity is pending
 *	Delete set is pending
 *	Records display quantity dropdown
 */
	/*	click on set Checkbox. 
	 */
	
	@FindBy(xpath="//input[@class='form-control-input ng-valid ng-dirty ng-touched']")
	public WebElement  checkbox1;
	
	/*	click on Open quantity 
	 */
	
	@FindBy(xpath="//input[@class='form-control textbox-width-height ng-pristine ng-valid ng-touched']")
	WebElement openQuantity ;
	
	/*	click on Hold quantity
	 */
	

	@FindBy(xpath="(//input[@class='form-control textbox-width-height ng-pristine ng-valid ng-touched'])[2]")
	WebElement holdQuantity ;
	
	/* Records display quantity dropdown
	*/

	@FindBy(xpath="//select[@class='custom-select']")
	WebElement records;
	
 /* Search Set text
 */
	
	@FindBy(xpath="//input[@id='selectSetSubstInstrument']")
	WebElement searchSet;
 /*	Select option xpath is pending
 *	Supplies + icon
 */
	
	@FindBy(xpath="//i[@class='fa fa-plus-circle icon-size']")
	WebElement supplies;
	
 /*	Search Supplies text
 */
	
	@FindBy(xpath="//input[@id='selectSupply']")
	WebElement searchSupplies;	
 /*	Select option xpath is pending
 * 	Anesthesia Request* dropdown
 * 
 */
	
	@FindBy(xpath="(//select[@class='form-control ng-untouched ng-pristine ng-valid'])[1]")
	WebElement anesthesia;
	
 /*	Block Anesthesia type	
 */
	
	@FindBy(xpath="(//select[@class='form-control ng-untouched ng-pristine ng-valid'])[1]")
	WebElement blockAnesthesiaType;
	
 /*	X-Ray Needed* - Yes checkbox
 */
		
	@FindBy(xpath="(//label[@class='form-check-label'])[1]")
	WebElement xRayYes;

 /*	X-Ray Needed* - No checkbox
 */
	
	@FindBy(xpath="(//label[@class='form-check-label'])[2]")
	WebElement xRayNo;	
	
 /*	Medications text
 */
	
	@FindBy(xpath="//textarea[@id='medications']")
	WebElement medications;
	
 /*	Side* dropdown
 */
	
	@FindBy(xpath="(//select[@class='form-control ng-untouched ng-pristine ng-valid'])[3]")
	WebElement side;
	
 /*	Position* dropdown
 */
	
	@FindBy(xpath="(//select[@class='form-control ng-untouched ng-pristine ng-valid'])[4]")
	WebElement position;
	
 /*	Positioning Comments text
 */
	
	@FindBy(xpath="//textarea[@id='positioning_information']")
	WebElement positioningComment;
	
 /*	Instructions text
 */
	
	@FindBy(xpath="//textarea[@id='instructions']")
	WebElement instructions;
	
 /*	Back button
 */
	
	@FindBy(xpath="//button[text()='Back']")
	WebElement back;
	
 /*	Remove Procedure button
 */
	
	@FindBy(xpath="//button[text()='Remove Procedure']")
	WebElement removeProcedure;
	
 /*	This will open a pop-up box
 *	Delete procedure is pending	
 *	Close popup button
 */
	
	@FindBy(xpath="//button[text()='Close']")
	WebElement closePopupButton;	

 /*	Close popup icon
 */
	
	@FindBy(xpath="//button[@class='close']")
	WebElement closePopupIcon;	
	
 /*	Create button
 */
	
	@FindBy(xpath="//button[text()='Create']")
	WebElement create;	
	
 /*	Confirmation pop-up
 * 	Ok button 
 */
	
	@FindBy(xpath="//button[text()='Ok']")
	WebElement confirmationOk;
	
 /*Click here button to download the Case Details
 */
	@FindBy(xpath="//a[text()='Click here']']")
	WebElement clickHere;


 /*	Actions:
 *	Basic set and other details
 
 */

	
	public CreateCaseSetSelectionPage() 
	{
		PageFactory.initElements(driver, this);
	}
	
	public void createCaseSetSelection( String openQuantityText,String holdQuantityText,  String recordsOption, String searchSetText, String searchSuppliesText, String anesthesiaOption, String blockAnesthesiaTypeOption, String medicationsText, String sideOption, String positionOption, String positioningCommentText, String instructionsText) 

	{
		
		checkbox1.click();
		openQuantity.sendKeys(openQuantityText);
		holdQuantity.sendKeys(holdQuantityText);
		records.sendKeys(recordsOption);
		searchSet.sendKeys(searchSetText);
		supplies.click();
		searchSupplies.sendKeys(searchSuppliesText);
		anesthesia.sendKeys(anesthesiaOption);
		blockAnesthesiaType.sendKeys(blockAnesthesiaTypeOption);
		xRayYes.click();
		xRayNo.click();
		medications.sendKeys(medicationsText);
		side.sendKeys(sideOption);
		position.sendKeys(positionOption);
		positioningComment.sendKeys(positioningCommentText);
		instructions.sendKeys(instructionsText);
		create.click();
				
	}
	

 /*	Back to previous sub-module
 */


	public void createCaseSetSelectionBack()
	{
		back.click();
	}
	

 /*	Remove Procedure button
 */
	
	public void createCaseRemoveProcedure()

	{
		removeProcedure.click();
		
	}
	

 /*	Remove Procedure - Procedure details pop-up
 */
	

	public void createCaseProcedureDetailsPopup()

	{
		closePopupButton.click();
		closePopupIcon.click();
		
	}
	

 /*	Confirmation Pop-up 
 */
 
	public void createCaseConfirmationPopup() 

	{
		clickHere.click();
		confirmationOk.click();
			
	}
	
	
}
