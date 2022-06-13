package Practies;

public class StaticArray2D
{
	public static void main(String[] args) 
	{
		int arr[][]={{10,20,30},{40,50,60}};
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<=arr.length;j++)
			{
				System.out.println(arr[i][j]+" \t");
				System.out.println();
			}
		}

	}
}
