package Practies;

public class WrapperDemo2
{
	public static void main(String[] args) 
	{
		System.out.println("Ticket Booking");

		System.out.println();

		String ticketprice = "$5,000";
		
//		String ticketprice = "5000";

		int ccBalance = 4000;

		String s1 =ticketprice.replace("$5,000", "5000");

		int price =Integer.parseInt(s1);
		
//		int price =Integer.parseInt(ticketprice);


		if(ccBalance>=price)
		{
			System.out.println("Book u r Ticket");
		}
		else
		{
			System.out.println("insufficient Balance");
		}
	}

}
