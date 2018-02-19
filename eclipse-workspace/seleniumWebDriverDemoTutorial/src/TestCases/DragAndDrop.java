package TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class DragAndDrop {
	
	WebDriver driver = null;

	@Test(priority=0)
	public void startBrowser() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\Desktop\\Selemium\\Drivers\\chromedriver.exe");
		 driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


        driver.get("https://www.dhtmlx.com/docs/products/dhtmlxTree/index.shtml");
        driver.manage().window().maximize();
	}
	
	
	@AfterMethod
	public void perform() {
        WebElement From = driver.findElement(By.className(".//*[@id='treebox1']/div/table/tbody/tr[2]/td[2]/table/tbody/tr[2]/td[2]/table/tbody/tr[1]/td[4]/span"));
        WebElement To = driver.findElement(By.xpath(".//*[@id='treebox2']/div/table/tbody/tr[2]/td[2]/table/tbody/tr[2]/td[2]/table/tbody/tr[2]/td[2]/table/tbody/tr[1]/td[4]/span"));
        
        Actions builder = new Actions(driver);
        
        try {
			Action dragAndDrop = builder.clickAndHold(From).moveToElement(To).release(To).build();
		} catch (Exception e) {
			
			throw e;
		
			 //dragAndDrop.build().perform();
		}

        driver.close();
	}
	
	
        
       
	}

