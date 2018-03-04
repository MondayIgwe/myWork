package classDemo;

public class secondClass {
 
	  String lang = "igbo";
	  
	public static void main(String[] args) {
	
		 System.out.println("Creating an object in the second class with the class name of the first class");
		firstClassDemo obj1 = new firstClassDemo();
		firstClassDemo calc = new firstClassDemo();
		
		calc.sum();  //you call the method this way
		obj1.sum();
		
		System.out.println("invoking the object"+" "+ obj1.name); //you call the varaible name this way
		System.out.println("invoking the object"+ " "+ obj1.x);
	

	}

}
