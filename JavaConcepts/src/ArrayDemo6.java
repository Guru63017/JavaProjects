
public class ArrayDemo6 
{ 
public static void main(String[] args) 
{
//	int arr[]=new int[1];
	ArrayDemo6 a1=new ArrayDemo6();
	int []arr1=a1.funA();
	for (int i=0;i<arr1.length;i++)
	{
		if (arr1[i]==30)
		System.out.print(arr1[i]+" ");
	}
}
int[] funA()
{
	int []a={10,20,30,40,50};
	return a;
}
}
