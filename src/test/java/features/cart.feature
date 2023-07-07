Feature: Validate add to cart funtionality


Scenario: verify add to cart successfully from PDP page
Given user launch site URL
When user login into the application
And  add product into the cart from PDP
Then Validate user is able to add the product


Scenario: verify add to cart successfully from PLP page
Given user launch site URL
When user login into the application
And  add product into the cart from PLP
Then Validate user is able to add the product
