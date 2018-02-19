package TestCases;

//IMPORT PACKAGES
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class myClassGuru99 {

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
		
		//Declare and assign variables and compare expected title with actual verification point
		String baseUrl = "http://demo.guru99.com/selenium/newtours";
		String expectedTitle = "Welcome: Mercury Tour";
		String actualTitle = "";
		
	
		//launch firefox and direct it to the base URL
		driver.get(baseUrl);
		
		//get the actual value
		actualTitle = driver.getTitle();
		
		/*Compare the actual title with the expected title 
		 * and print the result as "Passed or Failed"
		 */
		if (actualTitle.contentEquals(expectedTitle)) {
			System.out.println("Test Passed!");
		}else{
			System.out.println("Test Passed!");

			//Explicit wait on a specific object or element
			WebDriverWait wait = new WebDriverWait(driver, 3);
			WebElement signin =wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("submit" )));
			
			if(signin.isEnabled()) {
				signin.click();
				System.out.println("Button is Enabled"+ signin+ "AND IT CLICKED!");
			}else {
				System.out.println("Button is Disabled"+""+ driver.findElement(By.name("submit")).isDisplayed());
			}
					
		}
		
		//close the browser "FireFox" OR "Chrome"
		//driver.close();
	
	}

}
