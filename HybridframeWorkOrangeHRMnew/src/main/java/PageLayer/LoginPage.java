package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import UtlisLayer.JSExecutor;

public class LoginPage extends BaseClass {

	@FindBy(id = "txtUsername")
	WebElement uname;

	@FindBy(id = "txtPassword")
	WebElement pass;

	@FindBy(id = "btnLogin")
	WebElement lgnbutton;

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	public void loginFunctionality(String name, String password) {
		JSExecutor.enterdatausingJavaScriptExecutor(name, uname);
		JSExecutor.enterdatausingJavaScriptExecutor(password, pass);
		JSExecutor.clickonElementusingJavaScriptExecutor(lgnbutton);
	}

}

