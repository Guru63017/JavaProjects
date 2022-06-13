	
public class ArrayDemo4 //DynamicArray
{
public static void main(String[] args) 
{
A k=new A();
A arr[]=new A[5];
arr[0]=new A();
arr[1]=new A();
arr[2]=k;
//arr[2]=new A();
//arr[3]=new A();
arr[4]=new A();
k.i=9;
System.out.println(k);
System.out.println(arr[2]);
System.out.println(arr[2].i);
//System.out.println(k.i);
//System.out.println(arr[0]);
//System.out.println(arr[3]);
//System.out.println(arr[4]);
}
}
