package TestPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.TestBase.TestBase;

public class AddNewHealthSystemPage extends TestBase {
	
	//Initializing the Page Objects:
	public AddNewHealthSystemPage(){                             
		PageFactory.initElements(driver, this);    
		                                          
	}
	
	public void selectRadioButton() {
		driver.findElement(By.xpath("")).click();
	}
	
	
}
