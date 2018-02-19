package Modular_Driven_Framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class Modular_DrivenF implements IDrivers_Modular {

	
	public WebDriver driver;
	
	//Constructor
	public Modular_DrivenF(String HtmlUnit) throws Exception {

		
			driver = new HtmlUnitDriver();
		
	}

	

	@Override
	public void openBrowser(String Url) throws Exception {
		driver.get(Url);
		System.out.println(driver.getCurrentUrl());
		System.out.println("Browser opened");
		
	}

	@Override
	public void closeBrowser() throws Exception {
		driver.quit();
		System.out.println("Browser closed");
		
	}

	@Override
	public void getCurrentUrl() throws Exception {
	driver.navigate().to("");
		
	}

	@Override
	public void getTitle() throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setPageLoadTime() throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setImplicitWait() throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getUrl() throws Exception {
		// TODO Auto-generated method stub
		
	}

	
		
	}


