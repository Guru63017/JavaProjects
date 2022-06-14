package TestNGDemo;

import org.testng.annotations.Test;

public class TestNGGroupsDemo1 
{
	public static void main(String[] args)
	{
		
	}
	@Test(groups="Regression")
	public void funA()  
	{
		System.out.println("funA of TestNGGroupsDemo1");
	}
	
	@Test(groups="Regression")
	public void funB()
	{
		System.out.println("funB of TestNGGroupsDemo1");
		
	}
	
	@Test(groups="Sanity")
	public void funC() 
	{
		System.out.println("funC of TestNGGroupsDemo1");
	}
	
	@Test(groups="Sanity")
	public void funD()
	{
		System.out.println("funD of TestNGGroupsDemo1");
	}

}
