package UtlisLayer;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import BaseLayer.BaseClass;

public class ExtentsReports extends BaseClass{
	public static ExtentReports extent;
	
	public static ExtentReports extentreportsetup() {
	
		ExtentSparkReporter sparkreporter=new ExtentSparkReporter("C:\\Users\\nasee\\eclipse-workspace\\HybridframeWorkOrangeHRMnew\\ReportsFolder"+getDate()+"extentreport.html");
		extent=new ExtentReports();
		extent.attachReporter(sparkreporter);
		sparkreporter.config().setDocumentTitle("PIM Page Test Cases");
		return extent;
	}
		
	public static String getPassScreenshot(String screenshotname) throws IOException {
		File f = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		String dist = System.getProperty("user.dir") + "C:\\Users\\nasee\\eclipse-workspace\\HybridframeWorkOrangeHRMnew\\PassScreenshot" + screenshotname + getDate() + ".png";
		FileUtils.copyFile(f, new File(dist));
		return dist;
	}
	
		public static String getFailedScrenshot(String screenshotname) throws IOException {
			File f = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

			String dist = System.getProperty("user.dir") + "C:\\Users\\nasee\\eclipse-workspace\\HybridframeWorkOrangeHRMnew\\FailScreenshot" + screenshotname + getDate() + ".png";
			

			FileUtils.copyFile(f, new File(dist));

			return dist;
		}
			public static String getDate() {
				return new SimpleDateFormat("ddMMyyyy_HHmmss").format(new Date());

			}
	}
	


