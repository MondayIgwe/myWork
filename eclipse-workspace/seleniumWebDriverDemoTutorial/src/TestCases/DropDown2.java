package TestCases;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown2 {

	public static void main(String[] args) throws Exception {

		  /*============================================================
		  * Test Case 3
		  * Practice Exercise -1 (Drop Down Box/List)
					1.	Launch new Browser
					2.	Open “http://toolsqa.wpengine.com/automation-practice-form/”
					3.	Select ‘Continents’ Drop down ( Use Id to identify the element )
					4.	Select option ‘Europe’ (Use selectByIndex)
					5.	Select option ‘Africa’ now (Use selectByVisibleText)
					6.	Print all the options for the selected drop down and select one option of your choice
					7.	Close the browser

		  */
		
			WebDriver driver = new HtmlUnitDriver();
		  
		  //Step 1: launch application
		  driver.navigate().to("http://toolsqa.wpengine.com/automation-practice-form");
		  
		  //Step 2: ADD implicit wait
		  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		  
		  
		  //Step 3: Select 'Continents' Drop down ( Use Id to identify the element )
			// Find Select element of "Single selection" using ID locator

		  Select drpSelect = new Select(driver.findElement(By.id("continents")));
		  
		// Step 4:) Select option 'Europe' (Use selectByIndex)
			drpSelect.selectByVisibleText("Europe");
	 
			// Using sleep command so that changes can be noticed
			Thread.sleep(2000);
	 
			// Step 5: Select option 'Africa' now (Use selectByVisibleText)
			drpSelect.selectByIndex(2);
			Thread.sleep(2000);
	 
			// Step 6: Print all the options for the selected drop down and select one option of your choice
			// Get the size of the Select element
			List<WebElement> oSize = drpSelect.getOptions();
			int iListSize = oSize.size();
	 
			// Setting up the loop to print all the options
			for(int i =0; i < iListSize ; i++){
				
			
				// Storing the value of the option	
				String sValue = drpSelect.getOptions().get(i).getText();
				
				// Printing the stored value
				System.out.println(sValue);
				
				// Putting a check on each option that if any of the option is equal to 'Africa" then select it 
				if(sValue.equals("Africa")){
					drpSelect.selectByIndex(i);
					break;
					}
				
				driver.close();
		  

	}

}
}