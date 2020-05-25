package com.amazon.framework.utilities;

import java.io.File;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import com.amazon.framework.base.DriverManager;
import io.cucumber.core.api.Scenario;

public class UtilityMethods {

	/**
	 * This method is used for getting name of child directory of specifieddirectory
	 * 
	 * @param path
	 *            - path of directory
	 * @return - child directory name
	 */
	public static String getChildDirectoryName(String path) {
		File file = new File(path);

		File[] files = file.listFiles();

		for (File f : files) {
			if (f.isDirectory()) {
				return f.getName();
			}
		}
		return null;
	}

	public static void takeScreenShot(Scenario scenario, String... screenShotName) {
		final byte[] screenshot = ((TakesScreenshot) DriverManager.getDriver()).getScreenshotAs(OutputType.BYTES);
		if (screenShotName.length > 0) {
			scenario.embed(screenshot, "image/png", screenShotName[0]);
		} else {
			scenario.embed(screenshot, "image/png", scenario.getName());
		}
	}

}
