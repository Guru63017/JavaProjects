package TestNGDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Pixel 
{
	@Test
	public void testPixel() throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\GuruOnlineClass\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		WebElement slider = driver.findElement(By.xpath("//a[@href='http://jqueryui.com/slider/']"));
		slider.click();
		driver.switchTo().frame(0);
		WebElement Drag = driver.findElement(By.xpath("//div[@id='slider']"));
		Thread.sleep(1000);
		Actions act = new Actions(driver);
		act.dragAndDropBy(Drag, 20, 0).perform();
		Thread.sleep(2000);
		driver.quit();
		System.out.println("Done");
	}
}
