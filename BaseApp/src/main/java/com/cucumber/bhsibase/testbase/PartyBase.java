package com.cucumber.bhsibase.testbase;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.cucumber.bhsibase.datareader.ConfigReader;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class PartyBase {

	public static WebDriver driver;

	final static Logger logger = Logger.getLogger(PartyBase.class);

	String url = "https://pcdev03.accs54683.asw.accenture.com:8080/BASE_Express/default.aspx";
	String browser = "firefox";
	ConfigReader reader = new ConfigReader();

	public void geturl() throws Exception {

		logger.info("Entering the execute message");

		driver = new FirefoxDriver();
		logger.info("Mozzilla Browser opens");

		driver.get(reader.readurls("ExpressURL"));
		logger.info("Navigate to express");

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	}

}
