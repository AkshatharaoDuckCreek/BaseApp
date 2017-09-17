package com.cucumber.bhsibase.datareader;

import java.util.Properties;
import java.util.ResourceBundle;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties ; 

public class ConfigReader {
	 public String readurls(String applicaton) throws IOException {

			Properties prop = new Properties();
			InputStream input = null;
			String url = "" ; 

		

				//input = new FileInputStream("com/cucumber/bhsibase/config/config.properties");

				// load a properties file
			//	prop.load(input);
				final String FILENAME = "com/cucumber/bhsibase/config/config";
				
				ResourceBundle s=ResourceBundle.getBundle(FILENAME);
		        s.getString(applicaton);
				
				if(applicaton=="ExpressURL"){
					System.out.println("application:::::::::"+applicaton);
				 url = prop.getProperty("ExpressURL");
				 System.out.println("url::::::::::::::::::::::"+url);
				
				}
				 return url ; 
			} 
			
		
	
		}
	

