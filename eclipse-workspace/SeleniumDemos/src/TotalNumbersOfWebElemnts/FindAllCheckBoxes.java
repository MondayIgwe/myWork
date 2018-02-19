package TotalNumbersOfWebElemnts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class FindAllCheckBoxes {

	WebDriver driver = null;
	
	
	
	@BeforeTest
	public void beforeTest() {
		driver = new  HtmlUnitDriver();
		
		//Launch the application
		String URL = ("http://www.ironspider.ca/forms/checkradio.htm");
		driver.navigate().to(URL);
	}
	
	
	
	
		@Test
		
		public void initialise() throws Exception {

		Thread.sleep(2000);
		//Get the URL
		String url = driver.getCurrentUrl();
		System.out.println("The URL is:===>"   + url);
		
		Thread.sleep(2000);
		//Get PAGE Title
		String title = driver.getTitle();
		System.out.println("The page title is:"   + title);
		
		List <WebElement> checkBoxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
		System.out.println("The Total Numbers of Radios Buttons are:==>"+checkBoxes.size());
		
		for(int i =1; i<checkBoxes.size(); i++) {
			System.out.println("List of Radio Buttons");
			System.out.println(checkBoxes.get(i));
			System.out.println("=========================================================");
		}
		}
		
		
		
		
		@AfterTest
		public void tearDown() {
			driver.close();
		}
		
	
	
	
}
