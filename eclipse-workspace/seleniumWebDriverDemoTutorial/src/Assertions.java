import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Assertions {

	static String expectedErrorMessage = "Incorrect username or password entered. Please try again.";
	static String actualErrorMessage;
	
	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\Desktop\\Selemium\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://en.wikipedia.org/w/index.php?title=Special:UserLogin&returnto=Main+Page");
		driver.findElement(By.id("wpName1")).sendKeys("knjkjnd");
		driver.findElement(By.xpath(".//*[@id='wpPassword1']")).sendKeys("khihi");
		driver.findElement(By.xpath(".//*[@id='wpLoginAttempt']")).click();
		actualErrorMessage =  driver.findElement(By.xpath(".//*[@id='userloginForm']/form/div[1]/div/p")).getText();	
		
					//Assertions Checks
				//Assert.assertEquals(actualErrorMessage,  expectedErrorMessage);
				try {
					Assert.assertTrue(actualErrorMessage.contains(expectedErrorMessage));
					System.out.println( expectedErrorMessage+ "Test Passed");
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
		driver.close();
		
	}

}
