
public class WrapperDemo2
{

	public static void main(String[] args) 
	{

		String ticketPrice= "5000";
		 
		int Price = Integer.parseInt(ticketPrice);
		 

		int CcBalance = 4000;

		//		ticket price is in string but CcBalance is in int type 
		//		so,it not possible in that cases we use ( Integer.parseInt() )

		if (CcBalance>=Price)
		{
			System.out.println("Book U r ticket");
		}
		else
		{
			System.out.println("insufficient Balance");
		}
		System.out.println("Done");
	}

}
