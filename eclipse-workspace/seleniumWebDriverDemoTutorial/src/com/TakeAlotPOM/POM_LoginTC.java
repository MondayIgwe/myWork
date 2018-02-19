package com.TakeAlotPOM;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.TakeAlotTestCases.LoginPage;

/*
 * YOU PERFORM ACTIONS AND MAINTENANCE HERE
 * 
 * //USE PAGE OBJECT LIBRARY NOW(Package.className above)
 * //USE PAGE OBJECT LIBRARY NOW(className.MethodName)
 * locators and methods
 */

public class POM_LoginTC {

	private static WebDriver driver = null;
	
	
	
	
	public static void main(String[] args) throws Exception {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\Desktop\\Selemium\\Drivers\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		
			//Launch URL
	     driver.get("https://secure.takealot.com/account/login");
	     driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	     
	     	//get page Title
			String title = driver.getTitle();
			System.out.println("This the Page Title=>"+ title);
	     
	     
	     
	     
	     //Print the logo Text
	     System.out.println("The text the logo is==>"+  LoginPage.logo(driver).getText());
	    
	     
	     //Enter Username
	     LoginPage.txt_Username(driver).sendKeys("groovyminstrel@yahoo.com");
	     
	     //Enter Password
	     LoginPage.txt_Password(driver).sendKeys("MONDAYigwe1983");
	     
	     
	     //Click LogInButton 
	     LoginPage.btn_Login(driver).click();
	     
	     System.out.println("Login SUCCESFULL");
	     
	 
	     
	     
	  
	     //Click LogOut
	     System.out.println("Now LOG-OFF");
	     LoginPage.lnk_LogOut(driver).click();
	     System.out.println("Log Out was successful");
	     
	     driver.quit();
	     

		
	}

}
