package TestNGDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WebTableDemo1 
{
	@Test
	public void TestWebTable()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\GuruOnlineClass\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://only-testing-blog.blogspot.com/2013/09/test.html");
		driver.manage().window().maximize();
		WebElement singleNumber = driver.findElement(By.xpath("//*[@id='post-body-6522850981930750493']/div[1]/table/tbody/tr[1]/td[1]"));
		String print = singleNumber.getText();
		System.out.println("ccfirstrow...:"+print);
		
		List<WebElement> allrows = driver.findElements(By.xpath("//*[@id='post-body-6522850981930750493']/div[1]/table/tbody/tr"));
		int size = allrows.size();
		System.out.println("allrows...:"+size);
	
		
		List<WebElement> ccfirstrow = driver.findElements(By.xpath("//*[@id='post-body-6522850981930750493']/div[1]/table/tbody/tr[1]/td"));
		int size1 = ccfirstrow.size();
		System.out.println("ccfirstrow..:"+size1);
		
		
		List<WebElement> table = driver.findElements(By.xpath("//*[@id='post-body-6522850981930750493']/div[1]/table/tbody/tr/td"));
		int size3 = table.size();
		System.out.println("table...:"+size3);

//		for(int tr=1;tr<=table.size();tr++)
//		{
// 			for(int td=1;td<=table.size();td++)
//			{
//				
//			WebElement dataLable=driver.findElement(By.xpath("//*[@id='post-body-6522850981930750493']/div[1]/table/tbody/tr["+tr+"]/td["+td+"]"));	
//			String data = dataLable.getText();
//			System.out.println(data);
//			
//			}
//		}

//		driver.quit();
		
		System.out.println("Done");

				

	}
}
