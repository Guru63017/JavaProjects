package DesktopWindows;

import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class AutoITDemo1 
{
	@Test
	public void AutoItDemo() throws IOException, InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\GuruOnlineClass\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///C:/Users/malli/Desktop/Reprtfolder/WebSites/FileUpload.html");
		driver.manage().window().maximize();
		WebElement chooseFile = driver.findElement(By.xpath("//input[@id='rbg']"));
//		chooseFile.sendKeys("C:\\Users\\malli\\Desktop\\ScreenShots\\ScreenShot.jpeg");
		System.out.println("click on choose button1");
//		chooseFile.click();
		Actions a = new Actions(driver);
		a.click(chooseFile).perform();
		Thread.sleep(2000);
		Runtime.getRuntime().exec("C:\\Users\\malli\\Desktop\\Reprtfolder\\WebSites\\AutoITDemo1.exe");
		driver.quit();
		System.out.println("Done");
		
	}

}

