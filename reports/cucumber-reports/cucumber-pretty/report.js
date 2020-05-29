$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/searchaddupdateproduct.feature");
formatter.feature({
  "name": "verify search,add and update product in amazon web shop",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Search for product",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@SearchProduct"
    }
  ]
});
formatter.step({
  "name": "User is on Dashboard Page",
  "keyword": "Given "
});
formatter.step({
  "name": "User enter prodcut name \"\u003cproduct name\u003e\" in search field and click on search icon",
  "keyword": "When "
});
formatter.step({
  "name": "Application should display list of products matched with search content",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "product name"
      ]
    },
    {
      "cells": [
        "java programming books"
      ]
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on login page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStepDefinitions.user_is_on_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User login with valid credentials \"9701691990\" and \"Nithin$4\"",
  "keyword": "When "
});
formatter.match({
  "location": "LoginStepDefinitions.user_login_with_valid_credentials_and(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Search for product",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@SearchProduct"
    }
  ]
});
formatter.step({
  "name": "User is on Dashboard Page",
  "keyword": "Given "
});
formatter.match({
  "location": "DashBoardStepDefinitions.is_on_Dashboard_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enter prodcut name \"java programming books\" in search field and click on search icon",
  "keyword": "When "
});
formatter.match({
  "location": "GlobalMenuStepDefinitions.user_enter_prodcut_name_in_search_field(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Application should display list of products matched with search content",
  "keyword": "Then "
});
formatter.match({
  "location": "SearchResultsStepDefinitions.application_should_display_list_of_products_matched_with_search_content()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Add Product to cart",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@AddProduct"
    }
  ]
});
formatter.step({
  "name": "User is on Dashboard Page",
  "keyword": "Given "
});
formatter.step({
  "name": "User enter prodcut name \"\u003cproduct name\u003e\" in search field and click on search icon",
  "keyword": "When "
});
formatter.step({
  "name": "User should select product \"\u003cbook name\u003e\" with author \"\u003cauthor name\u003e\" from displayed products",
  "keyword": "Then "
});
formatter.step({
  "name": "User add product to the cart by cliking on on add to cart button",
  "keyword": "And "
});
formatter.step({
  "name": "User click on cart icon menu",
  "keyword": "And "
});
formatter.step({
  "name": "User should see added product \"\u003cbook name\u003e\" in shopping cart list",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "product name",
        "book name",
        "author name"
      ]
    },
    {
      "cells": [
        "java programming books",
        "Java - The Complete Reference",
        "Herbert Schildt"
      ]
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on login page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStepDefinitions.user_is_on_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User login with valid credentials \"9701691990\" and \"Nithin$4\"",
  "keyword": "When "
});
formatter.match({
  "location": "LoginStepDefinitions.user_login_with_valid_credentials_and(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Add Product to cart",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@AddProduct"
    }
  ]
});
formatter.step({
  "name": "User is on Dashboard Page",
  "keyword": "Given "
});
formatter.match({
  "location": "DashBoardStepDefinitions.is_on_Dashboard_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enter prodcut name \"java programming books\" in search field and click on search icon",
  "keyword": "When "
});
formatter.match({
  "location": "GlobalMenuStepDefinitions.user_enter_prodcut_name_in_search_field(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should select product \"Java - The Complete Reference\" with author \"Herbert Schildt\" from displayed products",
  "keyword": "Then "
});
formatter.match({
  "location": "SearchResultsStepDefinitions.user_should_select_product_with_author_from_displayed_products(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User add product to the cart by cliking on on add to cart button",
  "keyword": "And "
});
formatter.match({
  "location": "ProductSummaryStepDefinitions.user_add_product_to_the_cart_by_cliking_on_on_add_to_cart_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click on cart icon menu",
  "keyword": "And "
});
formatter.match({
  "location": "GlobalMenuStepDefinitions.user_click_on_cart_icon_menu()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should see added product \"Java - The Complete Reference\" in shopping cart list",
  "keyword": "Then "
});
formatter.match({
  "location": "CartStepDefinitions.user_should_verify_product_is_added_to_cart_or_not_with_book_and_author(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "update Product quantity cart",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@UpdateProductQuantity"
    }
  ]
});
formatter.step({
  "name": "User is on Dashboard Page",
  "keyword": "Given "
});
formatter.step({
  "name": "User enter prodcut name \"\u003cproduct name\u003e\" in search field and click on search icon",
  "keyword": "When "
});
formatter.step({
  "name": "User should select product \"\u003cbook name\u003e\" with author \"\u003cauthor name\u003e\" from displayed products",
  "keyword": "Then "
});
formatter.step({
  "name": "User add product to the cart by cliking on on add to cart button",
  "keyword": "And "
});
formatter.step({
  "name": "User click on cart icon menu",
  "keyword": "And "
});
formatter.step({
  "name": "User should see added product \"\u003cbook name\u003e\" in shopping cart list",
  "keyword": "Then "
});
formatter.step({
  "name": "User should update product quantity \"\u003cproduct quantity\u003e\" in cart page",
  "keyword": "And "
});
formatter.step({
  "name": "User should verify product quantity \"\u003cproduct quantity\u003e\" is updated in cart",
  "keyword": "Then "
});
formatter.step({
  "name": "User should verify cart total price value is updated or not for selected product quantity \"\u003cproduct quantity\u003e\"",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "product name",
        "book name",
        "author name",
        "product quantity"
      ]
    },
    {
      "cells": [
        "java programming books",
        "Java - The Complete Reference",
        "Herbert Schildt",
        "4"
      ]
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on login page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStepDefinitions.user_is_on_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User login with valid credentials \"9701691990\" and \"Nithin$4\"",
  "keyword": "When "
});
formatter.match({
  "location": "LoginStepDefinitions.user_login_with_valid_credentials_and(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "update Product quantity cart",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@UpdateProductQuantity"
    }
  ]
});
formatter.step({
  "name": "User is on Dashboard Page",
  "keyword": "Given "
});
formatter.match({
  "location": "DashBoardStepDefinitions.is_on_Dashboard_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enter prodcut name \"java programming books\" in search field and click on search icon",
  "keyword": "When "
});
formatter.match({
  "location": "GlobalMenuStepDefinitions.user_enter_prodcut_name_in_search_field(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should select product \"Java - The Complete Reference\" with author \"Herbert Schildt\" from displayed products",
  "keyword": "Then "
});
formatter.match({
  "location": "SearchResultsStepDefinitions.user_should_select_product_with_author_from_displayed_products(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User add product to the cart by cliking on on add to cart button",
  "keyword": "And "
});
formatter.match({
  "location": "ProductSummaryStepDefinitions.user_add_product_to_the_cart_by_cliking_on_on_add_to_cart_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click on cart icon menu",
  "keyword": "And "
});
formatter.match({
  "location": "GlobalMenuStepDefinitions.user_click_on_cart_icon_menu()"
});
formatter.result({
  "error_message": "org.openqa.selenium.ElementClickInterceptedException: element click intercepted: Element \u003ca href\u003d\"https://www.amazon.in/gp/cart/view.html?ref_\u003dnav_cart\" aria-label\u003d\"2 items in cart\" class\u003d\"nav-a nav-a-2\" id\u003d\"nav-cart\" tabindex\u003d\"17\"\u003e...\u003c/a\u003e is not clickable at point (1326, 31). Other element would receive the click: \u003cspan class\u003d\"nav-cart-icon nav-sprite\"\u003e\u003c/span\u003e\n  (Session info: chrome\u003d83.0.4103.61)\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027Reddi-Kothapalli.local\u0027, ip: \u0027fe80:0:0:0:c6b:7019:84ea:a3d6%en0\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002710.15.4\u0027, java.version: \u00271.8.0_231\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: true, browserName: chrome, browserVersion: 83.0.4103.61, chrome: {chromedriverVersion: 83.0.4103.39 (ccbf011cb2d2b..., userDataDir: /var/folders/gm/rp8ghlv94xn...}, goog:chromeOptions: {debuggerAddress: localhost:53800}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: MAC, platformName: MAC, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:virtualAuthenticators: true}\nSession ID: 28833f16f49c8898e0c20c7526da6dd1\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:285)\n\tat org.openqa.selenium.remote.RemoteWebElement.click(RemoteWebElement.java:84)\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\n\tat java.lang.reflect.Method.invoke(Method.java:498)\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:51)\n\tat com.sun.proxy.$Proxy19.click(Unknown Source)\n\tat com.amazon.framework.utilities.UIWrappers.clickOnElement(UIWrappers.java:21)\n\tat com.amazon.pages.GlobalMenuPage.clickOnCartIcon(GlobalMenuPage.java:45)\n\tat com.amazon.stepdefinitions.GlobalMenuStepDefinitions.user_click_on_cart_icon_menu(GlobalMenuStepDefinitions.java:21)\n\tat ✽.User click on cart icon menu(file:src/test/resources/features/searchaddupdateproduct.feature:36)\n",
  "status": "failed"
});
formatter.step({
  "name": "User should see added product \"Java - The Complete Reference\" in shopping cart list",
  "keyword": "Then "
});
formatter.match({
  "location": "CartStepDefinitions.user_should_verify_product_is_added_to_cart_or_not_with_book_and_author(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User should update product quantity \"4\" in cart page",
  "keyword": "And "
});
formatter.match({
  "location": "CartStepDefinitions.user_should_update_product_quantity_cart(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User should verify product quantity \"4\" is updated in cart",
  "keyword": "Then "
});
formatter.match({
  "location": "CartStepDefinitions.user_should_verify_product_quantity_is_updated_in_cart(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User should verify cart total price value is updated or not for selected product quantity \"4\"",
  "keyword": "And "
});
formatter.match({
  "location": "CartStepDefinitions.user_should_verify_cart_total_price_value_is_updated_or_not_for_selected_product_quantity(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Delete the product from cart",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@DeleteProduct"
    }
  ]
});
formatter.step({
  "name": "User is on Dashboard Page",
  "keyword": "Given "
});
formatter.step({
  "name": "User enter prodcut name \"\u003cproduct name\u003e\" in search field and click on search icon",
  "keyword": "When "
});
formatter.step({
  "name": "User should select product \"\u003cbook name\u003e\" from displayed products",
  "keyword": "Then "
});
formatter.step({
  "name": "User add product to the cart by cliking on on add to cart button",
  "keyword": "And "
});
formatter.step({
  "name": "User click on cart icon menu",
  "keyword": "And "
});
formatter.step({
  "name": "User should see added product \"\u003cbook name\u003e\" in shopping cart list",
  "keyword": "Then "
});
formatter.step({
  "name": "User delete product \"\u003cbook name\u003e\" from the shopping cart",
  "keyword": "When "
});
formatter.step({
  "name": "User should not see deleted product \"\u003cbook name\u003e\" from shopping cart",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "product name",
        "book name"
      ]
    },
    {
      "cells": [
        "java programming books",
        "A Textbook of Java Programming"
      ]
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on login page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStepDefinitions.user_is_on_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User login with valid credentials \"9701691990\" and \"Nithin$4\"",
  "keyword": "When "
});
formatter.match({
  "location": "LoginStepDefinitions.user_login_with_valid_credentials_and(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Delete the product from cart",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@DeleteProduct"
    }
  ]
});
formatter.step({
  "name": "User is on Dashboard Page",
  "keyword": "Given "
});
formatter.match({
  "location": "DashBoardStepDefinitions.is_on_Dashboard_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enter prodcut name \"java programming books\" in search field and click on search icon",
  "keyword": "When "
});
formatter.match({
  "location": "GlobalMenuStepDefinitions.user_enter_prodcut_name_in_search_field(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should select product \"A Textbook of Java Programming\" from displayed products",
  "keyword": "Then "
});
formatter.match({
  "location": "SearchResultsStepDefinitions.user_should_select_product_from_displayed_products(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User add product to the cart by cliking on on add to cart button",
  "keyword": "And "
});
formatter.match({
  "location": "ProductSummaryStepDefinitions.user_add_product_to_the_cart_by_cliking_on_on_add_to_cart_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click on cart icon menu",
  "keyword": "And "
});
formatter.match({
  "location": "GlobalMenuStepDefinitions.user_click_on_cart_icon_menu()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should see added product \"A Textbook of Java Programming\" in shopping cart list",
  "keyword": "Then "
});
formatter.match({
  "location": "CartStepDefinitions.user_should_verify_product_is_added_to_cart_or_not_with_book_and_author(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User delete product \"A Textbook of Java Programming\" from the shopping cart",
  "keyword": "When "
});
formatter.match({
  "location": "CartStepDefinitions.user_delete_product_from_the_shopping_cart(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should not see deleted product \"A Textbook of Java Programming\" from shopping cart",
  "keyword": "Then "
});
formatter.match({
  "location": "CartStepDefinitions.user_should_not_see_deleted_product_from_shopping_cart(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});