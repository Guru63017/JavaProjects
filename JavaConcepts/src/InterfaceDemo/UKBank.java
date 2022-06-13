package InterfaceDemo;

public class UKBank implements Bank
{
	@Override
	public void totalBalance() 
	{
		System.out.println("totalBalance UK");
	}

	@Override
	public void totalBranches()
	{
		System.out.println("totalBranches UK");
	}

}
