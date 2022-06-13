package ArraysPracties;

public class EvenWordsPrint
{
	public static void main (String[] args)
	{	
		String s1 = "This ";
		String s2 = " is ";
		String s3 = "Selenium ";
		String s4 = " Class";

		String s5= s1+s2+s3+s4;

		System.out.println(s5);

		char c1;

		String s6 = "";

		for(int i=0; i<s2.length(); i++)
		{
			c1 = s2.charAt(i);
			s6 = c1 + s6;
//						System.out.println(s6);

		}
		char c2;

		String s7 = "";

		for(int i=0; i<s4.length(); i++)
		{
			c2 = s4.charAt(i);
			s7 = c2 + s7;
		}
		//				System.out.println(s7);

		String s8 = s1+s6+s3+s7;

		System.out.println(s8);



	}

}

