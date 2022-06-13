package ArraysPracties;

public class WordRevers
{

	public static void main(String[] args) 
	{
		String str = "This is Selenium Class";
		String[] guru = str.split(" ",4);
		for (String s:guru)
			System.out.println(s);
		
		for (int i = guru.length-1; i>=0; i--)
		{
			System.out.println(guru[i]+" ");		}
		
	}
}


