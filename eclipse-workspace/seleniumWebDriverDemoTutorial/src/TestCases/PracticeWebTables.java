package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeWebTables {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\Desktop\\Selemium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		/*
		 * Practice Exercise 1
			1.	Launch new Browser
			2.	Open URL “http://toolsqa.wpengine.com/automation-practice-table/”
			3.	Get the value from cell ‘Dubai’ and print it on the console
			4.	Click on the link ‘Detail’ of the first row and last column

		 */
		
		System.out.println("Start of Program");
		
		driver.navigate().to("http://toolsqa.wpengine.com/automation-practice-table");
		
		//Store the value of the cell into a string variable
		String sCellValue = driver.findElement(By.xpath(".//*[@id='content']/table/tbody/tr[1]/td[2]")).getText();
		System.out.println(sCellValue);
		
		//Click on the "Detail" Link
		
		driver.findElement(By.xpath(".//*[@id='content']/table/tbody/tr[1]/td[6]/a")).click();
		 System.out.println("Link has been clicked");
	
	/*
	 * Test case 2
	 * Practice Exercise 2
	 * 1.	Launch new Browser
		2.	Open URL “http://toolsqa.wpengine.com/automation-practice-table/”
		3.	Get the value from cell ‘Dubai’ with using dynamic xpath
		4.	Print all the column values of row ‘Clock Tower Hotel’

	 * 
	 */
		 //Step 1: you create a dynamic xpath by using user-defined dynamic variable
		 
		 String sRow = "1";
		 String sCol = "2";
		 
		//Here we are locating the xpath by passing variables in the xpath
		 String sCellValue1 = driver.findElement(By.xpath(".//*[@id='content']/table/tbody/tr["+ sRow +"]/td["+ sCol+"]")).getText();
			System.out.println(sCellValue1);
		 
			//Print all the column values for "Clock Tower Hotel"
			String sRowValue = "Clock Tower Hotel";
			
			//loop
			for (int i = 1; i < 5; i++) {
				String sValue = null;
				sValue = driver.findElement(By.xpath(".//*[@id='content']/table/tbody/tr["+ i +"]/th")).getText();
				
				//
				if (sValue.equalsIgnoreCase(sRowValue)) {
					// If the sValue match with the description, it will initiate one more inner loop for all the columns of 'i' row 
					for (int j=1;j<=5;j++){
						String sColumnValue = driver.findElement(By.xpath(".//*[@id='content']/table/tbody/tr[" + i + "]/td["+ j +"]")).getText();
						System.out.println(sColumnValue);
					}
				break;
				}
				driver.close();
			}

				
				
			}
		 
		 

	}


