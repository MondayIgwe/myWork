package appModules;

import org.openqa.selenium.WebDriver;
import PageObjects.Home_Page;
import PageObjects.Login_Page;
import utility.ExcelUtils;

public class SignIn_Action {
	
	public static void Excecute(WebDriver driver) throws Exception
	{
		//This is to get the values from Excel sheet, passing parameters (Row num &amp; Col num)to getCellData method
		
		
		String sUserName = ExcelUtils.getCellData(1, 1);
		 
		String sPassword = ExcelUtils.getCellData(1, 2);

		Home_Page.lnk_MyAccount(driver).click();

		Login_Page.txtbx_UserName(driver).sendKeys(sUserName);

		Login_Page.txtbx_Password(driver).sendKeys(sPassword);

		Login_Page.btn_LogIn(driver).click();

	}
	
	
	

}
