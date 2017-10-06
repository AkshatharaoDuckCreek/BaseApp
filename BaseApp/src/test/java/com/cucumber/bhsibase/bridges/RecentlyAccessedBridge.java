package com.cucumber.bhsibase.bridges;

import org.openqa.selenium.WebDriver;

import com.cucumber.bhsibase.party.pages.CreatePartyPage;
import com.cucumber.bhsibase.party.pages.RecentlyAccessedPage;
import com.cucumber.bhsibase.testbase.PartyBase;

public class RecentlyAccessedBridge {

	PartyBase partybase = new PartyBase();
	WebDriver driver;

	
	
	public RecentlyAccessedBridge(){
		
		driver = partybase.driver ; 
	}
	RecentlyAccessedPage recentaccessedpage = new RecentlyAccessedPage(driver) ; 
	public void given() {
		
		recentaccessedpage.visiblityUnderRecentlyAccessed() ; 
	}
	
	public void when(){
		recentaccessedpage.clickOrganizedParty() ; 
	}

	public void then(){
		CreatePartyPage createpartypage = new CreatePartyPage(driver);
		createpartypage.validateParty();
	}
}
