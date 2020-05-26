Feature: verify search,add and update product in amazon web shop 

Background:

    Given User navigates to login screen
    
    Background: 
    Given User is on login page
    When User login with valid credentials "9701691990" and "Nithin$4"

  @SearchProduct
  Scenario Outline: Search for product
    Given User is on Dashboard Page
    When User enter prodcut name "<product name>" in search field and click on search icon
    Then Application should display list of products matched with search content

    Examples: 
      | product name           |
      | java programming books |
		
Scenario Outline: Search for product 
  Given User launch the amazon url
  And  User click on  the  Sign In button
  And User enter "<username>" into the field Email
  And User enter "<pwd>" into the field Password
  And User  click on the Sign In button
  And  User click in the Search In button 
  And  User enter "<searchproduct>" in the search box
  And   User click on the Search button
  Then User should verify the List displayed
  
Examples
  |Username  |Pwd    |searchproduct			      |     
  |**********|****   |java programming books  |
 
Scenario Outline: Add Product to cart 
  Given User launch the amazon url
  And  User click on  the  Sign In button
  And User enter "<username>" into the field Email
  And User enter "<pwd>" into the field Password
  And User  click on the Sign In button
  And  User click in the Search In button 
  And  User enter "<searchproduct>" in the search box
  And   User click on the Search button
  Then User should select product "<bookname>" from the list displayed
  And User should click on add to cart button
  And user click on cart icon menu 
  Then user should verify product added to cart
Examples
  |Username  |Pwd    |searchproduct			      |   bookname |  
  |**********|****   |java programming books  |   Java - The Complete Reference|
  
  Scenario Outline: Update Product quantity in cart 
  Given User launch the amazon url
  And  User click on  the  Sign In button
  And User enter "<username>" into the field Email
  And User enter "<pwd>" into the field Password
  And User  click on the Sign In button
  And  User click in the Search In button 
  And  User enter "<searchproduct>" in the search box
  And   User click on the Search button
  Then User should select product "<bookname>" from the list displayed
  And User should click on add to cart button
  And user click on cart icon menu 
  And user should change quantity from 1 to "<changequantity>"
  And click on update button
  Then User should verify change in total price 
  
  
  
  
  
Examples
  |Username  |Pwd    |searchproduct			      |   bookname |  
  |**********|****   |java programming books  |   Java - The Complete Reference|