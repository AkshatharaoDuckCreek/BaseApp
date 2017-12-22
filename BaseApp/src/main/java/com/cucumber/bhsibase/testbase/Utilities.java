package com.cucumber.bhsibase.testbase;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.cucumber.bhsibase.runner.TestRunner;

public class Utilities {

	PartyBase base = new PartyBase();

	public WebElement getWhenVisible(By locator) {
		WebElement element = null;
		WebDriverWait wait = new WebDriverWait(TestRunner.driver, 10);
		element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		return element;
	}

	public void clickWhenReady(WebElement locator) {
		WebDriverWait wait = new WebDriverWait(TestRunner.driver, 20);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(locator));
		element.click();
	}

	public void enterWhenReady(WebElement locator, String text) {
		WebDriverWait wait = new WebDriverWait(TestRunner.driver, 20);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(locator));

		element.sendKeys(text);
		element.sendKeys(Keys.ENTER);
	}

	public void Wait(int milliSeconds) {
		try {
			Thread.sleep(milliSeconds);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void validateWhenReady(WebElement locator, String actualvalue) {

		WebDriverWait wait = new WebDriverWait(TestRunner.driver, 20);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(locator));
		String title = element.getText();
		Assert.assertEquals(actualvalue, title);
	}

	public void validateWhenReady(By locator, String actualvalue) {

		WebDriverWait wait = new WebDriverWait(TestRunner.driver, 20);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(locator));
		String title = element.getText();
		Assert.assertEquals(actualvalue, title);
	}

	public void clickByWebElement(WebElement clickelement) {
		clickelement.click();
	}

	public void clickByString(String clickelement) {

		WebElement element = TestRunner.driver.findElement(By.xpath(clickelement));
		element.click();
	}

	public void NameValidation(WebElement elementXpath, String actualvalue) {

		String title = elementXpath.getText();
		Assert.assertEquals(actualvalue, title);
	}

	public void sendKeysUsingXpath(WebElement element, String text) {
		element.clear();
		element.sendKeys(text);
		element.sendKeys((Keys.ENTER));

	}

}
