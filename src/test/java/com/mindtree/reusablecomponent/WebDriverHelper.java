package com.mindtree.reusablecomponent;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverHelper {

	protected static WebDriver Driver;

	public WebDriver initialiseDriver(Properties prop) {
		String browser = prop.getProperty("browser");
		String driverName = "";
		if (browser.equalsIgnoreCase("firefox")) {
			driverName = ".\\BrowserDrivers\\geckodriver.exe";
			System.setProperty("webdriver.gecko.driver", driverName);
			Driver = new FirefoxDriver();
		} else if (browser.equalsIgnoreCase("edge")) {
			driverName = ".\\BrowserDrivers\\msedgedriver.exe";
			System.setProperty("webdriver.edge.driver", driverName);
			Driver = new EdgeDriver();
		} else {
			driverName = ".\\BrowserDrivers\\chromedriver.exe";
			System.setProperty("webdriver.chrome.driver", driverName);
			Driver = new ChromeDriver();
		}
		Driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		return Driver;
	}

	public static WebDriver getDriver() {
		return Driver;
	}

}
