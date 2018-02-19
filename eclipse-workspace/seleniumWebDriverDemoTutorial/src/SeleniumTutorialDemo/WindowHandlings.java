package SeleniumTutorialDemo;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlings {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\Desktop\\Selemium\\chromedriver.exe");
 
	        WebDriver driver = new ChromeDriver();
 
	        // Put an Implicit wait, this means that any search for elements on the page could take the time the implicit wait is set for before throwing exception
 
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 
	        // Launch the URL
			driver.get("http://toolsqa.wpengine.com/automation-practice-switch-windows/");	
	        
	        //Maximize the web page
	        driver.manage().window().maximize();
	        
	        WebElement clickElement = driver.findElement(By.id("button1"));
	        
	        //The loop will open for windows
	        for(int i = 0; i<3; i++) {
	        	clickElement.click();
	       
	        	
	        	//get text
	        	String clickWindow = clickElement.getText();
	        	System.out.println(clickWindow);
	        	
	        	//Het window unique id
	        	String handle = driver.getWindowHandle();
	        	System.out.println(handle);
	        	
	        	
	        	//Returm all the windows handle 
	        	Set <String> allWindowHandles = driver.getWindowHandles();
	        	
	        	//Return a group of elements or Arrays
	        	for(String handle1 : allWindowHandles = driver.getWindowHandles()) {
	        		System.out.println("Windoes handle"+ handle1);
	        	}
	        	Thread.sleep(5000);
	        	
	        }
	        	driver.quit();
	}

}
