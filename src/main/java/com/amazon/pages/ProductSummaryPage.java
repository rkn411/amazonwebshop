package com.amazon.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import com.amazon.framework.utilities.DriverWait;
import com.amazon.framework.utilities.DriverWait.WaitTime;
import com.amazon.framework.utilities.UIWrappers;

public class ProductSummaryPage extends GlobalMenuPage{
	public ProductSummaryPage() {
		logger = Logger.getLogger(ProductSummaryPage.class);
	}

	@FindBy(id="add-to-cart-button") private WebElement addToCartBtn;
	
	@Override
	public boolean isPageDisplayed() {
		return DriverWait.isElementDisplayed(addToCartBtn, WaitTime.ONEMINUTE);
	}
	
	public void clickAddToCartBtn() {
		int beforeCount=getCartItemsCount();
		logger.info("cart items before count is :"+beforeCount );
		UIWrappers.clickOnElement(addToCartBtn, "Add to Cart");
		DriverWait.customSleep(2);
		int afterCount=getCartItemsCount();
		logger.info("cart items after count is :"+afterCount );
		Assert.assertTrue(afterCount>beforeCount, "Cart Items Count is not updating when product is added to cart");
	}
}
