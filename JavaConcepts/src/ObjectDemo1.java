
public class ObjectDemo1 
{
	int a=10;
	boolean b1=true;
	static int c=30;
	public static void main(String[] args) 
	{
		//static variables are free defined in jvm,so it gives the result with out any key.

		System.out.println(c);

		//here a,b1 is the non-static variables, these are not free defined in jvm for getting out put use key 'new'

		// System.out.println(a);
		// System.out.println(b1);

		//When we create Object,LHS=RHS names should be same

//				int i=new ObjectDemo1();

		//class names are not in same and ObjectDemo1 not Declared

		//		boolean j=new Object1();

		//here create only the path

//		ObjectDemo1 o1=10;
		//ObjectDemo1 o1=false;

		//here we create the path for non static variable

		ObjectDemo1 o1=new ObjectDemo1();

		//here not give the proper direction
 		//System.out.println(a);
		//System.out.println(b1);

		System.out.println(o1.a);
		System.out.println(o1.b1);

		//here only the path will be print Because the 'ObjectDemo1' is the path

		System.out.println(o1);
	}

}
