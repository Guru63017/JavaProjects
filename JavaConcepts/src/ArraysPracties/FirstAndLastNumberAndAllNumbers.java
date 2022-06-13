package ArraysPracties;

public class FirstAndLastNumberAndAllNumbers
{
	public static void main(String[] args) 
	{
		int arr[]={1278,1348,3241,3071};

		int arr1[]={10,20,30,40,50};

		System.out.println("AllNumbers");

		for (int i=0; i<=4; i++)
		{ 

			System.out.print(arr1[i]+" ");
		}
		System.out.println();

		System.out.println("FirstNumbers");

		for (int i=0; i<=3; i++)
		{ 

			System.out.print(arr[i]/100+" ");

		}
		System.out.println();

		System.out.println("LastNumbers");

		for (int i=0; i<=3; i++)
		{ 

			System.out.print(arr[i]%100+" ");

		}

	}
}