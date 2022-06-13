package ArraysPracties;

public class ArrayDemo1 
{
public static void main(String[] args)
{
	ArrayDemo1 a1=new ArrayDemo1();
	int arr[]=new int[4];
	arr[0]=10;
	arr[1]=20;
	arr[2]=30;
	arr[3]=40;
	a1.funA(arr);
}
	void funA(int arr[])
	{
//		System.out.println(arr[0]);
	for (int i=0;i<arr.length;i++)
	{
		System.out.print(arr[i]+" ");
	}
}
}
