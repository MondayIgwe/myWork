package config;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class ActionKeywords {

	
	public static WebDriver driver = null;
	
	
	public static void openBrowser() {
		//Open the browser
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\Desktop\\Selemium\\Drivers\\chromedriver.exe");
		 driver = new ChromeDriver();
		
	}
	
	public static void navigate() {
		//Launch URL
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		String URL = "http://www.store.demoqa.com";
		driver.get(URL);
		
		//Validate URL
		 if (URL.isEmpty()) {
		    	URL ="about:blank";
		    }else {
		    	System.out.println("This is the URL==>"+driver.getCurrentUrl().trim());
		    	System.out.println("This the Page title==>"+driver.getTitle().trim());
		    	
		    }
	}
	
	
	public static void click_MyAccount() {
		 //Click on My Account
	      driver.findElement(By.xpath(".//*[@id='account']/a")).click();
	}
	
	
	
	public static void input_Username() {
		  //Enter Username
	     WebElement username = driver.findElement(By.id("log"));
	    if (username.isEnabled()) {
	    	username.sendKeys("sunday");
	    }else {
	    	System.out.println(username.isDisplayed());
	    }
	}
	
	
	
	public static void input_Password() {
		//Enter password
	    WebElement pass = driver.findElement(By.name("pwd"));
	    if (pass.isEnabled()) {
	    	pass.sendKeys("sundayMONDAY12345");
	    }else {
	    	System.out.println(pass.isDisplayed());
	    }
	}
	
	
	
	
	
	public static void click_Login() {
		 //Click login
	    WebElement btnClick = driver.findElement(By.xpath(".//*[@id='login']"));
		   if (btnClick.isEnabled()) {
			   btnClick.click();
		    }else {
		    	System.out.println(btnClick.isDisplayed());
		    }
	    
	}
	
	
	public static void waitFor() throws InterruptedException {
		Thread.sleep(5000);
		
	}
	
	
	
	public static void click_LogOut() {
		   //click Logo out
		 driver.findElement(By.xpath(".//*[@id='meta']/ul/li[2]")).click();
	}
	
	
	
	public static void close_Browser() {
		driver.close();
	}
	
}
