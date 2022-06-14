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

public class AnnotationsDemo4
{
	@Test
	public void funA() 
	{
		System.out.println("funA of AnnotationsDemo4");
	}

	@BeforeMethod
	public void beforeMethod() 
	{
		System.out.println("BeforeMethod of AnnotationsDemo4");
	}

	@AfterMethod
	public void afterMethod() 
	{
		System.out.println("afterMethod of AnnotationsDemo4");
	}

	@BeforeClass
	public void beforeClass()
	{
		System.out.println("beforeClass of AnnotationsDemo4");
	}

	@AfterClass
	public void afterClass()
	{
		System.out.println("afterClass of AnnotationsDemo4");
	}

	@BeforeTest
	public void beforeTest()
	{
		System.out.println("beforeTest of AnnotationsDemo4");
	}

	@AfterTest
	public void afterTest()
	{
		System.out.println("afterTest of AnnotationsDemo4");
	}

	@BeforeSuite
	public void beforeSuite() 
	{
		System.out.println("beforeSuite of AnnotationsDemo4");
	}

	@AfterSuite
	public void afterSuite() 
	{
		System.out.println("afterSuite of AnnotationsDemo4");
	}
}
