package com.flipkart.resources;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CommonActions {
	
	public static WebDriver driver = null;
	
	public void launch(String uRL) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(uRL);

	}
	
	public void insertText(WebElement element, String value) {
		element.sendKeys(value);

	}
	
	public void insertTextAndEnter(WebElement element, String value) {
		element.sendKeys(value, Keys.ENTER);

	}
	
	public void button(WebElement element) {
		element.click();

	}
}
