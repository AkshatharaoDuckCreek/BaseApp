package com.cucumber.bhsibase.party.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cucumber.bhsibase.testbase.PartyBase;

public class LoginPage {

	
	WebDriver driver ; 
	@FindBy(id="username")
	WebElement enterusername ; 
	
	@FindBy(id="password")
	WebElement password ; 
	
	@FindBy(xpath=".//*[@id='home']/a")
	WebElement clicklogin ; 
	
	@FindBy(id="id_LogOut")
	WebElement clicklogout ; 
	
	public LoginPage(WebDriver driver){
		
		PageFactory.initElements(driver, this); //this refers current class object
		
		
	}
	
	public LoginPage(){}
	
	public void enterunamepwd() {
		// TODO Auto-generated method stub
		
		enterusername.sendKeys("admin");
		password.sendKeys("admin");
		
	}

	public void clicklogin() {
		// TODO Auto-generated method stub
		
		clicklogin.click();
		
	}

	public void validatelogin() {
		// TODO Auto-generated method stub
		clicklogout.click();
	}

}
