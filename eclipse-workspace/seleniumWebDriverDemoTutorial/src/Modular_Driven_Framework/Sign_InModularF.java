package Modular_Driven_Framework;

import org.openqa.selenium.WebDriver;

//IMPORT PACKAGES & IT CLASS
import PageObjects.Login_POM;


public class Sign_InModularF {
	
	/* Test Senerios
	 * •	 Click on the My Account link.
		•	Enter Username
		•	Enter Password
		•	Click on the Submit button

	 * Actions are done here
	 * Call the ClassName.MethodName
	 * 
	 */
	
	
	
	//THIS IS YOUR MODULAR DRIVEN FRAMEWORK THAT YOU CALL INTO OTHER CLASSES
	//CONTAINS ARE THE METHODS YOU PERFORM ON THE APPLICATION
	//YOU CALL THEM FROM OTHER CLASSES OR YOU BUILD THEM INSIDE HERE
	
	
	//Create a method called Execute to club all of them
	public static void Execute(WebDriver driver) {
		
	
			
		
		
		//Enter Credentials
		Login_POM.verifyUserName(driver).sendKeys("Kingmondala");
		Login_POM.verifyPassword(driver).sendKeys("mondeew");
		
		//Click Log in Button
		Login_POM.btn_Login(driver).click();
		
		
		
		
	}

}
