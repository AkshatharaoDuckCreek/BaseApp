package com.cucumber.bhsibase.party.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.cucumber.bhsibase.bridges.CreatePartyBridge;
import com.cucumber.bhsibase.bridges.LoginBridge;
import com.cucumber.bhsibase.bridges.RecentlyAccessedBridge;
import com.cucumber.bhsibase.testbase.PartyBase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PartyTests extends PartyBase {

	@Given("^Enter the username and password$")
	public void enter_the_username_and_password() throws Throwable {
        geturl();
		LoginBridge login = new LoginBridge();
		login.Given();
	}

	@When("^I create a individual Party$")
	public void i_create_a_individual_Party_named() throws Throwable {
		CreatePartyBridge createParty = new CreatePartyBridge();
		createParty.When();

	}

	@Then("^the party should be created$")
	public void the_should_be_created() throws Throwable {

		CreatePartyBridge createParty = new CreatePartyBridge();
		createParty.Then();

	}

	/*@Given("^Business party has been created$")
	public void business_party_has_been_created() throws Throwable {
		geturl();
		LoginBridge login = new LoginBridge();
		login.Given();
	}*/

	@Given("^It visible under recently accessed section$")
	public void it_visible_under_recently_accessed_section() throws Throwable {
		geturl();
		LoginBridge login = new LoginBridge();
		login.Given();
		RecentlyAccessedBridge recentlyaccessed = new RecentlyAccessedBridge();
		recentlyaccessed.given();
	}

	@When("^I click Organization Party$")
	public void i_click_Organization_Party() throws Throwable {
		RecentlyAccessedBridge recentlyaccessed = new RecentlyAccessedBridge();
		recentlyaccessed.when();
	}

	@Then("^the party details should be displayed with party (\\d+) Involvement details$")
	public void the_party_details_should_be_displayed_with_party_Involvement_details(int arg1) throws Throwable {
		RecentlyAccessedBridge recentlyaccessed = new RecentlyAccessedBridge();
		recentlyaccessed.then();
	}
	@Given("^the business party has been created$")
	public void the_business_party_has_been_created() throws Throwable {
		geturl();
		loginenterdetails() ; 
	
	}

	@When("^I search and select Organization Party  by name$")
	public void i_search_and_select_Organization_Party_by_name() throws Throwable {
	
		searchParty() ; 
	}

	@Then("^the details should be displayed$")
	public void the_details_should_be_displayed() throws Throwable {
	    
	}

}
