package Utility;

import java.io.File;

import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.TestBase.TestBase;

public class TestUtil extends TestBase {
	
	

	public static long PAGE_LOAD_TIMEOUT=10;

	public static long IMPLICIT_WAIT=50;
	
	/*public static void takeScreenshotAtEndOfTest() throws IOException {
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String currentDir = System.getProperty("user.dir");
		FileUtils.copyFile(scrFile, new File(currentDir + "/screenshots/" + System.currentTimeMillis() + ".png"));
		
	}*/
	


}
