package Practies;

public class Test2 
{
	public static void main(String[] args) 
	{
	Test2 T1=new Test2();
	T1.funA('5');
	}
	void funA(char a)
	{
	char c=a;
	System.out.println(c);
	return;//last statement should be mandatory
	//System.out.println(c);
	}
}
