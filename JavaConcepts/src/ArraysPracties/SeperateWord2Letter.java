package ArraysPracties;

public class SeperateWord2Letter 
{

	public static void main(String[] args) 
	{

		String guru = "RBG technlogies";

		// Displays individual characters from given string

		System.out.println("print charecters for RBG technlogies ");


		for (int m = 0; m < guru.length(); m++) 
		{                                    
			System.out.print(guru.charAt(m)+" ");

			// Initialising String

			String s1 = "GeeksForGeeks";

			// Converts the string into

			// char array

//			char[] arr = s1.toCharArray();

//			System.out.println("Displaying individual characters"+ "from given string");

			// Printing the characters using for-each loop

//			for (char g:arr)
//
//				System.out.print(g + " ");

		}
	}

}
