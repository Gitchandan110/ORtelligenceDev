package TestCases;

import java.util.concurrent.TimeUnit;

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
	
	System.setProperty("webdriver.chrome.driver","D:\\SELENIUM\\DRIVERS\\chromedriver.exe");
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
		Thread.sleep(3000);

		// Confirm button
		wd.findElement(By.xpath("//button[contains(text(),'Confirm')]")).click();
		Thread.sleep(3000);

		// Create Case button
		wd.findElement(By.xpath("(//div[@class='rcorners3 border border-primary flexchild pointer-div'])[4]")).click();
		Thread.sleep(3000);
	
		CreateCaseBasicDetailsPage createCaseBasicDetails;
		
		
		
		
		
	
	}
}
