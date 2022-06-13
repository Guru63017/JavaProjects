//non static to static
public class MethodDemo7 
{
	public static void main(String[] args) 
	{
		System.out.println("Main Methode of MethodDemo7");

		//	m1.funB();

		MethodDemo7 m1=new MethodDemo7();

		m1.funB();

		System.out.println("Done");
	}
	void funA()
	{
		System.out.println("fun A of MethodDemo7");
	}
	void funB()
	{
		System.out.println("funB of MethodDemo7");

		MethodDemo7 m1=new MethodDemo7();

		m1.funA();

	}
}
