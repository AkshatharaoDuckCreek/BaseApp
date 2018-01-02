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
	public void enter_the_username_and_password() {
		// geturl();

		try {
			LoginBridge login = new LoginBridge();
	login.Given();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@When("^I create a individual Party$")
	public void i_create_a_individual_Party_named() throws Throwable {

		try {
			CreatePartyBridge createParty = new CreatePartyBridge();
			createParty.When();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Then("^the party should be created$")
	public void the_should_be_created() throws Throwable {
		try {
			CreatePartyBridge createParty = new CreatePartyBridge();
			createParty.Then();
		} catch (Exception e) {

			e.printStackTrace();
		}
	}

	/*
	 * @Given("^Business party has been created$") public void
	 * business_party_has_been_created() throws Throwable { geturl();
	 * LoginBridge login = new LoginBridge(); login.Given(); }
	 */

	@Given("^It visible under recently accessed section$")
	public void it_visible_under_recently_accessed_section() throws Throwable {
		// geturl();
		// LoginBridge login = new LoginBridge();
		// login.Given();
		try {
			RecentlyAccessedBridge recentlyaccessed = new RecentlyAccessedBridge();
			recentlyaccessed.given();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@When("^I click Organization Party$")
	public void i_click_Organization_Party() throws Throwable {

		try {
			RecentlyAccessedBridge recentlyaccessed = new RecentlyAccessedBridge();
			recentlyaccessed.when();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Then("^the party details should be displayed with party (\\d+) Involvement details$")
	public void the_party_details_should_be_displayed_with_party_Involvement_details(int arg1) throws Throwable {
try { 
		RecentlyAccessedBridge recentlyaccessed = new RecentlyAccessedBridge();
		recentlyaccessed.then();
	} catch(Exception e){
		e.printStackTrace();
	}}

	@Given("^the business party has been created$")
	public void the_business_party_has_been_created() throws Throwable {
		try {
			RecentlyAccessedBridge recentlyaccessed = new RecentlyAccessedBridge();
			recentlyaccessed.given();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@When("^I search and select Organization Party  by name$")
	public void i_search_and_select_Organization_Party_by_name() throws Throwable {
		try {
			searchParty();
			RecentlyAccessedBridge recentlyaccessed = new RecentlyAccessedBridge();
			recentlyaccessed.when();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Then("^the details should be displayed$")
	public void the_details_should_be_displayed() throws Throwable {
	
		try {
		RecentlyAccessedBridge recentlyaccessed = new RecentlyAccessedBridge();
		recentlyaccessed.then();
	}catch(Exception e){
		e.printStackTrace();
	}}

}
