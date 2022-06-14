
package DDFWDemos;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider2
{
	@Test(dataProvider="TestData1")
	public void funA(String username,String password)
	{
		System.setProperty("webdriver.chrome.driver","D:\\GuruOnlineClass\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys(password);
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		By by1 = By.xpath("//input[@id='btnLogin']");
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(by1));
		driver.quit();


	}
	@DataProvider(name="orangeHRM")
	public Object[][] TestData1()
	{
		Object[][] orangeHRMdata=new Object[1][2];
		orangeHRMdata[0][0]="RBG";
		orangeHRMdata[0][1] = "1234";
		return orangeHRMdata;
	}


}

