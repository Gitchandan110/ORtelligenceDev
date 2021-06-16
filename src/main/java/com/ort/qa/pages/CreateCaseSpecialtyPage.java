package com.ort.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ort.qa.base.TestBase;
import com.ort.qa.util.DropDownHandler;

public class CreateCaseSpecialtyPage extends TestBase
{
 /* Select Facility Dropdown*
	 */
	
	@FindBy(xpath="//select[@class='form-control ng-pristine ng-invalid ng-touched']")
	WebElement selectSpecialty;
	
	/*	next button
	 */
			
	@FindBy(xpath="(//button[@class='btn btn-primary'])[2]")
	WebElement next;	
	
	
 /*  Initialization
 */
	
	public CreateCaseSpecialtyPage() 

	{
		
		PageFactory.initElements(driver, this);
	}
	
 /* Actions 
 */
	
	public void selectSpecialty()
	{

		selectSpecialty.click();
	}
	
	public void clickOnDropDown() {
		DropDownHandler ds =new DropDownHandler(driver);
		 ds.selectUsingVisibleText(selectSpecialty,"Trauma");
	
	}
	public void clickOnNext()
	{

		 next.click();
	}
	
	
	
	
	

}
