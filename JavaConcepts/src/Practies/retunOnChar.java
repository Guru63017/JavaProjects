package Practies;

public class retunOnChar 
{

	public static void main(String[] args) 
	{
	retunOnChar	ch1=new retunOnChar();
	System.out.println(ch1.funB());

	}
	char funB()
	{
	char a='$';
	char b='@';
	char c=(char) (a+b);
	return c;
	}

}
