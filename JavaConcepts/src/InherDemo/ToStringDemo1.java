package InherDemo;

public class ToStringDemo1
{
	int a = 10;
	
	String s1 = "Selenium";
	
	public static void main(String[] args) 
	
	{
		System.out.println("Main Method Start");
		
		ToStringDemo1 t1 = new ToStringDemo1();	
		
		System.out.println(t1);
		
		System.out.println("Done");
	}
	
public String toString()
{
	System.out.println("tostring of ToStringDemo1");
	
	return s1+" "+a;
}
	
}
