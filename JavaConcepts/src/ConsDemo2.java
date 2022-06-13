
public class ConsDemo2 
{
	int a=5;
	
	ConsDemo2()
	{
		System.out.println("Cons of ConsDemo1");
		int a=10;
	}
	public static void main(String[] args)
	{
		System.out.println("Main Method Start");
		
		ConsDemo2 c1=new ConsDemo2(); //this is also used as calling the constractor
		
		System.out.println(c1.a);
		
		System.out.println("Done");
	}

}
