package com.amazon.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.amazon.framework.utilities.DriverWait;
import static com.amazon.framework.utilities.UIWrappers.*;
import com.amazon.framework.utilities.DriverWait.WaitTime;

public class GlobalMenuPage  extends BasePage {

	@FindBy(xpath = "//a[@id='nav-cart']")
	private WebElement cartIcon;
	
	@FindBy(id="nav-cart-count") private WebElement cartItemsCount;

	@FindBy(id = "twotabsearchtextbox")
	private WebElement searchTxtField;

	@FindBy(xpath = "//input[@class='nav-input' and @type='submit']")
	private WebElement searchIcon;

	@Override
	public boolean isPageDisplayed() {
		return DriverWait.isElementDisplayed(cartIcon, WaitTime.ONEMINUTE);
	}
	
	public void searchProduct(String productName) {
		inputText(searchTxtField, productName, "Search Input Field");
		clickOnElement(searchIcon, "Search Icon");
	}
	
	public void clickOnCartIcon() {
		clickOnElement(cartIcon,"cartIcon");
	}
	
	public int getCartItemsCount() {
		return Integer.parseInt(cartItemsCount.getText());
	}
	

}