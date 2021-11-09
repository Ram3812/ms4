package com.mindtree.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.mindtree.UIstore.LaundryPageUI;

public class LaundryPage extends LaundryPageUI {
	
	private WebDriver driver;

	public LaundryPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement getEle() {
		return driver.findElement(ele);
	}
}
