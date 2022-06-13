
public class ThisDemo4A 
{
	int a=5;

	ThisDemo4A()
	{
		this (20);

		
//		this key bring the current value
		
		a=10;
	}

	ThisDemo4A(int i)
	{
		a=i;
	}

	public static void main(String[] args) 
	{
		System.out.println("Main Method Start");
		
		ThisDemo4A	t1=new ThisDemo4A();

		System.out.println(t1.a);
	}
}
