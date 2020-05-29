package com.amazon.pages;

import static com.amazon.framework.utilities.UIWrappers.clickOnElement;
import static com.amazon.framework.utilities.UIWrappers.inputText;
import java.util.List;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import com.amazon.framework.utilities.DriverWait;
import com.amazon.framework.utilities.DriverWait.WaitTime;
import com.amazon.framework.utilities.UtilityMethods;
import com.amazon.framework.utilities.UtilityMethods.SelectionType;

public class CartPage extends GlobalMenuPage {
	public CartPage() {
		logger = Logger.getLogger(CartPage.class);
	}

	private String cartItemRootNode(String cartItemName) {
		return "//div[@class='sc-list-item-content' and .//*[contains(text(),'" + cartItemName + "')]]";
	}

	public By product(String productName, String... author) {
		return By.xpath("//div[@class='sc-list-item-content' and .//*[contains(text(),'" + productName + "')]]");
	}

	private String subtotalPrice = ".//*[@id='sc-subtotal-amount-buybox']/span";

	private String productPrice = ".//span[contains(@class,'sc-product-price')]";

	@FindBy(xpath = "//a[@id='hlb-view-cart-announce']")
	private WebElement viewCartButton;

	@FindBy(xpath = "//input[@type='submit' and @value='Delete']")
	private List<WebElement> productDeleteButton;

	@FindBy(xpath = "//input[@name='quantityBox']")
	private WebElement quantityField;

	@FindBy(xpath = "//a[@id='a-autoid-0-announce']")
	private WebElement updateButton;

	@FindBy(xpath = "//span[@class='a-price-whole'][3]")
	private WebElement totalPrice;

	private By deleteLink(String cartItemName) {
		return By.xpath(cartItemRootNode(cartItemName) + "//input[@value='Delete']");
	}

	@FindBy(xpath = "//input[@name='quantityBox']")
	private WebElement quantityBoxField;

	@FindBy(xpath = ".//*[@name='quantity']")
	private WebElement quantityDropdown;

	@Override
	public boolean isPageDisplayed() {
		return DriverWait.isElementDisplayed(quantityField, WaitTime.ONEMINUTE);
	}

	/**
	 * method to verify product in cart
	 * 
	 * @param productName
	 */
	public void verifyProductInCart(String productName) {
		Assert.assertTrue(DriverWait.isElementDisplayed(product(productName), WaitTime.ONEMINUTE),
				"Product with name " + productName + " does not exist in cart");
	}

	/**
	 * method to enter quantity
	 * 
	 * @param no
	 */
	public void enterquantity(String no) {
		inputText(quantityField, no, "quantity Field");
		logger.info("quantity entered as :" + no);
	}

	/**
	 * method to click cart button on cart view
	 */
	public void clickViewCartButton() {
		clickOnElement(viewCartButton, "viewCartButton");
	}

	/**
	 * method to click on update button
	 */

	public void clickUpdate() {
		clickOnElement(updateButton, "update button");
		logger.info("Clicked on update button");
	}

	/**
	 * method to delete item from cart
	 * 
	 * @param itemName
	 */

	public void deleteItemFromCart(String itemName) {
		clickOnElement(deleteLink(itemName), "Delete");
		logger.info("Clicked on delete button for item:" + itemName);
	}

	/**
	 * method to select quantity
	 * 
	 * @param quantity
	 */

	public void selectQuantity(String quantity) {
		UtilityMethods.selectOptionFromDropDown(quantityDropdown, quantity, SelectionType.VALUE);
		logger.info("dropdown value selected quantity as :" + quantity);
		DriverWait.customSleep(1);
		String selectedDropdownValue = UtilityMethods.getDropDownSelectedOption(quantityDropdown);
		// Assert.assertTrue(selectedDropdownValue.equals(quantity), "Unable to select /
		// update the quantity from dropdown");
	}

	/**
	 * method to verify cart quantity
	 * 
	 * @param quanity
	 */
	public void verifyCartQuantity(String quanity) {
		DriverWait.customSleep(2);
		int afterCartUpdateCount = getCartItemsCount();
		logger.info("Updated cart quantity entered as :" + afterCartUpdateCount);
		Assert.assertTrue(afterCartUpdateCount == Integer.parseInt(quanity),
				"Cart Items quantity is not updating when updating cart quantity");
	}

	/**
	 * method to verify cart total price
	 * 
	 * @param quanity
	 */
	public void verifyCartTotalPrice(String quanity) {
		double actualTotalCartValue = Double.parseDouble(
				DriverWait.waitForPresenceOfElement(subtotalPrice, "sub total Price", WaitTime.TWENTYSECONDS).getText()
						.replaceAll("[\\₹\\,]", "").trim().split("\\n")[0]);
		logger.info("Total price actual cart :" + actualTotalCartValue);
		double expectedTotalCartValue = Double
				.parseDouble(DriverWait.waitForPresenceOfElement(productPrice, "product Price", WaitTime.TWENTYSECONDS)
						.getText().replaceAll("[\\₹\\,]", "").split("\\n")[0])
				* Integer.parseInt(quanity);
		logger.info("Total price Expected cart :" + expectedTotalCartValue);
		Assert.assertTrue(expectedTotalCartValue == actualTotalCartValue,
				"cart total price value is not updated for selected product quantity");
	}
}
