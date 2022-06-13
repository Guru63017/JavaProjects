package Practies;

public class PolyDemo2 
{
	public static void main(String[] args)
	{
	PolyDemo2 p1=new PolyDemo2();
	p1.funA(10,20);
	p1.funA(45l, 55l);
	p1.funA(15, 20l);
	p1.funA(12l, 10);	
	}
	void funA(int i,int j)
	{
	System.out.println("int int args of PolyDemo2");
	}
	void funA(long i,long j)
	{
	System.out.println("long long args of PolyDemo2");
	}
	void funA(int i,long j)
	{
	System.out.println("int long args of PolyDemo2");
	System.out.println(i+j);
	}
	void funA(long i,int j)
	{
	System.out.println("long int args of PolyDemo");
	System.out.println(i+j);
	}
}
