package com.flipkart.stepdefinition;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources\\Features\\SearchingThings.feature",
					 glue = "com.flipkart.stepdefinition",
					 plugin = {"html:target", "json:target/reports.json"},
					 monochrome = true,
					 dryRun = false)

public class TestRunner {
	
	

}
