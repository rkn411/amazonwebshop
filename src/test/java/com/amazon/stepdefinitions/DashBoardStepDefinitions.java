package com.amazon.stepdefinitions;

import org.testng.Assert;

import com.amazon.pages.DashBoardPage;

import io.cucumber.java.en.Given;

public class DashBoardStepDefinitions {
	private DashBoardPage dashboardPage;
	
	public DashBoardStepDefinitions(DashBoardPage dashboardPage) {
		this.dashboardPage=dashboardPage;
	}

	@Given("User is on Dashboard Page")
	public void is_on_Dashboard_Page() {
		Assert.assertTrue(dashboardPage.isPageDisplayed(), "Dashboard Page is not displayed");
	}
}
