package com.amazon.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.amazon.framework.utilities.DriverWait;
import static com.amazon.framework.utilities.UIWrappers.*;
import com.amazon.framework.utilities.DriverWait.WaitTime;

public class GlobalMenuPage  extends BasePage {
	
	public GlobalMenuPage() {
		logger = Logger.getLogger(GlobalMenuPage.class);
	}

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
	/**
	 * method to search product with name
	 * @param productName
	 */
	public void searchProduct(String productName) {
		inputText(searchTxtField, productName, "Search Input Field");
		logger.info("Searched movie name as " +productName);
		clickOnElement(searchIcon, "Search Icon");
	}
	/**
	 * method to click on menu cart button
	 */
	public void clickOnCartIcon() {
		clickOnElement(cartIcon,"cartIcon");
		logger.info("Clicked on cart button");
	}
	
	/**
	 * method to getCartItems Count
	 * @return
	 */
	public int getCartItemsCount() {
		return Integer.parseInt(cartItemsCount.getText());
	}
	

}