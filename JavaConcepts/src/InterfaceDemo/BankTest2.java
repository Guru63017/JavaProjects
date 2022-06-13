package InterfaceDemo;

public class BankTest2 
{
Bank b1;
	public static void main(String[] args) 
	{
		BankTest2 b1 = new BankTest2();
		b1.BankDetails("UK");
	}

	void BankDetails(String bankName)
	{
		if (bankName.equals("US"))
		{
			b1 = new USBank();
		}
		else if (bankName.equals("UK"))
		{
			b1 = new UKBank();
		}
		else if (bankName.equals("Canada"))
		{
			b1 = new CanadaBank();
		}
		b1.totalBalance();
		b1.totalBranches();
	}
}
