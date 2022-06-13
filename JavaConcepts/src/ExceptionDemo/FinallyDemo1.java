package ExceptionDemo;

public class FinallyDemo1 
{

	public static void main(String[] args)
	{
		try
		{
			System.out.println(10/2);
			System.out.println(10/0);
		}
		catch(Exception e)
		{
			System.out.println("Exception block1 is invoking");
		}
		try
		{
			System.out.println(10/2);
			System.out.println(10/0);	
		}
		catch(Exception e)
		{
			System.out.println("Exception block2 is invoking");
		}
		finally
		{
			System.out.println("finally block1 is invoking");
		}
		try
		{
			System.out.println(10/2);
			System.out.println(10/0);	
		}
		finally
		{
			System.out.println("finally block2 is invoking");
		}
	}

}