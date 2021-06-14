package com.ort.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ort.qa.base.TestBase;

public class CreateCaseProcedureSelectionPage extends TestBase
{

 /*	Select 1st Option
 */
	
    @FindBy(xpath="(//button[text()='Select'])[1]")
	WebElement selectProcedure1;
	
 /*	Select 2nd Option
 */
	
	@FindBy(xpath="(//button[text()='Select'])[15]")
	public WebElement selectProcedure2;	

 /*	Back button
 */
	
	@FindBy(xpath="//button[text()='Back']")
	WebElement back;
	
	 /*	Select Procedure 27245.
	 */

 
 	@FindBy(xpath="(//button[@class='btn btn-primary'])[15]")
 	WebElement selectProceduree ;	
 

 	/*	Select another Proceed to cart.
	 */

 	@FindBy(xpath="//button[text()='Select another Procedure']")
 	WebElement selectAnotherProceedToCart;	
 
 	
 /*	Actions:
 *	Select 1st Procedure
 */
	
 	public CreateCaseProcedureSelectionPage() 
	{
		PageFactory.initElements(driver, this);
	}
	
 	public void createCaseProcedureSelectionOption() 
 	{
 		selectProcedure1.click();
				
 	}
 	

	 /*	Select 2nd Procedure
*/
	
	public void  createCaseProcedureSelectionPage() 
	{
		selectProcedure2.click();
				
	}
	
	
 /*	Redirect user to previous sub-module
 */
	
	public void createCaseProcedureSelectionBack() 
	{
		back.click();
				
	}
 
 	public void createCaseProcedureToCardOption() 
 	{
 	selectProceduree.click();
				
 	}
 
 	public void createCaseSelectAnotherProcedureToCardOption() 
 	{
 		selectAnotherProceedToCart.click();
				
 	}
 
 
	

}
