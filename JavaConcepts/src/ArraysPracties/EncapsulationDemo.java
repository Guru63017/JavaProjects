package ArraysPracties;

public class EncapsulationDemo 
{
	private int emp_salary;
	public static void main(String[] args) 
	{
		EncapsulationDemo e = new EncapsulationDemo();
		e.set_Salary(30000);
		System.out.println(e.get_Salary());
	}
	
	public void set_Salary(int salary)
	{
		emp_salary=salary;
		
	}
	
	public int get_Salary()
	{
		return emp_salary;
	}

}
