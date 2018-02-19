package TestCases;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksDemo {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\Desktop\\Selemium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


        driver.get("https://en.wikipedia.org/wiki/Main_Page");
        driver.manage().window().maximize();
        
        //capture the url
        String URL1 = driver.getCurrentUrl();

        if (URL1.contains("wikipedia.org")) {
        	System.out.println("yes");
        }else {
        	System.out.println("No");
        }
        
        
        driver.findElement(By.id("searchInput")).sendKeys("java");
        driver.findElement(By.id("searchButton")).click();
        
      //SREENSHOT 
		File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot, new File("C:\\Users\\Administrator\\Desktop\\screenshot.jpg"));
		
		
    
        
  
        
        	driver.close();
	}

}
