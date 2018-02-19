package SeleniumTutorialDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertDemo {

	public static void main(String[] args) throws Exception {
 
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\Desktop\\Selemium\\chromedriver.exe");
 
	        WebDriver driver = new ChromeDriver();
 
	        // Put an Implicit wait, this means that any search for elements on the page could take the time the implicit wait is set for before throwing exception
 
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 
	        // Launch the URL
	        driver.get("http://toolsqa.wpengine.com/handling-alerts-using-selenium-webdriver/");
	        	
	        
	        //Maximize the web page
	        driver.manage().window().maximize();
	        
	        //click on the Button alert
	         driver.findElement(By.xpath(".//*[@id='content']/p[4]/button")).click();
	         
	         
	         /*
	          * SIMPLE ALERT DEMO
	          */
	         //switch to javaScript alert box
	          Alert myAlert = driver.switchTo().alert();
	          
	          String alertText = myAlert.getText();
	           System.out.println(alertText);
	           
	           //Accept the Alert
		          myAlert.accept();
		          
	           
	   /*===================================================
	            * CONFIRMATION ALERT
	            */
	          
		         WebElement element = driver.findElement(By.xpath(".//*[@id='content']/p[8]/button"));
		         
		         ((JavascriptExecutor)driver).executeScript("arguments[0].click()",element);
		          
		         
		         //Alert
		         Alert confirmationAlert = driver.switchTo().alert();
		         String alertText1 = confirmationAlert.getText();
		          System.out.println("ALERT text is"+ alertText1);
		          
		          //dismiss the Alert
		         confirmationAlert.dismiss();
		         
		         /*
		          * PROMPT ALERTS
		          * ===========================================================
		          */
		         
		      // This step will result in an alert on screen
		         WebElement ele = driver.findElement(By.xpath(".//*[@id='content']/p[11]/button"));
		         
		         ((JavascriptExecutor)driver).executeScript("arguments[0].click()",ele);
		         
		         
		         //Prompt Alert
		         Alert promptAlert = driver.switchTo().alert();
		         
		         //Retrieve the text
		         String pAlert = promptAlert.getText();
		         
		         System.out.println("The Alert is: "+pAlert);
		         
		         //enter a value in the alert box
		         promptAlert.sendKeys("Acccepting Alert");
		         
		         Thread.sleep(1000);
		         
		         //Accept Alert
		         promptAlert.accept();
		         
		         //kill the browser
	          driver.close();
	}

}
