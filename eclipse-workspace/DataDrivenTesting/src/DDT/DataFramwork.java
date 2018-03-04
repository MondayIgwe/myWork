package DDT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataFramwork {

	WebDriver driver;
	
	
	@Test(dataProvider="wordpressData")
	public void WordLogin (String Username, String Password) {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\Desktop\\Selemium\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demosite.center/wordpress/wp-login.php");
		driver.findElement(By.id("user_login")).sendKeys("Username");
		driver.findElement(By.name("pwd")).sendKeys("Password");
		driver.findElement(By.xpath(".//*[@id='wp-submit']")).click();
		
		Assert.assertTrue(driver.getTitle().contains("Dashboard") );
		
	}
	
	@DataProvider(name="wordpressData")
	public Object[][] passData(){
		Object[][] data = new Object[4][2];
		
		data[0][0] = "monday";
		data[0][1] = "123";
		data[1][0] ="tuesdat";
		data[1][1] ="2333";
		data[2][0] = "admin1";
		data[2][1] = "demo123";
		data[3][0] = "admin";
		data[3][1] = "demo123";
				
		
		return data;
		
		
		
	}
}
