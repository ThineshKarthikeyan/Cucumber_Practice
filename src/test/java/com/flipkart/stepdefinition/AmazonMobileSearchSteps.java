package com.flipkart.stepdefinition;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AmazonMobileSearchSteps {
	
	static String input;
	
	@Given("user launches Amazon application")
	public void user_launches_Amazon_application() {
		Hooks.driver.get("https://www.amazon.com/");
	    
	}

	@When("user searching the mobile")
	public void user_searching_the_mobile() {
		WebElement searchBox = Hooks.driver.findElement(By.id("twotabsearchtextbox"));
		Hooks.driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		searchBox.sendKeys("Phones",Keys.ENTER);
		    
	}

	@When("user click on Add to cart")
	public void user_click_on_Add_to_cart() {
		Hooks.driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		WebElement chosenMobile = Hooks.driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[4]"));
		String parentWindowId = Hooks.driver.getWindowHandle();
		chosenMobile.click();
		Set<String> allWindowId = Hooks.driver.getWindowHandles();
		for (String x : allWindowId) {
			if (!x.equals(parentWindowId)) {
				Hooks.driver.switchTo().window(x);
			}
		}
		Hooks.driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		WebElement addToCartButton = Hooks.driver.findElement(By.id("add-to-cart-button"));
		addToCartButton.click();
	}

	@Then("navigates into the cart and check the updated order")
	public void navigates_into_the_cart_and_check_the_updated_order() {
		Hooks.driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		WebElement cartButton = Hooks.driver.findElement(By.id("nav-cart-count"));
		cartButton.click();
		Hooks.driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		WebElement addedMobile = Hooks.driver.findElement(By.xpath("(//span[@class='a-truncate-cut'])[1]"));
		String addedMobileName = addedMobile.getText();
		System.out.println(addedMobileName);
	    
	}

	@When("user searching the mobile by using {int} dim list concept")
	public void user_searching_the_mobile_by_using_dim_list_concept(Integer int1, io.cucumber.datatable.DataTable dataTable) {
		Hooks.driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		List<String> data= dataTable.asList();
		input = data.get(0);
		WebElement searchBox = Hooks.driver.findElement(By.id("twotabsearchtextbox"));
		searchBox.sendKeys(input,Keys.ENTER);
	}

	@When("user searching the mobile by using {int} dim list concept {string}")
	public void user_searching_the_mobile_by_using_dim_list_concept(Integer int1, String Phone_Name) {
		Hooks.driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		input = Phone_Name;
		WebElement searchBox = Hooks.driver.findElement(By.id("twotabsearchtextbox"));
		searchBox.sendKeys(Phone_Name,Keys.ENTER);
	}


}
