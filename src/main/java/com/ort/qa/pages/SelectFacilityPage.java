package com.ort.qa.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.ort.qa.base.TestBase;
import com.ort.qa.util.DropDownHandler;



public class SelectFacilityPage extends TestBase
{

	WebDriver driver;
	
 /*	Select Facility Dropdown*
 */
	
	@FindBy(xpath="//select[@name='locationId']")
	WebElement facilityDropdown;

 /*	Confirm button
 */
	
	@FindBy(xpath="//button[text()='Confirm']")
	WebElement confirm;	
	 
	
	@FindBy(xpath="(//a[@class='menu-font'])[4]")
	WebElement createcase;	
	
	@FindBy(xpath="(//div[@class='rcorners3 border border-primary flexchild pointer-div'])[4]")
	public WebElement dashboardCreateCase;
	
	
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
