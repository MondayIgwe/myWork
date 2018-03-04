package ParameterDemo;

public class passParameter {

	public static void main(String[] args)
	{
		
		//pass the parameters using an Object className
		passParameter obj1 = new passParameter();
		
		obj1.add(2,5);
		obj1.sub(4, 3);
	}
	
		public void add(int a, int b)
		{
			int c = a+b;
					System.out.println("Result is"+ " " + c);
		}
		
		public void sub(double x, double y)
		{
			double Result = x * y;
			System.out.println("Result is"+ Result);
		}
}
