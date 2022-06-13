package ExceptionDemo;

public class ExceptionDemo1
{
	//	static A k;

	public static void main(String[] args) 
	{
		System.out.println("Main methode Start");
		try
		{
			System.out.println(10/2);
			int arr[] = {10,20,30,40};
			System.out.println(arr[4]);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Arthamatic Exception is invoking");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Array Index outofBounds Exception invoking");
		}
		catch(NullPointerException e)
		{
			System.out.println("Nullpointer Exception is invoking");
		}

		catch(Throwable e)
		{
			System.out.println("Throwable is invoking");
		}
		System.out.println("Done");
	}

}
