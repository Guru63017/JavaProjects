package ArraysPracties;
// 1D 
public class DynamicArray1D
{
	public static void main(String[] args) 
	{
		int arr[]=new int[5];	
		arr[0]=50;
		arr[1]=40;
		arr[2]=45;
		arr[3]=75;
		arr[4]=12;

		//for(initialization; condition; increment/ decrement)  
		//{  
		//statements  
		//	}  

		//For 1d array for loop syntax
		//for(int i;i<arr.size;i++)

		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}
}
