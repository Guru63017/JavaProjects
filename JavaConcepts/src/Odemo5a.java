
public class Odemo5a 
{
	int x=1;
	A a1;
	void function1()
	{
		x=x+1;
		a1.i=a1.i+x;
	}
	public static void main(String[] args) 
	{
		Odemo5a d1=new Odemo5a();
		d1.x=d1.x+2;
		d1.a1=new A();
		d1.a1.i=d1.a1.i+1;
		d1.function1();
		System.out.println(d1.a1.i);
		System.out.println(d1.x);
		System.out.println("Done");
	}

}
