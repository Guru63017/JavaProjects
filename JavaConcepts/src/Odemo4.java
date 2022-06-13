
public class Odemo4 
{
	int x;
	//	there is no initilization thats why it gives null
	A a1;
	public static void main(String[] args)
	{
		Odemo4 d1=new Odemo4();

		System.out.println(d1.x);

		System.out.println(d1.a1);

		//	there is no proper address thats why it gives null pointer exception

		System.out.println(d1.a1.i);
	}

}
