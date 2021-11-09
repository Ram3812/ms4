package com.mindtree.utilities;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Logging {
//	static {
//		Properties prop = new Properties();
//		FileInputStream FIS;
//		try {
//			FIS = new FileInputStream(".\\src\\test\\resources\\log4j2.properties");
//			prop.load(FIS);
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//
//		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy-hh-mm-ss");
//		prop.setProperty("currentTime", dateFormat.format(new Date()));
//	}

	public Logger logger;

	public Logging(Object obj) {
		logger = LogManager.getLogger(obj.getClass());
	}

	public Logger CreateLogger() {
		return logger;
	}
}