package com.amazon.framework.base;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.amazon.framework.support.io.PropertiesFile;
import io.cucumber.testng.CucumberFeatureWrapper;
import io.cucumber.testng.PickleEventWrapper;
import io.cucumber.testng.TestNGCucumberRunner;
import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;
import net.masterthought.cucumber.presentation.PresentationMode;
import net.masterthought.cucumber.sorting.SortingMethod;

/**
 * Base for cucumber runner Picks up all options which are mentioned in cucumber
 * runner file and run scenarios based on tag notations given in runner file
 * Customize cucumber report after completion of execution
 *
 */
public class CucumberFeatureManager extends DriverManager {
	private TestNGCucumberRunner testNGCucumberRunner;

	@BeforeClass
	public void setUpClass() {
		testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
	}

	@Test(groups = "cucumber", description = "Runs Cucumber Scenarios", dataProvider = "scenarios")
	public void runScenario(PickleEventWrapper pickleWrapper, CucumberFeatureWrapper featureWrapper) throws Throwable {
		testNGCucumberRunner.runScenario(pickleWrapper.getPickleEvent());
	}

	@DataProvider
	public Object[][] scenarios() {
		return testNGCucumberRunner.provideScenarios();
	}

	@AfterClass
	public void tearDownClass() {
		testNGCucumberRunner.finish();
		File reportOutputDirectory = new File("reports/cucumber-reports");
		List<String> jsonFiles = new ArrayList<String>();
		jsonFiles.add("reports/cucumber-reports/cucumber-html-report.json");
		String path = System.getProperty("user.dir") + "/src/main/java/com/amazon";
		PropertiesFile propFile = new PropertiesFile(path + "/config/reportconfig.properties");
		String buildNumber = propFile.getProperty("BuildNumber");
		String projectName = "AmazonWebShop";
		Configuration configuration = new Configuration(reportOutputDirectory, projectName);
		configuration.setBuildNumber(buildNumber);
		configuration.addClassifications("Execution", propFile.getProperty("Execution"));
		//configuration.addClassifications("OS", propFile.getProperty("OS"));
		configuration.setSortingMethod(SortingMethod.NATURAL);
		configuration.addPresentationModes(PresentationMode.EXPAND_ALL_STEPS);
		configuration.setTrendsStatsFile(new File("target/test-classes/featurebuildtrends.json"));
		ReportBuilder reportBuilder = new ReportBuilder(jsonFiles, configuration);
		reportBuilder.generateReports();
	}
}
