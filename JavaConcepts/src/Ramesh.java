
public class Ramesh 
{

	public static void main(String[] args) 
	{
		Ramesh r1=new Ramesh();
		r1.addnumbers();
		r1.addnumbers2();
		r1.addnumbers3(50,60);
	}
	void addnumbers()
	{
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println(c);
	}
	void addnumbers2()
	{
		int a=30;
		int b=40;
		int c=a+b;
		System.out.println(c);
	}
	void addnumbers3(int a,int b)
	{
		int c=a+b;
		System.out.println(c);
	}
}
