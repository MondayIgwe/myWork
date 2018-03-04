package classDemo;

import java.io.*;
public class ExceptionTest {

	
	static double a[];
	
	public static void main(String[] args) {
		a = new double[4];
		
		try {
			printElement(4);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Catch Exception:"+ e);
			
		}catch (Exception e) {
			//Handle Exception of type exception
		}

	}
	
	static void printElement(int i) {
		if (i >= a.length) {
			
		}
		System.out.println("THE 5th elemnet is: " +a[i]);
	}

}
