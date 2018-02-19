package ConfigurationPackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import utility.ConfigurationReader;

public class TestCaseBrowser {
	


	
	@Test
	public void startBrowser() throws Exception {

		ConfigurationReader path = new ConfigurationReader();
		
		
		System.setProperty("webdriver.chrome.driver",path.getChrome());
			WebDriver driver = new ChromeDriver();
		driver.get("http://google.com");
		

		driver.quit();
	
	


	}
	
}
