package CaptureScreenshots;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Library.ScreenshotUtility;

public class captureScreenShot {

	@Test
	public void captureScreenshot() throws Exception
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\Desktop\\Selemium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Take screen shot of the browser starting
		ScreenshotUtility.screenshot(driver, "Browser started");
		
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.get("http://www.unisa.ac.za/sites/myunisa/default/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		
		
		//Take screenshot when the username is entered
		ScreenshotUtility.screenshot(driver, "Enter user name");
		
		WebElement txt = driver.findElement(By.xpath(""));
			txt.sendKeys("48094560");
			
			//SCREENSHOT
			try {
				TakesScreenshot ts = (TakesScreenshot)driver;
				File source = ts.getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(source, new File("./ScreenShots/facebook.png"));
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println("Screenshots taken");
			
			//close the browser
			
	}

}
