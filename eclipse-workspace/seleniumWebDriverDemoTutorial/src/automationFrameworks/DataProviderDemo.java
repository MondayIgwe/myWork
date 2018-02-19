package automationFrameworks;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class DataProviderDemo {
	private WebDriver driver;
	
	//Declare the data provider
	@DataProvider(name="Authentication")
	
	public static Object[][] credentials(){
		return new Object[][] { { "admin1", "demo123" }, { "groovyminstrel@yahoo.com", "September1983" }};
		
	}
	
	// Here we are calling the Data Provider object with its Name
	@Test(dataProvider="Authentication")
	
	@Parameters({"sUsername", "sPassword"})
	
	public void test(String sUsername, String sPassword) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\Desktop\\Selemium\\Drivers\\chromedriver.exe");
		  driver = new ChromeDriver();
	 
	      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 
	      driver.get("http://demosite.center/wordpress/wp-login.php");
	 
	
	 
	      driver.findElement(By.xpath(".//*[@id='user_login']")).sendKeys(sUsername);
	 
	      driver.findElement(By.xpath(".//*[@id='user_pass']")).sendKeys(sPassword);
	 
	      driver.findElement(By.xpath(".//*[@id='wp-submit']")).click();
	 
	      //Log Out
	      //driver.findElement(By.id("userNavigationLabel")).click();
	      //driver.findElement(By.xpath(".//*[@id='js_138']/div/div/ul/li[12]/a/span/span")).click();
	 
	      driver.quit();
	 
	  }
	 
	}



