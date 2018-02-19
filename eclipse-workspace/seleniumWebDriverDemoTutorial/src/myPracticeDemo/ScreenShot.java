package myPracticeDemo;

import java.io.File;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;


public class ScreenShot {

	public void getScreenShot(WebDriver driver, String screenshot) {
		
		try {
			TakesScreenshot ts = (TakesScreenshot)driver;
			File source = ts.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(source, new File("./ErrorScreenshot/"+screenshot+".png"));
			System.out.println("Screen is taken");
			
	
		}catch(Exception e) {
			System.out.println("Exception handled"+e.getMessage());
		}
		
	}
}
