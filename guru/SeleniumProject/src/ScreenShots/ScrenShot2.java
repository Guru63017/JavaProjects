package ScreenShots;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrenShot2 
{
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException, IOException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\GuruOnlineClass\\Selenium\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://uat.cap.org/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement shop = driver.findElement(By.xpath("(//a[@href='https://estoreuat.cap.org/OA_HTML/xxCAPibeCZzpHome.jsp?sitex=10020%3A22372%3AUS&ref=xxCAPibeCZzpHome.jsp'])[1]"));
		shop.click();
		takeScreenShot();
		Set<String> popupPage2 = driver.getWindowHandles();
		Iterator<String> switchpage = popupPage2.iterator();
		String parentWindow = switchpage.next();
		String childWindow = switchpage.next();
		driver.switchTo().window(childWindow);
//		Thread.sleep(20000);
		takeScreenShot();
		driver.switchTo().window(parentWindow);
		takeScreenShot();
		WebElement publication = driver.findElement(By.xpath("(//div[@class='c-primaryNav-trigger-text'])[6]"));
		takeScreenShot();
		Actions act = new Actions(driver);
		act.moveToElement(publication).perform();
		takeScreenShot();
		WebElement cap = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[3]/div/div/ul/li[6]/div/div/ul/li[3]/a"));
		act.moveToElement(cap).perform();
//		Thread.sleep(10000);
		takeScreenShot();
		cap.click();
//		Thread.sleep(4000);
		WebElement printBook = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div/div/div/a[1]/span[1]"));
		printBook.click();
//		Thread.sleep(20000);
		takeScreenShot();
		driver.switchTo().window(parentWindow);
		WebElement eBook = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div/div/div/a[2]/span[1]"));
		eBook.click();
//		Thread.sleep(20000);
		takeScreenShot();
		driver.switchTo().window(parentWindow);
		WebElement login = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[1]/div/ul/li[4]/a"));
//		Thread.sleep(3000);
		login.click();
		takeScreenShot();
		System.out.println("Done");
		driver.quit();

	}
	public static void takeScreenShot() throws IOException
	{
		Date d1 = new Date();
		SimpleDateFormat s1 = new SimpleDateFormat("ss mm");
		String Date = s1.format(d1);
		TakesScreenshot scrShot = ((TakesScreenshot)driver);
		File srcFile = scrShot.getScreenshotAs(OutputType.FILE);
		File DestFile = new File("C:\\Users\\malli\\Desktop\\ScreenShots\\screenShot.jpg"+Date+"");
		FileUtils.copyFile(srcFile, DestFile);
	}

}
