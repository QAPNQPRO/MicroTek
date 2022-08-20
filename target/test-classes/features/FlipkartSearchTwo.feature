@Sanity
Feature: User should be able to earch without login

	@12PRO
  Scenario: User Searching for "Iphone 12 pro"
    Given User opens "https://www.flipkart.com" and on Landing page
    And User is not logged in
    Then User searches for "Iphone 12 pro"
  
  @Redmi10
  Scenario: User Searching for "Redmi 10 pro max"
    Given User opens "https://www.flipkart.com" and on Landing page
    And User is not logged in
    Then User searches for "Redmi 10 pro max"
    
