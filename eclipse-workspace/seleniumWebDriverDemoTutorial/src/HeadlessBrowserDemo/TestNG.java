package HeadlessBrowserDemo;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterMethod;

public class TestNG {
	
	public WebDriver driver;
	
	@BeforeTest
	public void waitForPageToLoad() {
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	}
	
	
  @Test
  public void main() {
	  //Click my Unisa Link
	  driver.findElement(By.linkText("MYUNISA")).click();
	  
	  //click on the "Here to login" limk
	  driver.findElement(By.xpath("//button[@type='button']")).click();
	  
	  
	  
	  
	  
	  
	  /*
	  //Enter username
	  driver.findElement(By.xpath("//input[@type='text']")).sendKeys("48094560");
	  
	  //Enter password
	 WebElement txtPsw = driver.findElement(By.xpath(".//*[@id='pw']"));
	  
	  if (txtPsw.isDisplayed()) {
		  System.out.println("The textbox is disabled"+ txtPsw);
	  }else {
		  txtPsw.sendKeys("mondee");
		  System.out.println(txtPsw + " is Enabled");
		  
	  }
	  //click Login Button
	  WebElement btn = driver.findElement(By.name("submit"));
	  if(btn.isEnabled()) {
		  btn.click();
		  
	  }else {
		  System.out.println("The button is disabled");
	  }
	// Print a Log In message to the screen
      System.out.println(" Login Successfully, now it is the time to Log Off buddy.");

  */
	  
	  
	  
	  
	  
	  
	  
	  
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\Desktop\\Selemium\\Drivers\\chromedriver.exe");
	  //Create an instance of driver
	  //driver = new ChromeDriver();
	  driver = new HtmlUnitDriver();

	  //Put a Implicit wait, this means that any search for elements on the page could take the time the implicit wait is set for before throwing exception
	  driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	  
	  //launch the Online Store Website
	  driver.navigate().to("http://www.unisa.ac.za/sites/corporate/default");
	  
	  ///Retrieve the Website URL
	  String Url = driver.getCurrentUrl();
	  System.out.println("This is the website URL:===>"+ Url);
	  
	  //We want the page title
	  String title = driver.getTitle();
	  System.out.println("This is the page title==>"+ title);
	  
	 
  }

  @AfterMethod
  public void afterMethod() {
	  //Close the Browser
	  driver.quit();
  }

}
