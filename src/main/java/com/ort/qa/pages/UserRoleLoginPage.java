package com.ort.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.ort.qa.util.RepositoryPages;

public class UserRoleLoginPage extends RepositoryPages {
	
	
	@FindBy(xpath="//li[@class='dropdown user-menu pl-sm-0']")
	public WebElement menuUserName; 
	
	@FindBy(xpath="(//a[text()='Logout'])[1]")
	public WebElement menuLogout;
	
	
public  UserRoleLoginPage(WebDriver dr)
	
	{
		driver=dr;
		PageFactory.initElements(driver, this);  
	}
	
public void userRoleLogin(String status,String userRoleLoginId, String userRolePassword, String facilitySelection) throws InterruptedException 
{
	username.sendKeys(userRoleLoginId);
	Thread.sleep(2000);
	
	password.sendKeys(userRolePassword);
	Thread.sleep(2000);
	
	signUpBtn.click();
	Thread.sleep(2000);
	
	facilityDropdown.sendKeys(facilitySelection);
	Thread.sleep(2000);
	
	confirm.click();
 
	
}

public  void clickOnMenuLogout() throws InterruptedException 
{
	Thread.sleep(2000);
	Actions action = new Actions(driver);
	action.moveToElement(menuUserName).build().perform();
	menuLogout.click();

}

	
	

}
