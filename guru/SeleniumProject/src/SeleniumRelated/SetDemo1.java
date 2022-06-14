package SeleniumRelated;

import java.util.HashSet; 
import java.util.Iterator;
import java.util.Set;

//this is follow the generic concept
//this was avoid the duplicates
//when writen the program at that time it allows and at the run time it not taken

public class SetDemo1 
{
	public static void main(String[] args) 
	{
		Set set = new HashSet();
		set.add(10);
		set.add(true);
		set.add("RBG Technologies");
		
		int size = set.size();
		System.out.println("size :  "+size);
		
		set.add(true);
		set.add("RBG Technologies");
		size = set.size();
		System.out.println("size :  "+size);
		
//		in that process we can't print in  order wise
		
		Iterator dataDetails = set.iterator();
		
		System.out.println(dataDetails.next());
		System.out.println(dataDetails.next());
		System.out.println(dataDetails.next());

		
	}

}
