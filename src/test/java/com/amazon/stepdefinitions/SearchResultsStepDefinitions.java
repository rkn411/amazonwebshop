package com.amazon.stepdefinitions;

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
		
		
	}
}
