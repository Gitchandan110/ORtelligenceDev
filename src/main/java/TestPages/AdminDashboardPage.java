package TestPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.TestBase.TestBase;

public class AdminDashboardPage extends TestBase
{
	
	
	@FindBy(xpath="/html/body/app-root/app-full-layout/app-header/div/div[2]/div/div[1]/label")
		WebElement usernameLable;   //ignore this
		
	//to check logo link
	@FindBy(xpath="//img[@class='logo-width']]")                     
	WebElement ORtLogo;
	
	@FindBy(xpath="//*[@id=\"menu-ul\"]/ul/li[3]/a")
	WebElement menu;
	
	//to check profile link
	@FindBy(xpath="//*[@id=\"menu-ul\"]/ul/li[3]/div/a[1]")                     
	WebElement profileLink;
	
	//to check manage health system link
	@FindBy(xpath="//*[@id=\"menu-ul\"]/ul/li[1]/a")                    
	WebElement manageHealthSystemLink;
	
	//to check Alert Link
	@FindBy(xpath="//a[@class='menu-font menu-active']")                   
	WebElement AlertsLink;
	
	//creating DashboardPage Constructor and initializing page elements
	public AdminDashboardPage(){                           
		PageFactory.initElements(driver, this);
	
	}
	// verifyDashboardPageTitle method will call from DashBoard Test Class
	public String verifyAdminDashboardPageTitle() {  
		return driver.getTitle();
		
	}
	public boolean verifyCorrectUserNameLable() {
	return usernameLable.isDisplayed();            //ignore this
}

	public  boolean verifyMenu() {
		return menu.isDisplayed(); 
		
	}
	
	public  void clickOnProfileLink() {
		Actions action = new Actions(driver);
		action.moveToElement(profileLink).build().perform();
		profileLink.click();
		//profilelink.click();
		//return new ProfilePage();  
		
	}
	public  AdminManageHealthSystemPage clickOnManageHealthSystemLink() {
		 manageHealthSystemLink.click();
		return new AdminManageHealthSystemPage();
	}
	
	public AlertsPage  AlertsLink() {
		AlertsLink.click();
		return new AlertsPage();
	}
	
}  
