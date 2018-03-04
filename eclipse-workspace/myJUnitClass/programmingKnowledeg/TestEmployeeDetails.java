package programmingKnowledeg;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestEmployeeDetails {
	//instantiate object from classes
	EmpBusineesLogic empBusinessLogic = new EmpBusineesLogic(); 
	EmployeeDetails employee = new EmployeeDetails();
			 
	
	

	//test to check appraisal
	@Test
	public void testCalculateAppraisal()
	{
		employee.setName("monday");
		employee.setAge(62);
		employee.setMonthlySalary(9000);
		
		//EmpBusinessLogic
		double  appraisal = empBusinessLogic.calculateAppraisal(employee);
		assertEquals(500, appraisal, 0.0);
		
		
		//test to check the yearly salary
		@Test
		public void testCalculateYearlySalary() {
		
			employee.setName("chief");
			employee.setAge(76);
			employee.setMonthlySalary(28282);
			
			double salary = empBusinessLogic.calculateYearlySalary(employee);
			assertEquals(2929292, salary, 0.0);
			
		}
	
}
	
	
}
