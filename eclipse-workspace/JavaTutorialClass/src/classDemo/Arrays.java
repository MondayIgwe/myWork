package classDemo;

import java.util.Date;

public class Arrays {

	public static void main(String[] args) {
	

	
		//DATE
		Date date = new Date();
		System.out.println(date);
		
		//Sngle Array variable
		double[] myList = {1.9, 2.9,3.4,3.5};

		//print all ARRAY
		for(double element: myList)
		{
			System.out.println(element);
		}
		
		//OR 
		
		
		//print all the Array
		for (int i = 0; i<myList.length; i++ )
		{
			System.out.println(myList[i]+ " ");
		}
		
		//instance variable
		double total = 0;
		for (int i = 0; i<myList.length; i++)
		{
			total += myList[i];
		}
		System.out.println("Total is:" + total);
		
		//Finding the largest element
		double max = myList[0];
		
		for (int i = 1; i<myList.length; i++)
		{
			if (myList[i]> max)
				max = myList[i];
		}
		System.out.println("Max  is:" + max);
		
		
		//=========================================================
		//Passing Arrays to Methods
		/*public static void printArray(int[] array) {
		
			for (int i = 0; i<array.length; i++)
			{
				//Print all Array using .lenght
				System.out.print(array[i]);
			}
		}
		
		//========================================================================
		*/
		//return a result with another array
		/*public static int[] reverse(int[] list) 
		{
			int[] result = new int[list.length];
			
			for (int i =0; j=result.length; i<list.length; i++, j--) 
			{
				result[j] = list[i];
				
			}
			return result;
		}
		*/
		//========================================================================
		
		//Multi-Dymension Array---[]-> Row and []->Column///
		int firstarray[][] = {{1,2,3,4,5,6,7,8}, {2,5,5,6,4,5,6,7,3}}; // two rows
		int secondarray[][] = {{1,2,3,4,5,6,7,8}, {2,5,5,6,4,5,6,7,3}}; // two rows
		
		System.out.println("This is the First array");
		//call the method
		display(firstarray);
		
		System.out.println("This is the Second array");
		//call the method
		display(secondarray);
	}
	
	
		


	public static void display(int x[][]) {
		for (int row=0; row<x.length; row++) {
			for (int column =0; column<x[row].length; column++ ) {
				System.out.print(x[row][column]+"\t");
			}
			System.out.println();
		}
		

	
		}
	
	}



