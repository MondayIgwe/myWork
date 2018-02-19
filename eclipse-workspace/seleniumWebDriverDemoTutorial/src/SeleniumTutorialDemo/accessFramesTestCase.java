package SeleniumTutorialDemo;

//IMPORT PACKAGES
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class accessFramesTestCase {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\Desktop\\Selemium\\chromedriver.exe");
	//Instantiate objects
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.guru99.com/selenium/deprecated.html");
		driver.switchTo().frame("classframe");
		driver.findElement(By.linkText("Deprecated")).click();
		
		//close browser
		driver.close();
	}

}
