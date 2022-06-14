package TestNGDemo;

import java.util.Iterator; 
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class PopupWindowDemo2 
{
	@Test
	public void popupTest() throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\GuruOnlineClass\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://uat.cap.org/");
		WebElement shop = driver.findElement(By.xpath("(//a[@href='https://estoreuat.cap.org/OA_HTML/xxCAPibeCZzpHome.jsp?sitex=10020%3A22372%3AUS&ref=xxCAPibeCZzpHome.jsp'])[1]"));
		shop.click();
		Thread.sleep(1000);
		Set<String> popupPage2 = driver.getWindowHandles();
		Iterator<String> switchpage = popupPage2.iterator();
		String parentWindow = switchpage.next();
		String childWindow = switchpage.next();
		//		driver.switchTo().window(childWindow);
		driver.switchTo().window(parentWindow);
		WebElement publication = driver.findElement(By.xpath("(//div[@class='c-primaryNav-trigger-text'])[6]"));
		Actions act = new Actions(driver);
		act.moveToElement(publication).perform();
		Thread.sleep(5000);
		WebElement cap = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[3]/div/div/ul/li[6]/div/div/ul/li[3]/a"));
		act.moveToElement(cap).perform();
		Thread.sleep(2000);
		cap.click();
		Thread.sleep(2000);
		WebElement printBook = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div/div/div/a[1]/span[1]"));
		Thread.sleep(4000);
		printBook.click();

		driver.switchTo().window(parentWindow);
		WebElement eBook = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div/div/div/a[2]/span[1]"));
		Thread.sleep(2000);
		eBook.click();

		driver.switchTo().window(parentWindow);
		WebElement login = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[1]/div/ul/li[4]/a"));
		Thread.sleep(2000);
		login.click();

		System.out.println("Done");
		driver.quit();

	}
}
