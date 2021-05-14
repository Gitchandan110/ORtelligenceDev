package TestPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.TestBase.TestBase;

public class NurseForgotPasswordPage  extends TestBase {
	
	@FindBy(xpath="//img[@class='org-logo__image']")//For Logo
	WebElement ORtLogo;



	@FindBy(id ="username")//username for forgot password
	WebElement username;

	@FindBy(xpath="//a[text()='Forgot Password']")//For forgot Password
	WebElement forgotPassword;

	/*@FindBy(xpath="//img[@class='org-logo__image']")//Logo for next page.
	*WebElement ORtLogo1;
	 */
	
	@FindBy(id ="username")//username for forgot password
	WebElement usernameReset;

	@FindBy(xpath="//button[text()='Submit']")//submit button password
	WebElement submit;

	 /*@FindBy(xpath="//img[@class='org-logo__image']")//Logo for page 2
	*WebElement ORtLogo2;
	 */
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

	public void ForgotPasswordPage(){                           
		PageFactory.initElements(driver, this);
	}
	/*Actions
*/
	public boolean validateORtLogo() {
		return ORtLogo.isDisplayed(); 
		
	}
	public AdminForgotPasswordPage username(String un) {
		username.sendKeys(un);

		return new AdminForgotPasswordPage();
	}
	public AdminForgotPasswordPage click() {
		return new AdminForgotPasswordPage();
	}

	
	

	public AdminForgotPasswordPage prusername(String prun) {
		username.sendKeys(prun);
		submit.click();
		return new AdminForgotPasswordPage();
	}

	/*Coding for the purpose of Recovery.new password,verify new password.then click on that button. 
	 */

	public AdminDashboardPage recoveryCode(String rcd,String enpwd,String vn) {//Coding for the purpose of Recovery.new password,verify new password.then click on that button
		recoveryCode.sendKeys(rcd);
		enterNewPassword.sendKeys(enpwd);
		verifyNewPassword.sendKeys(vn);
		save.click();
		return new AdminDashboardPage();
	}

	public AdminForgotPasswordPage resend() {
		resend.click();
		return new AdminForgotPasswordPage();
	}
	
	

}
