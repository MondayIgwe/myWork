package CaptureScreenshots;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;



public class Screenshot {

	public static void main(String[] args) throws IOException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\Desktop\\Selemium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//implicit wait for 10 seconds
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//launch the website
		driver.get("http://www.calculator.net/");
		
		//maximize the web page
		driver.manage().window().maximize();
		
		// Click on Math Calculators
		driver.findElement(By.xpath(".//*[@id='menu']/div[3]/a")).click();
		
		// Click on Percent Calculators
		driver.findElement(By.xpath(".//*[@id='menu']/div[4]/div[3]/a")).click();
		
		// Enter value 10 in the first number of the percent Calculator
		driver.findElement(By.id("cpar1")).sendKeys("10");
		
		// Enter value 50 in the second number of the percent Calculator
		driver.findElement(By.id("cpar2")).sendKeys("50");
		
		// Click Calculate Button
		driver.findElement(By.xpath(".//*[@id='content']/table/tbody/tr/td[2]/input")).click();
		
		// Get the Result Text based on its xpath
		String result =
		driver.findElement(By.xpath(".//*[@id='content']/p[2]/span/font/b")).getText();
		
		
		//SREENSHOT 
		File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot, new File("C:\\Users\\Administrator\\Desktop\\screenshot.jpg"));
		
		
		//print a log in message to the screen
		System.out.println("The Result is " + result);
		
		//close the browser
		driver.close();
		
		
	}

}
