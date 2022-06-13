
public class PolyDemo1 
{

	public static void main(String[] args) 
	{
	PolyDemo1 p1=new PolyDemo1();	
	p1.funA();
	p1.funA(10);
	p1.funA(10.23488596589589f);
	p1.funA(10.23488596589589);
	}
void funA()
{
System.out.println("zero args funA of PolyDemo1");
}

// non return and parametarised

void funA(int a)
{
System.out.println("int args funA of PolyDemo1");
System.out.println(a);
}

//here performance depends on corresponding data type 
//if void funA(int a) put into comment than perform long,it was follow the corresponding order

void funA(long a)
{
System.out.println("long args funA of PolyDemo1");
System.out.println(a);
}
void funA(float a)
{
System.out.println("float args funA of PolyDemo1");
System.out.println(a);
}

//after double the values should be terminated
//but we need the values as we need than go for data type casting

void funA(double a)
{
System.out.println("zero args funA of PolyDemo1");
System.out.println(a);
}

}
