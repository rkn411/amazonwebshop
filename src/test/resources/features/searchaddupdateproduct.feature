Feature: verify search,add and update product in amazon web shop

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

 @AddProduct
  Scenario Outline: Add Product to cart
    Given User is on Dashboard Page
    When User enter prodcut name "<product name>" in search field and click on search icon
    Then User should select product "<book name>" with author "<author name>" from displayed products
    And User add product to the cart by cliking on on add to cart button
    And User click on cart icon menu
    Then User should see added product "<book name>" in shopping cart list

    Examples: 
      | product name           | book name                     | author name     |
      | java programming books | Java - The Complete Reference | Herbert Schildt |
      
  @UpdateProductQuantity
  Scenario Outline: update Product quantity cart
  	Given User is on Dashboard Page
    When User enter prodcut name "<product name>" in search field and click on search icon
    Then User should select product "<book name>" with author "<author name>" from displayed products
    And  User add product to the cart by cliking on on add to cart button
    And  User click on cart icon menu
    Then User should see added product "<book name>" in shopping cart list
    And  User should update product quantity "<product quantity>" in cart page
    Then User should verify product quantity "<product quantity>" is updated in cart
    And  User should verify cart total price value is updated or not for selected product quantity "<product quantity>"

    Examples: 
      | product name           | book name                     | author name     |product quantity|
      | java programming books | Java - The Complete Reference | Herbert Schildt |	4		|
      
  @DeleteProduct
  Scenario Outline: Delete the product from cart
    Given User is on Dashboard Page
    When User enter prodcut name "<product name>" in search field and click on search icon
    Then User should select product "<book name>" from displayed products
    And User add product to the cart by cliking on on add to cart button
    And User click on cart icon menu
    Then User should see added product "<book name>" in shopping cart list
    When User delete product "<book name>" from the shopping cart
    Then User should not see deleted product "<book name>" from shopping cart
    
    
    Examples: 
      | product name           | book name                      |
      | java programming books | A Textbook of Java Programming |