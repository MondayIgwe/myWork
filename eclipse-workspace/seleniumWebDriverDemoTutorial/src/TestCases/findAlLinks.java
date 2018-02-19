/**
 * 
 */
package TestCases;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

//import org.apache.http.HttpConnection;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


/**Test Scenerios
 * GET the numbers of links
 * Verify the url and get or retrieve all the links on the page
 * 
 *
 */
public class findAlLinks {

	
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\Desktop\\Selemium\\Drivers\\chromedriver.exe");
		//System.setProperty("webdriver.gecko.driver","C:\\Users\\Administrator\\Desktop\\Selemium\\Drivers\\geckodriver.exe");
		 
		WebDriver driver = new ChromeDriver();
			
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com");
		
		//get the url
		System.out.println("The expected URL I==>"  + driver.getCurrentUrl());
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
			System.out.println("This are all the links" + links.size());
			
			//For loop 
			for(int i=0; i<links.size(); i++) 
			{
				System.out.println("ThE name of the link #--"+ links.get(i).getText());
				 
				WebElement ele = links.get(i);
				String url = ele.getAttribute("href");
				verifyLinkActive(url);
			}
			driver.close();
	}
	
	
			//To verify  each url LINKS
			public static void verifyLinkActive(String linkUrl)
			{
				try
				{
					
				
				URL url = new URL(linkUrl);  //import java.net Package
				
				//Establish a connection between the browser and the server--> java.net
				HttpURLConnection httpURLConnect = (HttpURLConnection)url.openConnection();
				
				//set teh connection Time
				httpURLConnect.setConnectTimeout(3000);
				
				//connect
				httpURLConnect.connect();
				
				//verification point
				if(httpURLConnect.getResponseCode()==200)
				{
					System.out.println(linkUrl+ "-"+httpURLConnect.getResponseMessage());
					
				}
				
				if(httpURLConnect.getResponseCode()==HttpURLConnection.HTTP_NOT_FOUND)
				{
					System.out.println(linkUrl+"-"+httpURLConnect.getResponseMessage()+ " - "+HttpURLConnection.HTTP_NOT_FOUND);
					
				}
				
			}   catch (Exception e){
				 
				System.out.println(e);
					
				}
				
			}
			
			
	}


