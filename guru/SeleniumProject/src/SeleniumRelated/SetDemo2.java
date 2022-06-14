package SeleniumRelated;

import java.util.HashSet; 
import java.util.Iterator;
import java.util.Set;

public class SetDemo2 
{
	public static void main(String[] args) 
	{
		Set<String> set = new HashSet<String>();
		set.add("RBG Technologies");
		set.add("Selenium");
		set.add("java");

		int size = set.size();
		System.out.println(size);

//		System.out.println(set);

		Iterator<String> stringData = set.iterator();

		String data1 = stringData.next();
		String data2 = stringData.next();
		String data3 = stringData.next();

		for(String stock : set)
		{
			System.out.println(stock);
		}

		Set<Integer> set1 = new HashSet<Integer>();
		set1.add(10);
		set1.add(5);
		set1.add(52);
		int sizes = set1.size();
		System.out.println(sizes);

		Iterator<Integer> IntegerData = set1.iterator();
		Integer data5 = IntegerData.next();
		Integer data6 = IntegerData.next();
		Integer data7 = IntegerData.next();

		for(Integer stock : set1)
		{
			System.out.println(stock);
		}

		System.out.println("Done");
	}

}
