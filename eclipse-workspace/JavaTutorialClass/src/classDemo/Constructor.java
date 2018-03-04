package classDemo;
/*
 * //This is the syntax to create a Constructor
    public Car(){
	}
 */

public class Constructor {

	//Declare variable
		String name;
		
		

	
	//A constructor with values or parameters passed  
	public Constructor(String myNames) {
		name = myNames;
	
		
	}
	
	//A method that will perform the actions
	public void DisplayCharacter() {
		System.out.println("my name is:"+ name);
	;
	}

}
