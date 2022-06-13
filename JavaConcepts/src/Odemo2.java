
public class Odemo2 
{
	int x,y;
	void fun1()
	{
		x=x+1;
		Odemo2 d1=new Odemo2();
		d1.x=x+2;

		//	thes is udated local variable thats why out put is 3
		System.out.println(d1.x);
	}
	public static void main(String[] args) 
	{
		Odemo2 d1=new Odemo2();
		d1.fun1();
		//	these is local variable to the above one thats why out put is 1
		System.out.println(d1.x);
	}
}
