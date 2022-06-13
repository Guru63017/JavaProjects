
public class Odemo3
{
	int x=3;
	A a1=new A();
	public static void main(String[] args)
	{
	Odemo3 d1=new Odemo3();
	
	System.out.println(d1.x);
	
//	here a1 is the address of A class file
	
	System.out.println(d1.a1);
	
	System.out.println(d1.a1.i);

	d1.a1.funA();
	}

}
