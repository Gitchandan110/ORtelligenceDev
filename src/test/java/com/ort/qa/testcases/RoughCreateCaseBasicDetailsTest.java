 /*Hard Coded file
 */

package com.ort.qa.testcases;

import java.util.concurrent.TimeUnit;

import javax.security.auth.callback.ConfirmationCallback;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ort.qa.base.TestBase;
import com.ort.qa.pages.CreateCaseBasicDetailsPage;

public class RoughCreateCaseBasicDetailsTest 
{
	WebDriver wd;

	@BeforeMethod
	public void Setup() {
	
 /*	Piyush Driver Location: D:\\SELENIUM\\DRIVERS\\chromedriver.exe
 *  Priyanka Driver Location: 
 */
		
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
		
 /* Username Field
 */
		
		wd.findElement(By.id("username")).sendKeys("Christiana_nurse1@mailinator.com");
		Thread.sleep(1000);
		
 /*Password Field
 */
		
		wd.findElement(By.id("password")).sendKeys("ORT@33221");
		Thread.sleep(1000);
		
 /* Login button
 */
	
		wd.findElement(By.xpath("//button[contains(text(),'Sign On')]")).click();
		Thread.sleep(2000);

 /* Facility Dropdown - Click
 * Thread.sleep(3000);
 * wd.findElement(By.name("locationId")).click();
 * Thread.sleep(3000);
 */
 /*  Facility Dropdown - Select value
 */
	
		wd.findElement(By.name("locationId")).sendKeys("Wilmington, DE, 19899 , Wilmington, Delaware, 19899");
		Thread.sleep(3000);
		//ByAngular.
 /*	String confirmButton = "button[contains(text(),'Confirm')]";
 * Confirm button
 */
	
		wd.findElement(By.xpath("//button[contains(text(),'Confirm')]")).click();
		Thread.sleep(3000);

		/* Create Case button
		 */
		
		wd.findElement(By.xpath("(//div[@class='rcorners3 border border-primary flexchild pointer-div'])[4]")).click();
		Thread.sleep(10000);
	
		/* Last Name
		 */
		wd.findElement(By.xpath("//input[@id='lastName']")).sendKeys("s");
		Thread.sleep(3000);
		
		/*First Name
		 */
		wd.findElement(By.xpath("//input[@id='firstName']")).sendKeys("v");
		Thread.sleep(3000);
		
		/* MNR
		 */
		wd.findElement(By.xpath("//input[@id='mrn']")).sendKeys("646464");
		Thread.sleep(3000);
	
		/* Search button
		 */
		wd.findElement(By.xpath("//button[text()='Search']")).click();
		Thread.sleep(5000);

		/* Select Patient
		 */
		wd.findElement(By.xpath("//button[@name='Select']")).click();
		Thread.sleep(3000);
			
		/*Surgeon
		 */
		wd.findElement(By.xpath("//select[@id='surgeon']")).sendKeys("Christiana Surgeon");
		Thread.sleep(3000);
		
		/*Urgency
		 */
		wd.findElement(By.xpath("//select[@id='urgency']")).sendKeys(" Normal (Up to 48hrs.)");
		Thread.sleep(3000);
			
		/* Speciality
		 */
		wd.findElement(By.xpath("//select[@id='specialtyId']")).sendKeys(" Trauma");
		Thread.sleep(3000);
		
//		/*	Procedure IM Nail Hip / InterTroch / CMN Hip (27245)
//		 */
//		wd.findElement(By.xpath("//input[@id='selectProcedure']")).sendKeys("27244");
//		wd.findElement(By.xpath("//button[@id='ngb-typeahead-0-0']")).click();
//		Thread.sleep(3000);
		
		/* Next button
		 */
		wd.findElement(By.xpath("//button[text()='Next']")).click();
		Thread.sleep(3000);
		
		Thread.sleep(3000);
		wd.findElement(By.xpath("//area[@id='trauma22']")).click();
//		/*Opens System selection page with no System
//		 * Click here button
//		 */
//
//		wd.findElement(By.xpath("//a[text()='Click here']")).click();
//		Thread.sleep(3000);
//		/*	Pop-up opens
//		 * Switch to pop-up
//		 * Alert alert = wd.switchTo().alert();
//		 * Thread.sleep(3000);
//		 */
//
//
//		wd.findElement(By.xpath("//button[text()='Proceed to Cart']")).click();
	
	
	
	}
	
}
