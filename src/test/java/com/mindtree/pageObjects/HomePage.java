package com.mindtree.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.mindtree.UIstore.HomePageUI;

public class HomePage extends HomePageUI {
	private WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement getshopProducts() {
		return driver.findElement(shopProducts);
	}
	
	public WebElement getsearchBar() {
		return driver.findElement(searchBar);
	}
	
	public WebElement getsearchICON() {
		return driver.findElement(searchICON);
	}

	public WebElement getPowder() {
		return driver.findElement(Powder);
	}

	public WebElement getLearnMore() {
		return driver.findElement(LearnMore);
	}
}
