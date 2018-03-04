package programmingKnowledeg;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

public class TestJUnit1 extends TestCase {

	protected double fValue1;
	
	protected double fValue2;
	
	@Before
	public void setUp() {
		fValue1 = 2.0;
		fValue2 = 3.0;
		
	}
	
	@Test
	public void testAdd() {
		//count the number of test cases
		System.out.println("The number of test cases are:"+ this.countTestCases());
		
		//test getName
		String name = this.getName();
		System.out.println("The name of the Test caes is:"+ name);
		
		//test setName
		this.setName("testNewAdd");
		String newName = this.getName();
		System.out.println("Updated Test case Nam = "+ newName);
	}
	
		//tearDown is used to close the connection or clean up activities
		public void tearDown( ) {
			
		
	}
	
}
