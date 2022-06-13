package ArraysPracties;

public class DynamicArray2D
{
public static void main(String[] args) 
{
int [][]arr=new int[13][20];

arr[0][0]=10;
arr[0][1]=10;

arr[1][0]=10;
arr[1][1]=10;

arr[2][0]=10;
arr[2][1]=10;

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
