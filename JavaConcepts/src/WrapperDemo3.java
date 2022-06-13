
public class WrapperDemo3 
{

	public static void main(String[] args) 
	{
		String ticketPrice ="$5,000";
		
		int CcBalance = 4000;

		String s1=ticketPrice.replace("$5,000","5000");

		int price2=Integer.parseInt(s1);

		if (CcBalance>=price2)
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
