package InterfaceDemo;

public class BankTest1
{

	public static void main(String[] args) 
	{
//		we don't have a constractor and there is no impliment logical 
//		we can't creat an object for interface
//		Bank b1 = new Bank();

		Bank b1 = new USBank();
		Bank b2 = new UKBank();
		Bank b3 = new CanadaBank();

	}

}
