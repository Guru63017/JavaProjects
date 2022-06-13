
public class StaticDemo5a 
{

	//	int a =10;
//		static int b = 20;
	int a = funA();
	static int b = funB();
	
	int funA()
	{
		System.out.println("FunA of StaticDemo5a");
		return 10;
	}
	static int funB()
	{
		System.out.println("FunB of StaticDemo5a");
		return 20;
	}
	public static void main(String[] args) 
	{
		System.out.println("Main method start");
		StaticDemo5a s1 = new StaticDemo5a();
		s1.funA();
		System.out.println(s1.a);
		System.out.println("Done");
	}


}
