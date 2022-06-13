
public class MethodDemo5
{
	public static void main(String[] args) 
	{
	System.out.println("Main Methde of MethodDemo5");
	MethodDemo5 m1=new MethodDemo5();
	m1.funB();
	System.out.println("Done");
	}
	static void funA()
	{
	System.out.println("fun A of MethodDemo5");
	}
	void funB()
	{
	System.out.println("fun B of MethodDemo5");
	funA();
	}
}// this is the program for static to non static