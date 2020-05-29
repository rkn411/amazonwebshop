package com.amazon.stepdefinitions;

import org.testng.Assert;

import com.amazon.framework.utilities.DriverWait;
import com.amazon.framework.utilities.DriverWait.WaitTime;
import com.amazon.pages.CartPage;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class CartStepDefinitions {
	private CartPage cartPage;

	public CartStepDefinitions(CartPage cartPage) {
		this.cartPage = cartPage;
	}

	@Then("User should see added product {string} in shopping cart list")
	public void user_should_verify_product_is_added_to_cart_or_not_with_book_and_author(String productName) {
		cartPage.verifyProductInCart(productName);
	}

	@Then("User should update product quantity {string} in cart page")
	public void user_should_update_product_quantity_cart(String quantity) {
		cartPage.selectQuantity(quantity);
	}

	@Then("User should verify product quantity {string} is updated in cart")
	public void user_should_verify_product_quantity_is_updated_in_cart(String quantity) {
		cartPage.verifyCartQuantity(quantity);
	}

	@Then("User should verify cart total price value is updated or not for selected product quantity {string}")
	public void user_should_verify_cart_total_price_value_is_updated_or_not_for_selected_product_quantity(
			String quantity) {
		cartPage.verifyCartTotalPrice(quantity);
	}

	@When("User delete product {string} from the shopping cart")
	public void user_delete_product_from_the_shopping_cart(String itemName) {
		cartPage.deleteItemFromCart(itemName);
	}

	@Then("User should not see deleted product {string} from shopping cart")
	public void user_should_not_see_deleted_product_from_shopping_cart(String itemName) {
		Assert.assertFalse(DriverWait.isElementDisplayed(cartPage.product(itemName), WaitTime.TENSECONDS),
				"Unable to delete item from cart");
	}
}
