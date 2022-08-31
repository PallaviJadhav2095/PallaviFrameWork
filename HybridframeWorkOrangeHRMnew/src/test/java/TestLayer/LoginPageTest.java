package TestLayer;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import BaseLayer.BaseClass;
import PageLayer.LoginPage;
import UtlisLayer.AlertPopupMethod;
import UtlisLayer.JSExecutor;

@Test(groups = { "LoginPage" })

public class LoginPageTest extends BaseClass {

	@BeforeTest
	public void setUp() {
		BaseClass.initlization();
	}

	@Test
	public void validateLoginFunctionality() throws InterruptedException {
		JSExecutor.generateAlertPopUpusingJavaScriptExecutor("User is on Login Page");
		Thread.sleep(5000);
		boolean a = AlertPopupMethod.captureAlertText().contains("Login");

		Assert.assertTrue(a);

		AlertPopupMethod.clickOnOkButton();

		new LoginPage().loginFunctionality("Admin", "admin123");
	}

	@AfterTest
	public void tearDown() {
		// driver.close();
	}

}
