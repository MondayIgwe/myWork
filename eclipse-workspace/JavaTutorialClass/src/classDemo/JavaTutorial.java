package classDemo;

public class JavaTutorial {
	
	
	static int speed = 10; 
	
	public static void main(String[] args) {

	
		//double data type
		 double PI = 3.393;
		 System.out.println(PI);
		//char data type
	
		char ini = 'M';
		
		//int datatype
		int num = 100;
		System.out.println("This is integer"+" "+ num);
		//use boolean data type value
		boolean testResult = true;
		System.out.println("Test result is:"+" "  + testResult);
		
		//speed variable
		System.out.println(speed);
		
		//initial = (initial == 'f') ? true : false;
		System.out.println(ini);
		
			//Strings
		
		String str = "monday";
		
		
		//if expression
		if (str.equals("monday"))
				{
					System.out.println("Today is: "+ str);
					
				}else {
					System.out.println("Today is not: "+ str);
				}
		
		if (ini == 'M')
		{
			System.out.println(ini);
		}
		
		//switch
		switch(str) {
		case "monday":	//enter the value of the variable		
				System.out.println("Matched");
		break;
		
		case "tuesday":
			System.out.println("Not a match");
			break;
		default:
			System.out.println("Unknown day");
	
			/* Different ways of creating an array
			 * ArrayDataType[] ArrayName;
			 ** ArrayType [] ArrayName = New ArrayType [Size of an Array];
			 */
			
			String[] userNames = new String[3];
			
			userNames[0]= "ogwe";
			userNames[1]= "igwe";
			userNames[2]= "friday";
			
			System.out.println(userNames.length+ " " + userNames[2]);
			
			int[] budget = {100, 200, 300};
			int bud = budget.length;
			System.out.println(bud +""+budget[1]);
			
			
			//This is to print all the element values of an Array
			for(int i = 0; i<userNames.length-1; i++) {
				System.out.println(userNames);
			}
			
			
		
		}
	}

}
