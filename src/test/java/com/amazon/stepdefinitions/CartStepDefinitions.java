package com.amazon.stepdefinitions;

import com.amazon.pages.CartPage;

import io.cucumber.java.en.Then;

public class CartStepDefinitions {
	private CartPage cartPage;
	
	public CartStepDefinitions(CartPage cartPage) {
		this.cartPage=cartPage;
	}
	@Then("user should verify product is added to cart or not with book {string}")
	public void user_should_verify_product_is_added_to_cart_or_not_with_book_and_author(String productName) {
		cartPage.verifyProductInCart(productName);
	}
}
