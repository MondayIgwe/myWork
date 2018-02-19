package automationFrameworks;

import org.testng.annotations.Test;

/*
 * (groups={"app"})
 * 
 *  (groups={"app", "mobile"})
 */
public class GroupingAnnotation {
	
	//Groups of Tests cases
	@Test(groups= {"Car"})
	public void Car1() {
		System.out.println("Batch Car - Test Car 1");
		
	}
	
	@Test(groups= {"Car"})
	public void Car2() {
		System.out.println("Batch Car - Test Car 2");
		
	}

	@Test(groups= {"Scooter"})
	public void Scooter1() {
		System.out.println("Batch Scooter - Test Scooter 1");
	}
	
	@Test(groups= {"Scooter"})
	public void Scooter2() {
		System.out.println("Batch Scooter - Test Scooter 2");
	}
	
	@Test(groups= {"Car", "Sedan Car"})
	public void Sedan1() {
			System.out.println("Batch Sedan Car - Test Sedan 1");
		}
	}
	
	


