package TestPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.TestBase.TestBase;

public class CreateCaseProcedureSelectionPage extends TestBase
{
	
//	Select 1st Option
	@FindBy(xpath="(//button[text()='Select'])[1]")
	WebElement select1;
	
//	Select 2nd Option
	@FindBy(xpath="(//button[text()='Select'])[2]")
	WebElement select2;	
	
	
	
	
	
	

	
	
	
	
	
	public void AddFacilityPage() 
	{
		PageFactory.initElements(driver, this);
	}
}
