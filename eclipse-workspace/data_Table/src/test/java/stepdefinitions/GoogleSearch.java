package stepdefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class GoogleSearch {
	
	private WebDriver driver;

@Given("^I open the browser$")
public void i_open_the_browser() throws Throwable {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\Desktop\\Selemium\\Drivers\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://www.google.com");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
   System.out.println("Browser is open");
}

@When("^I navigate to google page$")
public void i_navigate_to_google_page() throws Throwable {
   Assert.assertTrue(driver.findElement(By.xpath(".//*[@id='gsr']/div[4]")).isDisplayed());
   System.out.println("Text field is displayed");
    System.out.println("Navigate to google");
}

@Then("^I validate the search text field$")
public void i_validate_the_search_text_field() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    System.out.println("Validate the search text field");
}



@When("^I navigate to gmail page$")
public void i_navigate_to_gmail_page() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	 System.out.println("Navigate to google");
}

@Then("^I validate gmail link$")
public void i_validate_gmail_link() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	System.out.println("Validate gmail link");
	driver.quit();
}



}
