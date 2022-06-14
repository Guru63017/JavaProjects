package DDFWDemos;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo1 
{
	@Test(dataProvider="setData")
	public void funA(int a) 
	{
		System.out.println(a);
	}

	/**
	 * two dimensional arrays
	 * @return
	 */

	@DataProvider
	public Object[][] setData()
	{
		Object o1[][] = new Object [3][1];
		o1[0][0] = 10;
		o1[1][0] = 20;
		o1[2][0] = 30;

		return o1;			  
	}
	@Test(dataProvider="setData1")
	public void funB(int a,int b) 
	{
		System.out.println(a);
		System.out.println(b);
	}

	@DataProvider
	public Object[][] setData1()
	{
		Object o1[][] = new Object [3][2];
		o1[0][0] = 10;
		o1[1][0] = 20;
		o1[2][0] = 30;

		o1[0][1] = 10;
		o1[1][1] = 20;
		o1[2][1] = 30;

		return o1;	
	}
}
