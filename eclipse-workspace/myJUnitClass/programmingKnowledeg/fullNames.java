package programmingKnowledeg;

import static org.junit.Assert.*;

import org.junit.Test;

public class fullNames {

	@Test
	public void fullNamestest() {
		myJUnitClass junit = new myJUnitClass();
		String names = junit.myNames("monday","igwe");
		assertEquals("mondayigwe", names);
		
	}

}
