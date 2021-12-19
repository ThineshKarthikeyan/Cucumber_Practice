#Author: ttthineshkumaar96@gmail,com.com

Feature: Validating mobile purchase

	Background:
		Given user launches Amazon application
  
  Scenario: Validating mobile purchase
    When user searching the mobile
    And user click on Add to cart
    Then navigates into the cart and check the updated order
   
#	Scenario: Validating mobile purchase by using 1 dim list concept
    #When user searching the mobile by using 1 dim list concept
    #|iPhone|Samsung|OnePlus|Nokia|
    #And user click on Add to cart
    #Then navigates into the cart and check the updated order
    
  #Scenario Outline:
    #When user searching the mobile by using 1 dim list concept "<Phone_Name>"
    #And user click on Add to cart
    #Then navigates into the cart and check the updated order 
    #
    #Examples:
#			|Phone_Name|
#			|iPhone|
#			|Samsung|
#			|Nokia|