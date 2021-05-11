package TestPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.TestBase.TestBase;

public class AdminAddNewHealthSystemPage extends TestBase {
	
	//Initializing the Page Objects:
	public AdminAddNewHealthSystemPage(){                             
		PageFactory.initElements(driver, this);    
		                                          
	}
	
	public void selectRadioButton() {
		driver.findElement(By.xpath("")).click();
	}
	
	
}
