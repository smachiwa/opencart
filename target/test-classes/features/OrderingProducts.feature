Feature: Application Ordering Products

Scenario Outline: Ordering Products is Displayed in Order History
Given types the url
When search the products add to cart             
Then click on checkoutbuttons and fill all delivery details order is placed
Then click on the continues buttons
Then click on the Orders History buttons on Home Page
Then Ordering Product is Displayeds

