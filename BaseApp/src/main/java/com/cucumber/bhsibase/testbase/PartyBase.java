package com.cucumber.bhsibase.testbase;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.cucumber.bhsibase.datareader.ConfigReader;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class PartyBase {

	public static WebDriver driver;
	String url = "https://pcdev03.accs54683.asw.accenture.com:8080/BASE_Express/default.aspx";
	String browser = "firefox";
	ConfigReader reader = new ConfigReader();

	public void geturl() throws Exception {

		driver = new FirefoxDriver();

		driver.get(reader.readurls("ExpressURL"));
		String log4jConfPath = "log4j.properties" ; 

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	}

}
