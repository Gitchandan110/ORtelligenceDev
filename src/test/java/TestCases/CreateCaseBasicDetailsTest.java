package TestCases;

import java.util.concurrent.TimeUnit;

import javax.security.auth.callback.ConfirmationCallback;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.TestBase.TestBase;

import TestPages.CreateCaseBasicDetailsPage;

public class CreateCaseBasicDetailsTest 
{
	WebDriver wd;

	@BeforeMethod
	public void Setup() {
	
	System.setProperty("webdriver.chrome.driver","C:\\SeleniumDriver\\chromedriver.exe");
	wd = new ChromeDriver();
	wd.get("https://qa.ortelligence.com/#/");
	wd.manage().window().maximize();
	wd.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	wd.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	wd.manage().deleteAllCookies();
	}

	@Test(priority = 1)
	public void LoginTest() throws InterruptedException 
	{
		Thread.sleep(3000);
		//Username Field
		wd.findElement(By.id("username")).sendKeys("QANurseOAFacilityOASystemOA@mailinator.com");
		Thread.sleep(1000);
		//Password Field
		wd.findElement(By.id("password")).sendKeys("ORT@3322");
		Thread.sleep(1000);
		// Login button
		wd.findElement(By.xpath("//button[contains(text(),'Sign On')]")).click();
		Thread.sleep(2000);

		// Facility Dropdown - Click
		Thread.sleep(3000);
		wd.findElement(By.name("locationId")).click();
		Thread.sleep(3000);

		// Facility Dropdown - Select value
		wd.findElement(By.name("locationId")).sendKeys("Test Facility OA System OA Address OA , Dallas, Texas, 650");
		Thread.sleep(1000);
		
		String confirmButton = "button[contains(text(),'Confirm')]";
		// Confirm button
		wd.findElement(By.xpath(confirmButton)).click();
		Thread.sleep(3000);

		// Create Case button
		wd.findElement(By.xpath("(//div[@class='rcorners3 border border-primary flexchild pointer-div'])[4]")).click();
		Thread.sleep(10000);
	
		// Last Name
		wd.findElement(By.xpath("//input[@id='lastName']")).sendKeys("s");
		Thread.sleep(3000);
		
		// First Name
		wd.findElement(By.xpath("//input[@id='firstName']")).sendKeys("v");
		Thread.sleep(3000);
		
		// MNR
		wd.findElement(By.xpath("//input[@id='mrn']")).sendKeys("646464");
		Thread.sleep(3000);
	
		// Search button
		wd.findElement(By.xpath("//button[text()='Search']")).click();
		Thread.sleep(5000);

		// Select Patient
		wd.findElement(By.xpath("//button[@name='Select']")).click();
		Thread.sleep(3000);
			
		// Surgeon
		wd.findElement(By.xpath("//select[@id='surgeon']")).sendKeys("QAHcpSurgeonOA FacilityOASystemOA");
		Thread.sleep(3000);
		
		// Urgency
		wd.findElement(By.xpath("//select[@id='urgency']")).sendKeys(" Normal (Up to 48hrs.)");
		Thread.sleep(3000);
			
		// Speciality
		wd.findElement(By.xpath("//select[@id='specialtyId']")).sendKeys(" Trauma");
		Thread.sleep(3000);
		
		// Next button
		wd.findElement(By.xpath("//button[text()='Next']")).click();
		Thread.sleep(3000);
		
//<<<<<<< HEAD
		// Femur
		wd.findElement(By.xpath("//map[@class='ng-star-inserted'] //area[@coords='200,361,199,383,198,401,194,423,208,422,208,413,211,398,213,381,216,362']")).click();
		Thread.sleep(3000);
//=======
//		wd.findElement(By.xpath("//div[@id='selectedBodyPartNameDivId']")).click();
////		Thread.sleep(2000);
		
//		// 
//		wd.findElement(By.xpath("")).click();
//		Thread.sleep(3000);
//>>>>>>> 46537dab4829e9af0cb9d9e6a154850d7e3482cc
		
		
	
	
	
	}
	
}
