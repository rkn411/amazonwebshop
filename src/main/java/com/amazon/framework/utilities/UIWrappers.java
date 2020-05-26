package com.amazon.framework.utilities;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import com.amazon.framework.base.DriverManager;

public class UIWrappers {
	/**
	 * method to click on element
	 * 
	 * @param WebElement
	 *            -element
	 * @param fieldName
	 * @throws Exception 
	 */
	public static void clickOnElement(WebElement element, String fieldName){
		try {
			element.click();
		} catch (NoSuchElementException e) {
			Logger.getLogger(UtilityMethods.class).error(e);
			Assert.assertTrue(false, fieldName + ":Element not found");
		}
	}

	/**
	 * method to click on elment
	 * 
	 * @param By-
	 *            element
	 * @param fieldName
	 */
	public static void clickOnElement(By element, String fieldName) {
		try {
			DriverManager.getDriver().findElement(element).click();
		} catch (NoSuchElementException e) {
			Logger.getLogger(UtilityMethods.class).error(e);
			Assert.assertTrue(false, fieldName + ":Element not found");
		}
	}

	/**
	 * method to enter text in the field
	 * 
	 * @param element
	 * @param textToEnter
	 * @param fieldName
	 */
	public static void inputText(WebElement element, String textToEnter, String fieldName) {
		try {
			element.sendKeys(textToEnter);
		} catch (NoSuchElementException e) {
			Logger.getLogger(UtilityMethods.class).error(e);
			Assert.assertTrue(false, fieldName + ":unable to enter text");
		}
	}

	/**
	 * method to enter text in the field
	 * 
	 * @param element
	 * @param textToEnter
	 * @param fieldName
	 */
	public static void inputText(By element, String textToEnter, String fieldName) {
		try {
			DriverManager.getDriver().findElement(element).sendKeys(textToEnter);
		} catch (NoSuchElementException e) {
			Logger.getLogger(UtilityMethods.class).error(e);
			Assert.assertTrue(false, fieldName + ":unable to enter text");
		}
	}
}
