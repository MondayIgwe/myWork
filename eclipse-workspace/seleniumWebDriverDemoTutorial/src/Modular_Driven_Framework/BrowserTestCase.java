 package Modular_Driven_Framework;

public class BrowserTestCase {
	
	public static void main(String[] args) {
		
		try {
			Modular_DrivenF action = new Modular_DrivenF("HtmlUnitDriver");
		         
				action.openBrowser("https://secure.takealot.com/account/login");
				
				action.closeBrowser();
		
		} catch (Exception e) {
		System.out.println("Exception handled"+e.getMessage());
		}
	}

}
