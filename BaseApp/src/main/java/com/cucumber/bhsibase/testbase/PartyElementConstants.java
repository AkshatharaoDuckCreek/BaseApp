package com.cucumber.bhsibase.testbase;

public class PartyElementConstants {
	
	public static final String PARTY_LOGIN_USERNAME = "username" ; 
	public static final String PARTY_LOGIN_PASSWORD="password" ; 
	public static final String PARTY_LOGIN_CLICKLOGIN = ".//*[@id='home']/a" ; 
	public static final String PARTY_CLICK_PARTY="Party" ;
	public static final String PARTY_ADD_NEW_PERSON_OR_PLACE = "//div[@id='partyDashboardAdd']/descendant::a" ; 
	public static final String PARTY_SELECT_PERSON_OR_PLACE = "//input[@fieldref='PartyInput.PartyTypeCode']" ; 
    public static final String PARTY_OGANIZATION_NAME="//input[@fieldref='PartyInput.PartyName']" ; 
    public static final String PARTY_CORRESSPONDENCE_NAME="//input[@fieldref ='PartyInput.PartyCorrespondenceName']" ; 
    public static final String PARTY_CONTACT_PERSON="//input[@fieldref='PartyExtendedData.PreferredContactPerson']" ; 
    public static final String PARTY_PREFERRED_METHOD_CONTACT = "//input[@fieldref='PartyInput.PreferredContactMethod']" ; 
    public static final String PARTY_ADDRESS="//input[@fieldref='LocationInput.LocationAddressLine1']" ; 
    public static final String PARTY_CITY ="//input[@fieldref='LocationInput.LocationCity']" ; 
    public static final String PARTY_STATE="//input[@fieldref='LocationInput.LocationStateDropDown']" ; 
    public static final String PARTY_ZIP_CODE="//input[@fieldref='LocationInput.LocationPostalCode']" ; 
    public static final String PARTY_PHONE_TYPE="//input[@fieldref='PartyPhoneInput.PhoneTypeCode']" ; 
    public static final String PARTY_PHONE_NUMBER = "//input[@fieldref='PartyPhoneInput.PhoneNumber']" ; 
    public static final String PARTY_EMAIL_TYPE="//input[@fieldref='PartyEmailInput.EmailTypeCode']" ; 
    public static final String PARTY_EMAIL_ADDRESS="//input[@fieldref='PartyEmailInput.EmailAddress']" ; 
    public static final String PARTY_DONE="//a[contains(@id,'31_1_1_anchorId')]" ; 
    public static final String PARTY_VALIDATE_ORGNAME="//div[@fieldref='PartyInput.PartyName']" ; 
    public static final String PARTY_VALIDATE_CRRNAME="//div[@fieldref='PartyInput.PartyCorrespondenceName']" ; 
}
