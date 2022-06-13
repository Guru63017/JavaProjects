
public class ConsDemo4 
{
	ConsDemo4(int a) // parameterised
	{
		System.out.println("Cons of ConsDemo4");

//		System.out.println(a);
	}
	public static void main(String[] args) 
	{
		System.out.println("Main Method Start");

		//	ConsDemo4 c1=new ConsDemo4();//Compiler time Error due to zero parameterised constructor is not exist

		ConsDemo4 c1=new ConsDemo4(10); //	because we create constractor with parameterised

		System.out.println("Done");
	}
}
