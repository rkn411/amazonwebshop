package com.amazon.pages;

import static com.amazon.framework.utilities.UIWrappers.clickOnElement;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.amazon.framework.utilities.DriverWait;
import com.amazon.framework.utilities.DriverWait.WaitTime;

public class CartPage extends BasePage {

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
	
	
	
	public void clickSignInLink() {
		clickOnElement(signInLink, "Sign In link");
	}
}
