
public class ConsDemo1 
{
	ConsDemo1()
	{
		System.out.println("Cons of ConsDemo1");
	}
	public static void main(String[] args)
	{
		System.out.println("Main Method of ConsDemo1");

		ConsDemo1 c1 = new ConsDemo1();

		System.out.println("Done");

		//Here  we call the Constructor ConsDemo1();

		new ConsDemo1();

		new ConsDemo1();

		new ConsDemo1();

		System.out.println(c1);
	}


}
