package Asserts;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertDemo1 
{
//	hardAssert
	@Test
	public void funA()
	{	
		String expectedData = "Selenium";
		String actualData = "RBG Technologies";
		Assert.assertEquals(actualData,expectedData);
		System.out.println("Done");
	}
	@Test
	public void funB()
	{	
		SoftAssert SoftAssert = new SoftAssert();
		String expectedData = "Selenium";
		String actualData = "Selenium";
		Assert.assertEquals(actualData, expectedData);
		System.out.println("Assert equals is executed for pass case");
	}
	@Test
	public void funC()
	{	
		String expectedData = "RBG";
		String actualData = "Selenium";
		String error = "Exception";

		SoftAssert SoftAssert = new SoftAssert();

		Assert.assertEquals(actualData, expectedData);
		System.out.println("Assert equals is executed for fail case");

		Assert.assertNotEquals(actualData, expectedData,error);
		System.out.println("Assert equals is executed for fail case");


		Assert.assertEquals(actualData, expectedData,error);
		System.out.println("Assert equals is executed for fail case");


		Assert.assertNotEquals(actualData, expectedData,error);
		System.out.println("Assert equals is executed for fail case");


		Assert.assertEquals(actualData, expectedData,error);
		System.out.println("Assert equals is executed for fail case");

		SoftAssert.assertAll();

	}

}
