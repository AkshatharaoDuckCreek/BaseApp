package com.cucumber.bhsibase.datareader;

import java.util.Properties;
import java.util.ResourceBundle;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public class ConfigReader {

	private static final String FILENAME = "com/cucumber/bhsibase/config/config";
	private static ResourceBundle resourceBundle = ResourceBundle.getBundle(FILENAME);

	public static String readurls(final String applicaton) {
		// Properties prop = new Properties();
		String url = null;
		if (resourceBundle != null) {
			url = resourceBundle.getString(applicaton);
		} else {
			//need to add logs 
		}

		return url;
	}

}
