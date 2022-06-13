
public class StaticDemo2 
{
	int i=10;
	static int j=20;
	public static void main(String[] args)
	{
		//	in main methode first prefer local variables and gives out put statement by statment
		int i=30;
		//	here we call the non static variables in main method without creating an object
		System.out.println(i);
		//	 Here we call the global variable in main method by creating an object
		StaticDemo2 s1=new StaticDemo2();
		//	here s1 is object reference variable and "i" is the variable name
		System.out.println(s1.i);
		//	here in main method there is no static members than go for global variable
		System.out.println(j);
		//	here we provide the local variable
		int j=40;
		System.out.println(j);
		
		//	this is used for call the global variable instead of local variable
	
		System.out.println(StaticDemo2.j);
//		System.out.println(s1.j);

	}

}
