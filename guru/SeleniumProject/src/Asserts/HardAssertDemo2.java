package Asserts;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertDemo2
{
	@Test
	public void funA()
	{
		String expectedData = "RBG";
		String actualData = "RBG";
		String error = "Exception";
		System.out.println("funA of HardAssertDemo1");
		Assert.assertEquals(expectedData,actualData,error);
		System.out.println("Condition is satisfied");
	}
	
	@Test
	public void funB()
	{
		String expectedData = "Java";
		String actualData = "RBG";
		String error = "expectedData is not equals to actualData";
		System.out.println("funB of HardAssertDemo1");
		Assert.assertEquals(expectedData,actualData,error);
		System.out.println("expectedData is not equals to actualData ");	
	}

	@Test
	public void funC()
	{
//		int expectedData = 10;
//		int actualData = 20;
		
		boolean actualData1 = true;
		boolean expectedData1 = false;
		String error = "null";
		
		System.out.println("funC of HardAssertDemo1");
		Assert.assertNotEquals(expectedData1,actualData1,error);
		System.out.println("condition is satisfied");
	}
	
	@Test
	public void funD()
	{
		int expectedData = 10;
		int actualData = 10;
		String error ="Exception";
		
//		boolean actualData1 = true;
//		boolean expectedData1 = true;
//		String str = "expected and actual are same here";
		
		System.out.println("funD of HardAssertDemo1");
		Assert.assertNotEquals(expectedData,actualData,error);
		System.out.println("condition is not satisfied");
	}

}

