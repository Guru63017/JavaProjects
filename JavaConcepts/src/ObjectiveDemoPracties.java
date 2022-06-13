
public class ObjectiveDemoPracties 
{
	int a=45;
	long l=85;
	static int G=12;
	public static void main(String[] args) 
	{
	System.out.println(G);
	//System.out.println(l);
	//System.out.println(a);//here l is non static variable
	//Here we use key"new"for non static variable
	ObjectiveDemoPracties guru=new ObjectiveDemoPracties();
	System.out.println(guru.a);
	System.out.println(guru.l);
	System.out.println(guru);
	}

}
