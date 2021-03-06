package com.ort.qa.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ort.qa.base.TestBase;




public class LoginPage extends TestBase{ 
		

 /* we have to use Page Factory-Object Repository
 * Here we will segregate all XPath using @FindBy annotation
 */
	WebDriver driver;
	@FindBy(name="username")
	WebElement username;

	@FindBy(name="password")
	WebElement password;

	@FindBy(xpath="//*[@id=\"page-ui-container\"]/div/div/div/div[2]/div[1]/div/form/div[3]/button")  
	WebElement signUpBtn;

	@FindBy(xpath="//img[contains(@class,org-logo__image)]")
	WebElement ortLogo;
	
	@FindBy(xpath="//div[text()='Incorrect username or password. Please try again.']")
	WebElement errorMsgForInvalidMail;

	@FindBy(xpath="//a[text()='Forgot Password']")
	WebElement forgotPassword;
	
	@FindBy(xpath="//a[text()='Forgot Password link']")
	WebElement forgotPasswordlink;
	
	@FindBy(xpath="//*[@id=\"page-ui-container\"]/div/div/div/div[2]/div[1]/div/div/div/text()") 
	WebElement passwordResetMsg;
	
	@FindBy(id="cancel-button")
	WebElement clickOnCancleButtonLink;
	
	@FindBy(id ="recovery-code")
	WebElement recoveryCode;  

	@FindBy(id ="new") 
	WebElement enterNewPassword; 

	@FindBy(id ="verify")
	WebElement verifyNewPassword;

	@FindBy(xpath="//button[@type='submit']")
	WebElement save;
	
 /*
 * using @FindBy annotation we have created different WebElements of login page
 * Now we are initializing the elements using PageFactory
 * Initializing the Page Objects:
 * creating loginpage constructor
 */
	
	public LoginPage(WebDriver dr)
	
	{
		driver=dr;
		

 /* PageFactory is a class and InitElements is method 
 * driver is coming from base class  //'this' means current class object, instead of this we can write LoginPage.class but better to use 'this'
 */

	
		PageFactory.initElements(driver, this);                                              
	}

    // Actions:

	
	public String validateLoginPageTitle(){
		return driver.getTitle();
	}

 /* isDisplayed method will return true or false if the logo is available
 */
	
	public boolean validateORtLogo() 
	{
		return ortLogo.isDisplayed();   
	}
	
	public NurseForgotPasswordPage clickOnForgotPasswordLink() {
		forgotPasswordlink.click();
		return new NurseForgotPasswordPage();
	}

	public LoginPage clickOnCancleLink() {
		clickOnCancleButtonLink.click();
		return new LoginPage(driver);
	}

	
	
	public boolean checkPasswordResetMsg() {
		String verifyPasswordResetMsg = passwordResetMsg.getText();
		if (verifyPasswordResetMsg.equals("Enter your username, and we'll send password reset instructions to your email address.")) {
			System.out.println("PasswordReset msg- Enter your username, and we'll send password reset instructions to your email address is displayed correctly.");
			return true;
		} else {
		System.out.println("PasswordResetmsg should display as- 'Enter your username, and we'll send password reset instructions to your email address'");
		return false;
	}
	}
	
	
	public boolean checkErrorMessage() {

		if (errorMsgForInvalidMail.getText().equals("Incorrect username or password. Please try again.")) {
			System.out.println("Invalid login Cred entered.");
			return true;
		} else {

			System.out.println("Error msg should be displayed as--'Incorrect username or password. Please try again.'");
			return false;
		}
	}

	public NurseDashboardPage login(String un, String pwd) throws InterruptedException{

		username.sendKeys(un);
		password.sendKeys(pwd);
		Thread.sleep(2000);
		signUpBtn.click();
		return new NurseDashboardPage(driver); 
	}
	

}


//deleted SelectFacilityPage login1 method: 03/06/2021














