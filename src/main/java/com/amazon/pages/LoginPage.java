package com.amazon.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import com.amazon.framework.utilities.DriverWait;
import com.amazon.framework.utilities.DriverWait.WaitTime;
import static com.amazon.framework.utilities.UIWrappers.*;

public class LoginPage extends BasePage {

	@FindBy(id="nav-link-accountList")
	private WebElement signInLink;
	
	@FindBy(id = "ap_email")
	private WebElement emailTxtField;

	@FindBy(id = "continue")
	private WebElement continueBtn;

	@FindBy(id = "ap_password")
	private WebElement passwordTxtField;

	@FindBy(id = "signInSubmit")
	private WebElement loginBtn;

	@Override
	public boolean isPageDisplayed() {
		return DriverWait.isElementDisplayed(emailTxtField, WaitTime.ONEMINUTE);
	}
	
	public void loginApplication(String userName,String password) {
		inputText(emailTxtField, userName, "Email");
		clickOnElement(continueBtn, "Continue");
		inputText(passwordTxtField, password, "Password");
		clickOnElement(loginBtn, "Login Button");
		Assert.assertTrue(new DashBoardPage().isPageDisplayed(), "Unble to login application");
		Assert.assertTrue(new GlobalMenuPage().isPageDisplayed(), "Global Menu is not displayed");
	}
	
	public void clickSignInLink() {
		clickOnElement(signInLink, "Sign In link");
	}
}
