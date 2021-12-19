package com.flipkart.stepdefinition;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Webdriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.Chromedriver;

import com.flipkart.objectRepository.MobileSearchPage;
import com.flipkart.resources.CommonActions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebdriverManager;

public class FlipkartMobileSearchSteps extends CommonActions{
	
	
	static List<String> windows;
	static String input;
	
	CommonActions ca = new CommonActions();
	MobileSearchPage mp = new MobileSearchPage();
	
	@Given("user launches flipkart application")
	public void user_launches_flipkart_application() {		
		
		System.out.println("Thinesh");
	}

	@Given("user enters credentials and click login")
	public void user_enters_credentials_and_click_login() { 
		WebElement popUp = mp.getSignUpDeny();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		ca.button(popUp);
		
	}

	@When("user searching mobile")
	public void user_searching_mobile() {
		WebElement searchBox = driver.findElement(By.name("q"));
		ca.insertTextAndEnter(searchBox, "Mobiles");
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
						
	}

	@When("user choosing a mobile click add to cart")
	public void user_choosing_a_mobile_and_click_add_to_cart() {
		String parentWindowId = driver.getWindowHandle();
		WebElement ChosenMobile = mp.getChosenMobile();
		ca.button(ChosenMobile);
		Set<String> allWindowId = driver.getWindowHandles();
		for (String x : allWindowId) {
			if (!x.equals(parentWindowId)) {
				driver.switchTo().window(x);
			}
		}
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		WebElement mobile = mp.getAddToCartButton();
		ca.button(mobile);
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	  
	}

	@Then("navigate into add to cart and check the order status")
	public void navigate_into_add_to_cart_and_check_the_order_status() {
		WebElement gettingIntoCart = mp.getGoToCart();
		ca.button(gettingIntoCart);
	    driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	    WebElement addedMobile = mp.getChosenMobileName();
	    driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	    String mobileName = addedMobile.getText();
	    System.out.println(mobileName);
	   
	}
	
	@When("user searching mobile using one dimensional list")
	public void user_searching_mobile_using_one_dimensional_list(io.cucumber.datatable.DataTable dataTable) {
	    List<String> data = dataTable.asList(String.class);
	    input = data.get(1);
	    WebElement searchBox = mp.getSearchBar();
	    ca.insertTextAndEnter(searchBox, input);
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	}
	
	@When("user searching mobile using one dimensional map")
	public void user_searching_mobile_using_one_dimensional_map(io.cucumber.datatable.DataTable dataTable) {
	    Map<String, String> data = dataTable.asMap(String.class, String.class);
	    input = data.get("Phone 3");
	    WebElement searchBox = mp.getSearchBar();
	    ca.insertTextAndEnter(searchBox, input);
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	}
	
	@When("user searching mobile using multiple inputs {string}")
	public void user_searching_mobile_using_multiple_inputs(String phones) {
		 input = phones;
		 WebElement searchBox = mp.getSearchBar();
		 ca.insertTextAndEnter(searchBox, input);
		 driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	}


}
