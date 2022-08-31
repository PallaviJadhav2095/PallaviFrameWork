package UtlisLayer;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import BaseLayer.BaseClass;

public class JSExecutor extends BaseClass{
	public static void enterdatausingJavaScriptExecutor(String value,WebElement wb) {
	
		((JavascriptExecutor)driver).executeScript("arguments[0].value='"+value+"'",wb);
		
	}
	public static void clickonElementusingJavaScriptExecutor(WebElement wb) {
		
		((JavascriptExecutor)driver).executeScript("arguments[0].click();",wb);
		}

	public static void scrolldownuptoelementusingJavaScriptExecutor(WebElement wb) {
		((JavascriptExecutor)driver).executeScript("arguments[0].ScrollIntoView(true);",wb);
		}
	public static void borderonElementusingJavaScriptExecutor (WebElement wb) {
		((JavascriptExecutor)driver).executeScript("arguments[0].Style.border='3px solid red';",wb);
		}
	public static String captureTitleusingJavaScriptExecutor() {
		return ((JavascriptExecutor)driver).executeScript("return document.title;").toString();
	}
	public static String captureUrlusingJavaScriptExecutor() {
		return((JavascriptExecutor)driver).executeScript("return document.URL;").toString();
	}
	
	public static void openUrlusingJavaScriptExecutor(String url) {
		((JavascriptExecutor)driver).executeScript("window.location='"+url+"';");
	}
	public static void moveSomeStepBackusingJavaScriptExecutor(String moveback) {
		((JavascriptExecutor)driver).executeScript("history go("+moveback+");");
	}
	public static void moveSomeStepForwardusingJavaScriptExecutor(String moveforward) {
		((JavascriptExecutor)driver).executeScript("history go("+moveforward+");");
	}
	public static void generateAlertPopUpusingJavaScriptExecutor(String alertvalue) {
		((JavascriptExecutor)driver).executeScript("alert('"+alertvalue+"')");
		}
	public static void generateConfirmPopUpusingJavaScriptExecutor(String confirmvalue) {
		((JavascriptExecutor)driver).executeScript("confirm('"+confirmvalue+"')");
		}
	public static void generatePromptPopUpusingJavaScriptExecutor(String promptvalue) {
		((JavascriptExecutor)driver).executeScript("prompt('"+promptvalue+"')");
		}
	public static void changeBackgroundColor(WebElement wb) {
		((JavascriptExecutor)driver).executeScript("arguments[0].style.backgroundColor='rgb(255,0,0)';",wb);
	}
		
	}

	

