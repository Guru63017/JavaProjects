package InherDemo;

public class TestB extends TestA
{
	int a = 30;
	public static void main(String[] args) 
	{
		TestA t1 = new TestB();
		System.out.println("Main Method Start");
		System.out.println(t1.a);
		System.out.println("Done");
	}

}
