package TestNGDemo;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ImplicitWaitDemo1
{
	@Test
	public void TestonImplicitWait() 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Guru Online Class\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demos.devexpress.com/aspxeditorsdemos/ListEditors/MultiSelect.aspx");
		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);   //deprecation
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement checkBox = driver.findElement(By.xpath("//span[@id='ContentHolder_lbFeatures_TG_D']"));
		checkBox.click();
		WebElement model10 = driver.findElement(By.xpath("//span[@id='ContentHolder_lbModels_10_D']"));
		model10.click();
		WebElement Blooth = driver.findElement(By.xpath("//span[@id='ContentHolder_lbFeatures_Bluetooth_D']"));
		Blooth.click();
		WebElement model11 = driver.findElement(By.xpath("//span[@id='ContentHolder_lbModels_11_D']"));
		model11.click();
		driver.quit();
	}
}
