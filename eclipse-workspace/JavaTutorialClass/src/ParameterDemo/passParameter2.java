package ParameterDemo;

public class passParameter2 {

	public static void main(String[] args)
	{
		
		//pass the parameters using an Object className
		passParameter2 obj1 = new passParameter2();
		
		int sum = obj1.add(2,5);
		System.out.println("Result is"+ " " + sum);
		
		double Result = obj1.sub(4.0, 3.8);
		
		System.out.println("Result is"+ Result);
	}
		public int add(int a, int b)
		{
			int c = a+b;
		  return c;
		}
		
		public double sub(double x, double y)
		{
			double Result = x * y;
			
			return Result;
		}
}
