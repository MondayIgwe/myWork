package SeleniumTutorialDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class MouseHoverAction {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\Desktop\\Selemium\\chromedriver.exe");
		 
        WebDriver driver = new ChromeDriver();

        // Put an Implicit wait, this means that any search for elements on the page could take the time the implicit wait is set for before throwing exception

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // Launch the URL
        driver.get("http://www.unisa.ac.za/sites/myunisa/default/");
        	
        
        //Maximize the web page
        driver.manage().window().maximize();
        
        //locate the Click here login Button
        driver.findElement(By.linkText("Click here to login")).click();
        
        
        //Enter User name
        driver.findElement(By.id("eid")).sendKeys("48094560");
        
        //Enter Password
        driver.findElement(By.name("pw")).sendKeys("mondee");
        
        //Click Login Button
        WebElement click = driver.findElement(By.name("submit"));
        
        if (click.isEnabled()) {
        	click.click();
        	System.out.println("The Student has successfully logged");
        }else {
        	System.out.println("Login Unsuccessful --Failed!");
        }
        
        
        //locate the element
        WebElement element = driver.findElement(By.xpath(".//*[@id='topnav']/li[6]/a"));
        element.click();
     

        Actions action = new Actions(driver);
        
        //move to the element,build the query and perform the action
        action.moveToElement(element).build().perform();
        
        //driver.findElement(By.linkText("My Admin"));
       
        
        
        
        
        
        
	}

}
