
public class ConsDemo5 
{
	int i=5;

	ConsDemo5(int a)
	{
		System.out.println("Cons of ConsDemo5");

		i=a;

	}
	public static void main(String[] args) 
	{
		System.out.println("Main Method Start");

		ConsDemo5 c1=new ConsDemo5(25);

		System.out.println(c1.i);

		System.out.println("Done");
	}

}
