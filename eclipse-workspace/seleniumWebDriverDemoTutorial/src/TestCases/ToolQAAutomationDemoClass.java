package TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolQAAutomationDemoClass {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\Desktop\\Selemium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		String ExpectedUrl = ("http://toolsqa.com/automation-practice-form/");
		driver.get(ExpectedUrl);
		
		Thread.sleep(5000);
		String actualUrl = driver.getCurrentUrl();
		if (actualUrl.equals(ExpectedUrl)) {
			System.out.println("Verification Successful"+" "+ ExpectedUrl);
		}else {
			System.out.println("Verification Failed" +" "+ actualUrl);
		}
			
		// Storing Title name in the String variable
		String Title = driver.getTitle();
		 System.out.println(Title);
		 
		/* //Store the length of the Title
		 int titleLength = driver.getTitle().length();
		 System.out.println(titleLength);
		 
		 
		 //get the Page Source
		 String pageSource = driver.getPageSource();
		 int pageSourceLength = driver.getPageSource().length();
		 System.out.println(pageSourceLength);
		 System.out.println(pageSource);
		 */
		 
		 
		 //Click on Tutorial link
		WebElement userName = driver.findElement(By.name("firstname"));
				userName.sendKeys("monday");
				//element.clear();
		WebElement sureName = driver.findElement(By.name("lastname"));
		sureName.sendKeys("12344");
		 
		//isSelected Method to check radio boxes
		boolean status = driver.findElement(By.name("sex")).isSelected();
		System.out.println(status);
		
		//Click on link
		//driver.findElement(By.linkText(".//*[@id='content']/div[1]/div/div/div/div[2]/div/form/fieldset/div[5]/a/strong")).click();
		
		//get the the text
		String linkText = driver.findElement(By.linkText(".//*[@id='content']/div[1]/div/div/div/div[2]/div/form/fieldset/div[5]/a/strong")).getText();
		 System.out.println(linkText);
		 
		// Click on "Partial Link Text" link
		 WebElement partialLink = driver.findElement(By.partialLinkText("Partial"));
		 partialLink.click();

		 System.out.println( partialLink.getText());
		 
		 
		 //back to home page
		 //driver.navigate().to(ExpectedUrl);
		 	
		 //click Button
			WebElement btnButton = driver.findElement(By.xpath(".//*[@id='submit']"));
			if(btnButton.isDisplayed()) {
					System.out.println("The button is disabled");
			}else {
				btnButton.click();
				System.out.println("Button is Enabled");
			}
			btnButton.getTagName();
			btnButton.getCssValue(Title);
			btnButton.getAttribute("id");
			Dimension dimensions = btnButton.getSize();
			System.out.println(dimensions);
			Point point = btnButton.getLocation();
			System.out.println(point);
			
			//Convert element in to a astring
			String sClass = driver.findElement(By.tagName("button")).toString();
			System.out.println(sClass);
		//close the browser
			driver.close();
	}

	
}
