package SeleniumRelated;

import java.util.ArrayList;  
import java.util.List;

//FindElements concept and it returns the List<webelements>
//The "List", it allows the Duplicates and following the index
//this is generic concepts

public class ListDemo1
{
public static void main(String[] args) 
{
//ArrayList list = new ArrayList();
	
List list = new ArrayList();
list.add(10);// 0 place
list.add("RBG Technologies");  // 1st place
list.add("true"); //2nd place

list.add("RBG Technologies");//3rd place

int size = list.size();
System.out.println("size :  "+size);

System.out.println(list.get(3));

list.add("RBG");

size = list.size();
System.out.println("size :  "+size);
System.out.println(list.get(4));
System.out.println("Done");
}
}
