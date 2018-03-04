package executionEngine;


import org.openqa.selenium.WebDriver;
import config.ActionKeywords;
import utility.ExcelUtils;



public class DriverScript {
/* This an Automation End to End flow
 * •	Step 1 – Open a Browser
	•	Step 2 – Navigate to URL
	•	Step 3 – Click on My Account button
	•	Step 4 – Enter Username
	•	Step 5 – Enter Password
	•	Step 6 – Click on LogIn button
	•	Step 7 – Click on LogOut button
	•	Step 8 – Close the Browser

 */
	
	
	public static WebDriver driver  = null;
	
	
	public static void main(String[] args) throws Exception {
	
		ActionKeywords.openBrowser();
		
		//Declare the path of the Excel file with name of he Excel file
		String sPath = "C:\\Users\\Administrator\\eclipse-workspace\\KeywordDriveFramework\\src\\dataEngine\\dataEngine.xlsx";
	    
		//Here, we are passing the Excel path and SheetName as arguments to connect with the excel file
		//USING THE ClassName.MethodName because it a static method
		ExcelUtils.setExcelFile(sPath, "Test Steps");
		
		//This is the loop for reading the values of the column 3 (Action Keyword) row by row
		
		for(int iRow = 1; iRow<9; iRow++) {
			//store the value of excel cell in sActionKeyword string variable
			String sActionKeyword =  ExcelUtils.getCellData(iRow, 3); //3 means the Column 3 in the Excel sheet
			
			
			//Comparung the value of Excel cell with all other projects keywords
			if(sActionKeyword.equals("openBrowser")) {
				//Action Keyword is called to perform an action
				//Open browser
				ActionKeywords.openBrowser();
				
			}else if(sActionKeyword.equals("navigate")) {
				//Launch the Url
				ActionKeywords.navigate();
				
			}else if(sActionKeyword.equals("click_My Account")){
				 //Click on My Account
				ActionKeywords.click_MyAccount();
				
			}else if(sActionKeyword.equals("Input_Username")) {
				 //Enter Username
				ActionKeywords.input_Username();
				
			}else if(sActionKeyword.equals("Input_Password")){
				 
			     //Enter Password
				ActionKeywords.input_Password();
				
			}else if(sActionKeyword.equals("click_Login")){
				   //Click login
				ActionKeywords.click_Login();
				
			}else if(sActionKeyword.equals("waitFor")){
				  //Wait for
				ActionKeywords.waitFor();
				
			}else if(sActionKeyword.equals("click_LogOut")){
				  //Click Log out button
			ActionKeywords.click_LogOut();
			
			}else if(sActionKeyword.equals("closeBrowser")){
				  
			    //Kill the process
				ActionKeywords.close_Browser();
			}
		}	    
		 
	
	    
	    

	}



	}

