package com.amazon.pages;

import org.openqa.selenium.support.PageFactory;

import com.amazon.framework.base.DriverManager;

public abstract class BasePage {
	
	public BasePage(){
		PageFactory.initElements(DriverManager.getDriver(), this);;
	}
	
	public abstract boolean isPageDisplayed();
}
