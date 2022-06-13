
public class MethodDemo9 
{
	public static void main(String[] args) 
	{
		MethodDemo9 m1 = new MethodDemo9();

		m1.funA();
		m1.funB();

		System.out.println(m1.funB());

		int n=m1.funB();

		System.out.println(n);
	}
	void funA()
	{
		System.out.println("funA of MethodDemo9");
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println(c);
	}
	int funB()
	{
		System.out.println("funB of MethodDemo9");
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println(c);
		// in return data type method signature used as variable,in that we use any data tye 
		// we can initilised the value in return statement
		return 3000;	//c;//b;//@;//10;
	}
}
