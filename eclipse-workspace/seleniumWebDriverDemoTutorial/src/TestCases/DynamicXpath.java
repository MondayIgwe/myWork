package TestCases;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicXpath {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\Desktop\\Selemium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


        driver.get("http://demosite.center/wordpress/wp-login.php");
        driver.manage().window().maximize();
        
      //click the link
        driver.findElement(By.xpath("//a[contains(text(),'Lost your password')]")).click();
        
        //Navigate back to login page
        driver.navigate().back();
        //Enter user name
        driver.findElement(By.xpath(".//*[@id='user_login']")).sendKeys("admin");
        
        //Enter password
        driver.findElement(By.xpath(".//*[@id='user_pass']")).sendKeys("demo123");
        
        
        //Click login button
        driver.findElement(By.xpath(".//*[@id='wp-submit']")).click();
        
        List <WebElement> link = driver.findElements(By.tagName("a"));
        System.out.println("The total links are:" + link.size() );
        driver.close();
	}

}
