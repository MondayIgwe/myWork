package testNg;

import org.testng.Assert;
import org.testng.annotations.Test;


public class TestEmployeeDetails {
	
	//instantiate object
	EmpBusinessLogic empBusinessLogic = new 	EmpBusinessLogic();
	EmployeeDetails employee = new EmployeeDetails();
	

	@Test
	public void testCalculateAppraisal()
	{
		employee.setName("lesego");
		employee.setMonthlySalary(10000);
		employee.setAge(29);
		
		//
		double appraisal = empBusinessLogic.calculateAppraisal(employee);
		Assert.assertEquals(1000, appraisal, 0.0, "1000");
		
	}
	
	
	
	
}
