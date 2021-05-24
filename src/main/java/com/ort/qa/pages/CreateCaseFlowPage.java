package com.ort.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ort.qa.base.TestBase;

public class CreateCaseFlowPage extends TestBase {
	
	WebDriver driver;
	@FindBy(name="username")
	WebElement username;

	@FindBy(name="password")
	WebElement password;

	@FindBy(xpath="//*[@id=\"page-ui-container\"]/div/div/div/div[2]/div[1]/div/form/div[3]/button")  
	WebElement signUpBtn;
	
	@FindBy(xpath="//select[@name='locationId']")
	WebElement facilityDropdown;
	
	@FindBy(xpath="//button[text()='Confirm']")
	WebElement confirm;	
	 
	@FindBy(xpath="(//a[@class='menu-font'])[4]")
	WebElement createcase;	
	 
	@FindBy(xpath="//input[@id='lastName']")
	WebElement patientLastName;
	
	@FindBy(xpath="//input[@id='firstName']")
	WebElement patientFirstName;
	
	@FindBy(xpath="//input[@id='dob']")
	WebElement patientDOB;
	
	@FindBy(xpath="//input[@id='mrn']")
	WebElement patientMRN;
	
	@FindBy(xpath="//button[text()='Search']")
	WebElement search;
	
	@FindBy(xpath="//button[@name='Select']")
	WebElement selectPatient;
	
	
    public CreateCaseFlowPage(WebDriver dr)
	
	{
		driver=dr;
		PageFactory.initElements(driver, this); 
		
	}
    
    
    public void createCaseFlowVerify()

    {
	
    	
	
    }
	
	
	
	
	
	
	
	
	
	
	/*public static WebDriver driver;
	private static final int WAIT = 30;
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://qa.ortelligence.com/#");
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.cssSelector("#username")).sendKeys("Christiana_nurse1@mailinator.com");
		driver.findElement(By.cssSelector("#password")).sendKeys("ORT@33221");
		driver.findElement(By.xpath("//button[text()='Sign On']")).click();
		WebElement ele =driver.findElement(By.xpath("//select"));
		Select sel = new Select(ele);
		sel.selectByIndex(2);
		driver.findElement(By.xpath("//button[text()='Confirm']")).click();
		driver.findElement(By.xpath("//img[@alt='Create Case']")).click();
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Sharma");
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("vikas");
		driver.findElement(By.xpath("//input[@id='mrn']")).sendKeys("646464");
		driver.findElement(By.xpath("//button[text()='Search']")).click();
		driver.findElement(By.xpath("//button[@name='Select']")).click();
		
		
*/

	
	
}

