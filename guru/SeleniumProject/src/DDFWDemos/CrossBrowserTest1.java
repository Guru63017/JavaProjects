package DDFWDemos;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserTest1
{
	@Test
	@Parameters("browser")
	public void CrossBrowserTesting(String browserName)
	{
		GenericMethodsDemo1 generic = new GenericMethodsDemo1();
		generic.openBrowser(browserName);
		generic.enterUrl("https://opensource-demo.orangehrmlive.com/");
		generic.enterData("name","txtUsername","Admin");
		generic.enterData("xpath", "//input[@name='txtPassword']", "admin123");
		generic.click("name","Submit");
	}

}

