package AbsDemo;

public abstract class AbsDemo1 
{
AbsDemo1()
{
	System.out.println("Cons of AbsDemo1");
}
	public static void main(String[] args)
	{
//		we Can't Create an Object for abstract class directly.
//		But it is possible through child class refer AbsChild1 program
//		AbsDemo1 ab1 = new AbsDemo1();
	}
	
//	Abstract classes are also used to write the un-implimented functions
	
	abstract void funA();
	abstract void funB();
	
//	this is already implimented thats why it is not possible to implement
	
	void funC()
	{
		System.out.println("funC of AbsDemo1");
	}

}
