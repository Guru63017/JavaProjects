
public class ArrayDemo3 //DynamicArray
{
	public static void main(String[] args)
	
	{
	
	int arr[][]=new int[10][20];
	
	arr[0][0]=10;
	arr[0][1]=20;
	arr[0][2]=30;
	arr[0][3]=40;
	arr[0][4]=50;
	
	arr[1][0]=50;
	arr[1][1]=60; 
	arr[1][2]=70;
	arr[1][3]=80;
	arr[1][4]=10;
	
	arr[2][0]=90;
	arr[2][1]=100;
	arr[2][2]=110;
	arr[2][3]=130;
	arr[2][4]=140;
	
	arr[3][0]=90;
	arr[3][1]=100;
	arr[3][2]=110;
	arr[3][3]=130;
	arr[3][4]=140;

	arr[4][0]=90;
	arr[4][1]=100;
	arr[4][2]=110;
	arr[4][3]=130;
	arr[4][4]=140;
	

	
//	System.out.println(arr[2][4]);
//	System.out.println(arr[1][3]);
	
	for(int i=0;i<arr.length;i++)
	{ 
		for(int j=0;j<arr[i].length;j++)
		{
	
		System.out.print(arr[i][j]+"\t");
		}
		System.out.println();
		System.out.println();
			
	}
	}
}
