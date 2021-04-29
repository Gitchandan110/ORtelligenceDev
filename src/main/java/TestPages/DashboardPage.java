package TestPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.TestBase.TestBase;

public class DashboardPage extends TestBase
{
	
	
	@FindBy(xpath="/html/body/app-root/app-full-layout/app-header/div/div[2]/div/div[1]/label")
		WebElement usernameLable;   //ignore this
		
	
	@FindBy(xpath="//img[@class='logo-width']]")                      //xpath for logolink
	WebElement ORtLogo;
	
	@FindBy(xpath="//*[@id=\"menu-ul\"]/ul/li[3]/a")
	WebElement menu;
	
	@FindBy(xpath="//*[@id=\"menu-ul\"]/ul/li[3]/div/a[1]")                     //xpath for profile link
	WebElement profilelink;
	
	@FindBy(xpath="//*[@id=\"menu-ul\"]/ul/li[1]/a")                    //xpath for ManageHealthSystemLink
	WebElement manageHealthSystemLink;
	
	@FindBy(xpath="//a[@class='menu-font menu-active']")                    //xpath for AlertsLink
	WebElement AlertsLink;
	
	
	public DashboardPage(){                             //creating loginpage constructor
		PageFactory.initElements(driver, this);
	
	}

	public String verifyDashboardPageTitle() {  // this method will call from DashBoard Test Class
		return driver.getTitle();
		
	}
	public boolean verifyCorrectUserNameLable() {
	return usernameLable.isDisplayed();            //ignore this
}

	public  boolean verifyMenu() {
		return menu.isDisplayed(); 
		
	}
	
	public  ProfilePage clickOnProfileLink() {
		profilelink.click();
		return new ProfilePage();  
		
	}
	public  ManageHealthSystemPage clickOnManageHealthSystemLink() {
		 manageHealthSystemLink.click();
		return new ManageHealthSystemPage();
	}
	
	public AlertsPage  AlertsLink() {
		AlertsLink.click();
		return new AlertsPage();
	}
	
}
