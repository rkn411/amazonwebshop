package com.amazon.stepdefinitions;

import com.amazon.pages.GlobalMenuPage;

import io.cucumber.java.en.When;

public class GlobalMenuStepDefinitions {
	private GlobalMenuPage globalMenu;
	
	public GlobalMenuStepDefinitions(GlobalMenuPage globalMenu) {
		this.globalMenu=globalMenu;
	}
	
	@When("User enter prodcut name {string} in search field and click on search icon")
	public void user_enter_prodcut_name_in_search_field(String productName) {
		globalMenu.searchProduct(productName);
	}
}