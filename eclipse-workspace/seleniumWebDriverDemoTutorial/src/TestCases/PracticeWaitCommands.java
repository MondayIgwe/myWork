package TestCases;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PracticeWaitCommands {
/*
 * REQUIREMENTS
 * 
		 * Practice Exercise
		1) Launch new Browser
		2) Open URL “http://toolsqa.wpengine.com/automation-practice-switch-windows/”
		3) Click on the Button “Timing Alert”
		4) Accept the Alert (Alert will take 3 second to get displayed, Use WebDriverWait to wait for it)

 */
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\Desktop\\Selemium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		

        driver.get("http://toolsqa.wpengine.com/automation-practice-switch-windows/");
        driver.manage().window().maximize();
        
        
        //click on the button
        WebElement element = driver.findElement(By.xpath(".//*[@id='timingAlert']"));
        System.out.println("Timer javaScript Alert is triggered but not yet opened");
        
        if (element.isEnabled()) {
        	element.click();
        	System.out.println("Enabled");
        }else {
        	System.out.println("No enabled");
        }
        
        //Create a new Wait
        WebDriverWait wait = new WebDriverWait(driver, 10);
        
        //Wait for Alert to be present
        Alert myAlert =wait.until(ExpectedConditions.alertIsPresent());
        System.out.println("Either pop up is displayed Or it is timeed out");
        
        //Accept the Alert
        myAlert.accept();
        System.out.println("Alert is Accepted");
        System.out.println("i want to see the: " + myAlert.getText());
        
        
        //Kill the browser
        driver.close();
	}

}
