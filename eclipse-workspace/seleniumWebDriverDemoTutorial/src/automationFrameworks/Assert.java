package automationFrameworks;

import org.openqa.selenium.WebDriver;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;


public class Assert {
	
	private WebDriver driver;
	
	@Test(priority=0)
	public void VerifyUrl() {
		System.setProperty("webdriver.ie.driver","C:\\Users\\Administrator\\Desktop\\Selemium\\Drivers\\IEDriverServer.exe");
		
		System.out.println("Internet Explorer is Executing test");
		  driver = new InternetExplorerDriver();
		  
		  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		 
		  
		  driver.navigate().to("http://www.google.com");
		  
		  
		  String title = driver.getTitle();
		  System.out.println(title);
		  org.testng.Assert.assertTrue(true, title.trim());

	
			
		 
	}
	
	@Test(priority=1)
	public void testEquals() {
		String sValue = "monday";
		System.out.println("True or False");
		org.testng.Assert.assertEquals("monday", sValue);
		
		 driver.quit();
		
	}
	
	
	
	
	
	
	
	
	

}
