package com.cucumber.bhsibase.party.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import com.cucumber.bhsibase.testbase.PartyElementConstants;

public class CreatePartyPage {
	
	@FindBy(id= PartyElementConstants.PARTY_CLICK_PARTY)
	@CacheLookup 
    WebElement text ; 
	
	public void addparty(){		
		
		
	}
	

}
