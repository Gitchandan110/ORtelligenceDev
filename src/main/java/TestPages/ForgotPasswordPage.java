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
	}
}


