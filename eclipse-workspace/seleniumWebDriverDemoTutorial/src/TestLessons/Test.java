package TestLessons;

//import java.util.List;
import java.util.concurrent.TimeUnit;
//import org.openqa.selenium.interactions.Action;
//import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.Select;	//PACKAGE TO SELECT DROP DOWN BOX	


/*  Requirements Test Cases for the AUT.
 * ================================================================================================================
 * Author   : Monday Igwe (Automation Tester) 
 * Test    : Verify that the web application can be launched
 *           Verify the Email Address WebElement and check if it Email TextBox is Enabled
 *           Verify that the value can be retrieved
 * Web Application --->  https://www.facebook.com/
 */

public class Test 

{
public static void main(String[] args)

{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\Desktop\\Selemium\\chromedriver.exe");
		
		//Create Webdriver driver the Object
		WebDriver driver = new ChromeDriver();
		
		//maximize application window
		driver.manage().window().maximize();
		
		
		
		
		
		
		/*
		
		//Declare and Assign the URL to the variable to launch the Web APPLICATION
		String baseUrl = "https://www.facebook.com/";
		driver.get(baseUrl);
		
		
		
		//Get the WebElement for the Email Address Element
		WebElement email = driver.findElement(By.id("email"));
		
		//VERIFICATION POINT
		if (email.isEnabled()) {
			email.sendKeys("abcd@gmail.com");
		}
		

		//Get the value from the Textbox
			String result = driver.findElement(By.id("email")).getAttribute("value");
	
		//Print the retrieved value
			System.out.println("This the retrieved value" +" " + result);
			
			
			
			//click the Login Button
			driver.findElement(By.xpath(".//*[@id='u_0_13']")).click();
			
			//print message With more other methods
			System.out.println("This is the output of the isSelected" 
			+ driver.findElement(By.xpath(".//*[@id='u_0_13']")).isSelected());
			
			System.out.println("The output of the isDisabled is" 
					+" "+ driver.findElement(By.xpath(".//*[@id='u_0_13']")).isDisplayed());
			
			System.out.println("The output of the isEnabled is" 
					+"  "+driver.findElement(By.xpath(".//*[@id='u_0_13']")).isEnabled());
			
			
			
			/*
			 
			//wait for 2 minutes for the values to be visible
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			//Select drop down Box BY creating an object constructor
			Select drpday = new Select( driver.findElement(By.id("day")));
			drpday.selectByIndex(1);
			
			//wait for 2 minutes for the values to be visible
			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			Select drpMonth = new Select( driver.findElement(By.id("month")));
			drpMonth.selectByVisibleText("Jan");
			
			//wait for 2 minutes for the values to be visible
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			Select drpYear = new Select( driver.findElement(By.xpath(".//*[@id='year']")));
			drpYear.selectByIndex(1999);
			
			
			//print out message With more other methods
			System.out.println("Is the Day Selected ?" 
					+"  "+ driver.findElement(By.id("day")).isSelected());
			
			System.out.println("Is the Month Disabled ?" 
					+"  "+ driver.findElement(By.id("month")).isDisplayed());
			
			System.out.println("Is the Year Enabled ?" 
					+"  "+ driver.findElement(By.xpath(".//*[@id='year']")).isEnabled());
			

			//click on the CheckBox
			driver.findElement(By.id("caddoptional")).click();
			
			//print out message With more other methods
			System.out.println("Is the checkbox Selected ?" 
				+"  "+ driver.findElement(By.id("caddoptional")).isSelected());
			
			System.out.println("Is the checbox Disabled?" 
					+"  "+	driver.findElement(By.id("caddoptional")).isDisplayed());
					
		*/	
			
			
			
	//=====================================================================================================================
	
	/*
	 * ANOTHER WEBSITE FOR TESTING OR LEARNING DRAG & DROP ELEMENTS		
	 
			
			
			
			//WAIT FOR 10 SENDS
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			//launch the application
			driver.navigate().to("http://www.keenthemes.com/preview/metronic/templates/admin/ui_tree.html");
			
			//maximize page
			driver.manage().window().maximize();
			
			
			//create the objects
			WebElement From = driver.findElement(By.xpath(".//*[@id='j3_7_anchor']"));
			
			WebElement To = driver.findElement(By.xpath(".//*[@id='j3_1_anchor']"));
			
			Actions builder = new Actions(driver);
			Action drapAndDrop = builder.clickAndHold(From)
			.moveToElement(To)
			.release(To)
			.build();
			drapAndDrop.perform();
			
	*/	
			
/*
 * ==============================================================================================================================
 * ANOTHER WEBSITE FOR TESTING MULTPLE SELECTION FROM A LIST BOX			
 */
			
			//implicit wait
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get("http://demos.devexpress.com/aspxeditorsdemos/ListEditors/MultiSelect.aspx");
			
			
			/*
			//Check the List box element 
			driver.findElement(By.id("ControlOptionsTopHolder_lbSelectionMode_I")).click();
			driver.findElement(By.id("ControlOptionsTopHolder_lbSelectionMode_DDD_L_LBI0T0")).click();
			
			if(driver.findElement(By.id("ContentHolder_lbFeatures_MemoryCardSlot_D")).isEnabled()) {
			  System.out.println("The list box is Enabled");
			}else {
				 System.out.println("The list box is Enabled");
				 
				 
				 
				 //SELECT MULTIPLE LIST BOXES
				 Actions builder = new Actions(driver);
				 
				 WebElement select = driver.findElement(By.id("ControlOptionsTopHolder_lbSelectionMode_I")); //Multiple option selected on the dropdown list
				 
				 //use the select object
				 List<WebElement> options = select.findElements(By.tagName("td"));
				 System.out.println(options.size());
				 
				 Action multipleSelect = builder.keyDown(Keys.CONTROL)
						 .click(options.get(2))
						 .click(options.get(4))
						 .click(options.get(6))
						 .build();
				 multipleSelect.perform();
				 
				 	*/
			//Get All the Links in a Web Page
			java.util.List<WebElement> Links = 
					driver.findElements(By.tagName("a"));
			
			System.out.println("Number os links in the Page is:"+ " "+ Links.size());
			
      for (int i = 1; i <=Links.size(); i=i+1)
      {
    	  System.out.println("The Name of the Link#" + i + Links.get(i).getText());    	  
      }
      
      
}
			
			
			//close the browser
			//driver.close();
	
}

