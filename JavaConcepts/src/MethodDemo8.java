
public class MethodDemo8 
{
	public static void main(String[] args) 
	{
		MethodDemo8 m1 = new MethodDemo8();
		//		m1.funA();
		m1.funB();
		//
	}
	void funA()
	{
		System.out.println("funA of MethodDemo8");
		return;

		//	System.out.println("funA of MethodDemo8");

	}
	int funB()
	{
		System.out.println("funB of MethodDemo8");

		return 10;
		//	System.out.println("funB of MethodDemo8");
	}
}
// in return data type last statement should be mandatory
// after last statement we write any statement the jvm will not accepted