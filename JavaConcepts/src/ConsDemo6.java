
public class ConsDemo6 
{
	int i=5;

	int j=10;

	ConsDemo6(int a,int b)
	{
		System.out.println("Cons of ConsDemo6");

		i=a;

		j=b;
	}
	public static void main(String[] args)
	{
		System.out.println("Main Method Start");

		//		here costractor is parameterised

		ConsDemo6 c1=new ConsDemo6(20,30);

		System.out.println(c1.i);

		System.out.println(c1.j);

		System.out.println("Done");
	}
}
