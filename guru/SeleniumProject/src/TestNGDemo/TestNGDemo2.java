package TestNGDemo;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class TestNGDemo2
{
	public static void main(String[] args) 
	{
		System.out.println("Main Method Start");
	}
	
	@Test
	public void funA()  // when u r not assing the priority by default it takes zero priority.
						// when u r giving similar priorities than go for alphabatical order.
	{
		System.out.println("funA of TestNGDemo2");
	}
	
	@Test 
	public void funB()
	{
		System.out.println("funB of TestNGDemo2");
		System.out.println(0/0);
//		it doesn't get out put because in the above statement takes the exception
		System.out.println("Done");
	}
	
	@Test 
	public void funC() throws Exception 
	{
		System.out.println("funC of TestNGDemo2");
//		throw new Exception();
//		this statement used for skip the Test when it fails and moved to forword
		throw new SkipException("Exception Remove2");
//		after throw new Exception and throw new SkipException they dont accept any statement
//		System.out.println(10/2);
		
	}
	@Test(enabled=false)
	public void funD()
	{
		System.out.println("funD of TestNGDemo2");
	}
//	the above statement means hide the data when it run time
	@Test(enabled=true)
	public void funE()
	{
		System.out.println("funD of TestNGDemo2");
	}
//	it means to unhide the data
	

}
