
public class MethodDemo7A
{
	public static void main(String[] args) 
	{
	System.out.println("Main Methode of MethodDemo7A");
	
	MethodDemo7A m1=new MethodDemo7A();
	
	m1.funB();//funA calling from m1 variable
	
	MethodDemo7A m2=new MethodDemo7A();
	
	m2.funB();//funA() calling from m2 variable
	
	System.out.println("Done");
	
	}
	void funA()
	{
	System.out.println("funA of MethodDemo7A");
	}
	void funB()
	{
	System.out.println("funB of MethodDemo7A");
	
	funA();//funA() calling from the funB() current object
	}
	}
