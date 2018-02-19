package myPracticeDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(myPracticeDemo.ListenerTestNG.class)

public class TestCase {

	WebDriver driver;
	
	
	
	@Test(priority=0)
	public void takeAlotApp() {
		
		/*
		 * TAKE ALOT WEB APPLLICATION
		 * Test Scenerio
		 * 
		 * Launch the application
		 * Enter Username
		 * Enter Password
		 * Click Login Button
		 * Take screenshot and TestNG Listener of important steps
		 */

		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\Desktop\\Selemium\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
		
		
			//Test Step 1---Launch URL
	     String URL = ("https://secure.takealot.com/account/login");
	     driver.get(URL);
	     driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	     
	     if (URL.isEmpty()) {
	    	 URL = "about: blank";
	    	 
	     }else {
	    	 URL.toLowerCase();
	    	 System.out.println("The Url is:==>"+ driver.getCurrentUrl());
	    	 System.out.println("The PAGE TITLE is:==>"+driver.getTitle());
	         driver.manage().window().getSize();
	    	 driver.manage().window().getPosition();
	     }
	     
	     
	    //Create ScreenShot Constructor object
	     ScreenShot shot = new ScreenShot();
	     
	     
	     
	     
	    	 //Test Step 2--Enter Username
	     WebElement txtUser = driver.findElement(By.id("email"));
	     
	     if(txtUser.isDisplayed()) {
	     txtUser.sendKeys("groovymondee@gmail.com");
	     System.out.println(txtUser.getAttribute("name"));
	   //Take screenshot
	     shot.getScreenShot(driver, "User name Captured");
	     }else {
	    	 System.out.println(txtUser.isDisplayed());
	     }
	     
	 	
	
	     //TEST STEP 3--Enter Password
	     try {
			WebElement txtPass = driver.findElement(By.id("password"));
			 txtPass.sendKeys("MONDAYigwe1983");
			//Take screenshot
		     shot.getScreenShot(driver, "User Password Captured");
		     
		} catch (Exception e) {
			System.out.println("Exception handled for Error"+e.getMessage());
		}
	  	
	     
	     
	
	     //TEST STEP 4--Click Login Button
	     WebElement btn = driver.findElement(By.xpath(".//*[@id='loginForm']/button"));

	     if(btn.isEnabled()) {
	    	 btn.click();
	    	 shot.getScreenShot(driver, "Login button Captured");
	     }else {
	    	 System.out.println(btn.isDisplayed());
	     }
	     
	     
	     
	}
	
	
	@Test(priority=1)
	public void tearDown() {
		driver.quit();
	}
}
