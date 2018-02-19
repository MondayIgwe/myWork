package automationFrameworks;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeDriver;

public class DataProviderTest {

	/*
	 * Step 1: Create a test case of Login Application with TestNG Data Provider.
		Step 2:  Create a Test Data sheet.
		Step 3: Create functions to Open & Read data from Excel
		Step 4: Create a TestNg test case for accepting data from Excel using Data Provider.
		Step 5: Run the test against the Test Case name in the Test Data file

	 */
	
	
	private WebDriver driver;
	
	
  @Test(dataProvider = "Authentication")
  public void test(String sUsername, String sPassword) {
	  driver = new ChromeDriver();
	  
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  
      driver.get("http://www.store.demoqa.com");
 
      driver.findElement(By.xpath(".//*[@id='account']/a")).click();

	  
	  //Arguement passed will be used as String variable
      
      driver.findElement(By.id("log")).sendKeys("sUsername");
      driver.findElement(By.id("pwd")).sendKeys("sPassword");
      driver.findElement(By.id("login")).click();

	  //Log out
      driver.findElement(By.xpath(".//*[@id='account_logout']/a")).click();
      
	  
  }
  
  

  @DataProvider(name="Authentication")
  public Object[][] credentials() {
	  
      // The number of times data is repeated, test will be executed the same no. of times
	  
      // Here it will execute two times

    return new Object[][] {new Object[] { 1, "a" },
      new Object[] { 2, "b" },
    };
  }
}
