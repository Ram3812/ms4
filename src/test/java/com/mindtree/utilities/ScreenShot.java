package com.mindtree.utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.mindtree.reusablecomponent.WebDriverHelper;

public class ScreenShot {
	private WebDriver Driver;

	public void getScreenShot(String file) {
		Driver = WebDriverHelper.getDriver();
		String filePath = ".\\SS\\" + file + CurrentTime.getTimestamp() + ".png";
		TakesScreenshot ScrnShot = (TakesScreenshot) Driver;
		File SrcFile = ScrnShot.getScreenshotAs(OutputType.FILE);
		File DestFile = new File(filePath);
		try {
			FileUtils.copyFile(SrcFile, DestFile);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
