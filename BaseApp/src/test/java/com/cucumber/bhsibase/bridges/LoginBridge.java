package com.cucumber.bhsibase.bridges;

import org.openqa.selenium.WebDriver;

import com.cucumber.bhsibase.party.pages.LoginPage;
import com.cucumber.bhsibase.testbase.PartyBase;

public class LoginBridge  {
	PartyBase partybase = new PartyBase() ; 
	WebDriver driver  ; 
	
	public LoginBridge(){
		
		driver = PartyBase.driver ; 
	}
	

	public void Given(){
		
		LoginPage login = new LoginPage(driver) ; 
		login.enterunamepwd() ; 
		
	}
	
	public void When(){
		
		LoginPage login = new LoginPage(driver) ; 
		login.clicklogin() ; 
	}
	
	public void Then(){
		
		LoginPage login = new LoginPage(driver) ; 
		login.validatelogin() ; 
		
		
	}

}
