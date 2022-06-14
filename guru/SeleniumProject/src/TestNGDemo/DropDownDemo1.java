package TestNGDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropDownDemo1 
{
	@Test
	public void monthDropDown() 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\GuruOnlineClass\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/newtours/reservation.php");
		driver.manage().window().maximize();
		WebElement dropDown = driver.findElement(By.xpath("//select[@name='toMonth']"));
		Select month = new Select(dropDown);
		//		month.selectByIndex(0);
		//		month.selectByValue("12");
		month.selectByVisibleText("October");

		List<WebElement> monthList = driver.findElements(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[7]/td[2]/select[1]"));
		for(int tr=1;tr<=monthList.size();tr++)
		{
			WebElement monthNames=driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[7]/td[2]/select[1]"));	
			String  namesList= monthNames.getText();
			System.out.println(namesList);
		}

		System.out.println("Done");
		driver.quit();
	}
}
