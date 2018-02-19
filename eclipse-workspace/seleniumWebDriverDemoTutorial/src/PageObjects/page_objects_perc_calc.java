package PageObjects;

import org.openqa.selenium.*;

/**
 * Each objects in a page are created 
 * and also there Methods/Functions that used to access the objects on the page 
 *
 */
public class page_objects_perc_calc
{

	private static WebElement element = null;
	
	//Math Cal Link
	public static WebElement lnk_math_calc(WebDriver driver) 
	{
		element = driver.findElement(By.xpath(".//*[@id='homelistdiv']/table/tbody/tr/td[3]/div[2]/a"));
		
		return element;
	}
	
	//Percentage Calc Link
	
	public static WebElement lnk_percent_calc(WebDriver driver) 
	{
		element = driver.findElement(By.xpath(".//*[@id='content']/ul[1]/li[3]/a"));
		
		return element;
		
	}
	
	//Number 1 Text Box --> Method
	
	public static WebElement txt_num_1(WebDriver driver) 
	{
		element = driver.findElement(By.xpath(".//*[@id='cpar1']"));
		
		return element;
		
	}
	
	//Number 2 Text Box --> Methodtxt_num_2
	public static WebElement txt_num_2(WebDriver driver) 
	{
	
	element = driver.findElement(By.xpath(".//*[@id='cpar2']"));
	return element;
	
}
	//Calculator Button
	public static WebElement btncalc(WebDriver driver) 
	{
	element = driver.findElement(By.xpath(".//*[@id='content']/table[1]/tbody/tr[2]/td/input[2]"));
	
	return element;
	
}
	//Result
	public static WebElement web_result(WebDriver driver) 
	{
	  element = driver.findElement(By.xpath(".//*[@id='cpar3']"));
	  
	  return element;
	}
	
}

