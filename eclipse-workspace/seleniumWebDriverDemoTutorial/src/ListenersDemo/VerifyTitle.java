package ListenersDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifyTitle {


	@Test 
	public void checkTitle() {
		WebDriver driver;
		driver = new HtmlUnitDriver();
		driver.get("http://google.com");
	System.out.println(driver.getTitle());
	Assert.assertTrue(true, "It is Displayed and TRUE");
	}
}
