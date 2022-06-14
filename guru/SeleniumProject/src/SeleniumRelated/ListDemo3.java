package SeleniumRelated;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListDemo3 
{
	public static void main(String[] args)
	{ 
		System.setProperty("webdriver.chrome.driver", "D:\\Guru Online Class\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/button/");
		List<WebElement> ElementList = driver.findElements(By.tagName("//input[@type='submit']"));

//		List<WebElement> list1 = new ArrayList<WebElement>();
		
		
		for(WebElement Select : ElementList) 
		{
			String ListName = Select.getText();

			System.out.println(ListName);

		}
		System.out.println("Done");
	}
}
