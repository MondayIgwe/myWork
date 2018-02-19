package TestCases;


import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;

public class MultipleTest {
	/*
	 * Executing multple tests with a Single testNG class
	 */
	
	WebDriver driver;
	
	
	
  @Test(priority=0)    //Assign priority during execution
  public void one() {
	  System.out.println("This is Test case number 1");
  }
  
  
  @Test(priority=1)
  public void two() {
	  System.out.println("This is Test Case number 2 ");
  }
  
  
  @Test(priority=2, enabled=false)  //To skip a test from executing
  public void three() {
	  System.out.println("This is Test Case number 3 ");
	  
  }
  @Test(priority=3)
  public void four() {
	  System.out.println("This is Test Case number 4");
  }
  
 
}
