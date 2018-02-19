package SeleniumTutorialDemo;

//IMPORT PACKAGES
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import java.util.concurrent.*;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.*;


/*COMMENT
 * =====================================================================================
 * Author   : Monday Igwe
 * Test    : To verify that the verify that the web application can launched
 *          Expected Title matches Actual Title
 * 
 */
	

public class webDriverDemo
{
	public static void main(String[] args)
	
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\Desktop\\Selemium\\chromedriver.exe");
		
		//Instantiate Objects 
		//WebDriver driver = new FirefoxDriver();
		WebDriver driver = new ChromeDriver();
		
		
		// Maximize the browser
		driver.manage().window().maximize();
		
		//Puts an Implicit wait, Will wait for 10 seconds
		// before throwing exception
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		
		//declare and assign tageName
		String tagName = "";
		String expectedTitle = "Facebook";
		String actualTitle = "";
		
		// Launch website using navigation method
		driver.navigate().to("https://facebook.com");
		
		//get the Title of the web page
		actualTitle = driver.getTitle();
		
		tagName = driver.findElement(By.id("email")).getTagName();
		System.out.println(tagName);

  //Verification point on the title
		if(actualTitle.contentEquals(expectedTitle)) {
			System.out.println("passed"+ " "+actualTitle);
			
		}else {
			System.out.println("Test Failed" + " " +expectedTitle);
			
		}
		
		//Close the Browser.
		driver.close();
		//System.exit(0);
		}
		}
		