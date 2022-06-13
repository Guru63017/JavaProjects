//	Static To Static Calling
public class MethodDemo3 
{
	public static void main(String[] args) 
	{
		System.out.println("MainMethode MethodDemo3");
		
		funB();
		
		System.out.println("Done");
	}
	static void funA()
	{
		System.out.println("funA of MethodDemo3");
	}
	static void funB()
	{
		System.out.println("fun B of MethodDemo3");
		
		funA();
	}
}	