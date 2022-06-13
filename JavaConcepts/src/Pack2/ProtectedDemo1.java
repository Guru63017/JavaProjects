package Pack2;

public class ProtectedDemo1 
{

	protected int a = 10;
	protected void funA()
	{
		ProtectedDemo1 p1 = new ProtectedDemo1();
		System.out.println(p1.a);
		p1.funA();
		
	}

}