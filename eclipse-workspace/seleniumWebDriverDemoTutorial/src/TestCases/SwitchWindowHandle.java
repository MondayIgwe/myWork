package TestCases;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchWindowHandle {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\Desktop\\Selemium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		String url = "http://demosite.center/wordpress/wp-login.php";
		driver.navigate().to(url);
		
		//get the number of links
		List <WebElement> iLinks = driver.findElements(By.tagName("a"));
		 int myLinks = iLinks.size();
		   System.out.println("The numbers of links are" +"==>"+ myLinks);
		
		//Return a string of alphanumeric window handle
		String handle = driver.getWindowHandle();
			System.out.println(handle);
			
			//Returns  a set of window handles 
			Set <String> idhandle = driver.getWindowHandles();
			System.out.println(idhandle);
			
			/*SWITCH METHOD
			 * Switch to Method driver.switchTo().window("windowName");
			 * ===================================================================
			 */
			for (String handles : driver.getWindowHandles()) {
				driver.switchTo().window(handles);
				System.out.println(handles);
			}
			
			/*
							 * Practice Exercise 1
				1) Launch new Browser
				2) Open URL “http://toolsqa.wpengine.com/automation-practice-switch-windows/”
				3) Get Window name (Use GetWindowHandle command)
				4) Click on Button “New Message Window”, it will open a Pop Up Window
				5) Get all the Windows name ( Use GetWindowHandles command)
				6) Close the Pop Up Window (Use Switch Command to shift window)

			 */
			
			//wait
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
				
			//launch application
			driver.get("http://toolsqa.wpengine.com/automation-practice-switch-windows");
			
			
			//get the window name
			String wName = driver.getWindowHandle();
			  System.out.println(wName);
			  
			  // Step 4:  click on the Button
			    driver.findElement(By.name("New Message Window")).click();
			    
			    //Store and print the name of all windows
			    Set wHandles = driver.getWindowHandles();
			       System.out.println(wHandles);
			  
			       //pass a window handle to the other window
			       for (String wHandle1 : driver.getWindowHandles()) {
			    	   System.out.println(wHandle1);
			    	   driver.switchTo().window(wHandle1);
			       }
			
			  
				driver.close();
	}

}
