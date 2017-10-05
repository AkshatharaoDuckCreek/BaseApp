package com.cucumber.bhsibase.party.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.cucumber.bhsibase.bridges.CreatePartyBridge;
import com.cucumber.bhsibase.bridges.LoginBridge;
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

}
