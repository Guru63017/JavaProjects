package Pack1;

public class PrivateDemo1 
{
	private int a=10;
	private void funA()
	{
		System.out.println("funA of privateDemo1");
	}
	void funB()
	{
		System.out.println("funB of privateDemo1");
		System.out.println(a);
		funA();
	}

}
