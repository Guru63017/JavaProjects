
public class MethodDemo2 
{
	public static void main(String[] args) 
	{
		System.out.println("MainMethode of MethodDemo2");

		//static variable it takes by default

		funC();

		//funA();
		//funB();

		//		these are non static variable by useing key 'new'

		MethodDemo2 M1=new MethodDemo2();

		M1.funA();
		M1.funB();

		System.out.println("Done");
	}
	void funA()
	{
		System.out.println("funA of MethodDemo2");
	}
	void funB()
	{
		System.out.println("funB of MethodDemo2");
	}
	static void funC()
	{
		System.out.println("funC of MethodDemo2");
	}
}
