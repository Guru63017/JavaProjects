package TestNGDemo;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

//  this program same as popupwindowDemo0

public class POPUP2A
{
	@Test
	public void PopupTest() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\GuruOnlineClass\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://uat.cap.org/");
		WebElement shop = driver.findElement(By.xpath("(//a[@href='https://estoreuat.cap.org/OA_HTML/xxCAPibeCZzpHome.jsp?sitex=10020%3A22372%3AUS&ref=xxCAPibeCZzpHome.jsp'])[1]"));
		shop.click();
		Set<String> popupPage2 = driver.getWindowHandles();
		Iterator<String> switchpage = popupPage2.iterator();
		String parentWindow = switchpage.next();
		String childWindow = switchpage.next();
		driver.switchTo().window(parentWindow);
		WebElement publication = driver.findElement(By.xpath("(//div[@class='c-primaryNav-trigger-text'])[6]"));
		Actions act = new Actions(driver);
		act.moveToElement(publication).perform();
		driver.switchTo().window(parentWindow);
		WebElement cap = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[3]/div/div/ul/li[6]/div/div/ul/li[3]/a"));
		act.moveToElement(cap).perform();
		cap.click();
		driver.switchTo().window(parentWindow);
		WebElement printBook = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div/div/div/a[1]/span[1]"));
		String expectedlink = "";
		String actualink = printBook.getAttribute("href");
		Assert.assertNotEquals(actualink, expectedlink);
		printBook.click();
		driver.switchTo().window(parentWindow);
		WebElement eBook = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div/div/div/a[2]/span[1]"));
		String expectedLink = ""; 
		String actualLink = eBook.getAttribute("href");
		Assert.assertNotEquals(actualLink, expectedLink);
		eBook.click();
		driver.switchTo().window(parentWindow);
		WebElement login = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[1]/div/ul/li[4]/a"));
		login.click();

		System.out.println("Done");
		driver.quit();
		
	}
}
