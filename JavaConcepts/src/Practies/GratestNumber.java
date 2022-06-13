package Practies;

public class GratestNumber
{
	public static void main(String[] args) 
	{
		FunA(45,65,130);
	}
	static void FunA(int a,int b,int c)
	{
		if (a > b & a > c) 
		{
			System.out.println("The largest number is: "+a);  

		}
		else if (b > a & b > c) 
		{
			System.out.println("The largest number is: "+b);  
		}
		else if (c > a & c > b)  
		{
			System.out.println("The largest number is: "+c);  
		}
		else  
		{	
			System.out.println("The numbers are same.");  
		} 
	}

}