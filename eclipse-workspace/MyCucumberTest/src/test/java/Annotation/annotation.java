package Annotation;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class annotation {
	WebDriver driver = null;
	
	@Given("^ I am on Facebook login pages$")
	public void goToFacebook() {
		
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
	}
	
	
	
}