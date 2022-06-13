//non static to static
public class MethodDemo6 
{
	public static void main(String[] args) 
	{
	System.out.println("Main Methde of MethodDemo6");
	funB();
	System.out.println("Done");
	}
	void funA()
	{
	System.out.println("fun A of MethodDemo6");
	}
	static void funB()//we run directly because static variable
	{
	System.out.println("fun B of MethodDemo6");
	MethodDemo6 m1=new MethodDemo6();
	m1.funA();
	} 
}