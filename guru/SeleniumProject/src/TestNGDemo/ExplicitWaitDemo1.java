package TestNGDemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ExplicitWaitDemo1
{
	@Test
	public void TestonExplicitWait() 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\GuruOnlineClass\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demos.devexpress.com/aspxeditorsdemos/ListEditors/MultiSelect.aspx");
		driver.manage().window().maximize();
		WebElement checkBox = driver.findElement(By.xpath("//span[@id='ContentHolder_lbFeatures_TG_D']"));
		checkBox.click();
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		By by1 = By.xpath("//span[@id='ContentHolder_lbModels_10_D']");
		wait.until(ExpectedConditions.visibilityOfElementLocated(by1));
		
		WebElement model10 = driver.findElement(By.xpath("//span[@id='ContentHolder_lbModels_10_D']"));
		model10.click();
		
		WebElement Blooth = driver.findElement(By.xpath("//span[@id='ContentHolder_lbFeatures_Bluetooth_D']"));
		Blooth.click();
		
		By by2 = By.xpath("//span[@id='ContentHolder_lbModels_11_D']");
		wait.until(ExpectedConditions.visibilityOfElementLocated(by2));
		
		WebElement model11 = driver.findElement(By.xpath("//span[@id='ContentHolder_lbModels_11_D']"));
		model11.click();
		driver.quit();
	}
}
