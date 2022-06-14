package SeleniumRelated;

import java.util.ArrayList; 
import java.util.List;

public class ListDemo2 
{

	public static void main(String[] args) 

	{	
		//		String Related Topics

		List<String> list1 = new ArrayList<String>();
		
		//		list.add(10);
		//		list.add(true); not accepted because it returns only the string data type

		list1.add("RBG Technologies");
		list1.add("Selenium");

		int size = list1.size();

		System.out.println("size:  "+size);

		System.out.println(list1.get(0));

		String data = list1.get(0);

		System.out.println(data);

		System.out.println("Done");

		//		Integer Related Topics

		//		List<int> list2 = new ArrayList<int>();  // it gives error because "int" is premitive data type

		List<Integer> list2 = new ArrayList<Integer>();

//		belowe two are not accepted because those are not related to Integer Data type
//		list2.add(true);
//		list2.add("RBG Technologies");  

		list2.add(10);
		list2.add(15);

		Integer size1 = list2.size();
		System.out.println("size:  "+size1);

		System.out.println(list2.get(1));

		Integer data2 = list2.get(0);

		System.out.println(data2);

		System.out.println("Done");

	}

}
