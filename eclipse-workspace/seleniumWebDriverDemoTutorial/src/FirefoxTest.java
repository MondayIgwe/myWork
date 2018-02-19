import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class FirefoxTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Desktop\\Selemium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://google.com");
		System.out.println("browser opened"+ driver.getTitle());
		

		WebElement text = driver.findElement(By.cssSelector("div.gb_Q.gb_R"));
		
		System.out.println(text.getText());
		
		driver.close();

	}

}
