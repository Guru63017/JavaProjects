package DDFWDemos;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider3 
{

	@Test(dataProvider="TestData")
	public void funA(String username,String password)
	{
		System.setProperty("webdriver.chrome.driver","D:\\GuruOnlineClass\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys(password);
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
//		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
//		By by1 = By.xpath("//input[@id='btnLogin']");
//		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(by1));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.quit();
	}
	@DataProvider
	public Object[][] TestData()
	{
		Object[][] orangeHRMdata=new Object[10][2];
		orangeHRMdata[0][0]="RBG";
		orangeHRMdata[0][1]="Selenium";

		orangeHRMdata[1][0]="Selenium";
		orangeHRMdata[1][1]="RBG123";

		orangeHRMdata[2][0]="JAVA";
		orangeHRMdata[2][1]="123456";

		orangeHRMdata[3][0]="GURU";
		orangeHRMdata[3][1]="guru";

		orangeHRMdata[4][0]="Admin";
		orangeHRMdata[4][1]="admin123";

		orangeHRMdata[5][0]="Admin123";
		orangeHRMdata[5][1]="Admin";

		orangeHRMdata[6][0]="ABCDEF";
		orangeHRMdata[6][1]="4585G";

		orangeHRMdata[7][0]="12345rbg";
		orangeHRMdata[7][1]="Rbg785";

		orangeHRMdata[8][0]="GURU99";
		orangeHRMdata[8][1]="999guru";

		orangeHRMdata[9][0]="dev2552";
		orangeHRMdata[9][1]="bhav54";

		return orangeHRMdata;

	}
}

