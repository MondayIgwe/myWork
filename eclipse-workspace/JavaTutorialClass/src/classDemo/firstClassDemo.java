package classDemo;

/**
 * @author Administrator
 *
 */
public class firstClassDemo {
	
	//Variable declaration
	int x = 100;
	String name = "friday";
	
	String myName;


	
	public static void main(String[] args) {
		
		System.out.println("Start of Program !");
		
		
		//Create an objectname or objectreference that will invoke the variablename and Methods()
		//constructor
		firstClassDemo obj1 = new firstClassDemo();
		
		obj1.sum();
		System.out.println(obj1.vName("son"));
		
		
		System.out.println("This is x value" + obj1.x);
		System.out.println("This is String value!" + obj1.name);
		System.out.println(obj1);
		System.out.println("End of Program !");
		System.out.println("This is x value" + obj1.x);
	}
	
	
	public void sum() //Method
	{
		int a = 90;
		int b= 100;
		int c=a+b;
		
		if(a== 90) {
			System.out.println("A is ==>"+ a);
		}
		
		System.out.println("The sum of the two numbers is:" + c);
		
	}
	

	
	
	public String vName(String sName) {
		this.myName=sName;
		
		return name;
		
	}
	  
	

}
