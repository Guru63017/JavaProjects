package Practies;

public class LowestNumber 
{

	public static void main(String[] args) 
	{
		lowestNumber(450, 12, 542);
	}
	static void lowestNumber(int a, int b,int c)
	{
		if(a < b & a < c)
		{
			System.out.println("LowestNumber..:"+a);
		}
		else if (b < a & b < c)
		{
			System.out.println("LowestNumber..:"+b);
		}
		else if (c < a & c < b)
		{
			System.out.println("LowestNumber..:"+c);
		}
	}
}
