$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Features/SearchingThings.feature");
formatter.feature({
  "name": "Title of your feature",
  "description": "  I want to use this template for my feature file",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@tag"
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user launches flipkart application",
  "keyword": "Given "
});
formatter.match({
  "location": "FlipkartMobileSearchSteps.user_launches_flipkart_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters credentials and click login",
  "keyword": "And "
});
formatter.match({
  "location": "FlipkartMobileSearchSteps.user_enters_credentials_and_click_login()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Mobile search validation",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@tag"
    }
  ]
});
formatter.step({
  "name": "user searching mobile",
  "keyword": "When "
});
formatter.match({
  "location": "FlipkartMobileSearchSteps.user_searching_mobile()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user choosing a mobile click add to cart",
  "keyword": "And "
});
formatter.match({
  "location": "FlipkartMobileSearchSteps.user_choosing_a_mobile_and_click_add_to_cart()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "navigate into add to cart and check the order status",
  "keyword": "Then "
});
formatter.match({
  "location": "FlipkartMobileSearchSteps.navigate_into_add_to_cart_and_check_the_order_status()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});