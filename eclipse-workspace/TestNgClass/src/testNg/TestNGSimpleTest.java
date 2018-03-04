package testNg;

import org.testng.annotations.Test;
import org.testng.Assert;


public class TestNGSimpleTest {
	
	
	@Test
	public void testAdd()
	{
		String str = "TestNG is working";
		Assert.assertNotEquals("TestNG is working fine",str);
		
}
	
	
	

	

}
