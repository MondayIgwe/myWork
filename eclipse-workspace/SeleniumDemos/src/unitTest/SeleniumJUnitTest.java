package unitTest;

import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;


public class SeleniumJUnitTest {

		private static HtmlUnitDriver driver;
		WebElement element;
		
		@BeforeClass
		public void openBrowser() {
			driver = new HtmlUnitDriver();
			driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		}
		
		@Test
		public void valid_Credientials() {
			System.out.println("Starting test" + new Object(){}.getClass().getEnclosingMethod().getName());
			
			
			driver.get("http://www.store.demoqa.com");	
		     driver.findElement(By.xpath(".//*[@id='account']/a")).click();
		     driver.findElement(By.id("log")).sendKeys("testuser_3");
		     driver.findElement(By.id("pwd")).sendKeys("Test@123");
		     driver.findElement(By.id("login")).click();
		     
		     try {
		    	 element = driver.findElement (By.xpath(".//*[@id='account_logout']/a"));
		     }catch(Exception e) {
		    	 
		     }
		     
		     Assert.assertNotNull(element);
		     System.out.println("Ending test " + new Object(){}.getClass().getEnclosingMethod().getName());
	     }
		
		public void Invalid_Credientials() {
			System.out.println("Starting test" + new Object(){}.getClass().getEnclosingMethod().getName());
			
			
			driver.get("http://www.store.demoqa.com");	
		     driver.findElement(By.xpath(".//*[@id='account']/a")).click();
		     driver.findElement(By.id("log")).sendKeys("testuser_3");
		     driver.findElement(By.id("pwd")).sendKeys("Test@123");
		     driver.findElement(By.id("login")).click();
		     
		     try {
		    	 element = driver.findElement (By.xpath(".//*[@id='account_logout']/a"));
		     }catch(Exception e) {
		    	 
		     }
		     
		     Assert.assertNotNull(element);
		     System.out.println("Ending test " +new Object(){}.getClass().getEnclosingMethod().getName());
		}
		
		
		@AfterClass
		public void closeBrower() {
			driver.quit();
		}
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	

}
