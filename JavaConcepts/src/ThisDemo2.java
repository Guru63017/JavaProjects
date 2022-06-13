
public class ThisDemo2 
{
	ThisDemo2()
	{
		System.out.println(this);
	}
	public static void main(String[] args) 
	{
		ThisDemo2 t1=new ThisDemo2();	
		
		System.out.println(t1);
		
		System.out.println();
		
		ThisDemo2 t2=new ThisDemo2();
	
		System.out.println(t2);
		
		System.out.println();
		
		ThisDemo2 t3=new ThisDemo2();
		
		System.out.println(t3);
		
		System.out.println();
		
		System.out.println("Done");
	}
}
