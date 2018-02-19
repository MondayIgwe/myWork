package TotalNumbersOfWebElemnts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class TotalTextBoxes {

	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\Desktop\\Selemium\\chromedriver.exe");
		 
		WebDriver driver = new HtmlUnitDriver();
		
		driver.navigate().to("http://demosite.center/wordpress/wp-login.php");
		String title = driver.getTitle();
		String getUrl = driver.getCurrentUrl();
		System.out.println("The page Title is:"+ title+ "   " +   "and"+ " "+  "The URL is:"+ getUrl);
		
		List <WebElement> textBoxes = driver.findElements(By.xpath("//input[@size='20']"));
		System.out.println("Total number of Textboxes are: "+ textBoxes.size());
		
		for(int i =0; i<=textBoxes.size(); i++) {
			System.out.println(textBoxes.get(i));
		}
		
		driver.close();

	}

}
