package TestPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.TestBase.TestBase;

public class ForgotPasswordPage extends TestBase {
	//For Logo
	@FindBy(xpath="//img[@class='org-logo__image']")
	WebElement ORtLogo;
	
	//For forgot Password
	@FindBy(xpath="//a[text()='Forgot Password']")
	WebElement forgotPassword;
	
	//Logo for next page.
	@FindBy(xpath="//img[@class='org-logo__image']")
	WebElement ORtLogo1;
	
	//username for forgot password
	@FindBy(id ="username")
	WebElement username;
	
	//submit button password
	@FindBy(xpath="//button[text()='Submit']")
	WebElement submit;
	
	//Logo for page 2
	@FindBy(xpath="//img[@class='org-logo__image']")
	WebElement ORtLogo2;
	
	//Recovery code Purpose
	@FindBy(id ="recovery-code")
	WebElement recoveryCode;
	
	//For new Password
	@FindBy(id ="new") 
	WebElement enterNewPassword;
	
	//For new Password
	@FindBy(id ="verify")
	WebElement verifyNewPassword;
	
	//For next page
	@FindBy(xpath="//button[@type='submit']")
	WebElement save;
	
	//Link for Resend
	@FindBy(xpath="//a[@href='#']")
	WebElement resend;
	
	//creating  constructor
	public ForgotPasswordPage(){                            
		PageFactory.initElements(driver, this);
	}
	
	//Actions
	//For first logo
	//isDisplayed method will return true or false if the logo is available
	public boolean validateORtLogo() {
		return ORtLogo.isDisplayed();   
	}
	
	//Link click for Forgot Password
	public ForgotPasswordPage click() {
		forgotPassword.click();
		return new ForgotPasswordPage();
	}
<<<<<<< HEAD
	//Logo for new page1
	//isDisplayed method will return true or false if the logo is available
	public boolean validateORtLogo1() {
		return ORtLogo1.isDisplayed();   
	}
	//For the username and Submit Purpose
	public ForgotPasswordPage username(String un) {
		username.sendKeys(un);
		submit.click();
		return new ForgotPasswordPage();
	}
	//Logo for new page2
	//isDisplayed method will return true or false if the logo is available
	public boolean validateORtLogo2() {
		return ORtLogo2.isDisplayed();   
	}

	//Coding for the purpose of Recovery.new password,verify new password.then click on that button
	public DashboardPage recoveryCode(String rcd,String enpwd,String vn) {
		recoveryCode.sendKeys(rcd);
		enterNewPassword.sendKeys(enpwd);
		verifyNewPassword.sendKeys(vn);
		save.click();
		return new DashboardPage();
	}
	//for the purpose of New Page Link we are going to Click on the Resend option such that we can get our code.
	public ForgotPasswordPage resend() {
		resend.click();
		return new ForgotPasswordPage();
=======

	public boolean validateORtLogo1() {//Logo for new page1
		return ORtLogo1.isDisplayed();   //isDisplayed method will return true or false if the logo is available
	//}

	//public ForgotPasswordPage username(String un) {//For the username and Submit Purpose
		//username.sendKeys(un);
	//	submit.click();
	//	return new ForgotPasswordPage();
	}

	//public boolean validateORtLogo2() {//Logo for new page2
		//return ORtLogo2.isDisplayed();   //isDisplayed method will return true or false if the logo is available
>>>>>>> c5581b212efdac04b2c7960b3efbef0444b95313
	}


//	@FindBy(xpath="//img[@class='org-logo__image']")//For Logo
//	WebElement ORtLogo;
//
//	@FindBy(xpath="//a[text()='Forgot Password']")//For forgot Password
//	WebElement forgotPassword;
//
//	//@FindBy(xpath="//img[@class='org-logo__image']")//Logo for next page.
//	//WebElement ORtLogo1;
//
//	@FindBy(id ="username")//username for forgot password
//	WebElement username;
//
//	@FindBy(xpath="//button[text()='Submit']")//submit button password
//	WebElement submit;
//
//	//@FindBy(xpath="//img[@class='org-logo__image']")//Logo for page 2
//	//WebElement ORtLogo2;
//
//	@FindBy(id ="recovery-code")//Recovery code Purpose
//	WebElement recoveryCode;
//
//	@FindBy(id ="new")//For new Password 
//	WebElement enterNewPassword;
//
//	@FindBy(id ="verify")//For new Password
//	WebElement verifyNewPassword;
//
//	@FindBy(xpath="//button[@type='submit']")//For next page
//	WebElement save;
//
//	@FindBy(xpath="//a[@href='#']")//Link for Resend
//	WebElement resend;
//
//	public ForgotPasswordPage(){                             //creating  constructor
//		PageFactory.initElements(driver, this);
//	}
//	//Actions
//
////	public boolean validateORtLogo() {//For first logo
//		return ORtLogo.isDisplayed();   //isDisplayed method will return true or false if the logo is available
//	}
//	public ForgotPasswordPage click() {//Link click for Forgot Password
//		forgotPassword.click();
//		return new ForgotPasswordPage();
//	}
//
//	//public boolean validateORtLogo1() {//Logo for new page1
//	//	return ORtLogo1.isDisplayed();   //isDisplayed method will return true or false if the logo is available
//	//}
//
//	public ForgotPasswordPage username(String un) {//For the username and Submit Purpose
//		username.sendKeys(un);
//		submit.click();
//		return new ForgotPasswordPage();
//	}
//
//	//public boolean validateORtLogo2() {//Logo for new page2
//		//return ORtLogo2.isDisplayed();   //isDisplayed method will return true or false if the logo is available
//	//}
//
//
//	public DashboardPage recoveryCode(String rcd,String enpwd,String vn) {//Coding for the purpose of Recovery.new password,verify new password.then click on that button
//		recoveryCode.sendKeys(rcd);
//		enterNewPassword.sendKeys(enpwd);
//		verifyNewPassword.sendKeys(vn);
//		save.click();
//		return new DashboardPage();
//	}
//
//	public ForgotPasswordPage resend() {//for the purpose of New Page Link we are going to Click on the Resend option such that we can get our code.
//		resend.click();
//		return new ForgotPasswordPage();
//	}
//
//}
//
//
//
