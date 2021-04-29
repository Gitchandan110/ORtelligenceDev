package TestPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.TestBase.TestBase;





public class ManageHealthSystemPage extends TestBase {
	
	
	
	@FindBy(xpath="/html/body/app-root/app-full-layout/div[1]/app-admin/app-client-hospital/div[3]/div[3]/a")                     //xpath for profile link
	WebElement addNewHealthSystemLink;

	
	@FindBy(xpath="/html/body/app-root/app-full-layout/div[1]/app-admin/app-client-hospital/div[2]/div[3]/a")                     //xpath for profile link
	WebElement manageSUusersLink;

	public ManageHealthSystemPage(){                             
		PageFactory.initElements(driver, this);
	
	}
	
	public  AddNewHealthSystemPage clickOnAddNewHealthSystemLink() {
		addNewHealthSystemLink.click();
		return new AddNewHealthSystemPage();  
	
	
	}

}
