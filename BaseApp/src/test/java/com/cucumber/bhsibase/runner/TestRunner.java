package com.cucumber.bhsibase.runner;

import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.cucumber.bhsibase.datareader.ConfigReader;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import cucumber.api.testng.CucumberFeatureWrapper;
import cucumber.api.testng.TestNGCucumberRunner;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/PartyFeatures.feature"}, glue = {"com.cucumber.bhsibase.party.tests"})
public class TestRunner  {
	
	public static WebDriver driver ; 
	   private TestNGCucumberRunner testNGCucumberRunner;
	   
	   @BeforeClass(alwaysRun = true)
	   public void setUpClass() throws Exception {

		   ConfigReader reader = new ConfigReader();

			driver = new FirefoxDriver() ; 
			driver.get(reader.readurls("ExpressURL"));
	        testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
	    }
	    
	   @Test(description = "Runs Cucumber Feature", dataProvider = "features")
	    public void feature(CucumberFeatureWrapper cucumberFeature) {
	        testNGCucumberRunner.runCucumber(cucumberFeature.getCucumberFeature());
	    }
	   
	   @DataProvider
	    public Object[][] features() {
	        return testNGCucumberRunner.provideFeatures();
	    }
	   
	   @AfterClass(alwaysRun = true)
	    public void tearDownClass() throws Exception {
		   driver.quit();
		   testNGCucumberRunner.finish();
	    }

}
 