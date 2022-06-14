package ScreenShots;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReportDemo3
{
	public static ExtentHtmlReporter htmlReporter;
	public static ExtentReports extent;
	public static ExtentTest extentLoggerE;
	public static  ExtentTest parentExtentLogger;
	public static void main(String[] args) throws IOException 
	{
		System.out.println("Start");
		System.setProperty("webdriver.chrome.driver", "D:\\GuruOnlineClass\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/newtours/reservation.php");
		driver.manage().window().maximize(); 
		
		TakesScreenshot scrShot = ((TakesScreenshot)driver);
		File srcFile = scrShot.getScreenshotAs(OutputType.FILE);
		File DestFile = new File("C:\\Users\\malli\\Desktop\\ScreenShots\\ScreenShot.jpeg");
		FileUtils.copyFile(srcFile, DestFile);
	
		htmlReporter = new ExtentHtmlReporter("C:\\Users\\malli\\Desktop\\Reprtfolder\\Test3.html");
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		parentExtentLogger = extent.createTest("Test3");
		extentLoggerE = parentExtentLogger.createNode("Senario1");   
		
		extentLoggerE.log(Status.PASS,MarkupHelper.createLabel(" - Test Case Pass", ExtentColor.GREEN));
//		extentLoggerE.log(Status.FAIL,MarkupHelper.createLabel(" - Test Case Fail", ExtentColor.RED));
//		extentLoggerE.log(Status.SKIP,MarkupHelper.createLabel(" - Test Case Skip", ExtentColor.BLUE));
		extentLoggerE.pass("",MediaEntityBuilder.createScreenCaptureFromPath("C:\\Users\\malli\\Desktop\\ScreenShots\\ScreenShot.jpeg").build());
		extent.flush();
		System.out.println("Done");
		driver.quit();
		
	}
}
