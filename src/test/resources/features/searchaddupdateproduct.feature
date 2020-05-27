Feature: verify search,add and update product in amazon web shop

  Background: 
    Given User is on login page
    When User login with valid credentials "" and ""

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
    And user click on cart icon menu
    Then user should verify product is added to cart or not with book "<book name>"

    Examples: 
      | product name           | book name                     | author name     |
      | java programming books | Java - The Complete Reference | Herbert Schildt |
      
   @UpdateProduct
    Scenario Outline: update Product quantity cart
