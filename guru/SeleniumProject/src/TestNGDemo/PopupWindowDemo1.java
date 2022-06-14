package TestNGDemo;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class PopupWindowDemo1 
{
	@Test
	public void PopupWindowTset() throws InterruptedException  
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Guru Online Class\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://uat.cap.org/");
		driver.manage().window().maximize();
		WebElement shop = driver.findElement(By.xpath("(//a[@href='https://estoreuat.cap.org/OA_HTML/xxCAPibeCZzpHome.jsp?sitex=10020%3A22372%3AUS&ref=xxCAPibeCZzpHome.jsp'])[1]"));
		shop.click();
		String popupPage1 = driver.getWindowHandle();
		
		Set<String> popupPage2 = driver.getWindowHandles();
		Iterator<String> switchpage = popupPage2.iterator();
		String parentWindow = switchpage.next();
		String childWindow = switchpage.next();
		
//		in this move to login page
		driver.switchTo().window(parentWindow);
//		in this move to main page(Shop)
		driver.switchTo().window(childWindow);
		Thread.sleep(2000);
		WebElement loginDrop = driver.findElement(By.xpath("//div[@id='nav']/child::span"));
//		this is one of the syntax for action
		Actions act = new Actions(driver);
		act.moveToElement(loginDrop).perform();
		Thread.sleep(4000);
		
		WebElement loginClick = driver.findElement(By.xpath("//a[@class='elabNavLogin xfu']"));
		Thread.sleep(4000);
	
		loginClick.click();
		
		driver.quit();

	}
}
