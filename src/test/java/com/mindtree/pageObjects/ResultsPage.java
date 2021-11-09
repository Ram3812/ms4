package com.mindtree.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.mindtree.UIstore.ResultsPageUI;

public class ResultsPage extends ResultsPageUI {
	private WebDriver driver;

	public ResultsPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement getEle() {
		return driver.findElement(ele);
	}

}
