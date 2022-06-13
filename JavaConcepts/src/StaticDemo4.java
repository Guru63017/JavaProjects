
public class StaticDemo4 
{
	public static void main(String[] args) 
	{
		//		in this we call values from StaticDemo3 to StaticDemo4 without giving any values
		//		for non-static object will be created
		StaticDemo3 s1=new StaticDemo3();

		System.out.println(s1.i);

		System.out.println(s1);

		//		the adress will be applicable for both static and non static 		
		System.out.println(s1.j);

		//		here we call the funA from A class

		s1.a1.funA();

		System.out.println(StaticDemo3.j);

//		it is only for static members not for non-static
		
//		System.out.println(StaticDemo3.i);

		
		StaticDemo3.a1.funA();

		//		this is a new object give the adress 

		StaticDemo3 s2 =new StaticDemo3();

		System.out.println(s2);

		//		System.out.println(s2.j);
	}

}
