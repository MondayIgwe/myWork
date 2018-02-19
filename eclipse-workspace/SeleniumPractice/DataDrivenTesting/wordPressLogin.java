package DataDrivenTesting;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class wordPressLogin {
	
	@Test(dataProvider="wordpressData")
	public void loginToWprdPress(String username, String password)//Test case

	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	driver.navigate().to("http://demosite.center/wordpress/wp-login.php");
	  	
	driver.findElement(By.id("user_login")).sendKeys(username);
	driver.findElement(By.id("user_pass")).sendKeys(password);
	driver.findElement(By.xpath(".//*[@id='wp-submit']")).click();
	
	//Thread.sleep(5000);
	
	System.out.println(driver.getTitle());
	
	//close
	driver.quit();
	}
	
	
	@DataProvider(name="wordpressData")
	//Array object with two dimension array
	public Object[][] passData()
	{
		Object[][] data = new Object[3][2]; //3 rows and 3 coliumns
		data[0][0] = "admin1";
		
		data[0][1] = "password";
		
		data[1][0] = "admin2";
		data[1][1] = "password";
		
		
		data[2][0] = "admin3";
		data[2][1] = "admin3";
		
		return data;
	}
	

}
