package InherDemo;

public class ICICIBank extends RBIBank
{
	ICICIBank()
	{
		System.out.println("Cons of ICICIBank");
	}
	public static void main(String[] args) 
	{
		ICICIBank i1 = new ICICIBank();
		i1.cBillscore();
	}
}
