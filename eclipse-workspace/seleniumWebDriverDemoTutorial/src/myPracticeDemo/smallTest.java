package myPracticeDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class smallTest {

	public static void main(String[] args) {
	WebDriver driver = new HtmlUnitDriver();
	
	driver.get("http://google.com");
	driver.manage().window().getSize();
	driver.manage().deleteAllCookies();
	driver.manage().getCookies();
	System.out.println(driver.getWindowHandles());
	System.out.println(driver.getClass());
	
	driver.quit();

	}

}
