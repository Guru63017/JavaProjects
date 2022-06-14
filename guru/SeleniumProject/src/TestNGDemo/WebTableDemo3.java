package TestNGDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WebTableDemo3 
{
	@Test
	public void selectedName() 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\GuruOnlineClass\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bseindia.com/markets/equity/EQReports/mktwatchR.html?filter=gainer*all$all$");		

		//		for single selection

		//		WebElement list = driver.findElement(By.xpath("//*[@id='fontSize']/div[2]/div/div[1]/div/div/div/div[3]/table/tbody/tr/td/table/tbody/tr[8]/td[2]/a"));
		//		list.click();
		
//		selected person

		int select[] = {3};
		for(int i=0; i<select.length; i++)
		{
			int  selectedName=select[i];
			WebElement selectedLink = driver.findElement(By.xpath("//*[@id='fontSize']/div[2]/div/div[1]/div/div/div/div[3]/table/tbody/tr/td/table/tbody/tr["+selectedName+"]/td[2]/a"));
			selectedLink.click();

		}
		driver.quit();

	}
}
