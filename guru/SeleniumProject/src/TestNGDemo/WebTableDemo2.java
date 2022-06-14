package TestNGDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WebTableDemo2 
{
	@Test
	public void tetTable()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\GuruOnlineClass\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.bseindia.com/markets/equity/EQReports/mktwatchR.html?filter=gainer*all$all$");
		driver.manage().window().maximize();
		List<WebElement> list = driver.findElements(By.xpath("//*[@id='fontSize']/div[2]/div/div[1]/div/div/div/div[3]/table/tbody/tr/td/table/tbody/tr/td[2]"));
		int size = list.size();
		System.out.println(size);

		for(int tr=1;tr<=list.size();tr++)
		{
			WebElement dataLable=driver.findElement(By.xpath("//*[@id='fontSize']/div[2]/div/div[1]/div/div/div/div[3]/table/tbody/tr/td/table/tbody/tr["+tr+"]/td[2]"));	
			String data = dataLable.getText();
			System.out.println(data);
		}
//		driver.quit();
	}
}
