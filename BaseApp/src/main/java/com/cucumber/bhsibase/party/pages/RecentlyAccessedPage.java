package com.cucumber.bhsibase.party.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cucumber.bhsibase.testbase.PartyBase;
import com.cucumber.bhsibase.testbase.PartyDataReader;
import com.cucumber.bhsibase.testbase.PartyElementConstants;
import com.cucumber.bhsibase.testbase.Utilities;

public class RecentlyAccessedPage {
Utilities utilities = new Utilities();
	

	private PartyBase baseParty = new PartyBase();
	
	

    String partyname= baseParty.xmlhelper(PartyDataReader.PARTYINFO_INPUT_ORGNAME) ; 
    String  lastaccessed = PartyElementConstants.PARTY_RECENTLY_ACCESSED_A+partyname+PartyElementConstants.PARTY_RECENTLY_ACCESSED_B ; 	
    By value = By.xpath(lastaccessed) ; 
	
    
	@FindBy(id = PartyElementConstants.PARTY_CLICK_PARTY)
	WebElement partytab;
	

	public RecentlyAccessedPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	
	public void visiblityUnderRecentlyAccessed() {
	
		utilities.clickByWebElement(partytab);
		utilities.validateWhenReady(value,baseParty.xmlhelper(PartyDataReader.PARTYINFO_INPUT_ORGNAME));
	}

	public void clickOrganizedParty() {
	
		utilities.clickByWebElement(partytab);
		utilities.clickByString(lastaccessed) ; 
	}

}
