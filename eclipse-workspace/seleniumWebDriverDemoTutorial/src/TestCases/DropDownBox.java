package TestCases;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public final class DropDownBox {
	

/*  Requirements Test Cases for the AUT.
 * ================================================================================================================
 * Author   : Monday Igwe (Automation Tester) 
 * Automation Test    : Verify that user can launch the web application
 *           	        Verify that user can select from the Drop-down list
*           	        Verify that a user can launch the second application
*                       Verify that user can clear Email and Password Textbox Elements
 *           	        Verify that a user can be select from the Multiple Drop-Down List
 * =================================================================================================================
 */

	public static void main(String[] args) throws Exception {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\Desktop\\Selemium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		System.out.println("Start of Program");
		
		/*
		 * Test Case 1
		 * 
		 * 
		//launch application
		driver.get("http://demo.guru99.com/selenium/newtours/register.php");
		
		//Slect class package uses a New Keyword for Drop-down & Multiple selections
		Select drpCountry = new Select(driver.findElement(By.name("country")));
		
		//select the option from the drop-down list using the method
		drpCountry.selectByVisibleText("NIGERIA");
		System.out.println("Passed");
		*/
		
		/*====================================================================================================================
			*Test Case 2
			* ANOTHER WEBSITE-> Selecting Items in a Multiple SELECT elements
		*/
		

		driver.navigate().to("http://jsbin.com/osebed/2");
		
		Select fruits = new Select(driver.findElement(By.id("fruits")));
		
		if(fruits.isMultiple()) {
		fruits.selectByVisibleText("Banana");
		fruits.selectByIndex(2);
		System.out.println("Passed");
		}else {
			System.out.println("Not selected");
		}
		//To get the total number of the elements in the drop-dwon
		  List<WebElement> elementCount=fruits.getOptions();
		  System.out.println(elementCount.size());
			
		  //Print each number of the elements
		  int iSize = elementCount.size();
		  
		  //loop
		  for(int i =0; i<iSize; i++) {
			  String sValue = elementCount.get(i).getText();
			  System.out.println(sValue);
		  }
				
		  
		  
					System.out.println("End fo Program");
					//Kill the browser
					driver.close();
	}
	


	}
	
