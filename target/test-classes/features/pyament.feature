Feature: Validate all payment funtionality

Scenario: verify card payment successfully with valid deatils 
Given user launch site URL
When user login into the application
And  add product into the cart and navigate to checkout page
And user select card payment method and enter all valid deatils
Then Validate succesful payment by card
