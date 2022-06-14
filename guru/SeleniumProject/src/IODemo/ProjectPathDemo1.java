package IODemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProjectPathDemo1
{

	public static void main(String[] args)
	{
		String projectPath = System.getProperty("user.dir");
		System.out.println("projectPath: "+projectPath);

		System.setProperty("webdriver.chrome.driver",projectPath+ "\\webDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://aprtacitizen.epragathi.org/#!/index");
		System.out.println("Done");
	}

}
