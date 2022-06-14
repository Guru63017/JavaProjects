package TestNGDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DragAndDropDemo1
{
	@Test
	public void ActionsTest() throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\GuruOnlineClass\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
//		driver.switchTo().frame(0);
		WebElement Element = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(Element);
		WebElement Drag = driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement Drop = driver.findElement(By.xpath("//div[@id='droppable']"));
		Actions act = new Actions(driver);
		Thread.sleep(3000);
		act.dragAndDrop(Drag, Drop).perform();
		driver.quit();
		System.out.println("Done");
	}
}
