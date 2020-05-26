package com.amazon.stepdefinitions;

import org.testng.Assert;

import com.amazon.pages.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class LoginStepDefinitions {
	private LoginPage loginPage;
	
	public LoginStepDefinitions(LoginPage loginPage) {
		this.loginPage=loginPage;
	}

	@Given("User is on login page")
	public void user_is_on_login_page() {
		loginPage.clickSignInLink();
		Assert.assertTrue(loginPage.isPageDisplayed(), "Login page is not displayed");
	}
	
	@When("User login with valid credentials {string} and {string}")
	public void user_login_with_valid_credentials_and(String userName, String password) {
		loginPage.loginApplication(userName, password);
	}
}
