
public class ConsDemo3 
{
	int a=5;
	
	ConsDemo3()
	{
		System.out.println("Cons of ConsDemo3");

		int a=10;

//		System.out.println(a);
	}
	public static void main(String[] args) 
	{
		System.out.println("Main Method Start");

		ConsDemo3 c1=new ConsDemo3();

		System.out.println(c1.a);

		System.out.println("Done");
	}

}
