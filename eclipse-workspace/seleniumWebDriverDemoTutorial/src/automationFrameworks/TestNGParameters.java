package automationFrameworks;


import java.util.concurrent.TimeUnit;
 
import org.openqa.selenium.By;
 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.annotations.Test;
 
import org.testng.annotations.Parameters;

public class TestNGParameters {
	
	/*
	 * authentication.
			1) Create a test on my demo OnlineStore application to perform LogIn which takes the two string argument as username & password.
			2) Provide Username & Password as parameter using TestNG Annotation

	 */
	
	
	
	private WebDriver driver;
	
	
	@Test
	@Parameters({"sUsername", "sPassword"})
	
	public void test(String sUsername, String sPassword) {
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\Desktop\\Selemium\\Drivers\\chromedriver.exe");
		driver = new HtmlUnitDriver();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		driver.get("http://www.store.demoqa.com");
		 
	      driver.findElement(By.xpath(".//*[@id='account']/a")).click();
	 
	      driver.findElement(By.id("log")).sendKeys(sUsername);
	 
	      driver.findElement(By.id("pwd")).sendKeys(sPassword);
	 
	      driver.findElement(By.id("login")).click();
	 
	      driver.findElement(By.xpath(".//*[@id='account_logout']/a")).click();
	 

	     driver.quit();
	}
	
	

}
