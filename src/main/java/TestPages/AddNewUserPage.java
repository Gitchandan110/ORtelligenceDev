package TestPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.TestBase.TestBase;

public class AddNewUserPage extends TestBase{
	
	@FindBy(id="")
	WebElement firstname;
	
	@FindBy(id="")
	WebElement lastname;
	
	@FindBy(id="")
	WebElement username;
	
	//Initializing the Page Objects:
	public AddNewUserPage(){                             
		    PageFactory.initElements(driver, this);    
			                                          
		}
		
	public void createNewUser(String ftname,String ltname,String uname) {
			Select select =new Select(driver.findElement(By.name("name"))); 
			select.selectByVisibleText("name");
			firstname.sendKeys(ftname);
			lastname.sendKeys(ltname);
			username.sendKeys(uname);
			
		}
		

}
