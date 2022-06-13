package Pack1;

public class ProtectedDemo1 
{
	protected int a=10;
	public static void main(String[] args) 
	{ 
		ProtectedDemo1 p = new ProtectedDemo1();
		System.out.println(p.a);
		p.funA();
		
	}
	protected void funA()
	{
		a = 20;
		System.out.println("funA of protectedDemo1");
	}
	

}

