
public class StringDemo4 
{
public static void main(String[] args)
{
String s1="   RBG technologies   ";
//System.out.println(s1);
s1.trim();
//System.out.println(s1);//by using trim no changes here 
String s5=s1.trim();
//System.out.println(s5);
s1=s1.trim();
System.out.println(s1);

String s2="hii dude go and sitt there";
System.out.println(s2);
s2.toUpperCase();
String s6=s2.toUpperCase();
System.out.println(s6);
s2=s2.toUpperCase();
System.out.println(s2.toUpperCase());

String s3= "RBG technologies";
s3.toLowerCase();
String s4=s3.toLowerCase();
System.out.println(s4);
System.out.println(s3.toLowerCase());
s3=s3.toLowerCase();
System.out.println(s3);

}
}
