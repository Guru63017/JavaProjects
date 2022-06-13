
public class WrapperDemo1
{
	public static void main(String[] args) 
	{
		int a=10;

		// Integer is a pre-defined class in java

		Integer i1=new Integer (a);  //Boxing

		int b=i1.intValue();  //Un-Boxing
		System.out.println(b);

		Integer i2=20; //new Integer (a); // Auto Boxing

		int c=i2;  //i2.intValue();  //Auto Un-Boxing
	}
}
