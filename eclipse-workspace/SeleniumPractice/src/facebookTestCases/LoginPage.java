package facebookTestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class LoginPage {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new HtmlUnitDriver();
		
		//Test Step 1: ---launch the web page
		String url = "https://www.facebook.com/";
		driver.navigate().to(url);
		
		//Wait for page to load
		 driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		
		 /*
		//Step 2:--Enter Username
		WebElement uName = driver.findElement(By.id("email"));
		if(uName.isEnabled()) {
			System.out.println("Enter Username");
			Thread.sleep(2000);
			uName.sendKeys("groovyminstrel@yahoo.com");
			System.out.println("Passed");
			
		}else {
			System.out.println("Failed");
			
		}
		
		//wait for 10 seconds before executing the next element -> Password
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		
		//Test Step 3:   Enter Password
		WebElement pass = driver.findElement(By.id("pass"));
		if(pass.isEnabled()) {
			System.out.println("Enter Password");
			//wait
			driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
			pass.sendKeys("lsg123monday");
			System.out.println("Passed");
		}else {
			System.out.println("Failed");
		}
		
		
		*/
		 
		//Test Step 4:----Click the Login Button
		WebElement cBtn = driver.findElement(By.xpath("//input[@type='submit']"));
		cBtn.click();
		System.out.println(cBtn+"Logged in Succesfull");
		/*
		
		boolean cValue = cBtn.isEnabled();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		if (cValue) {
			cBtn.click();
			System.out.println("The Button is enabled" +cValue);
			System.out.println("Logged in Succesfull");
			
		}else {
			System.out.println("Failed");
		}
		*/
		driver.close();
		
		

	}

}
