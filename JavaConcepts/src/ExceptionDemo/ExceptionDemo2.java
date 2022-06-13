package ExceptionDemo;

public class ExceptionDemo2
{

	public static void main(String[] args)
	{
		addNumbers ();
		subNumbers();
		divNumbers();
		mulNumbers();
	}
	static void addNumbers()
	{
		try
		{
			int a = 10;
			int b = 20;
			int c = a+b;
			System.out.println(c);
		}
		catch(Exception e)
		{
			
		}
	}
	static void subNumbers()
	{
		try
		{
			int a = 10;
			int b = 20;
			int c = b-a;
			System.out.println(c);
		}
		catch(Exception e)
		{
			
		}
	}
	static void divNumbers()
	{
		try
		{
			int a = 10;
			int b = 0;
			int c = a/b;
//			System.out.println(a);
			System.out.println(c);
		}
		catch(Exception e)
		{
			System.out.println("Exception is invoking");
		}
	}
	static void mulNumbers()
	{
		try
		{
			int a = 10;
			int b = 20;
			int c = a*b;
			System.out.println(c);
		}
		catch(Exception e)
		{
			
		}
	}
}
