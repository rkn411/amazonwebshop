package com.amazon.framework.utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import java.util.LinkedList;
import java.util.Set;

import com.amazon.framework.base.DriverManager;

public class UtilityMethods {

	public enum SelectionType {
		INDEX, VALUE, TEXT;
	}

	/**
	 * This utility method is used to select options from drop down
	 * 
	 * @param dropDown
	 *            - Takes drop down web element
	 * @param option
	 *            - Option which has to be selected from drop down
	 * @param type
	 *            - Selection type (Index or Value or Text)
	 */
	public static Select selectOptionFromDropDown(WebElement dropDown, String option, SelectionType type) {
		Select s = new Select(dropDown);
		if (type.toString().equalsIgnoreCase("Index")) {
			s.selectByIndex(Integer.parseInt(option));
		} else if (type.toString().equalsIgnoreCase("Value")) {
			s.selectByValue(option);
		} else {
			s.selectByVisibleText(option);
		}
		return s;
	}

	/**
	 * This method is used get selected option from drop down
	 * 
	 * @param dropDown
	 * @return
	 */
	public static String getDropDownSelectedOption(WebElement dropDown) {
		Select s = new Select(dropDown);
		return s.getFirstSelectedOption().getText();
	}
	
	public static void switchToLatestWindow() {
		Set<String> windows=DriverManager.getDriver().getWindowHandles();
		DriverManager.getDriver().switchTo().window(new LinkedList<String>(windows).get(1));
	}

}
