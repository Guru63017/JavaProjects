
public class StaticDemo5 
{
//	int a=10;
//	static int b=20;
	
	int a=funA();
	static int b = funB();

	//	Return used for call the 
	//	this is the return data type "funA()" Method signature performed as variable 
	int funA()
	{
		System.out.println("funA of StaticDemo5");
		return 30;
	}
	static int funB()
	{
		System.out.println("funB of StaticDemo5");
		return 70;
	}
	public static void main(String[] args) 
	{
		System.out.println("main method start");
		//	here we create Object for non static members
		StaticDemo5 s1=new StaticDemo5();
		//	by using Object name call the non-static members
		s1.funA();
		//	here we call the static members in two ways
		//	by using Object address and class name	
		//	s1.funB();
		//	StaticDemo5.funB();
		System.out.println(s1.a);
		System.out.println(StaticDemo5.b);
		System.out.println("Done");
			new StaticDemo5();
			new StaticDemo5();
			new StaticDemo5();
			new StaticDemo5();
	}

}
