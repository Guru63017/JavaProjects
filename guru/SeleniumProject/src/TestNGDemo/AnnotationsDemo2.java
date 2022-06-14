package TestNGDemo;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class AnnotationsDemo2 
{
	@Test
	public void funA() 
	{
		System.out.println("funA of AnnotationsDemo2");
	}

	@AfterMethod
	public void afterMethod() 
	{
		System.out.println("afterMethod of AnnotationsDemo2");
	}

	@AfterClass
	public void afterClass()
	{
		System.out.println("afterClass of AnnotationsDemo2");
	}

	@AfterTest
	public void afterTest()
	{
		System.out.println("afterTest of AnnotationsDemo2");
	}

	@AfterSuite
	public void afterSuite() 
	{
		System.out.println("afterSuite of AnnotationsDemo2");
	}
}
