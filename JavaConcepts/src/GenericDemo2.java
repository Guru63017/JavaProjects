
public class GenericDemo2<T> 
{
	T t1;
	public static void main(String[] args) 
	{
		GenericDemo2<String>g1 = new GenericDemo2<String>();
		g1.funA("RBG technologies");

		//		g1.funA(10);
		//GenericDemo2<int>g2 = new GenericDemo2<int>();
		
     
		GenericDemo2<Integer>g2 = new GenericDemo2<Integer>();
		g2.funA(10);

		//GenericDemo2<boolean>g3 = new GenericDemo2<boolean>();

		GenericDemo2<Boolean>g3 = new GenericDemo2<Boolean>();
		g3.funA(true);
		
	}
	
	void funA(T t1)
	{
		System.out.println(t1);
	}
}
