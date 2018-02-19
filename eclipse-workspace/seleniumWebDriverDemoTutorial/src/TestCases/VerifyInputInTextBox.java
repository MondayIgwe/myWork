package TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public final class VerifyInputInTextBox {
	

/*Author   : Monday Igwe (Automation Tester)
 * Test    : To verify that the verify that the web application can launched
 *          and Check if Textbox is Enabled
 * 
 */
	
	
	

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\Desktop\\Selemium\\chromedriver.exe");
		//System.setProperty("webdriver.firefox.marionette","C:\\Users\\Administrator\\Desktop\\Selemium\\geckodriver.exe");
		
		//object Instantiation
		//WebDriver driver = new FirefoxDriver();
		WebDriver driver = new ChromeDriver();
		//maximize the browser
				driver.manage().window().maximize();
				//set implicit time 
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
				
				
				System.out.println("Start of Program");
		
		//Declare and assign URL to a Variable
		String baseUrl = "http://demo.guru99.com/selenium/newtours";
		driver.get(baseUrl);
		

		//Enter inputData in the TextBox and Verify if TextBox is Enabled
		WebElement txt_username = driver.findElement(By.name("userName"));
		
		
		
		//Use a Try catch to Handle Exception and CHECK IF TEXTBOX IS ENABLED
		try {
			if(txt_username.isEnabled()) {
				txt_username.sendKeys("tutorial");
				System.out.println("TextBox is Enabled" +  " --" +"Passed");
			}
			
		}
		catch (NoSuchElementException nsee) {
			
			System.out.println(nsee.toString() + " "+"Failed");
		}
		
		//Enter inputData in the TextBox and Verify if TextBox is Enabled
		WebElement txt_pass = driver.findElement(By.name("password"));
		
		try {
			if(txt_pass.isEnabled()) {
				txt_pass.sendKeys("tutorial");
				System.out.println("TextBox is Enabled" +  " --" +"Passed");
			}
			
		}
		catch (NoSuchElementException nsee) {
			
			System.out.println(nsee.toString() + " "+"Failed");
		}
		

		//click on the Button
        driver.findElement(By.name("submit")).click(); 
     
		System.out.println("End fo Program");

	}

}
