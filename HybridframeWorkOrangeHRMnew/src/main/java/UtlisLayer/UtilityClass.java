package UtlisLayer;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import BaseLayer.BaseClass;

public class UtilityClass extends BaseClass{
	
public static void getPassScreenshot(String Screenshotname) throws IOException {
		
		
		File f=(((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE));
		String date=new SimpleDateFormat("ddMMYYYY_HHMMSS").format(new Date());
		String dist=System.getProperty("user.dir")+"/HybridframeWorkOrangeHRMnew/PassScreenshot"+Screenshotname+date;
		FileUtils.copyFile(f, new File(dist));
	}
public static void getfailScreenshot(String Screenshotname) throws IOException {
	
	
	File f=(((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE));
	String date=new SimpleDateFormat("ddMMYYYY_HHMMSS").format(new Date());
	String dist=System.getProperty("user.dir")+"/HybridframeWorkOrangeHRMnew/FailScreenshot"+Screenshotname+date;
	FileUtils.copyFile(f, new File(dist));
}
}


