package TestCases;

import java.util.concurrent.TimeUnit;
import org.testng.annotations.Test;
import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;		


/*  Requirements Test Cases for the AUT.
 * ================================================================================================================
 * Author   : Monday Igwe (Automation Tester) 
 * Test    : Verify that the web application can be launched
 *           Verify the Email Address WebElement and check if it Email TextBox is Enabled
 *           Verify the Password WebElement
 *           Verify that Email and Password Textbox Elements can cleared from the Textboxs
 *           Verify the Submit Button and check if it is enabled Element
 * 
 */


public class VerifyGuru99Login {
	
@Test
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\Desktop\\Selemium\\Drivers\\chromedriver.exe");
		
		//Create Webdriver driver the Object
		WebDriver driver = new ChromeDriver();
		
		//maximize application window
		driver.manage().window().maximize();
		
		//Declare and Assign the URL to the variable to launch the Web APPLICATION
		String baseUrl = "http://demo.guru99.com/selenium/webform/login.html";
		driver.get(baseUrl);
		
		
		
		//Get the WebElement for the Email Address Element
		WebElement email = driver.findElement(By.id("email"));
		
		//VERIFICATION POINT
		if (email.isEnabled()) {
			email.sendKeys("abcd@gmail.com");
		}
		
		//wait for 10 seconds
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//Get the WebElement for the Password Element
		WebElement password = driver.findElement(By.id("passwd"));
		  password.sendKeys("abcdefghlkjl");
			System.out.println("Text Field Set");
			
			
			//Delete values from the TextBoxes
			//email.clear();
			//password.clear();
			
			//Click on Submit Button to SUBMIT the form
			WebElement btnlogin = driver.findElement(By.id("SubmitLogin"));
			
			if (btnlogin.isEnabled()) {
			btnlogin.click();
			System.out.println("Login Done" +"-"+ "Passed");
			
			//kill the browser
			driver.close();
			
			
		}
	}

}

