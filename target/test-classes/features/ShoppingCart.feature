Feature: Application ShoppingCart

Scenario: As a customer I want to navigate to Shopping cart page
Given Visit the Application URL
And Click on the Shopping cartButton which is on Homepage
Then Verify user is able to navigate shopping Cart on ShoppingCart Page

Scenario: As a customer I want to Add the product to Shopping cart
Given Visit the Application URL
When Type valid products into search box
And Click on search button on homePage
And Verify the product is Display on Search Page
And Click on Add to CartOption on the search page
Then Click on shopping Cart on the Search page

Scenario: As a customer I want to Add the product From WishList to ShoppingCart
Given Visit the Application URL
When Login to Account on login page
Then Type valid products into search box
And Click on search button on homePage
And Verify the product is Display on Search Page
And Click on add to Wishlist option on the Search Page
And Verify the success message is Display on search page as add to wishlist
Then Click on Wishlist Option On the Search page
And Click on the add to cart Option on the WishList page
Then Verify the success message is Display as product add to Shopping cart on WishList Page