package com.ort.qa.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ort.qa.base.TestBase;

public class LoginPage extends TestBase{ 
		


	/* we have to use Page Factory-Object Repository
	 *Here we will segregate all XPath using @FindBy annotation
	 */
	
	@FindBy(name="username")
	WebElement username;

	@FindBy(name="password")
	WebElement password;

	@FindBy(xpath="//*[@id=\"page-ui-container\"]/div/div/div/div[2]/div[1]/div/form/div[3]/button")  
	WebElement signUpBtn;

	@FindBy(xpath="//img[contains(@class,org-logo__image)]")
	WebElement ortLogo;

	@FindBy(xpath="//a[text()='Forgot Password']")
	WebElement forgotPassword;

	@FindBy(id ="recovery-code")
	WebElement recoveryCode;  

	@FindBy(id ="new") 
	WebElement enterNewPassword; 

	@FindBy(id ="verify")
	WebElement verifyNewPassword;

	@FindBy(xpath="//button[@type='submit']")
	WebElement save;
	
	/*
	 *using @FindBy annotation we have created different WebElements of login page
	 *Now we are initializing the elements using PageFactory
	 *Initializing the Page Objects:
	 *creating loginpage constructor
	 */
	
	public LoginPage(){
		
	/*PageFactory is a class and InitElements is method 
	 *driver is coming from base class  //'this' means current class object, instead of this we can write LoginPage.class but better to use 'this'
	 */
		
		PageFactory.initElements(driver, this);                                              
	}

	/*Actions:
	 */
	
	public String validateLoginPageTitle(){
		return driver.getTitle();
	}

	/*isDisplayed method will return true or false if the logo is available
	 */
	
	public boolean validateORtLogo() {
		return ortLogo.isDisplayed();   
	}


	public NurseDashboardPage login(String un, String pwd){

		username.sendKeys(un);
		password.sendKeys(pwd);
		signUpBtn.click();
		return new NurseDashboardPage(); 
	}
	
	public void loginuser(String user, String pwd)
			{
				username.sendKeys(user);
				password.sendKeys(pwd);
				save.click();
				
			}
			

	public SelectFacilityPage login1(String un, String pwd){

		username.sendKeys(un);
		password.sendKeys(pwd);
		signUpBtn.click();
		return new SelectFacilityPage(); 
	}

}






