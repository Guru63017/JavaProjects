
public class PolyDemo3 
{

	public static void main(String[] args) 
	{
		PolyDemo3 p1 = new PolyDemo3();
		
		A k=new A();
//		System.out.println(k);

		p1.funA(k);
		p1.funA(new A());
		
//		its ambigues
//		p1.funA(null);
				
		B E = new B();
		p1.funA(E);
		p1.funA(new B());
		
		C m = new C();
		p1.funA(m);
		p1.funA(new C());
		
		
	}
	//	A is a data type and a1 is a reference variable and it handles only class A address
	void funA(A a1)
	{
		System.out.println("class A object");
		System.out.println(a1);
	}
	void funA (B a1)
	{
		System.out.println("class B object");
		System.out.println(a1);
	}
	void funA (C a1)
	{
		System.out.println("class C object");
		System.out.println(a1);
	}
}
