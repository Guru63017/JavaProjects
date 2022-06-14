
import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathsOnGuru99
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","D:\\GuruOnlineClass\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/newtours/index.php");
		//driver.get("https://www.facebook.com/");
		//driver.get("https://www.bbc.com/");


		//driver.findElement(By.name("userName")).sendKeys("Guru");
		//driver.findElement(By.name("password")).sendKeys("12345");
		////driver.findElement(By.name("submit")).click();


		//driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[2]/td[2]/input")).sendKeys("Guru");
		//driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[3]/td[2]/input")).sendKeys("12345");
		//driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[4]/td[2]/div/input")).click();

		//driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("Guru");
		//driver.findElement(By.xpath("//input[@name='password']")).sendKeys("12345");
		//driver.findElement(By.xpath("//input[@name='submit']")).click();

		//driver.findElement(By.xpath("//input[@name='userName' and @type='text']")).sendKeys("Guru");
		//driver.findElement(By.xpath("//input[@name='password' and @type='password']")).sendKeys("123456");
		//driver.findElement(By.xpath("//input[@name='submit' and @type='submit']")).click();

		//driver.findElement(By.cssSelector("input[name='userName']")).sendKeys("Guru");
		//driver.findElement(By.cssSelector("input[name='password']")).sendKeys("123456");
		//driver.findElement(By.cssSelector("input[name='submit']")).click();

		//driver.findElement(By.cssSelector("input[name='userName'][type='text']")).sendKeys("Guru99");
		//driver.findElement(By.cssSelector("input[name='password'][type='password']")).sendKeys("123456");
		//driver.findElement(By.cssSelector("input[name='submit'][type='submit']")).click();

		//driver.findElement(By.cssSelector("input[id='email']")).sendKeys("6304846409");
		//driver.findElement(By.cssSelector("input[id='pass']")).sendKeys("azaddudekula");
		////driver.findElement(By.cssSelector("button[id^='u_0_d_']")).click();
		//driver.findElement(By.cssSelector("button[id*='_P/']")).click();


		driver.findElement(By.linkText("REGISTER")).click();
		driver.findElement(By.partialLinkText("REGIST")).click();
		driver.quit();
		
		System.out.println("Done");
	}

}
