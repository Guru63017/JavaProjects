package ArraysPracties;

public class ArrayDemo6 
{

	public static void main(String[] args) 
	{
		ArrayDemo6 a1=new ArrayDemo6();
		int ar1[]=a1.funA();
		for (int i=0;i<ar1.length;i++)
		{
			if (ar1[i]==45)
			System.out.println(ar1[i]);
		}
		
	}
	int []funA()
	{
		int k[]={12,20,23,45,56,78};
		return k;
	}

}
