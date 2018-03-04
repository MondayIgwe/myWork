package classDemo;

public class Car { 

	//Use the Car keyword to declare Car Class variable
	// Car ford = new Car();

	//Class Member Variables & Fields
		int sModel;
	    int iGear;
	    int iHighestSpeed;
	
	 
	    
	    //create a constructor
	    public Car(int Model, int gear, int speed) {
	    	int sModel = Model;
	    	int iGear = gear;
	    	int iHighestSpeed = speed;
	    }
	
	//create a method to display the variable		
	  public void DisplayCharacter() {
		  System.out.println("Model of the car is"+" " + sModel);
		  System.out.println("Numbers of gera is"+" " + iGear);
		  System.out.println("The highest speedometer of the car"+" " + iHighestSpeed);
	  }

}
