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

public class LoginPage {
	ScreenCapture screencap;
	final static Logger logger = Logger.getLogger(LoginPage.class);
	
	

	WebDriver driver;
	@FindBy(id = "username")
	WebElement enterusername;

	@FindBy(id = "password")
	WebElement password;

	@FindBy(xpath = ".//*[@id='home']/a")
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

	String readusername = readxmlobj.readxml("username","PartyData");
	String readpassword = readxmlobj.readxml("password","PartyData");

		enterusername.sendKeys(readusername);
		password.sendKeys(readpassword);
		logger.info("entered username and password");
		
		screencap.capturescreen("enteruserpwd");

	}

	public void clicklogin() {
		// TODO Auto-generated method stub

		clicklogin.click();

	}

	public void validatelogin() {
		// TODO Auto-generated method stub
		clicklogout.click();
	}

}
