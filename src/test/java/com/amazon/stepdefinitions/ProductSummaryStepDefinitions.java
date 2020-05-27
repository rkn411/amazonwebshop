package com.amazon.stepdefinitions;

import com.amazon.pages.ProductSummaryPage;

import io.cucumber.java.en.Then;

public class ProductSummaryStepDefinitions {
	
	private ProductSummaryPage summaryPage;
	
	public ProductSummaryStepDefinitions(ProductSummaryPage summaryPage) {
		this.summaryPage=summaryPage;
	}
	
	@Then("User add product to the cart by cliking on on add to cart button")
	public void user_add_product_to_the_cart_by_cliking_on_on_add_to_cart_button() {
		summaryPage.clickAddToCartBtn();
	}
}
