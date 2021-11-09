package com.mindtree.stepDefinitions;

import org.apache.logging.log4j.Logger;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.mindtree.pageObjects.HomePage;
import com.mindtree.pageObjects.ResultsPage;
import com.mindtree.utilities.Logging;
import com.mindtree.utilities.OpenBrowser;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import junit.framework.Assert;

@RunWith(Cucumber.class)
public class TC002SD extends OpenBrowser {
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

	@When("^user searches for \"([^\"]*)\"$")
	public void user_searches_for_something(String key) {
		HomePage Hp = new HomePage(Driver);
		Hp.getsearchBar().sendKeys(key);
		Hp.getsearchICON().click();
		logger.info("Searched for Antibacterial");
	}

	@SuppressWarnings("deprecation")
	@Then("^user navigates to result page validate the text$")
	public void user_navigates_to_result_page_validate_the_text() {
		ResultsPage RP = new ResultsPage(Driver);
		Assert.assertEquals(RP.getEle().getText(), "Antibacterial");
		logger.info("Verified Antibacterial...");
	}

}