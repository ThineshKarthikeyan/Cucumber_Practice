#Author: ttthineshkumaar96@gmail.com

@tag
Feature: Title of your feature
  I want to use this template for my feature file
  
  Background:
		 Given user launches flipkart application
    And user enters credentials and click login

  Scenario: Mobile search validation
    #When user searching mobile
    #And user choosing a mobile click add to cart
    #Then navigate into add to cart and check the order status
    
  #Scenario: Mobile search validation
    #When user searching mobile using one dimensional list
    #|IPhone|Samsung|Oppo|Vivo|Redmi|
    #And user choosing a mobile click add to cart
    #Then navigate into add to cart and check the order status
    
  #Scenario: Mobile search validation
    #When user searching mobile using one dimensional map
    #|Phone 1 |IPhone|
    #|Phone 2 |Samsung|
    #|Phone 3 |Oppo|
    #|Phone 4 |Vivo|
    #|Phone 5 |Redmi|
    #And user choosing a mobile click add to cart
    #Then navigate into add to cart and check the order status
    
  Scenario Outline: Mobile search validation
    When user searching mobile using multiple inputs "<phones>"
    And user choosing a mobile click add to cart
    Then navigate into add to cart and check the order status
    
    Examples:
			 |phones|
  		 |Samsung|
 		   |Oppo|
   		 |Vivo|
   		 |Redmi|
   

