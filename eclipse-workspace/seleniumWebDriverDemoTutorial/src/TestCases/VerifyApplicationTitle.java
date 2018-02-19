package TestCases;

//import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class VerifyApplicationTitle {
	

	@Test
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Administrator\\\\Desktop\\\\Selemium\\\\Drivers\\\\chromedriver.exe");
		//System.setProperty("webdriver.gecko.driver", "C:\\Users\\Administrator\\Desktop\\Selemium\\geckodriver.exe");
		//WebDriver driver1 = new FirefoxDriver();
		WebDriver driver = new ChromeDriver();
		
		//maximize the browser
		driver.manage().window().maximize();
		
		//set implicit time 
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		
		System.out.println("Start of Program");
		
		//launch the URL 
		String Expectedurl = "https://www.facebook.com";
		String actualUrl = "";
		driver.get(Expectedurl);
		
		if (Expectedurl.equals(actualUrl)) {
			System.out.println(driver.getCurrentUrl());
			 System.out.println("Test case Passed!"+ Expectedurl);
		}else {
			System.out.println("Test Failed!");
		}
		  
		 
		//get the Page Title
		System.out.println(driver.getTitle()); 
		
	
		
	
		
		//Explicit wait on the Email element
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email")));
		element.sendKeys("groovyminstrel@yahoo.com");
		
		//find and enter values in the Password Textbox
		WebElement passwd = driver.findElement(By.name("pass"));
				passwd.sendKeys("mondayigwe");
				element.isDisplayed();
				
				
				System.out.println(element);
		
		System.out.println("The value for the password is:"+" "+passwd.getText());
		
		
		//click on the Button
        driver.findElement(By.cssSelector("input.u_0_a]")).click(); 
     
        
        
        
		System.out.println("End of Program")	;
		
		//close the browser
		driver.close();
	}


}
