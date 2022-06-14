package SeleniumRelated;

import java.util.Hashtable; 
import java.util.Map;

public class MapDemo 
{
	public static void main(String[] args) 
	{
		Map map = new Hashtable();
		map.put("Course", "Selenium");
		map.put("Email", "RBG Technologies");
		map.put("Phone", "96666");

		Map<String,	Integer> map2 = new Hashtable<String,Integer>();
		map2.put("Selenium",10);
//		map2.put("Selenium","Course"); // not possible parameterised are different
//		map2.put(10, "Selenium"); // not possible parameterised are different
		Map<Integer, String> map3 = new Hashtable<Integer, String>();
		map3.put(10, "Selenium");



	}

}
