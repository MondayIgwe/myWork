package automationFramework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import PageObjects.*;

//Import Packages utility.*
import utility.Constant;
import utility.ExcelUtils;
import appModules.SignIn_Action;


public class Apache_Poi_TC {
	
	private static WebDriver driver = null;
	
	public static void main(String[] args) throws Exception {

		//This is to open the Excel file. Excel path, file name and the sheet name are parameters to this method
		
		ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData,  "Sheet1");

		driver = new HtmlUnitDriver();
		
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		driver.get(Constant.URL);
	
		SignIn_Action.Excecute(driver);
		System.out.println("Login Successfully, Now it time to log off buddy");
		
		 Home_Page.lnk_LogOut(driver).click(); 
		 
	        driver.quit();
	 
	        //This is to send the PASS value to the Excel sheet in the result column.
	 
	        ExcelUtils.setCellData("Pass", 1, 3);

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}