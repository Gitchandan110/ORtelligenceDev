package TestPages;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

import com.TestBase.TestBase;

	public class LoginPage extends TestBase{ 
		
		// we have to use Page Factory-Object Repository
		//Here we will segregate all XPath using @FindBy annotation
		@FindBy(name="username")
		WebElement username;
		
		@FindBy(name="password")
		WebElement password;

		@FindBy(xpath="//*[@id=\"page-ui-container\"]/div/div/div/div[2]/div[1]/div/form/div[3]/button")   //xpath
		WebElement signUpBtn;
		
		@FindBy(xpath="//img[contains(@class,org-logo__image)]")
		WebElement ORtLogo;
	
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
		//
		//using @FindBy annotation we have created different WebElements of login page
		//Now we are initializing the elements using PageFactory
		//Initializing the Page Objects:
		public LoginPage(){                             //creating loginpage constructor
			PageFactory.initElements(driver, this);    //PageFactory is a class and InitElements is method 
			                                          //driver is coming from base class  //'this' means current class object, instead of this we can write LoginPage.class but better to use 'this'
		}
		
		//Actions:
		public String validateLoginPageTitle(){
			return driver.getTitle();
		}
		
		public boolean validateORtLogo() {
		return ORtLogo.isDisplayed();   //isDisplayed method will return true or false if the logo is available
		}
		
		public ForgotPasswordPage login(String Rcd, String ENpwd, String VN) {
			forgotPassword.click();
			recoveryCode.sendKeys("Rcd");
			enterNewPassword.sendKeys("ENpwd");
			verifyNewPassword.sendKeys("VN");
			save.click();
			
			return new ForgotPasswordPage();
			
		}
		
			
		public DashboardPage login(String un, String pwd){
			username.sendKeys(un);
			password.sendKeys(pwd);
			signUpBtn.click();
			    		
			return new DashboardPage(); // it  will return to Dashboard page
		}
		
		
		public ManageHealthSystemPage dashboard(String un, String pwd){
			username.sendKeys(un);
			password.sendKeys(pwd);
			signUpBtn.click();
			    		
			return new ManageHealthSystemPage(); // it  will return to Dashboard page
		}
		
		
	}

	
		
	


