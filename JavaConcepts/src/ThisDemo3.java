
public class ThisDemo3
{
	ThisDemo3()
	{
		System.out.println("Zero args of ThisDemo3");
	}

	ThisDemo3(int a)
	{
		
//		this key bring the current object
		
		this();

		System.out.println("int args of ThisDemo3");
		
		System.out.println(a);
	}

	public static void main(String[] args) 
	{
		System.out.println("Main Method Start");	

		ThisDemo3 t1=new ThisDemo3(20);

		System.out.println("Done");
	}
}
