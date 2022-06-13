package InherDemo;

public class TestD 
{

	public static void main(String[] args)
	{
		System.out.println("Main Method Start");
		TestC t1 = new TestC();
		t1.funA();
		funA();
		System.out.println("Done");
	}
	static void funA()
	{
		System.out.println("funA of TestD");
	}

}
