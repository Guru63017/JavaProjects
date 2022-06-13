
public class VariableDemo3 
{
	int i=10;
	static int j=20;
	public static void main(String[] args) 
	{
		System.out.println(j);
		j=30;
		System.out.println(j);
		int j=40;
		System.out.println(j);

		//	 System.out.println(k); //compile error becaue in that program the value of 'k' is not declare and not initilised  

		//	System.out.println(i);here int i is the non static variable thats why we create an object

		// here we create the variable name with guru

		int a=52;
		
		VariableDemo3 guru = new VariableDemo3();

		System.out.println(guru.i);

		// by calling with object name address will be printed

		System.out.println(guru);

		VariableDemo3 guru1 = new VariableDemo3();

//		System.out.println(guru1.a); // this is not possible beacuse this local variable

		System.out.println(guru1);

		//		here i is a local variable thats why object was not needed
		
	}
}