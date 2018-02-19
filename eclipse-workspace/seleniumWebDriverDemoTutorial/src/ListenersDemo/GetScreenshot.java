package ListenersDemo;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class GetScreenshot{
	
	
	public static void capture(WebDriver driver, String screenshotName){
		//Screenshot
				try {
					TakesScreenshot ts = (TakesScreenshot)driver;
					File source = ts.getScreenshotAs(OutputType.FILE);
					FileUtils.copyFile(source, new File("./ErrorScreenshot/"+screenshotName+".png"));
					System.out.println("Screen shot taken");
					
				} catch (Exception e) {
					
					System.out.println("Exception while taken screenshot"+ e);
				}
				
		
		
		
	}

}
