package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class Home_Page {
	
	public void homePage(WebDriver driver) {
	driver = new HtmlUnitDriver();
	driver.findElement(By.id(""));
	}
}
