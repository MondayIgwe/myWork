package PageObjects;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
/*
 * Created Methods and Element locators
 */

public class Login_POM {

	
	static WebElement element = null;
	static int PageTimeOut;
	
	
	
	public static WebElement verifyUserName(WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[@id='wpName1']"));
		return element;
	}
	
	public static WebElement verifyPassword(WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[@id='wpPassword1']"));
		return element;
		
	}
	
	
	public static WebElement btn_Login(WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[@id='wpLoginAttempt']"));
		return element;
		
	}
	
	public static int setPageTimeOut(WebDriver driver, int pageTimeOut) {
		PageTimeOut=pageTimeOut;
		driver.manage().timeouts().pageLoadTimeout(pageTimeOut, TimeUnit.SECONDS);
		return pageTimeOut;
		
	}
	
	public void tearDown(WebDriver driver) {
		 driver.quit();
	}
	
	
	
	
}
