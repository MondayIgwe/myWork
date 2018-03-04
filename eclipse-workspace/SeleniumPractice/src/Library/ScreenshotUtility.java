package Library;

/*
 * A UTILITY LIBRARY THAT YOU CAN USE TO INVOKE THE FUNCTION IN ANY CLASS TO TAKE SCREENSHOTS
 * 
 * e.g ScreenshotUtility.screenshot(driver, "enter the step strings");
 */
import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenshotUtility {
	
	public static void screenshot(WebDriver driver, String screenshot)
	{
		try {
			TakesScreenshot ts = (TakesScreenshot)driver;
			File source = ts.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(source, new File("./ScreenShots/"+screenshot+" .png"));
		} catch (Exception e) {
			System.out.println("Exception while taken screenshots"+e.getMessage());
		
	
	}

	}
}
