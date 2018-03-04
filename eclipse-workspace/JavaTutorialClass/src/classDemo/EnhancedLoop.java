package classDemo;

public class EnhancedLoop {
	/*
	 * for (data_type variable: array_name)
	 */

	public static void main(String[] args) {
	
		//Array of days in a week
		String[] days = {"monday","tuesday","wednesday","thursday","friday","saturday","sunday"};
		
		
		
		
		//Apply enhanced loop. IT IS USED IN SELEMIUM WEBDRIVER
		
		for(String dayName : days) {
			System.out.println("The days is:"+ " "+dayName);
		}
	}

}
