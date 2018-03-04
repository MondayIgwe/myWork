package log4jDemo;


import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class log4jTest {
	
	private static WebDriver driver;
	
	private static final Logger logger = Logger.getLogger(log4jTest.class.getName());

	
	
	
	public static void main(String[] args) {
		
		
		DOMConfigurator.configure("log4j.xml");
		
		logger.info("#########################################################");
		logger.info("Test has started");
		
	
	
		driver = new HtmlUnitDriver();
		
		//put implict wait
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		//Launch the website
		driver.navigate().to("http://www.calculator.net");
		String windowHandle = driver.getWindowHandle();
		System.out.println("This the frame window handle"+  windowHandle);
		
		logger.info("Open calc Application");
		
		//Maximise browser
		driver.manage().window().maximize();
		
		//Click on the Math Calculator
		driver.findElement(By.xpath(".//*[@id='homelistdiv']/table/tbody/tr/td[3]/div[2]/a")).click();
		 logger.info("Clicked Math Calculator Link");
		 
		// Click on Percent Calculators
		 driver.findElement(By.xpath(".//*[@id='content']/ul[1]/li[3]/a"))
		 .click(); logger.info("Clicked Percent Calculator Link");
		  
		 // Enter value 10 in the first number of the percent Calculator
		 driver.findElement(By.xpath(".//*[@id='cpar1']")).sendKeys("10");
		 logger.info("Entered Value into First Text Box");
		 
		 // Enter value 50 in the second number of the percent Calculator
		 driver.findElement(By.xpath(".//*[@id='cpar2']")).sendKeys("50");
		 logger.info("Entered Value into Second Text Box");
		 
		 // Click Calculate Button
		 driver.findElement(By.xpath(".//*[@id='content']/table[1]/tbody/tr[2]/td/input[2]")).click();
		 logger.info("Click Calculate Button");
		
		//Get the result
		 String Result = driver.findElement(By.xpath(".//*[@id='cpar3']")).getText();
		 	
		// Print a Log In message to the screen
		 logger.info(" The Result is " + Result);
		 if(Result.equals("5"))
		 {
		 logger.info("The Result is Pass");
		 
		 }
		 else
		 {
		 logger.error("TEST FAILED, NEEDS INVESTIGATION");
		 }
		 logger.info("# # # # # # # # # # # # # # # # # # # # # # # # # # # ");
		 
		 
		 // Close the Browser.
		 driver.close();
		 logger.isInfoEnabled();
		 logger.info("Close Browser");
		 }
		 
		 
		 
	}


