package org.rediff.testRunnerClass;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.reddiff.baseClass.BaseClass;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(features = "src//test//java//org//rediff//featurefile",
	glue = "org.rediff.stepDefinition",
	monochrome = true,
	dryRun = false,
	strict = true,
	
	plugin = {"html:Reports/Html_Report.html",
			  "pretty",
			  "json:Reports/Json_Reports.json",
			  "com.cucumber.listener.ExtentCucumberFormatter:Reports/Extent_Report.html"})
public class TestRunnerClass extends BaseClass{

	@BeforeClass
	public static void setup() {
		browserLaunch("chrome");
		implicitWait(20);
	}
	@AfterClass
	public static void tearDown() {
		driverQuit();
	}
}
