package com.amazon.pages;

import org.openqa.selenium.support.FindBy;
import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.amazon.framework.utilities.UIWrappers;
import com.amazon.framework.utilities.UtilityMethods;

public class ProductSearchResultsView extends GlobalMenuPage{
	public ProductSearchResultsView() {
		logger = Logger.getLogger(ProductSearchResultsView.class);
	}
	
	private static final String searchResultsRootNode="//div[@data-component-type='s-search-result']";
	
	@FindBy(xpath=searchResultsRootNode) private List<WebElement> searchResults;
	
	private By productName(String productName) {
		return By.xpath("//a[./span[text()='"+productName+"']]");
	}
	
	private By productWithAuthor(String productName,String author) {
		return By.xpath("//a[contains(text(),'"+author+"')]/../..//a[./span[text()='"+productName+"']]");
	}
	
	public int getCountOfProducts() {
		return searchResults.size();
	}
	
	public void clickProductInSearchResult(String productName,String... authorName) {
		if(authorName.length>0) {
			UIWrappers.clickOnElement(productWithAuthor(productName,authorName[0]),"Product");
			logger.info("Clicked on product with author name as:"+productName);
		}else {
			UIWrappers.clickOnElement(productName(productName),"Product");
		}
		UtilityMethods.switchToLatestWindow();
		logger.info("Switched to latest window");
		Assert.assertTrue(new ProductSummaryPage().isPageDisplayed(), "Product Summary Page is not displayed");
	}
}