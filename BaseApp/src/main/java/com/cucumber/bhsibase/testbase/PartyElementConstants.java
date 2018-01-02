package com.cucumber.bhsibase.testbase;

public class PartyElementConstants {

	public static final String PARTY_LOGIN_USERNAME = "username-inputEl";
	public static final String PARTY_LOGIN_PASSWORD = "password-inputEl";
	public static final String PARTY_LOGIN_CLICKLOGIN = ".//*[@id='home']/a";
	public static final String PARTY_VALIDATE_SELECTPARTY = ".//*[@id='productNavSelect-trigger-picker']" ; 
	
	public static final String PARTY_CLICK_PARTY = "//li[text()='Party']";
	public static final String PARTY_ADD_NEW_PERSON_OR_PLACE = "//div[@id='partyDashboardAdd']/descendant::a";
	public static final String PARTY_SELECT_PERSON_OR_PLACE = "//input[@fieldref='PartyInput.PartyTypeCode']";
	public static final String PARTY_OGANIZATION_NAME = "//input[@fieldref='PartyInput.PartyName']";
	public static final String PARTY_CORRESSPONDENCE_NAME = "//input[@fieldref ='PartyInput.PartyCorrespondenceName']";
	public static final String PARTY_CONTACT_PERSON = "//input[@fieldref='PartyExtendedData.PreferredContactPerson']";
	public static final String PARTY_PREFERRED_METHOD_CONTACT = "//input[@fieldref='PreferredContact.Method']";
	public static final String PARTY_ADDRESS = "//input[@fieldref='LocationInput.LocationAddressLine1']";
	public static final String PARTY_CITY = "//input[@fieldref='LocationInput.LocationCity']";
	public static final String PARTY_STATE = "//input[@fieldref='LocationInput.LocationStateCode']";
	public static final String PARTY_ZIP_CODE = "//input[@fieldref='LocationInput.LocationPostalCode']";
	public static final String PARTY_PHONE_TYPE = "//input[@fieldref='PartyPhoneInput.PhoneTypeCode']";
	public static final String PARTY_PHONE_NUMBER = "//input[@fieldref='PartyPhoneInput.PhoneNumber']";
	public static final String PARTY_EMAIL_TYPE = "//input[@fieldref='PartyEmailInput.EmailTypeCode']";
	public static final String PARTY_EMAIL_ADDRESS = "//input[@fieldref='PartyEmailInput.EmailAddress']";
	public static final String PARTY_DONE = "//span[text()='Done']/ancestor::a";
	public static final String PARTY_VALIDATE_ORGNAME = "//div[@fieldref='PartyInput.PartyName']";
	public static final String PARTY_VALIDATE_CRRNAME = "//div[@fieldref='PartyInput.PartyCorrespondenceName']";
	public static final String PARTY_RECENTLY_ACCESSED_A = "//a[text()='";
	public static final String PARTY_RECENTLY_ACCESSED_B = "']";
	public static final String PARTY_CLICK_HOME = "//a[contains(@id,'partyHome')]" ; 
	
	

	public static final String PARTY_SEARCH_FOR_PERSON_OR_PLACE = "//div[@id='partyDashboardSearch']/descendant::a";
	public static final String PARTY_SEARCH_ORGANIZATION = "//input[@fieldref='SD_PartyInput.PartyTypeCode']";
	public static final String PARTY_SELECT_NAME_ADDRESS = "//input[@fieldref='SearchRequestWorkingData.searchType']";
	public static final String PARTY_SELECT_ORGNAME = "//input[@fieldref='SD_PartyInput.PartyName']";

	public static final String PARTY_SEARCH_FOR_PERSON_AND_PLACE = "//a[contains(@id,'1_1_1_anchorId')]";
	public static final String PARTY_SELECT_STATE="//input[@fieldref='SD_LocationInput.LocationStateCode']" ; 
	public static final String PARTY_ENTER_PARTY = ".//*[@id='productNavSelect-inputEl']" ; 
}
