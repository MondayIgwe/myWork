package PageObjects;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * The Percentage Test Case
 *
 */
public class percent_calculatorTest
{

	private static  WebDriver driver = null;
	
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\Desktop\\Selemium\\chromedriver.exe");
		driver = new ChromeDriver();
		
		//Implicit Wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//get the URL
		driver.get("http://www.calculator.net");
		
		
		//Use page object library now
		page_objects_perc_calc.lnk_math_calc(driver).click();  //click on the Math link
		page_objects_perc_calc.lnk_percent_calc(driver).click(); //click percentage link
		page_objects_perc_calc.txt_num_1(driver).clear(); //Clear or reset the Textbox 1
		page_objects_perc_calc.txt_num_1(driver).sendKeys("10"); //enter values in the Text Box
		page_objects_perc_calc.txt_num_2(driver).clear(); //Clear the second TextBox 2
		page_objects_perc_calc.txt_num_2(driver).sendKeys("50");// Enter value in second TextBox 2
		page_objects_perc_calc.btncalc(driver).click(); // Click calculate
		
		//Get the result
		String Result = page_objects_perc_calc.web_result(driver).getText();
		
		if (Result.equals("5"))
		{
			System.out.println("Result Passed");
			
		}
		else
		{
			System.out.println("Result Failed");
			
		}
		//close browser
		driver.close();
	}

}
