package com.ort.qa.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.ort.qa.base.TestBase;
import com.ort.qa.util.DropDownHandler;
import com.ort.qa.util.RepositoryPages;



public class SelectFacilityPage extends RepositoryPages
{

	WebDriver driver;
	
 
	
 /*  Initialization
 */
	
	public SelectFacilityPage(WebDriver dr) 

	{
		driver=dr;
		PageFactory.initElements(driver, this);
	}
		
	
	/*	Actions : 
	 */
	
	
	public void clickOnDropDown() {
		DropDownHandler dp =new DropDownHandler(driver);
        dp.selectUsingVisibleText(facilityDropdown,"Wilmington, DE, 19899 , Wilmington, Delaware, 19899");
	}
	
	public void clickOnCreateCase()
	{
		dashboardCreateCase.click();
	}
	
	
	public void clickConfirm()
	{
		
		confirm.click();
	}
	
	
}
