package SeleniumTutorialDemo;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoIt {

	private static WebDriver driver = null;
	
	
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\Desktop\\Selemium\\chromedriver.exe");
		
			driver = new ChromeDriver();
			
		    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		    //AutoIt
		    Runtime.getRuntime().exec("C:\\Users\\Administrator\\Desktop\fileupload.exe");
			
		    driver.get("http://toolsqa.wpengine.com/automation-practice-form");
	 
		    driver.findElement(By.id("photo")).click();
		    
		 
		    Thread.sleep(5000);
		    
		    driver.close();

			
			
			
			
			
			
			
			
			
	}

}
