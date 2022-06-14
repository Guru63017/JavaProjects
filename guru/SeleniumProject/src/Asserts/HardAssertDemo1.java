package Asserts;

import org.testng.Assert; 
import org.testng.annotations.Test;

public class HardAssertDemo1
{
	@Test
	public void funA()
	{
		String expectedData = "RBG";
		String actualData = "RBG";
		System.out.println("funA of HardAssertDemo1");
		Assert.assertEquals(expectedData,actualData);
		System.out.println("expectedData is equals to actualData ");
	}
	
	@Test
	public void funB()
	{
		String expectedData = "Java";
		String actualData = "RBG";
		System.out.println("funB of HardAssertDemo1");
		Assert.assertEquals(expectedData,actualData );
		System.out.println("expectedData is not equals to actualData ");	
	}

	@Test
	public void funC()
	{
//		int expectedData = 10;
//		int actualData = 20;
		
		boolean actualData1 = true;
		boolean expectedData1 = false;
		
		System.out.println("funC of HardAssertDemo1");
		Assert.assertNotEquals(expectedData1,actualData1);
		System.out.println("expectedData is not equals to actualData");
	}
	
	@Test
	public void funD()
	{
		int expectedData = 10;
		int actualData = 10;
		
//		boolean actualData1 = true;
//		boolean expectedData1 = true;
		
		System.out.println("funD of HardAssertDemo1");
		Assert.assertNotEquals(expectedData,actualData );
		System.out.println("expectedData is not equals to actualData");
	}

}
