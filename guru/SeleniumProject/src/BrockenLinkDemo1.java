import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrockenLinkDemo1 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\GuruOnlineClass\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.gmail.com/");
		WebElement Brockenlink = driver.findElement(By.xpath("//*[@id='view_container']/div/div/div[2]/div/div[1]/span/div/div/a"));
		
		String ActualAtributeValue = Brockenlink.getAttribute("href");
		String ExectedAtributeValue = " ";
		
		if(ActualAtributeValue.equals("ExectedAtributeValue"))
		{
			System.out.println("This is Not Brocken Link");
			
		}
		else
		{
			System.out.println("This is Not Brocken Link");	
		}
		
		System.out.println("Done");
	}

}
