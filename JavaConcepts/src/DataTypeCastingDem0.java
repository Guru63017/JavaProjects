
public class DataTypeCastingDem0
{
	public static void main(String[] args) 
	{
		int a=10;
		float f1=a;

		System.out.println(f1);

		long l=330303;
		float f2=l;

		System.out.println(f2);

		//float f3=10.23528528; // by default decimal values comes under Double data type,(implicit data type) 
		//Here the values in double data type not possible convert in float data type
		float f3=10.2385658569f;//if in case we need the data in float data type we give the command float with in brackets or mentioned f
		//this is also know as explicit data type
		System.out.println(f3);
		//			int b=f1;
		int b=(int)f1;
		int c=(int)f3;
		System.out.println(c);
		float f4=10.23f;
		System.out.println(f4);
		System.out.println(b);
	}

}
