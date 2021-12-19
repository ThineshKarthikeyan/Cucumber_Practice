package com.flipkart.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.flipkart.resources.CommonActions;

public class MobileSearchPage extends CommonActions{
	
	public MobileSearchPage() {
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath = "//button[text()='✕']")
	private WebElement signUpDeny;
	
	@FindBy(name = "q")
	private WebElement searchBar;
	
	@FindBy(xpath = "(//div[@class='_4rR01T'])[3]")
	private WebElement chosenMobile;
	
	@FindBy(xpath = "/html/body/div/div/div[3]/div/div/div[2]/div/ul/li/button")
	private WebElement addToCartButton;
	
	@FindBy(xpath = "//a[@class='_2Kn22P gBNbID']")
	private WebElement chosenMobileName;
	
	@FindBy(xpath = "//span[text()='Cart']")
	private WebElement goToCart;

	public WebElement getSignUpDeny() {
		return signUpDeny;
	}

	public WebElement getSearchBar() {
		return searchBar;
	}

	public WebElement getChosenMobile() {
		return chosenMobile;
	}

	public WebElement getAddToCartButton() {
		return addToCartButton;
	}

	public WebElement getChosenMobileName() {
		return chosenMobileName;
	}

	public WebElement getGoToCart() {
		return goToCart;
	}
	

}
