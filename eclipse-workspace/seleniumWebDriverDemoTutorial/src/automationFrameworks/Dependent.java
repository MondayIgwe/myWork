package automationFrameworks;

import org.testng.annotations.Test;

public class Dependent {
	
	
  @Test(dependsOnMethods= {"OpenBrowser"})
  public void SignIn() {
	  
	  System.out.println("This will execute SECOND  after (OpenBrowser)");
  }
  
  @Test
  public void OpenBrowser() {
	  System.out.println("This will execute FIRST before (SigniN)");
  }
  
  @Test(dependsOnMethods= {"SignIn"})
  public void LogOut() {
	  System.out.println("This will execute THIRD before (SigniN)");
  }
}
