package HeadlessBrowserDemo;

import org.openqa.selenium.By;

import org.openqa.selenium.htmlunit.HtmlUnitDriver;




public class testHtmlUnit {

	

	public static void main(String[] args) throws InterruptedException {
		
		
		HtmlUnitDriver unitDriver = new HtmlUnitDriver(true);
	
		
		
		//open google.com webpage
		unitDriver.get("http://www.unisa.ac.za/sites/myunisa/default/");

        
        //locate the Click here login Button
        unitDriver.findElement(By.linkText("Click here to login")).click();
        
        
        //Enter User name
        unitDriver.findElement(By.id("eid")).sendKeys("48094560");
        
        //Enter Password
        unitDriver.findElement(By.name("pw")).sendKeys("mondee");
        
        //Click Login Button
        unitDriver.findElement(By.name("submit")).click();;
        		
		
        

	}
	
	
}
