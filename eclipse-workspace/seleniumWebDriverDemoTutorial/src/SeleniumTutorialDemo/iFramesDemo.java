package SeleniumTutorialDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iFramesDemo {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\Desktop\\Selemium\\chromedriver.exe");
		 
		WebDriver driver = new ChromeDriver();
		driver.get("http://toolsqa.wpengine.com/iframe-practice-page/");

     //Get the total number of iframes in a web page by finding element using iframe tag
		List <WebElement> iframe = driver.findElements(By.tagName("iframe"));
		//print total number
		System.out.println("The total numbers of iframes are:"+ iframe.size());
		
		Thread.sleep(3000);
		//switch by index
		driver.switchTo().frame(0);
		
		
		Thread.sleep(3000);
		//switch by name or by ID
		driver.switchTo().frame("iframe1");
		//driver.switchTo().frame("IF1");
		
		
		Thread.sleep(3000);
		//switch to another iframe by WebElement
		//first find the WebElement using a locator
		WebElement iframeElement = driver.findElement(By.id("IF1"));
		
		//pass the WebElement to the switch command
		driver.switchTo().frame(iframeElement);
		
		
		Thread.sleep(3000);
		//Switch back to the main page or Parent page
		driver.switchTo().defaultContent();
		
		
		
		
		driver.quit();
		
		
	}

}
