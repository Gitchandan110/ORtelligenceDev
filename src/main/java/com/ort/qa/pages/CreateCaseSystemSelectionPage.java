package com.ort.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ort.qa.base.TestBase;

public class CreateCaseSystemSelectionPage extends TestBase
{

 /*	System found
 * 	Checkbox 1st option
 */ 

	
	@FindBy(xpath="(//input[@type='checkbox'])")
	public WebElement checkBoxElement;
	
	@FindBy(xpath="(//input[@type='checkbox'])[1]")
	public WebElement checkboxSystem1;
	
 /*	Checkbox 2nd option
 */ 
	
	@FindBy(xpath="(//input[@type='checkbox'])[2]")
	public WebElement checkboxSystem2;

 /*	Back button
 */
	
	@FindBy(xpath="//button[text()='Back']")
	public WebElement back;

 /*	Select button
 */
	
	@FindBy(xpath="//button[text()='Select']")
	WebElement select;
	
 /*	System not found exception
 *	Click here link to open pop-up
 */
	
	@FindBy(xpath="(//button[@class='btn btn-primary'])[2]")
	public WebElement clickOnSelectButton;

 /*	Pop-up - Proceed to Cart button
 */
	
	@FindBy(xpath="//button[text()='Proceed to Cart']")
	public WebElement proceedToCart;
	
 /*	Pop-up - Select another Procedure button
 */
	
	@FindBy(xpath="//button[text()='Select another Procedure']")
	WebElement selectAnotherProcedure;

 /*Pop-up - Close Icon
 */
	
	@FindBy(xpath="//button[@class='close']")
	WebElement closeIcon;


 /*Actions:
 */
	
	public CreateCaseSystemSelectionPage() 
	{
		PageFactory.initElements(driver, this);
	}
	
 /*	Select 1st system 
 */
	
	public void createCaseSystemSelectionOption1()

	{
		checkboxSystem1.click();
		select.click();
				
	}


 /*	Select 2nd System	
 */

	public void createCaseSystemSelectionOption2()
	{
		checkboxSystem2.click();
		select.click();
				
	}
	
 /* If no system is found
 */

	public void createCaseSystemSelectionSelectSystem()
	{
		
 /*	Click here link to open Confirmation pop-up
 */ 
		
		clickOnSelectButton.click();
		
 /* Confirmation pop-up will open.
 */
		
						
	}
	

 /*	Confirmation pop-up
 */
 
	public void createCaseConfirmationPopUp() 
	{
 /*	Redirects user to Set selection sub-module
 */
		
		proceedToCart.click();
		
 /*		Redirects user to Basic details sub-module
 */
		
		selectAnotherProcedure.click();
		
 /*		Close pop-up byt clicking on Icon
 */

		closeIcon.click();
		
	}
	
 /*	Back to previous sub-module
 */

	public void createCaseSystemSelectionBack()
	{
		back.click();
	}
	

}
