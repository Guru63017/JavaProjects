package Migration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ListOfWebtables {
	@Test
	public void WebtablesTest()
	{


		System.setProperty("webdriver.chrome.driver", "D:\\Guru Online Class\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demos.devexpress.com/aspxeditorsdemos/ListEditors/MultiSelect.aspx");
		WebElement webtables = driver.findElement(By.xpath("(//table)[56]"));
		webtables.click();
		System.out.println("Done");

	}

}

