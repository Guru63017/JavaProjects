package FinalDemo;

public class FinalChildMethod extends FinalParentMethod
{
//	public void cBillscore()
	{
		System.out.println("cBillscore of FinalChildMethod");
	}
	
	public static void main(String[] args) 
	{
		FinalChildMethod f1 = new FinalChildMethod();
		f1.cBillscore();
		
	}

}
