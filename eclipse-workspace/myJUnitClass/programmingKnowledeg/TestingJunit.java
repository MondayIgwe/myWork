package programmingKnowledeg;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestingJunit {
	
	String message = "Hello Monday";
	
	//instantiate object
	MessageUtil messageUtil = new MessageUtil(message);
	


	@Test
	public void testPrintMessage()
	{
		message = "New Word";
		
	    assertEquals(message, messageUtil.printMessage());	
	}

}
	
