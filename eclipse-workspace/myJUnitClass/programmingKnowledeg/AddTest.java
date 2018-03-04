package programmingKnowledeg;

import static org.junit.Assert.*;

import org.junit.Test;

public class AddTest {

	@Test
	public void Addtest() {
		myJUnitClass junit = new myJUnitClass();
		int result = junit.add(100, 200);
		assertEquals(300, result);				
		
		}

}
