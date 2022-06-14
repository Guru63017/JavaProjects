package ScreenShots;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReportDemo1     
{
	public static ExtentHtmlReporter htmlReporter;
	public static ExtentReports extent;
	public static ExtentTest extentLoggerE;
	public static  ExtentTest parentExtentLogger; 
	public static void main(String[] args) 
	{    
		System.out.println("Start");
		htmlReporter = new ExtentHtmlReporter("C:\\Users\\malli\\Desktop\\Reprtfolder\\Test1.html");
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		parentExtentLogger = extent.createTest("Test1");
		extentLoggerE = parentExtentLogger.createNode("Senario1");
		extentLoggerE.log(Status.PASS,MarkupHelper.createLabel(" - Test Case failed", ExtentColor.GREEN));
//		extentLoggerE.log(Status.FAIL,MarkupHelper.createLabel(" - Test Case failed", ExtentColor.RED));
//		extentLoggerE.log(Status.SKIP,MarkupHelper.createLabel(" - Test Case Skipped", ExtentColor.ORANGE));
		extent.flush();
		System.out.println("Done");
	}

}
