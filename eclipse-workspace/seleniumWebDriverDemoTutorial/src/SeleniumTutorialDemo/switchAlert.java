package SeleniumTutorialDemo;

import java.util.concurrent.TimeUnit;

//IMPORT PACKAGES
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;


public class switchAlert {

	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\Desktop\\Selemium\\chromedriver.exe");
		//Instantiate objects
			WebDriver driver = new ChromeDriver();
			
			//implict wait-->it is the Default wait
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			
			
			
			driver.get("http://jsbin.com/usidix/1");
			String alertMessage = "";
			driver.findElement(By.cssSelector("input[value=\"Go!\"]")).click();
			
			//asssign the alert variable to the object iorder to get the message
			alertMessage = driver.switchTo().alert().getText();
			
			//automatically close the alert message
			driver.switchTo().alert().accept();
			
			System.out.println(alertMessage);
			
			//close all windows
			driver.quit();
			
			
			
			
		

	}

}
