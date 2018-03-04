package facebookTestCases;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
//import org.openqa.selenium.firefox.FirefoxDriver;
public class facebookLinks {

		WebDriver driver = new HtmlUnitDriver();
		 
	@BeforeTest
	public void initializeBrowser() {
		driver.get("https://www.linkedin.com");
		String browserUrl = driver.getCurrentUrl();
		String title = driver.getTitle();
		System.out.println("The browser URL IS:" +browserUrl);
		System.out.println("The title of the page is:"+ title);
	}
	
	@Test
	public void getLinks()
	{
		java.util.List<WebElement> links = driver.findElements(By.tagName("a"));
	
		System.out.println(links.size());
		
		for (int i = 1; i<=links.size(); i=i++) {
			if (links.size() == 10) {
				break;
			}
			System.out.println(links.get(i));
		}
			
		driver.close();
		}
	}
 
		
 
		
 
	



