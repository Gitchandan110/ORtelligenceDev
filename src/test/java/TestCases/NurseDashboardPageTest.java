package TestCases;

import org.testng.annotations.BeforeMethod;

import com.TestBase.TestBase;

import TestPages.LoginPage;
import TestPages.NurseDashboardPage;

public class NurseDashboardPageTest extends TestBase{
	
	LoginPage loginPage;
	 NurseDashboardPage nurseDashboardPage;
	
     public NurseDashboardPageTest() {
	 super();	
}
     
     @BeforeMethod
 	public void setUp() {
 		initialization();



}}