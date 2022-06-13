
public class VariableDemo2 

{
	int i=10; //Non-static Variable

	//	static variables starts with static

	static int j=20; //Static Variable 

//		int i=30; //Duplicate Variable

	public static void main(String[] args) 

	{

		int k=30; //Local variable

		int i=40;  // These are not Duplicate Variable beacause these are local variable

		//int k=50; //Duplicate variable

		//	it takes i=40; beacause first preference takes local variable,if local variable not available than go for global variable
		//	these is a non-static members thats why creats Objects

		System.out.println(i);

		System.out.println(j);

		System.out.println(i+j);

		System.out.println(j+k);
	}

}
