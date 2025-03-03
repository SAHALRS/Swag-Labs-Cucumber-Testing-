
@cart
Feature: Automating Cart

  @cart1
  Scenario: Check Checkout button working properly
    Given user enters login page
    And select products and click on checkout
    And Close driver
   

 @cart2
  Scenario: checkout using valid credentials 
    Given user enters login page
    And select products and click on checkout
    Then Enter Valid Credentials
    And Click on continue
    And click on finish
    And Close driver
   

 @cart3
  Scenario: checkout without entering username 
    Given user enters login page
    And select products and click on checkout
    Then Enter Lastname
    And Click on continue
    And click on finish
    And Close driver
    
     @cart4
  Scenario: check cancel in checkout is working 
    Given user enters login page
    And select products and click on checkout
    Then Enter Valid Credentials
    And Click on continue
    And click on cancel
    And Close driver
    
     @cart5
  Scenario: verify total is expected 
    Given user enters login page
    And select products and click on checkout
    Then Enter Valid Credentials
    And Click on continue
    Then verify Total amound
    And Close driver