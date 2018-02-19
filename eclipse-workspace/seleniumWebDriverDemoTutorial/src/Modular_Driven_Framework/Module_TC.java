package Modular_Driven_Framework;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObjects.Login_POM;




public class Module_TC {

	
	
	
	public static void main(String[] args) throws Exception {
	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\Desktop\\Selemium\\Drivers\\chromedriver.exe");
		
		
		  WebDriver driver = new ChromeDriver();
			
		    //Launch
			String url = "https://en.wikipedia.org/w/index.php?title=Special:UserLogin&returnto=Main+Page";
			driver.get(url);
		
			
			    //CheckPoint
					if(url.isEmpty()) {
						url ="about:blank";
					}else {
						url.trim();
						System.out.println("The URL IS:==>"+driver.getCurrentUrl());
						System.out.println("The page title is:==>"+driver.getTitle().trim());
	
		//call page loadtime out method
		Login_POM.setPageTimeOut(driver, 10);
		
		
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
	
		
		
		//Use your Module Driven Framework "Sign_InModularF"
		
		Sign_InModularF.Execute(driver);  //ClassName.MethodName because the SignIn Class has a static keyword
		 System.out.println("Login successful");
		
		
		
	Login_POM close = new Login_POM();
		 close.tearDown(driver);
		
	}

	}
	}
