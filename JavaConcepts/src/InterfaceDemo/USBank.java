package InterfaceDemo;

public class USBank implements Bank

{
	@Override
	public void totalBalance() 
	{
		System.out.println("totalBalance US");
	}

	@Override
	public void totalBranches() 
	{
		System.out.println("totalBranches US");
	}

}
