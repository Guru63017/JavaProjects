
public class ThisDemo1
{
	ThisDemo1()
	{

		//		this key act as reference variable and it gives address

		//		it is pointing the current Object

		System.out.println(this);	
	}
	public static void main(String[] args) 
	{
		System.out.println("Main Method Start");

		ThisDemo1 t1=new ThisDemo1();

		System.out.println(t1);

		System.out.println("Done");
	}
}
