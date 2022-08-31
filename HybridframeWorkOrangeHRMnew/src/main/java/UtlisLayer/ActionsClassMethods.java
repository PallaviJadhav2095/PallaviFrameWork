package UtlisLayer;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import BaseLayer.BaseClass;

public class ActionsClassMethods extends BaseClass {
	
	public static void clickonElement(WebElement wb) {
	new Actions(driver).click(wb).build().perform();
     }
	public static void doubleclickonElement(WebElement wb) {
		new Actions(driver).doubleClick(wb).build().perform();
	}
	public static void rightclickonElement(WebElement wb) {
		new Actions(driver).contextClick(wb).build().perform();
	}
	public static void mouseoveronElement(WebElement wb) {
		new Actions(driver).moveToElement(wb).build().perform();
	}
	public static void dragandDroptheElement(WebElement src,WebElement trg) {
		new Actions(driver).dragAndDrop(src, trg).build().perform();
	}
	public static void clickandHoldTheElement(WebElement wb) {
		new Actions(driver).clickAndHold(wb).build().perform();
		}
	public static void releaseTheElement(WebElement wb) {
		new Actions(driver).release(wb).build().perform();
	}
	public static void clickandmovetoElement(WebElement move,WebElement click) {
		new Actions(driver).moveToElement(move).click(click).build().perform();
	}
	public static void enterDatawithsendkeys(WebElement wb,String value) {
		new Actions(driver).sendKeys(wb, value).build().perform();
	}
	public static void enterDataInUpperCase(WebElement wb,String value) {
		new Actions (driver).keyDown(Keys.SHIFT).sendKeys(wb, value).keyUp(Keys.SHIFT).build().perform();
	}
	public static void moveEndOfPage() {
		new Actions(driver).keyDown(Keys.CONTROL).sendKeys(Keys.END).keyUp(Keys.SHIFT).build().perform();
	}
	
	public static void moveHomePage() {
		new Actions(driver).keyDown(Keys.CONTROL).sendKeys(Keys.HOME).keyUp(Keys.SHIFT).build().perform();
	}
	public static void copyTextFromTextBox(WebElement wb) {
		new Actions(driver).keyDown(Keys.CONTROL).sendKeys(wb, "a").sendKeys("C").keyUp(Keys.CONTROL).build().perform();
	}
	public static void pasteTextFromTextBox(WebElement wb) {
		new Actions(driver).keyDown(Keys.CONTROL).sendKeys(wb, "v").keyUp(Keys.CONTROL).build().perform();
	}
	
}