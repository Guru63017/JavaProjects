package TestNGDemo;

import org.testng.annotations.Test;

public class TestNGDemo1
{
	public static void main(String[] args) 
	{
		System.out.println("Main Method Start");
	}
	@Test
	public void funA()  // when u r not assing the priority by default it takes zero priority.
						// when u r giving similar priorities than go for alphabatical order.
	{
		System.out.println("funA of TestNGDemo1");
	}
	@Test (priority=1)
	public void funB()
	{
		System.out.println("funB of TestNGDemo1");
	}
	@Test (priority=2)
	public void funC()
	{
		System.out.println("funC of TestNGDemo1");
	}

}
