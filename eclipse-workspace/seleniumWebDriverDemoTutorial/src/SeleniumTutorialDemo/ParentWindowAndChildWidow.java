package SeleniumTutorialDemo;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParentWindowAndChildWidow {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\Desktop\\Selemium\\chromedriver.exe");
		 
		WebDriver driver = new ChromeDriver();
		driver.get("http://toolsqa.wpengine.com/automation-practice-switch-windows/");

		//get the Prent window
		String parentWindow = driver.getWindowHandle();
		  System.out.println("Parent window handle  "+parentWindow);
		  
		  //Then open 4 other child windows
		  WebElement clickElement = driver.findElement(By.id("button1"));
		  
		  for(int i=0; i<3; i++) {
			  clickElement.click();
			  
			  System.out.println(clickElement.isEnabled());
			  Thread.sleep(2000);
		  }
		  
		  //Get all the windows handles the are open above
		  Set <String> allWindowhandles = driver.getWindowHandles();
		  
		  //loop
		  for (String handle : allWindowhandles)
		  {
			  System.out.println("Switching to window"+ handle);
			  System.out.println("Navigating to google.com");
			    driver.navigate().to("https://www.google.com");
			  
			  //Switch to windows
			  driver.switchTo().window(handle);
			  
		  }
		  
		  //switch to the the parent window
		  driver.switchTo().window(parentWindow);
		  
		  
		  Thread.sleep(5000);
		  driver.quit();
	}
	

}
