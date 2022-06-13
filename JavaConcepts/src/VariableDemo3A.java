
public class VariableDemo3A 
{
	public static void main(String[] args)
	{
int a=10;
int b=a;

//here we create the reserved the V1 variable area 

VariableDemo3 V1=new VariableDemo3();

//here share the adress v1 to v2 reference variable 

VariableDemo3 V2=V1;

System.out.println(V1);

System.out.println(V2);

System.out.println(b);
	}

}
