package TestNGDemo;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationsDemo3
{
	@Test
	public void funA() 
	{
		System.out.println("funA of AnnotationsDemo3");
	}
	
	@BeforeMethod
	public void beforeMethod() 
	{
		System.out.println("BeforeMethod of AnnotationsDemo3");
	}

	@BeforeClass
	public void beforeClass()
	{
		System.out.println("beforeClass of AnnotationsDemo3");
	}

	@BeforeTest
	public void beforeTest()
	{
		System.out.println("beforeTest of AnnotationsDemo3");
	}


	@BeforeSuite
	public void beforeSuite() 
	{
		System.out.println("beforeSuite of AnnotationsDemo3");
	}

}
