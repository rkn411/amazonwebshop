package com.amazon.stepdefinitions;

import org.testng.Assert;

import com.amazon.pages.ProductSearchResultsView;

import io.cucumber.java.en.Then;

public class SearchResultsStepDefinitions {
	@SuppressWarnings("unused")
	private ProductSearchResultsView searchResult;
	
	public SearchResultsStepDefinitions(ProductSearchResultsView searchResult) {
		this.searchResult=searchResult;
	}
	
	@Then("Application should display list of products matched with search content")
	public void application_should_display_list_of_products_matched_with_search_content() {
		Assert.assertTrue(searchResult.getCountOfProducts()>0, "There is no products matched with search content");
	}
	
	@Then("User should select product {string} with author {string} from displayed products")
	public void user_should_select_product_with_author_from_displayed_products(String productName, String authorName) {
		searchResult.clickProductInSearchResult(productName, authorName);
	}
	@Then("User should select product {string} from displayed products")
	public void user_should_select_product_from_displayed_products(String productName) {
		searchResult.clickProductInSearchResult(productName);
	}
}
