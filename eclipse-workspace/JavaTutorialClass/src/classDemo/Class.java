package classDemo;

import java.util.Scanner;

public class Class {
	

	
	
	public static void main (String args[])
	{
		
	
		
		//Create an Object from the other class to be used in this class
		Class2 myClassObj = new Class2();
		
		myClassObj.simpleMessage();
	
		//import a Scanner and use the other class name and the Object
		 Scanner input = new Scanner(System.in);
		 
		 Class2 myClassObj1 = new Class2();
			System.out.println("Enter username");
			String name = input.nextLine();
			myClassObj1.myName(name);
		 
		 
		/*
		 * 
		
		
		double fnum, snum, answer;
		System.out.println("Enter first number:");
		fnum = mon.nextDouble();
		
		System.out.println("Enter Second number:");
		snum = mon.nextDouble();
		
		answer = fnum + snum;
		System.out.println(answer);
		
		
		/*=========================================================
		 * 
		 */
		double mynum = 4.4;
		
		
		int  num=3, num1 = 5, Total;
		Total = num + num1; 
		
		System.out.println("The Total is:"+ Total);
		System.out.println("The Total is:"+ ++Total);
		System.out.println("The Total is:"+ --Total);
		
		if(mynum == 4.4)
		{
			System.out.println("The double number is:" + mynum);
			
		}else {
			System.out.println("This is False");
		}
		
		
		int boy = 18, girl = 15;
		if (boy == 18 && girl == 15)
		{
			System.out.println("Boy may enter");
		}else {
			System.out.println("Boy cannot enter");
		}
			
			if (girl < boy || boy > 11){
			System.out.println("Girl may enter");
			
		}else {
			System.out.println("Invalid");
		}
			
			/*
			 * ===================================================================
			 */
					 //Switch statement
					 
			
			int age = 3;
			
			switch (age) {
			case 1:
				System.out.println("A child");
				break;
			case 2:
				System.out.println("You can talk");
				break;
			case 3:
				System.out.println("Yes...Correct");
				break;
			default:
				System.out.println("i dont no how old you are");
			}
				/*
				 * 	While loop
				 */
					int counter = 0;
					
					while(counter < 10 ) {
						counter++;
						System.out.println(counter);
						
			}
					
					/*
					 * Multiple classes
					 */
					 
		
		
	}

}
