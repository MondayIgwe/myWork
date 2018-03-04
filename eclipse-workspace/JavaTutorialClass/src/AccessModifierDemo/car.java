package AccessModifierDemo;

public class car {

	//members or fields of the class && Declare there variables
	public static int iWeek;
	public static int iMonth;
	public String name;
	public int age; //all other classes and Packages can access it 
	protected String motor; //accessed only class and through inheritance in another package, another class in thesame package cannot access it
	int speed;  //default-accessor modifier and can only be accessed by the classes in thesame package
	
	
	//This is a method
	public void DisplayCaharacter() {
		System.out.println("My name is "+ name);
		System.out.println("my age is "+  age);
		System.out.println("This the car name "+  motor);
	}
	
	public static void DispalyStaticCharacter() {
		System.out.println("Week days are "  + iWeek+" days");
		System.out.println("Week days are "  + iMonth+" days");
	}
	
	
}


