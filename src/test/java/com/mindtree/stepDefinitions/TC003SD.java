package com.mindtree.stepDefinitions;

import org.apache.logging.log4j.Logger;
import org.junit.runner.RunWith;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import com.mindtree.pageObjects.HomePage;
import com.mindtree.pageObjects.LaundryPage;
import com.mindtree.utilities.Logging;
import com.mindtree.utilities.OpenBrowser;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import junit.framework.Assert;

@RunWith(Cucumber.class)
public class TC003SD extends OpenBrowser {
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

	@When("^user click on learn more$")
	public void user_click_on_learn_more() {
		HomePage Hp = new HomePage(Driver);
		JavascriptExecutor js = (JavascriptExecutor) Driver;
		js.executeScript("window.scrollBy(0,250)", "");
		Hp.getLearnMore().click();
		logger.info("Clicked on Learn More...");
	}

	@Then("^navigates to next page verify the text$")
	public void navigates_to_next_page_verify_the_text() throws Throwable {
		LaundryPage LP = new LaundryPage(Driver);
		Assert.assertEquals(LP.getEle().getText(), "How to Read Laundry Symbols");
		logger.info("Checked and verified the text");
	}

}