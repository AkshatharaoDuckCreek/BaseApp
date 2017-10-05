package com.cucumber.bhsibase.party.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cucumber.bhsibase.datareader.ReadXML;
//import com.cucumber.bhsibase.datareader.ReadXML;
import com.cucumber.bhsibase.screenshot.ScreenCapture;
import com.cucumber.bhsibase.testbase.PartyBase;
import com.cucumber.bhsibase.testbase.PartyElementConstants;

public class LoginPage {
	ScreenCapture screencap;
	final static Logger logger = Logger.getLogger(LoginPage.class);
	private PartyBase baseParty ; 
	
	

	//WebDriver driver;
	@FindBy(id = PartyElementConstants.PARTY_LOGIN_USERNAME)
	WebElement enterusername;

	@FindBy(id = "password")
	WebElement password;

	@FindBy(xpath = PartyElementConstants.PARTY_LOGIN_CLICKLOGIN)
	WebElement clicklogin;

	@FindBy(id = "id_LogOut")
	WebElement clicklogout;

	public LoginPage(WebDriver driver) {

		PageFactory.initElements(driver, this); // this refers current class
												// object

	}

	public LoginPage() {
	}

	public void enterunamepwd() {
		// TODO Auto-generated method stub
		screencap = new ScreenCapture();

		ReadXML readxmlobj = new ReadXML();

		String readusername = readxmlobj.readxml("username", "PartyData");
		String readpassword = readxmlobj.readxml("password", "PartyData");

		enterusername.sendKeys(readusername);
		password.sendKeys(readpassword);
		logger.info("entered username and password");

		screencap.capturescreen("enteruserpwd");
		clicklogin.click();

	}

	public void validatelogin() {
		// TODO Auto-generated method stub
		clicklogout.click();
	}

}
