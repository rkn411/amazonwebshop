package com.amazon.stepdefinitions;

import com.amazon.framework.base.DriverManager;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	private DriverManager manager;
	
	@Before
	public void beforeScenario(Scenario scenario) {
		manager=new DriverManager();
		manager.launchApplication();
	}
	
	@After
	public void afterScenario() {
		manager.closeDriver();
	}
}
