package InterfaceDemo;

public class CanadaBank implements Bank
{

	@Override
	public void totalBalance()
	{
		System.out.println("totalBalance Canada");		
	}

	@Override
	public void totalBranches()
	{
		System.out.println("totalBranches Canada");	
	}

}
