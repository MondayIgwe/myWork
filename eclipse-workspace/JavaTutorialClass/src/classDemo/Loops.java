package classDemo;

public class Loops {
	
	/*
	 * for(Variable Initialization; Boolean_Expression Test; Increment/Decrement){
   //Statements
	}

	 */

	public static void main(String[] args) {
		//This will print 0,1,2,3,4,5
		
		for (int i = 0; i<=5; i++)
		{
			if(i == 4) {
				break;
			}
			System.out.println("Print all the values"+ i);
		}
		for (int i = 0; i<=5; i++) {
			if(i == 2) {
				continue; //it skips the 2 and continue executing from 3
			}
			System.out.println("Print all the values"+ i);
		}
	}
	

}
