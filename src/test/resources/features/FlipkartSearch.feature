@Smoke
Feature: User should be able to earch without login

	@13PRO
  Scenario: User Searching for "Iphone 13 Pro Max"
    Given User opens "https://www.flipkart.com" and on Landing page
    And User is not logged in
    Then User searches for "Iphone 13 Pro Max"
    
  @S12  
 	Scenario: User Searching for "Galaxy s12"
    Given User opens "https://www.flipkart.com" and on Landing page
    And User is not logged in
    Then User searches for "Galaxy s12"
