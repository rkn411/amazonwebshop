package com.amazon.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import com.amazon.framework.utilities.DriverWait;
import com.amazon.framework.utilities.DriverWait.WaitTime;
import static com.amazon.framework.utilities.UIWrappers.*;

public class LoginPage extends BasePage {
	public LoginPage() {
		logger = Logger.getLogger(LoginPage.class);
	}

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
	/**
	 * method to login into application
	 * @param userName
	 * @param password
	 */
	
	public void loginApplication(String userName,String password) {
		inputText(emailTxtField, userName, "Email");
		logger.info("Entered Email as your id");
		clickOnElement(continueBtn, "Continue");
		inputText(passwordTxtField, password, "Password");
		logger.info("Entered Pwd as your pwd");
		clickOnElement(loginBtn, "Login Button");
		Assert.assertTrue(new DashBoardPage().isPageDisplayed(), "Unble to login application");
		Assert.assertTrue(new GlobalMenuPage().isPageDisplayed(), "Global Menu is not displayed");
	}
	/**
	 * method to click on signIn link
	 */
	
	public void clickSignInLink() {
		clickOnElement(signInLink, "Sign In link");
	}
}
