
public class StaticConsDemo1 
{
	int i=1;
	static int j=1;
	StaticConsDemo1()
	{
	i++;
	j++;
	}
	public static void main(String[] args)
	{
	System.out.println(j);
	StaticConsDemo1 sc1=new StaticConsDemo1();
	System.out.println(sc1.i);
	System.out.println(sc1.j);
	StaticConsDemo1 sc2=new StaticConsDemo1();
	System.out.println(sc2.i);
	System.out.println(sc2.j);
	System.out.println("Done");
	}
}
