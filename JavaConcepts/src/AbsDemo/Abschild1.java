package AbsDemo;

public class Abschild1 extends AbsDemo1
{
Abschild1()
{
	System.out.println("Cons of Abschild1");
}
	public static void main(String[] args) 
	{
		Abschild1 ab1 = new Abschild1();
		
//		this reference variable is used to bring the implimented function
		
		ab1.funC();
	}

//	 this belowe @Override used for to find exactly error easily
	
	@Override 
	void funA() 
	{
		System.out.println("funA of AbsDemo1");
	}

	@Override
	void funB()
	{
	System.out.println("funB of AbsDemo1");	
	}
	

}
