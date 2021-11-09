package com.mindtree.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

import com.mindtree.reusablecomponent.WebDriverHelper;

public class OpenBrowser extends WebDriverHelper {
	protected Properties prop;
	private FileInputStream FIS;
	protected WebDriver Driver;

	public OpenBrowser() {
		prop = new Properties();
		try {
			FIS = new FileInputStream(".\\config.properties");
			prop.load(FIS);
		} catch (IOException e) {
			System.out.println("Properties File not found:  " + e.getLocalizedMessage());
		}
	}
}
