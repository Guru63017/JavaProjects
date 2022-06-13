package InherDemo;

public class RBIBankTest1 
{

	public static void main(String[] args)
	{
		RBIBank r1 = new RBIBank();
		r1.cBillscore();
		
		RBIBank r2 = new HDFCBank(); // UP Casting
		r2.cBillscore();
	}
	
}