package UtlisLayer;

import BaseLayer.BaseClass;

public class AlertPopupMethod extends BaseClass {
	
	public static void clickOnOkButton() {
		driver.switchTo().alert().accept();	
		}
  public static void clickOnCancleButton() {
	  driver.switchTo().alert().dismiss();
  }
	public static String captureAlertText() {
		return driver.switchTo().alert().getText();
	}
	public static void enterDataInAlert(String value) {
		driver.switchTo().alert().sendKeys(value);
	}
}
