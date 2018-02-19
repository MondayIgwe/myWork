package TestNg;
import org.openqa.selenium.*;
import org.testng.annotations.*;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class TestNGClass 

{
	private WebDriver driver;
	
	private String URL = "http://www.calculator.net";
	
	
	@Parameters("browser")
	@BeforeTest
	public void launchapp(String browser)
	{
		if (browser.equalsIgnoreCase("firefox"))
{
	System.out.println("Executing on firefox");
	driver = new FirefoxDriver();
	driver.get(URL);
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	
}else if (browser.equalsIgnoreCase("Chrome"))
{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\Desktop\\Selemium\\chromedriver.exe");
	System.out.println("Chrome is Executing the Test");
	  driver = new ChromeDriver();
	  driver.get(URL);
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.manage().window().maximize();
	  
}else if (browser.equalsIgnoreCase("ie")) 
{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\Desktop\\Selemium\\IEDriverServer.exe");
	System.out.println("Internet Explorer is Executing test");
	  driver = new InternetExplorerDriver();
	  driver.get(URL);
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.manage().window().maximize();
	  
}else {
	throw new IllegalArgumentException("The Browser type is undefined");
	
}
	}
	
@Test
public void calculatepercent()
{
// Click on Math Calculators
driver.findElement(By.xpath(".//*[@id='menu']/div[3]/a")).click();

// Click on Percent Calculators
driver.findElement(By.xpath(".//*[@id='menu']/div[4]/div[3]/a")).click();

// Enter value 10 in the first number of the percent Calculator
driver.findElement(By.id("cpar1")).sendKeys("10");

// Enter value 50 in the second number of the percent Calculator
driver.findElement(By.id("cpar2")).sendKeys("50");

// Click Calculate Button
driver.findElement(By.xpath(".//*[@id='content']/table/tbody/tr/td[2]/input")).click();

// Get the Result Text based on its xpath
String result =
driver.findElement(By.xpath(".//*[@id='content']/p[2]/span/font/b")).getText();
// Print a Log In message to the screen
System.out.println(" The Result is " + result);
if(result.equals("5"))
{
System.out.println(" The Result is Pass");
}
else
{
System.out.println(" The Result is Fail");
}
}
@AfterTest
public void closeBrowser()
{
driver.close();
}
	
	

}
