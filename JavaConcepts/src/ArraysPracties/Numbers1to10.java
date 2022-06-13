package ArraysPracties;

public class Numbers1to10 
{
	public static void printNumbers(int i)
	{
		if (i<=10)
		{
			System.out.println(i);
			printNumbers(i+1);
		}
	}
	public static void main(String[] args)
	{
		int i  = 1;
		printNumbers(i);
//		guru(1);
	}
	static void guru(int x)
	{
		if (x<=10)
		{
			System.out.println(x);
			guru(x+1);
		}
	}
}
