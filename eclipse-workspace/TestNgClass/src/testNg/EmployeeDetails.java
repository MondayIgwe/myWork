package testNg;

public class EmployeeDetails {

	private String name;
	
	private double monthlySalary;
	
	private int age;
	
	/*
	 * @return the name
	 */
	
	public String getName()
	{
		return name;
	}
	
	/*
	 * @param name the name to set
	 */
	public void setName(String name)
	{
		this.name=name;
	}
	
	/*
	 * @return monthSalary
	 */
	
	public double getMonthlySalary()
	{
		return monthlySalary;
	}
	
	/*
	 * @param monthsalary 
	 */
	
	public void setMonthlySalary(double monthlySalary)
	{
		this.monthlySalary = monthlySalary;
	}
	
	
	/*
	 * @retirn the age
	 */
	
	public int age ()
	{
		return age;
	}
	
	/*
	 * @param age the age to set
	 */
	
	public void setAge(int age)
	{
		this.age=age;
	}
}
