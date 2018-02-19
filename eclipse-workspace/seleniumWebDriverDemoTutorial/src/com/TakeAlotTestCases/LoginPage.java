package com.TakeAlotTestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import org.testng.annotations.Test;
/*
 * YOU DESIGN TEST CASES HERE
 * e,g It will store all the locators and methods for the login Page
 */


public class LoginPage {

	private static WebElement element = null;

	
	//Test Step 1
	@Test(priority=0)
	public static WebElement txt_Username(WebDriver driver) {
		
		element = driver.findElement(By.id("email"));
		
		return element;
	}
	
	//Test Step 2
	@Test(priority=1)
	public static WebElement txt_Password(WebDriver driver) {
		element = driver.findElement(By.id("password"));
		
		return element;
	}
	
	//Test Step 3
	@Test(priority=2)
	public static WebElement btn_Login(WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[@id='loginForm']/button"));
		return element;
	}
	
	
	
	
	//Test Step 4
	@Test(priority=3)
	public static WebElement logo(WebDriver driver ) {
		element = driver.findElement(By.xpath(".//*[@id='header']/div/a"));
		return element;
		
		
	}
	
	
	
	//Test Step 5
	@Test(priority=4)
	public static WebElement lnk_LogOut(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 50);
		element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='login-logout']/a")));
		
		return element;
	}
	
}
