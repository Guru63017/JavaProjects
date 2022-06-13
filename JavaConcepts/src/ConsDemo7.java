
public class ConsDemo7
{
	int i=5;

	int j=10;

	ConsDemo7(int i,int j)
	{
		System.out.println("Cons of ConsDemo7");
		
//		int i,int j those are local variables

		i=i;
		j=j;
	}
	public static void main(String[] args) 
	{
		System.out.println("Main Method Start");

		ConsDemo7 c1=new ConsDemo7(20,30);

		System.out.println(c1.i);

		System.out.println(c1.j);

		System.out.println("Done");
	}
}
