package com.mindtree.UIstore;

import org.openqa.selenium.By;

public class HomePageUI {
	protected static By shopProducts = By.xpath("//a[@href='/en-us/shop']");
	protected static By Powder = By.xpath("//a[contains(text(),'Powder')]");
	protected static By searchBar = By.xpath("//input[@type='search']");
	protected static By searchICON = By.xpath("//button[@type='submit']");
	protected static By LearnMore = By.xpath("//a[contains(href,'how-to-do-laundry')]");
}