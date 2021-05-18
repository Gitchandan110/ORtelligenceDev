package com.ort.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.ort.qa.util.TestUtil;
import com.ort.qa.util.WebEventListener;


public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop;
	public static EventFiringWebDriver e_driver;
	public static WebEventListener eventListener;
	
	
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
		
		/*initialising the browser using property file
		 */
		String browserName = prop.getProperty("browser");  
		
		/*priyanka's driver path:"webdriver.chrome.driver","C:\\SeleniumDriver\\chromedriver.exe
		 * Piyush's driver path : D:\BITBUCKET\ortelligence-automation-qa\src\test\resources\Driver\chromedriver.exe
		 * 
		 * */
		
		if(browserName.equals("chrome")){
			System.setProperty("webdriver.chrome.driver","D:\\BITBUCKET\\ortelligence-automation-qa\\src\\test\\resources\\Driver\\chromedriver.exe");	     
			driver = new ChromeDriver(); 
		}
		else if(browserName.equals("FF")){
			System.setProperty("webdriver.gecko.driver", "");	
			driver = new FirefoxDriver(); 
		}	
	
		e_driver = new EventFiringWebDriver(driver);
		/* Now create object of EventListerHandler to register it with EventFiringWebDriver
		 */
		eventListener = new WebEventListener();
		e_driver.register(eventListener);
		driver = e_driver;
		
	    driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		
		/*reading the property file to get URL
		 */
	    driver.get(prop.getProperty("url")); 
	   
		
	
	}
}
