package ScreenShots;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReportDemo2    
{
	public static ExtentHtmlReporter htmlReporter;
	public static ExtentReports extent;
	public static ExtentTest extentLoggerE;
	public static  ExtentTest parentExtentLogger; 
	public static void main(String[] args) 
	{    
		System.out.println("Start");
		String data1 = System.getProperty("user.dir");
		System.out.println(data1);
		htmlReporter = new ExtentHtmlReporter(data1+"C:\\Users\\malli\\Desktop\\Reprtfolder\\Test2.html");

		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		parentExtentLogger = extent.createTest("Test1");
		extentLoggerE = parentExtentLogger.createNode("Senario1");

		extentLoggerE.log(Status.PASS,MarkupHelper.createLabel(" - Test Case Passed", ExtentColor.GREEN));
		extentLoggerE.log(Status.FAIL,MarkupHelper.createLabel(" - Test Case failed", ExtentColor.RED));
		extentLoggerE.log(Status.SKIP,MarkupHelper.createLabel(" - Test Case Skipped", ExtentColor.ORANGE));

		parentExtentLogger = extent.createTest("Test2");
		extentLoggerE = parentExtentLogger.createNode("Senario2");

		extentLoggerE.log(Status.PASS,MarkupHelper.createLabel(" - Test Case Passed", ExtentColor.GREEN));
		extentLoggerE.log(Status.FAIL,MarkupHelper.createLabel(" - Test Case failed", ExtentColor.RED));
		extentLoggerE.log(Status.SKIP,MarkupHelper.createLabel(" - Test Case Skipped", ExtentColor.ORANGE));
		extent.flush();

		System.out.println("Done");
	}

}