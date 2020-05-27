package com.amazon.pages;

import static com.amazon.framework.utilities.UIWrappers.clickOnElement;
import static com.amazon.framework.utilities.UIWrappers.inputText;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import com.amazon.framework.utilities.DriverWait;
import com.amazon.framework.utilities.DriverWait.WaitTime;


public class CartPage extends GlobalMenuPage {

	private By product(String productName, String... author) {
		return By.xpath("//div[@class='sc-list-item-content' and .//*[contains(text(),'" + productName + "')]]");
	}

	@FindBy(xpath = "//input[@name='quantityBox']")
	private WebElement quantityField;

	@FindBy(xpath = "//a[@id='a-autoid-0-announce']")
	private WebElement updateButton;

	@FindBy(xpath = "//span[@class='a-price-whole'][3]")
	private WebElement totalPrice;

	@Override
	public boolean isPageDisplayed() {
		return DriverWait.isElementDisplayed(quantityField, WaitTime.ONEMINUTE);
	}

	public void verifyProductInCart(String productName) {
		Assert.assertTrue(DriverWait.isElementDisplayed(product(productName), WaitTime.ONEMINUTE),
				"Product with name " + productName + " does not exist in cart");
	}

	public void enterquantity(String no) {
		inputText(quantityField, no, "quantity Field");
	}

	public void clickUpdate() {
		clickOnElement(updateButton, "update button");

	}
}
