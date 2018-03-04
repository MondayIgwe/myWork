package classDemo;
import AccessModifierDemo.car;  //import ANOTHER PACKAGE WITH IT CLASS
public class ArrayClass {

	public static void main(String[] args) {
	
		//CALLING FROM ANOTHER CLASS
		car ford = new car();
		ford.age = 2;   //set the values
		ford.name = "lsg";

		ford.DisplayCaharacter();
		
		
		
		String[] sDay = {"monday","tuesday","wednesday","thursday","friday","saturday","sunday"};
		Print_Array(sDay); //passed the variable sDay in 
		
		String[] aMake = ReturnArray();
		for(int i = 0; i<aMake.length-1; i++) {
			System.out.println(aMake);
		}
	}

	
	
	
	

	//Create to method to return array
		private static String[] ReturnArray() {
			String[] aArray = {"BMW","AUDI","TOYOTA","SUZUKI","HONDA"};
			return aArray;
	
	}




		//Create to method to pass array
		public static void Print_Array(String[]array) {
			for(int i = 0; i<array.length-1;i++) {
				System.out.println("print all the values in the array "+ array[i]);
			}
			
		
			
	
	
	}

}
