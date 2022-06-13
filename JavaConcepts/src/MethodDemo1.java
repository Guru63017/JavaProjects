// STATIC TO STATIC
public class MethodDemo1 
{

	public static void main(String[] args) 
	{
		// in this program only main method performed if you need any other out put than write as a statement like funA(); in main methode

		System.out.println("MainMethode of MethodDemo1");

		//this is static and non return data type thats why call directly
		
//				func();
		
		//		calling the non static variable by create an object
		
//		MethodDemo1 m1=new MethodDemo1();
//		m1.funA();
//		m1.funB();
	}	

	void funA()
	{
		System.out.println("funA of MethodDemo1");
	}
	void funB()
	{
		System.out.println("funB of MethodDemo1");
	}
	static void func()
	{
		System.out.println("funC of MethodDemo1");
	}
}
