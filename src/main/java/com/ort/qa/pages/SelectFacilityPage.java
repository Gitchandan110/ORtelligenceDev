package com.ort.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.ort.qa.base.TestBase;
import com.ort.qa.util.DropDownHandler;



public class SelectFacilityPage extends TestBase
{
	WebDriver driver;
//	Select Facility Dropdown*
	@FindBy(xpath="//select[@name='locationId']")
	WebElement facilityDropdown;

//	Confirm button
	@FindBy(xpath="//button[text()='Confirm']")
	WebElement confirm;	
	
//  Initialization
	public SelectFacilityPage(WebDriver dr ) 
	{
		driver = dr;
		PageFactory.initElements(driver, this);
	}
		
	
//	Actions : 
	public void clickConfirm()
	{
		
		confirm.click();
	}
	
	
	public void clickOnDropDown() {
		DropDownHandler dp =new DropDownHandler(driver);
        dp.SelectUsingVisibleText(facilityDropdown,"Wilmington, DE, 19899 , Wilmington, Delaware, 19899");
	}
	
	
	
	
//	public static WebElement getElement(By element) {
//		return driver.findElement(element);
//}
//	
//	
//	public static void SelectUsingVisibleValue(WebElement element, String visibleValue) {
//		Select select = new Select(element);
//		select.selectByVisibleText(visibleValue);
//		}

}
