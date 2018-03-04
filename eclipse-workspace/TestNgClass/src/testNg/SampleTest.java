package testNg;

import org.testng.Assert;
import org.testng.annotations.Test;



public class SampleTest {
	
	String message = "Hello monday";
	
	MessageUtil messageUtil = new MessageUtil(message);

	@Test
	public void testPrintMesssage(String message)
	{
		System.out.println(message);

	 Assert.assertEquals(message, messageUtil.printMessage());
	}
	
	
	
}
