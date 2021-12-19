package com.flipkart.stepdefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.flipkart.resources.CommonActions;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Hooks extends CommonActions{
	
	CommonActions ca = new CommonActions();
	
	@Before
	public void beforeScenario() {
		ca.launch("https://www.flipkart.com/");

	}
	
	@After
	public void afterScenario() {
		driver.quit(); 

	}

}
