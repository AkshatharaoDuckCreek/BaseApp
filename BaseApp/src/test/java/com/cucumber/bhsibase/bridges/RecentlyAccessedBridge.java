package com.cucumber.bhsibase.bridges;

import org.openqa.selenium.WebDriver;

import com.cucumber.bhsibase.party.pages.CreatePartyPage;
import com.cucumber.bhsibase.party.pages.RecentlyAccessedPage;
import com.cucumber.bhsibase.runner.TestRunner;


public class RecentlyAccessedBridge {

	//PartyBase partybase = new PartyBase();
	WebDriver driver;

	
	
	public RecentlyAccessedBridge(){
		
		driver = TestRunner.driver ; 
	}
	
	public void given() {
		RecentlyAccessedPage recentaccessedpage = new RecentlyAccessedPage(driver) ; 
		recentaccessedpage.visiblityUnderRecentlyAccessed() ; 
	}
	
	public void when(){
		RecentlyAccessedPage recentaccessedpage = new RecentlyAccessedPage(driver) ; 
		recentaccessedpage.clickOrganizedParty() ; 
	}

	public void then(){
		
		CreatePartyPage createpartypage = new CreatePartyPage(driver);
		createpartypage.validateParty();
	}
}
