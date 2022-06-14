package Asserts;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertDemo2 
{

	@Test
	public void funB()
	{
		String expectedData = "java";
		String actualData = "RBG";
		String error = "Exception";


		SoftAssert softassert = new SoftAssert();

		softassert.assertEquals(actualData,expectedData,error);
		System.out.println("assert euals is executed for positive case");

		softassert.assertEquals(actualData,expectedData,error);
		System.out.println("assert euals is executed for Negative case");


		softassert.assertEquals(actualData,expectedData ,error);
		System.out.println("assert euals is executed for positive case");

		softassert.assertNotEquals(actualData,expectedData,error );
		System.out.println("assert euals is executed for negative case");

		softassert.assertAll();
	}
}
