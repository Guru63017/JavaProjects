package TestNGDemo;

import org.testng.annotations.Test;

public class TestNGDemo3
{

	public static void main(String[] args)
	{


	}
	@Test(priority=0)
	public void loginTest()
	{
		System.out.println("loginTest of TestNGDemo3");	
		System.out.println(0/0);
	}

//	"dependsOnMethods" it means it was depend on other statements
	@Test(priority=1,dependsOnMethods="loginTest")
	public void customerDetails()
	{
		System.out.println("customerDetails of TestNGDemo3");
	}
	

}
