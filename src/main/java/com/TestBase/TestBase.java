package com.TestBase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.events.WebDriverEventListener;

import Utility.TestUtil;


public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop;
	
	
	public TestBase(){
	try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream(System.getProperty("user.dir")+ "\\src\\main\\resources\\config.properties");
			prop.load(ip);
		} 
	catch (FileNotFoundException e) {
			e.printStackTrace();
		} 
	catch (IOException e) {
			e.printStackTrace();
		}
	}   
	
	public static void initialization(){
		String browserName = prop.getProperty("browser");  //initialising the browser using property file
		
		if(browserName.equals("chrome")){
			System.setProperty("webdriver.chrome.driver","D:\\SELENIUM\\DRIVERS\\chromedriver");	     //C:\SeleniumDriver
			driver = new ChromeDriver(); 
		}
		else if(browserName.equals("FF")){
			System.setProperty("webdriver.gecko.driver", "");	
			driver = new FirefoxDriver(); 
		}	
	
	
		
	    driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
	    driver.get(prop.getProperty("url"));  //reading the property file to get URL
		
	
	}
}
