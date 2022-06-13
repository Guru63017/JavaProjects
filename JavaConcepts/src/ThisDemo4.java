
public class ThisDemo4 
{
	ThisDemo4()
	{
		this (20);

		System.out.println("Zero args of thisDemo4");

	}

	ThisDemo4(int a)
	{
		System.out.println("int args of ThisDemo4");

		System.out.println(a);

	}

	public static void main(String[] args) 
	{
		System.out.println("Main Method Start");

		ThisDemo4 t1=new ThisDemo4();

		System.out.println("Done");
	}
}

