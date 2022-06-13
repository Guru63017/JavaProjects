
public class StringBufferDemo1 
{
	public static void main(String[] args) 
	{
		StringBuffer s1 = new StringBuffer("RBG ");
		
		System.out.println(s1);
		
		StringBuffer s2 = new StringBuffer();
		
		s1.append("Technologies ");
		
		s1.append(s2);
		StringBuffer s3 = s1.append(s2);

		System.out.println(s1);
//		System.out.println(s1.append(s2));
//		System.out.println(s3);
		
		
	}
}
