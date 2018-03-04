package classDemo;

public class constructors {
	
	//class variable always has a static keyword
	static double num = 99.00;
	static int puppyAge;

	public constructors(String name)
	{

		
		//This is a constructor, Must be same as the class name
		System.out.println("my name is" + name);
	}
	
	public void setAge(int age)// Method
	{
		 puppyAge = age;
	}
	
	static //Instance variable, within the clss but out any method or constructor blocks
	int mySalary = 10;
	
	public void empSalary (int salary)
	{
		
		mySalary = salary;
	
	}
	
		
		public static void main(String[] args)
		{
			//create object to be used for the constructors
			constructors myPuppy = new constructors(" "+ "igwe");
		
			
			//objectReference.methodName
			myPuppy.setAge(3);
			//myPuppy.empSalary(mySalary);
			System.out.println(mySalary);
			
			
			System.out.println(num);
			
			System.out.println(puppyAge);
			
	}
	

}
