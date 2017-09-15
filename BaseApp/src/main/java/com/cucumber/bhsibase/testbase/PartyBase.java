package com.cucumber.bhsibase.testbase;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class PartyBase {

	
public static WebDriver driver ; 
 String url = "https://pcdev03.accs54683.asw.accenture.com:8080/BASE_Express/default.aspx" ;
String browser = "firefox" ; 





/**public void selectBrowser(String browser){
	if(browser.equalsIgnoreCase("friefox")){
		
		driver = new FirefoxDriver() ; 
	}
	
}*/

public void geturl(){
	
	driver = new FirefoxDriver() ; 
	System.out.println("UUUUUUUUURRRRRRRRLLLLLLLL222222222222222222::::::::::::"+url);
	driver.get(url);
	System.out.println("UUUUUUUUURRRRRRRRLLLLLLLL33333333333333333333::::::::::::"+url);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS) ; 
}
	

}
