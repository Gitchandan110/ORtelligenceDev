package com.ort.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ort.qa.base.TestBase;

public class NurseForgotPasswordPage  extends TestBase {
	
	@FindBy(xpath="//img[@class='org-logo__image']")
	WebElement ortLogo;

	@FindBy(id ="username")//username for forgot password
	WebElement username;

	@FindBy(xpath="//a[text()='Forgot Password']")//For forgot Password
	WebElement forgotPassword;

	@FindBy(id ="username")//username for forgot password
	WebElement usernameReset;

	@FindBy(xpath="//button[text()='Submit']")//submit button password
	WebElement submit;

	@FindBy(id ="recovery-code")
	WebElement recoveryCode;

	@FindBy(id ="new")
	WebElement enterNewPassword;

	@FindBy(id ="verify")
	WebElement verifyNewPassword;

	@FindBy(xpath="//button[@type='submit']")
	WebElement save;

	@FindBy(xpath="//a[@href='#']")
	WebElement resend;

	public NurseForgotPasswordPage(){                           
		PageFactory.initElements(driver, this);
	}
	
 /*Actions
 */
	
	public boolean validateORtLogo() {
		return ortLogo.isDisplayed(); 
		
	}
	public NurseForgotPasswordPage username(String un) {
		username.sendKeys(un);

		return new NurseForgotPasswordPage();
	}
	public NurseForgotPasswordPage click() {
		return new NurseForgotPasswordPage();
	}

	
	

	public NurseForgotPasswordPage prusername(String prun) {
		username.sendKeys(prun);
		submit.click();
		return new NurseForgotPasswordPage();
	}

 /* Coding for the purpose of Recovery.new password,verify new password.then click on that button. 
 */

	public NurseDashboardPage recoveryCode(String rcd,String enpwd,String vn) {//Coding for the purpose of Recovery.new password,verify new password.then click on that button
		recoveryCode.sendKeys(rcd);
		enterNewPassword.sendKeys(enpwd);
		verifyNewPassword.sendKeys(vn);
		save.click();
		return new NurseDashboardPage(driver);
	}

	public NurseForgotPasswordPage resend() {
		resend.click();
		return new NurseForgotPasswordPage();
	}
	
	

}
