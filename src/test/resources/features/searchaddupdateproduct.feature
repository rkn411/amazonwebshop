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
