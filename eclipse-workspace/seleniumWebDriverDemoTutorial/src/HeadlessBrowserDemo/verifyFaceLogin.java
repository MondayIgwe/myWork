package HeadlessBrowserDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class verifyFaceLogin {
	
	WebDriver driver = new HtmlUnitDriver();
	public String name;
	
	@BeforeClass
	public void getTitle() {
	
	driver.get("http://facebook.com");
	String url = driver.getCurrentUrl();
	String title = driver.getTitle();
	System.out.println("The URL IS ===> " + url);
	System.out.println("The title is:===>" + title);
	
	}
	
	@Test
	public void verifyFacebookTitle() {
	
	driver.get("http://facebook.com");
	String facebook_title = driver.getTitle();
    Assert.assertTrue(facebook_title.contains("facebook"));
	
	
	}
	

}
