
public class ThisDemo3A 
{
	int a=5;
	
	ThisDemo3A()
	{
		this(20);
		a=10;//only initilization
		
	}
	
	ThisDemo3A(int i)
	{
		int a = 20;
//		this();
		System.out.println();
		
	}
	public static void main(String[] args) 
	{
		ThisDemo3A t1=new ThisDemo3A(20);
		
		System.out.println(t1.a);
	}
}
