
@Home
Feature: Home page automation

  @Home1
  Scenario: add all products into cart
    Given open website
    When user enters valid username and password
    And click on submit
    Then Navigate to Home
    And click on all products
    And click on cart page
    Then navigate to cart page
    And close driver
    
    
    @Home2
    Scenario: dropdown configeration
    Given open website
    When user enters valid username and password
    And click on submit
    And configure dropdown 
     And close driver

  @Home3
Scenario: Remove added products
    Given open website
    When user enters valid username and password
    And click on submit
    Then Navigate to Home
    And click on all products
    And click on cart page
    And Click Continue purchase
    And Remove added products 
    And click on cart page
   
    @Home4
    Scenario: user logout
    Given open website
    When user enters valid username and password
    And click on submit
    And Click on menu 
    And Click on logout
    And close driver
    
    @Home5
    Scenario: User Reset app state in menu
    Given open website
    When user enters valid username and password
    And click on submit
    And click on all products
    And Click on menu 
    And Click on Reset app state
    Then check the product button states is Reseted
 
    And close driver
    
     @Home6
  Scenario: User All items in menu
    Given open website
    When user enters valid username and password
    And click on submit
    Then Navigate to Home
    And click on all products
    And click on cart page
    Then navigate to cart page
    And Click on menu 
    And click on All items in menu
    And close driver
    
   