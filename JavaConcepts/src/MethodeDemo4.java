
public class MethodeDemo4 
{

	public static void main(String[] args) 
	{
	System.out.println("MainMethode MethodDemo4");
	funC();
	System.out.println("Done");
	}
	static void funA()
	{
	System.out.println("funA of MethodDemo4");
	funC();
	}
	static void funB()
	{
	System.out.println("fun B of MethodDemo4");
	funA();
	}
	static void funC()
	{
	System.out.println("MainMethode MethodDemo4");
	funB();
	}
}
