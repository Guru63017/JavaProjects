
public class StringDemo3 
{
	public static void main(String[] args) 
	{
		String s1="abc";//literal
		System.out.println(s1);
		String s2="xyz";
		System.out.println(s2);
		if (s1==s2)
		{
			System.out.println("s1 and s2 are same");
		}
		else
		{
			System.out.println("s1 and s2 are not same");
		}
		String s3=new String("abc");
		System.out.println(s3);
		if (s1==s3)
		{
			System.out.println("s1 and s3 are same");
		}
		else
		{
			System.out.println("s1 and s3 are not same");
		}
		String s4="abc";
		System.out.println(s4);
		if (s1==s4)
		{
			System.out.println("s1 and s4 are same");	
		}
		else
		{
			System.out.println("s1 and s4 are not same");
		}
		if (s1.equals(s2))
		{
			System.out.println("s1 and s2 are same");
		}
		else
		{
			System.out.println("s1 and s2 are not same");
		}
		if (s1.equals(s3))
		{
			System.out.println("s1 and s3 are same");
		}
		else
		{
			System.out.println("s1 and s3 are not same");
		}

	}
}
