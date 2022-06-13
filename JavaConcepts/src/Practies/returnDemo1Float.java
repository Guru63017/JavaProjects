package Practies;

public class returnDemo1Float 
{
	public static void main(String[] args) 
	{
	int sumOfAmount=100000;
	returnDemo1Float DF1=new returnDemo1Float();
	float deductions=DF1.deductions();
	float netSalary=sumOfAmount-deductions;
	System.out.println(netSalary);
	float totaltax=(30/100)*netSalary;
	System.out.println(totaltax);
	}
	float deductions()
	{
	float PF=10000;
	float TA=8000;
	float DA=2000;
	float Totaldeductions=PF+TA+DA;
	System.out.println(Totaldeductions);
	return Totaldeductions;
	}
}
