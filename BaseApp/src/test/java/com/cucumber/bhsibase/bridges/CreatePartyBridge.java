package com.cucumber.bhsibase.bridges;

import org.openqa.selenium.WebDriver;

import com.cucumber.bhsibase.party.pages.CreatePartyPage;
import com.cucumber.bhsibase.testbase.PartyBase;

public class CreatePartyBridge {

	PartyBase partybase = new PartyBase();
	WebDriver driver;

	public CreatePartyBridge() {

		driver = PartyBase.driver;
	}

	public void When() {
		// TODO Auto-generated method stub
		CreatePartyPage createpartypage = new CreatePartyPage(driver);

		createpartypage.addparty();

	}

	public void Then() {
		CreatePartyPage createpartypage = new CreatePartyPage(driver);

		createpartypage.validateParty();
		
		
	}

}
