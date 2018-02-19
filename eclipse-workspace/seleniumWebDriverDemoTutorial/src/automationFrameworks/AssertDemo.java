package automationFrameworks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AssertDemo {
	
	WebDriver driver;
	
	
	@BeforeTest
	public void getUrl() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\Desktop\\Selemium\\Drivers\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		String url = "http://www.unisa.ac.za/sites/myunisa/default";
		
		System.out.println(driver.getTitle());
		
		Assert.assertTrue(url.contains("http://www.unisa.ac.za/sites/myunisa/default"), "Url Not Available");
		Assert.assertTrue(url.equals("http://www.unisa.ac.za/sites/myunisa/default"), "Url Not Available");
		Assert.assertNotNull(url, "Url is empty");
		
	}
	
	
	
	@Test(priority=1)
	public void testOne() {
		System.out.println("This is just a test");
		Assert.assertFalse(1>2);
	
	}
	
	@Test(priority=2)
	public void tearDown() {
		driver.close();
	}

}
