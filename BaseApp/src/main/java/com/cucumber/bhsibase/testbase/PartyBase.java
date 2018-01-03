package com.cucumber.bhsibase.testbase;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

import com.cucumber.bhsibase.datareader.ConfigReader;
import com.cucumber.bhsibase.datareader.ReadXML;
import com.cucumber.bhsibase.screenshot.ScreenCapture;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class PartyBase {

	// public static WebDriver driver;

	PartyBase baseParty;

	ReadXML readxmlobj = new ReadXML();

	Utilities utilities;

	final static Logger logger = Logger.getLogger(PartyBase.class);

	// String url =
	// "https://pcdev03.accs54683.asw.accenture.com:8080/BASE_Express/default.aspx";
	String browser = "firefox";
	ConfigReader reader = new ConfigReader();

	public String xmlhelper(String value) {

		String readvalue = readxmlobj.readxml(value, "PartyData");
		return readvalue;
	}

	@FindBy(id = PartyElementConstants.PARTY_LOGIN_USERNAME)
	WebElement enterusername;

	@FindBy(id = "password")
	WebElement password;

	@FindBy(xpath = PartyElementConstants.PARTY_LOGIN_CLICKLOGIN)
	WebElement clicklogin;

	@FindBy(id = PartyElementConstants.PARTY_CLICK_PARTY)
	WebElement partytab;

	@FindBy(xpath = PartyElementConstants.PARTY_SEARCH_FOR_PERSON_OR_PLACE)
	WebElement partysearch;

	@FindBy(xpath = PartyElementConstants.PARTY_SEARCH_ORGANIZATION)
	@CacheLookup
	WebElement selectorg;

	@FindBy(xpath = PartyElementConstants.PARTY_SELECT_NAME_ADDRESS)
	WebElement searchby;

	@FindBy(xpath = PartyElementConstants.PARTY_SELECT_ORGNAME)
	WebElement orgname;

	@FindBy(xpath = PartyElementConstants.PARTY_SEARCH_FOR_PERSON_AND_PLACE)
	WebElement clicksearch;

	@FindBy(xpath = PartyElementConstants.PARTY_SELECT_STATE)
	WebElement selectstate;

	public PartyBase(WebDriver driver) {

		PageFactory.initElements(driver, this); // this refers current class
												// object

	}

	public PartyBase() {

	}

	public void loginenterdetails() {

		// TODO Auto-generated method stub
		// screencap = new ScreenCapture();

		ReadXML readxmlobj = new ReadXML();

		String readusername = readxmlobj.readxml("username", "PartyData");
		String readpassword = readxmlobj.readxml("password", "PartyData");

		enterusername.sendKeys(readusername);
		password.sendKeys(readpassword);
		// logger.info("entered username and password");

		// screencap.capturescreen("enteruserpwd");
		clicklogin.click();

		partytab.click();

	}

	public void searchParty() {
		baseParty = new PartyBase();
		utilities = new Utilities();
		// partysearch.click();

		By selectorg = By.xpath(PartyElementConstants.PARTY_SEARCH_ORGANIZATION);
		By searchname = By.xpath(PartyElementConstants.PARTY_SELECT_NAME_ADDRESS);
		By selectorgname = By.xpath(PartyElementConstants.PARTY_SELECT_ORGNAME);
		By selectstate = By.xpath(PartyElementConstants.PARTY_SELECT_STATE);
        By clicksearch = By.xpath(PartyElementConstants.PARTY_SEARCH_FOR_PERSON_AND_PLACE) ;             
		
		utilities.clickByString(PartyElementConstants.PARTY_SEARCH_FOR_PERSON_OR_PLACE);
		utilities.enterWhenReady(selectorg, baseParty.xmlhelper(PartyDataReader.PARTYINFO_SELECT_ORG));
		utilities.enterWhenReady(searchname, baseParty.xmlhelper(PartyDataReader.PARTYINFO_SEARCH_NAME_ADD));
		utilities.enterWhenReady(selectorgname, baseParty.xmlhelper(PartyDataReader.PARTYINFO_INPUT_ORGNAME));
		utilities.enterWhenReady(selectstate, baseParty.xmlhelper(PartyDataReader.PARTYINFO_SELECT_STATE));
		utilities.clickWhenReady(clicksearch);
		
	//	clicksearch.click();
	}
}
