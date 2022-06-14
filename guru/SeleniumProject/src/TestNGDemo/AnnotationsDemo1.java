package TestNGDemo;

import org.testng.annotations.Test; 
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class AnnotationsDemo1
{
	@Test
	public void funA() 
	{
		System.out.println("funA of AnnotationsDemo1");
	}
	@Test
	public void funB()
	{
		System.out.println("funB of AnnotationsDemo1 ");
	}

	@BeforeMethod
	public void beforeMethod() 
	{
		System.out.println("beforeMethod of AnnotationsDemo1");
	}

	@AfterMethod
	public void afterMethod() 
	{
		System.out.println("afterMethod of AnnotationsDemo1");
	}

	@BeforeClass
	public void beforeClass()
	{
		System.out.println("beforeClass of AnnotationsDemo1");
	}

	@AfterClass
	public void afterClass()
	{
		System.out.println("afterClass of AnnotationsDemo1");
	}

	@BeforeTest
	public void beforeTest()
	{
		System.out.println("beforeTest of AnnotationsDemo1");
	}

	@AfterTest
	public void afterTest()
	{
		System.out.println("afterTest of AnnotationsDemo1");
	}

	@BeforeSuite
	public void beforeSuite() 
	{
		System.out.println("beforeSuite of AnnotationsDemo1");
	}

	@AfterSuite
	public void afterSuite() 
	{
		System.out.println("afterSuite of AnnotationsDemo1");
	}

}
