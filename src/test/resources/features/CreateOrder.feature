Feature: Complete an order
As a new customer to the ecommerce websiste
I want to be able to do a purchase
So that I can get the product that I want
 
 Background: User has launched the browser
     Given I navigate to the ecommerce website
@smoke
  Scenario: Successful order of any two items with Existing customer

    	Given I have added  two items to my shopping bag
		When I proceed to the check out
		And I sign in the into the website
        And I select my address
        And I select Terms and condition
		And I select a payment method
		#And I I confirm the order

@smoke @smoke1
  Scenario: Successful order of any two items with new customer

    Given I have added  two items to my shopping bag
    When I proceed to the check out
    And I create my account
    And I select my address
    And I select Terms and condition
    And I select a payment method
		#And I I confirm the order