package com.mindtree.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.mindtree.UIstore.ProductsPageUI;

public class ProductsPage extends ProductsPageUI {
	private WebDriver driver;

	public ProductsPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement getList() {
		return driver.findElement(list);
	}

	public String getTitle() {
		return driver.getTitle();
	}
}
