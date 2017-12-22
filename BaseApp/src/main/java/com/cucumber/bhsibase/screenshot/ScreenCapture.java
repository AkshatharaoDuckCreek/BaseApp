package com.cucumber.bhsibase.screenshot;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.cucumber.bhsibase.runner.TestRunner;
import com.cucumber.bhsibase.testbase.PartyBase;

public class ScreenCapture {

	PartyBase partybase = new PartyBase();

	public static void capturescreen(String screenShotName) {
		try {
			Date date = new Date();
			SimpleDateFormat formatter = new SimpleDateFormat("YYYY-MM-dd_hh-mm-ss");
			TakesScreenshot takesScreenshot = (TakesScreenshot) TestRunner.driver;

			File scrFile = ((TakesScreenshot) TestRunner.driver).getScreenshotAs(OutputType.FILE);

			FileUtils.copyFile(scrFile,
					new File("./screenshots/" + screenShotName + "_" + formatter.format(date) + ".png"));

			System.out.println("Printing screen shot taken for className " + screenShotName);

		} catch (Exception e) {
			System.out.println("Exception while taking screenshot " + e.getMessage());
		}

	}
}
