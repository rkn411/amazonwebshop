package com.amazon.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.amazon.framework.utilities.DriverWait;
import com.amazon.framework.utilities.DriverWait.WaitTime;

public class DashBoardPage extends GlobalMenuPage{
	
	public DashBoardPage() {
		logger = Logger.getLogger(DashBoardPage.class);
	}


	@FindBy(xpath="//div[@id='pageContent']//div[contains(@class,'carousel-center')]")
	private WebElement dashboardPage;
	
	@FindBy(id="twotabsearchtextbox")
	private WebElement searchBox;
	
	@FindBy(xpath="//input[@class='nav-input']")
	private WebElement searchButton;
	
	@Override
	public boolean isPageDisplayed() {
		return DriverWait.isElementDisplayed(dashboardPage, WaitTime.ONEMINUTE);
	}

}
