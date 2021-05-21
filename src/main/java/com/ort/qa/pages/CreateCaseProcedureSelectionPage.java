package com.ort.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ort.qa.base.TestBase;

public class CreateCaseProcedureSelectionPage extends TestBase
{

 /*	Select 1st Option
 */
	
 /* @FindBy(xpath="(//button[text()='Select'])[1]")
*/	WebElement selectProcedure1;
	
 /*	Select 2nd Option
 */
	
	@FindBy(xpath="(//button[text()='Select'])[2]")
	WebElement selectProcedure2;	

 /*	Back button
 */
	
	@FindBy(xpath="//button[text()='Back']")
	WebElement back;
	
 /*	Procedure not found exception	
 *	@FindBy(xpath="")
 *	WebElement ;	
 */
	
 /*	Actions:
 *	Select 1st Procedure
 */
	
 	public CreateCaseProcedureSelectionPage() 
	{
		PageFactory.initElements(driver, this);
	}
	
 /*	public void createCaseProcedureSelectionOption1() 
 *	{
 *	selectProcedure1.click();
				
 *	}
 */
 	
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

	public static void click() {
		// TODO Auto-generated method stub
		
	}
	
	

}
