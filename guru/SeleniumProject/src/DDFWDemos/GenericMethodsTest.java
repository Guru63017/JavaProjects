package DDFWDemos;

public class GenericMethodsTest
{

	public static void main(String[] args) throws InterruptedException 
	{
		GenericMethodsDemo1 key =new GenericMethodsDemo1();
		
		key.openBrowser("chrome");
		
		key.enterUrl("https://opensource-demo.orangehrmlive.com/");
		
//		key.enterData("xpath", "//input[@name='txtUsername']", "Admin");
		key.enterData("name","txtUsername","Admin");
		
		key.enterData("xpath", "//input[@name='txtPassword']", "admin123");
//		key.enterData("name", locatorValue, data);
		Thread.sleep(2000);
		
		key.click("name","Submit");
		
		System.out.println("done");
		
	}

}
