package ArraysPracties;

public class ArrayStaticDemo1 
{
	public static void main(String[] args)
	{
		int arr[][]={{10,20,30,40,50},
				{11,12,13,14,15},
				{4,20,41,40,55}};
		for (int i=0;i<arr.length;i++)
		{
			for (int j=0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j]+" \t");
			}
			System.out.println();
			System.out.println();
		}
	}

}
