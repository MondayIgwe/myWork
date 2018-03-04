package programmingKnowledeg;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class GeneralTutorial {
	
	@Test
	//STRINGS
public void testString()
{
		String str = "ABCDEF";
	 
		String joinStr = str.concat("igwe");
		assertEquals( str, "ABCDEF");
		assertEquals("ABCDEF",joinStr);
		
}
	@Test
	public void testEquality(){
		String str = "monday";
		String strr = "monday";
		String strrr = "Monday";
		
		assertTrue(str.equals(strr));
		assertTrue(strrr.equalsIgnoreCase(strr));
		
	}
	
	@Test
	public void understandArray()
	{
		int[] scores = new int[] {0,1,2,3,4,5};
		assertEquals(0, scores[0]);
		assertEquals(1, scores[1]);
		assertEquals(2, scores[2]);
		assertEquals(3, scores[3]);
		assertEquals(4, scores[4]);
	
	}
	
	
}
