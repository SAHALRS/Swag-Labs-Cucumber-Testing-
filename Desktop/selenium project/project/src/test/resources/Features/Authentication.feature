@test
Feature: Automating Login

  @test1
  Scenario: login with valid credentcials
    Given Navigate to Home page
   When Enter the name and password
    And Click on products
   Then Navigate to the next page
    And click on product
    Then quite the page
    
    
    

  @test2
  Scenario: login with invalid credentcials
    Given Navigate to Home page
   When Enter the name "locked_out_user" and password "secret_sauce"
    And Click on products
   Then Navigate to the next page
    And click on product
    Then quite the page
    
    @test3
  Scenario: login without username and password
    Given Navigate to Home page
   When skip name and password
    And Click on products
     Then Navigate to the next page
    And click on product
    Then quite the page
    
    @test4
     Scenario: login without entering username
   Given Navigate to Home page
   When skip name feild 
   And Click on products
     Then Navigate to the next page
    And click on product
    Then quite the page
    
    @test5

     Scenario: login without entering password
   Given Navigate to Home page
   When skip password feild 
   And Click on products
     Then Navigate to the next page
    And click on product
    Then quite the page
    
    @test6
     Scenario: login with invalide username and password
  Given Navigate to Home page
   When enter<username>and<password>
   And Click on products
     Then Navigate to the next page
    And click on product
    Then quite the page
    
    Examples:
|username|password |
|rockey  |12345    |
|james   |433355   |
|jhon    |23@ddsggs|   


 @test7
     Scenario: login with valid name and Password
  Given Navigate to Home page
   When enter<name>and<Password>
   And Click on products
     Then Navigate to the next page
    And click on product
    Then quite the page
    
    Examples:
|name           |Password    |
|standard_user  |secret_sauce|
| visual_user   |secret_sauce|

