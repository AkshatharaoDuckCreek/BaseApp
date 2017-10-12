package com.cucumber.bhsibase.bridges;

import org.openqa.selenium.WebDriver;

import com.cucumber.bhsibase.party.pages.LoginPage;
import com.cucumber.bhsibase.testbase.PartyBase;

public class SearchPartyBridge {
	
	PartyBase partybase = new PartyBase() ; 
	WebDriver driver  ; 
	
	public SearchPartyBridge(){
		
		driver = PartyBase.driver ; 
	}
	
public void When(){
		
	
	}
	

}
