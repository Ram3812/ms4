package com.mindtree.stepDefinitions;

import org.apache.logging.log4j.Logger;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import com.mindtree.pageObjects.HomePage;
import com.mindtree.pageObjects.ProductsPage;
import com.mindtree.utilities.Logging;
import com.mindtree.utilities.OpenBrowser;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import junit.framework.Assert;

@RunWith(Cucumber.class)
public class TC001SD extends OpenBrowser {
	public WebDriver Driver;
	private Logging loghelper = new Logging(this);
	private Logger logger = loghelper.CreateLogger();

	@Given("^user on \"([^\"]*)\"$")
	public void user_on_something(String url) {
		Driver = initialiseDriver(prop);
		logger.info("Driver initialized...");
		Driver.get(url);
		Driver.manage().window().maximize();
	}

	@When("^Hover on shop products$")
	public void hover_on_shop_products() {
		HomePage HP = new HomePage(Driver);
		Actions action = new Actions(Driver);
		action.moveToElement(HP.getshopProducts()).perform();
		logger.info("Hovered on Shop Products");
	}

	@SuppressWarnings("deprecation")
	@Then("^navigates to products page$")
	public void navigates_to_products_page() {
		ProductsPage PP = new ProductsPage(Driver);
		Assert.assertEquals(PP.getTitle(), "Shop or Buy Laundry Powder | Laundry Products - Tide");
		logger.info("Checked the products page");
	}

	@And("^click on powder$")
	public void click_on_powder() {
		HomePage HP = new HomePage(Driver);
		HP.getPowder().click();
	}

	@SuppressWarnings("deprecation")
	@And("^verify the product present$")
	public void verify_the_product_present() throws Throwable {
		ProductsPage PP = new ProductsPage(Driver);
		Assert.assertEquals(PP.getList().getText(), "Tide Free and Gentle powder");
		logger.info("Checked the required name");
	}

}