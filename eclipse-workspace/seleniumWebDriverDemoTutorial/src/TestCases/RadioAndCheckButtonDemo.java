package TestCases;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioAndCheckButtonDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\Desktop\\Selemium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		String ExpectedUrl = ("http://www.calculator.net/mortgage-payoff-calculator.html");
		driver.get(ExpectedUrl);
		
		
		//Store all the elements of the same category in the list of WebElements
		List<WebElement> rdBtn = driver.findElements(By.xpath("//input[@type='radio']"));
	
		System.out.println("The total numbers of Radio butttons are ==>"+ rdBtn.size());
		
		
		// Create a boolean variable which will hold the value (True/False)
		boolean bValue = false;
		
		//This statement wil return true incase the first Radio button is selected
		bValue = rdBtn.get(0).isSelected();
		
		//This will check that if the bValue is True, means if the Radio button is selected
		if (bValue == true) {
			//This will select the second Radio button
			  rdBtn.get(1).click();
		}else {
			rdBtn.get(0).click();
		}
		
		
		
		/*
		//CHECKBOXES 
		List<WebElement> oCheckBox = driver.findElements(By.name("exp"));
		
		// This will tell you the number of checkboxes are present
		int iSize = oCheckBox.size();
		
		//loop th size
		for(int i = 0; i<iSize; i++) {
			String sName = oCheckBox.get(i).getAttribute("value");
			System.out.println("The number of check boxes are:"+" "+ sName);
			
		}
		*/
			
		driver.close();
		
		
	
	
	
	}

}
