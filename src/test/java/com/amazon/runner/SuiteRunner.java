package com.amazon.runner;


import com.amazon.framework.base.CucumberFeatureManager;

import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		dryRun = false,
		monochrome=true,
		strict = false,
		features = "src/test/resources/features",
		glue = {"com.amazon.stepdefinitions"},
		tags = {"@SearchProduct,@SearchProduct"},
		plugin = {"html:reports/cucumber-reports/cucumber-pretty",
				"json:reports/cucumber-reports/cucumber-html-report.json",
				"usage:reports/cucumber-reports/cucumber-usage.json",
				"rerun:reports/cucumber-reports/failedscenarios.txt" })

public class SuiteRunner extends CucumberFeatureManager{

}
