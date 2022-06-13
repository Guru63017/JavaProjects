
public class ConsDemo7A 
{
	int i=5;

	int j=10;

	ConsDemo7A(int i,int j)
	{
		System.out.println("Cons of ConsDemo7A");
		
//		this key act as a reference variable and it is pointing the current object 
		
		this.i=i;

		this.j=j;
	}
	public static void main(String[] args) 
	{
		System.out.println("Main Method Start");

		ConsDemo7A c1=new ConsDemo7A(50,80);

		System.out.println(c1.i);

		System.out.println(c1.j);

		System.out.println("Done");
	}
}
