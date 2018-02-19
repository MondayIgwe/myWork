package ListenersDemo;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.annotations.Test;

public class username {

  @Test
  public void verifyCredentials() throws IOException {
	  WebDriver driver;
	  driver = new HtmlUnitDriver();
	  String URL = "https://en.wikipedia.org/w/index.php?title=Special:UserLogin&returnto=Main+Page";
	  driver.get(URL);
	  
	  
	  if(URL.isEmpty()) {
		  URL ="about: blank";
	  }else if(URL.contains(URL)){
		  System.out.println("The URL IS:==> "+driver.getCurrentUrl());
	  }else {
		  throw new RuntimeException("Test not implemented");
	  }
	  
	 
	  //enter user name
	  WebElement user = driver.findElement(By.id("wpName1"));
	  user.click();
	  
	  
	//enter password
	  WebElement pass = driver.findElement(By.id("wpPassword1"));
	  pass.click();
      System.out.println(pass.getAttribute("name"));
	  
      
	//Click Remember checkBox
	  WebElement checkBox = driver.findElement(By.id("wpRemember"));
	
	  
	  try {
		if (checkBox.isSelected() ||  checkBox.isEnabled()) {
				System.out.println("True, Checkbox is enabled");
				  checkBox.click();
		  }else {
			  System.out.println("Checkbox is NOT enabled"+ checkBox.isDisplayed());
		  }
	} catch (Exception e) {
		System.out.println(e);;
	}
		//Click Login
		  WebElement login = driver.findElement(By.id("wpLoginAttempt"));
		  login.click();
		  
		
		  
	driver.quit();  
  }
}
