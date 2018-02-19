package ListenersDemo;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
//import org.testng.annotations.Listeners;
import org.testng.annotations.Test;



//Binding listener with the Test case class when executing a single Test case
//@Listeners(ListenersDemo.TestNGListener.class)

public class TestCase {
	
	@Test
	public void SeleniumTitle() throws Exception {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\Desktop\\Selemium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		GetScreenshot.Capture(driver, "BrowserStarted"); //Capture screenshot
		driver.get("http://www.seleniumhq.org/docs/04_webdriver_advanced.jsp");
		
		GetScreenshot.Capture(driver, "UrlImageTaken"); //Capture screenshot
		System.out.println("The URL is :==>"   +  driver.getCurrentUrl());
		
		GetScreenshot.Capture(driver, "TitlePictureTaken"); //Capture screenshot
		System.out.println(driver.getTitle());
		
		
		
		driver.quit();
		
	}


}
