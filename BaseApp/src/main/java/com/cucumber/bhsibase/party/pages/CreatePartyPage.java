package com.cucumber.bhsibase.party.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cucumber.bhsibase.datareader.ReadXML;
import com.cucumber.bhsibase.testbase.PartyBase;
import com.cucumber.bhsibase.testbase.PartyDataReader;
import com.cucumber.bhsibase.testbase.PartyElementConstants;
import com.cucumber.bhsibase.testbase.Utilities;

public class CreatePartyPage {

	Utilities utilities = new Utilities();
	

	private PartyBase baseParty;
	//

	@FindBy(id = PartyElementConstants.PARTY_CLICK_PARTY)
	WebElement partytab;

	@FindBy(xpath = PartyElementConstants.PARTY_ADD_NEW_PERSON_OR_PLACE)
	WebElement addnewparty;

	@FindBy(xpath = PartyElementConstants.PARTY_SELECT_PERSON_OR_PLACE)
	WebElement personorplace;
	
	@FindBy(xpath = PartyElementConstants.PARTY_OGANIZATION_NAME)
	WebElement organizationname ; 
	
	@FindBy(xpath=PartyElementConstants.PARTY_CORRESSPONDENCE_NAME)
	WebElement corresspondencename ; 
	
	@FindBy(xpath=PartyElementConstants.PARTY_CONTACT_PERSON)
	WebElement contactperson ; 
	
	@FindBy(xpath=PartyElementConstants.PARTY_PREFERRED_METHOD_CONTACT) 
	WebElement preferredcontact ; 
	
	@FindBy(xpath=PartyElementConstants.PARTY_ADDRESS)
	WebElement partyaddress ; 
	
	@FindBy(xpath=PartyElementConstants.PARTY_CITY)
	WebElement partycity ; 
	
	@FindBy(xpath=PartyElementConstants.PARTY_STATE)
	WebElement partystate ; 
	
	@FindBy(xpath=PartyElementConstants.PARTY_ZIP_CODE)
	WebElement partyzipcode ; 
	
	@FindBy(xpath=PartyElementConstants.PARTY_PHONE_TYPE)
	WebElement partyphonetype ; 
	
	@FindBy(xpath=PartyElementConstants.PARTY_PHONE_NUMBER)
	WebElement partyphonenumber ; 
	
	@FindBy(xpath = PartyElementConstants.PARTY_EMAIL_TYPE)
	WebElement partyemailtype ; 
	
	@FindBy(xpath=PartyElementConstants.PARTY_EMAIL_ADDRESS)
	WebElement partyemailaddress ; 
	
	@FindBy(xpath=PartyElementConstants.PARTY_DONE)
	WebElement clickdone ; 
	
	@FindBy(xpath=PartyElementConstants.PARTY_VALIDATE_ORGNAME)
	WebElement validatedpartyname ; 
	
	@FindBy(xpath=PartyElementConstants.PARTY_VALIDATE_CRRNAME)
	WebElement validatecorrpartyname ; 

	public CreatePartyPage(WebDriver driver) {

		PageFactory.initElements(driver, this); // this refers current class
												// object

	}

	public CreatePartyPage() {

	}

	public void addparty() {

		baseParty = new PartyBase() ; 
		utilities.clickByWebElement(partytab);
		utilities.clickWhenReady(addnewparty);
		utilities.sendKeysUsingXpath(personorplace, baseParty.xmlhelper(PartyDataReader.PARTYINFO_SELECT_TYPE));
		utilities.sendKeysUsingXpath(organizationname, baseParty.xmlhelper(PartyDataReader.PARTYINFO_INPUT_ORGNAME));
		utilities.sendKeysUsingXpath(corresspondencename, baseParty.xmlhelper(PartyDataReader.PARTYINFO_INPUT_CRRNAME));
		utilities.sendKeysUsingXpath(contactperson, baseParty.xmlhelper(PartyDataReader.PARTYINFO_INPUT_CONTACTPERSON));
		utilities.sendKeysUsingXpath(preferredcontact, baseParty.xmlhelper(PartyDataReader.PARTYINFO_INPUT_METHOD_OF_CONTACT));
		utilities.sendKeysUsingXpath(partyaddress, baseParty.xmlhelper(PartyDataReader.PARTYINFO_INPUT_ADDRESS));
		utilities.sendKeysUsingXpath(partycity, baseParty.xmlhelper(PartyDataReader.PARTYINFO_INPUT_CITY));
		utilities.sendKeysUsingXpath(partystate, baseParty.xmlhelper(PartyDataReader.PARTYINFO_INPUT_STATE));
		utilities.sendKeysUsingXpath(partyzipcode, baseParty.xmlhelper(PartyDataReader.PARTYINFO_INPUT_ZIPCODE));
		utilities.sendKeysUsingXpath(partyphonetype, baseParty.xmlhelper(PartyDataReader.PARTYINFO_INPUT_PHONETYPE));
		utilities.Wait(2000);
		utilities.sendKeysUsingXpath(partyphonenumber, baseParty.xmlhelper(PartyDataReader.PARTYINFO_INPUT_PHONENUMBER));
		utilities.Wait(2000);
		utilities.sendKeysUsingXpath(partyemailtype, baseParty.xmlhelper(PartyDataReader.PARTYINFO_INPUT_EMAILTYPE));
		utilities.Wait(2000);
		utilities.sendKeysUsingXpath(partyemailaddress, baseParty.xmlhelper(PartyDataReader.PARTYINFO_INPUT_EMAILADD));
		utilities.clickByWebElement(clickdone);
	}
	
	public void validateParty(){
		baseParty = new PartyBase() ; 
		utilities.validateWhenReady(validatedpartyname,baseParty.xmlhelper(PartyDataReader.PARTYINFO_INPUT_ORGNAME));
		utilities.NameValidation(validatecorrpartyname,baseParty.xmlhelper(PartyDataReader.PARTYINFO_INPUT_CRRNAME));
		
	}

}
