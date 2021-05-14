package TestPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.TestBase.TestBase;

public class CreateCaseProcedureSelectionPage extends TestBase
{

	/*	Select 1st Option
	 */
	
	@FindBy(xpath="(//button[text()='Select'])[1]")
	WebElement selectProcedure1;
	
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
	
	public void CreateCaseProcedureSelectionOption1() 
	{
		selectProcedure1.click();
				
	}

	/*	Select 2nd Procedure
	 */
	public void CreateCaseProcedureSelectionOption2() 
	{
		selectProcedure2.click();
				
	}
	
	/*	Redirect user to previous sub-module
	 */
	
	public void CreateCaseProcedureSelectionBack() 
	{
		back.click();
				
	}
	
	
	public void AddFacilityPage() 
	{
		PageFactory.initElements(driver, this);
	}
}
