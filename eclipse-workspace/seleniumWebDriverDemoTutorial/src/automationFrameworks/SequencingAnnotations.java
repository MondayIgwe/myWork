package automationFrameworks;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class SequencingAnnotations {
	
	
	@Test
	public void testCase1() {
		System.out.println("This is the Test case 1");
	}
	
	@Test
	public void testCase2() {
		System.out.println("This is Test case 2");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("The will execute before every Method");
	}
		
	@AfterMethod
	public void afterMethod() {
		System.out.println("The will execute after every Method");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("The will execute before the Class");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("The will execute after the class");
	}
	
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("The will execute before the Test");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("The will execute after the Test");
	}
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("The will execute before the TestSuite");
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("The will execute after the TestSuite");
	}
	
}
