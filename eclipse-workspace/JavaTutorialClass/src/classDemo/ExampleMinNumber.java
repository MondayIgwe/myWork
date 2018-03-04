package classDemo;

public class ExampleMinNumber {

	public static void main(String[] args) 
	{
	int a = 11;
	int b = 7;
	int c = minFunction(a, b);
	System.out.println("Minimum value is:"+ c);
	
	rankPoints(300.00);
	}
	
	
	//Returns the minimum of two numbers
	public static int minFunction(int n1, int n2)
	{
		int min;
		if(n1 < n2)
		{
			min = n2;
			
		}else {
			min=n1;
			
			
		}
		return min;
	}
	public static void rankPoints(double point)
	{
		if (point >= 200.00) {
			System.out.print("Rank: A2");
		}else if (point >=100.98) {
			System.out.print("Rank: A3");
		}
	}

}
